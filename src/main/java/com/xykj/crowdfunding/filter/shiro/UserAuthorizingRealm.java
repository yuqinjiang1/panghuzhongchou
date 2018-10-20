   package com.xykj.crowdfunding.filter.shiro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;






import org.apache.commons.collections4.CollectionUtils;
/*import org.apache.commons.collections.CollectionUtils;*/
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






/*import com.plg.shiro.entity.OmPermis;
import com.plg.shiro.entity.OmRole;
import com.plg.shiro.entity.OmUser;
import com.plg.shiro.service.IPermissionService;
import com.plg.shiro.service.IRoleService;
import com.plg.shiro.service.IUserService;
import com.plg.shiro.util.Md5;*/
import com.xykj.crowdfunding.reverse.dao.PermissionsMapper;
import com.xykj.crowdfunding.reverse.dao.RoleMapper;
import com.xykj.crowdfunding.reverse.dao.UserMapper;
import com.xykj.crowdfunding.reverse.pojo.Permissions;
import com.xykj.crowdfunding.reverse.pojo.Role;
import com.xykj.crowdfunding.reverse.pojo.User;
import com.xykj.crowdfunding.service.PermissionsService;
import com.xykj.crowdfunding.service.RoleService;
import com.xykj.crowdfunding.service.UserService;

/**
 * 自定义认证、授权
 * 
 * @author Thinkpad 参考：yunnex.saofu.web.service.shiro.AuthShiroRealm
 */
@Service
public class UserAuthorizingRealm extends AuthorizingRealm {
	private static Logger logger = LoggerFactory.getLogger(UserAuthorizingRealm.class);

	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private  PermissionsService perService;

	private static final String USER_SESSION_KEY = "sys_user";
	
	public  static  User LOGINUSER;

	/**
	 * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.
	 * 比如遇到@RequiresPermissions注解时，会调用
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		logger.info("授权查询回调函数");
		System.out.println("================");
		// 获取登录时输入的用户名
		String username = (String) principals.getPrimaryPrincipal();

		Session session = SecurityUtils.getSubject().getSession();
		User user  = (User) session.getAttribute(USER_SESSION_KEY);
		System.out.println("用户： "+user);
		LOGINUSER = user;
		// 权限信息对象，用来存放查出的用户的所有的角色（role）及权限（permission）等
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		if (null != user) {
			System.out.println("调用setRoles");
			authorizationInfo.setRoles(this.getUserRoles(user.getUserId()));
			authorizationInfo.setStringPermissions(this.getUserPermissions(user.getUserId()));
		}
		System.out.println("authorizationInfo:  "+authorizationInfo);
		return authorizationInfo;
	}

	/**
	 * 认证回调函数,登录时调用
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		logger.info("认证回调函数");

		UsernamePasswordToken authcToken = (UsernamePasswordToken) token;
		System.out.println("授权姓名authcToken.getUsername"+authcToken.getUsername());
		User user = null;
		try {
			user = userService.getUserByName(authcToken.getUsername());
			System.out.println("========>user:"+user +" authcToken.getUsername()"+authcToken.getUsername());
		} catch (Exception e) {
			logger.error("身份认证发生异常", e);
			throw new AuthenticationException("身份认证发生异常");
		}

		if (null == user) {
			logger.warn("身份认证失败，登录名不存在");
			throw new UnknownAccountException("身份认证失败，登录名不存在");
		}
		
/*		if (1 != user.getStatus()) {
			logger.warn("身份认证失败，用户已被禁用");
			throw new LockedAccountException("身份认证失败，用户已被禁用");
		}*/

		// 密码验证
/*		if (!user.getPassword().equals(Md5.getMD5ofStrByLowerCase(String.valueOf(authcToken.getPassword())))) {
			logger.warn("身份认证失败，登录密码不正确");
			throw new IncorrectCredentialsException("身份认证失败，登录密码不正确");
		}
*/
		Session session = SecurityUtils.getSubject().getSession();
		session.setAttribute(USER_SESSION_KEY, user);

		return new SimpleAuthenticationInfo(authcToken.getUsername(), authcToken.getPassword(), getName());
	}

	///////////////////////////////////////// private////////////////////////////////////
	/**
	 * 获取用户角色
	 * 
	 * @param userId
	 * @return
	 */
	private Set<String> getUserRoles(String userId) {
		System.out.println("获取用户角色 userId"+userId);
		List<Role> orRoleList = roleService.selectByUserId(userId);
			
		System.out.println("orRoleList: "+orRoleList);
		Set<String> roles = new HashSet<>();
		if (CollectionUtils.isEmpty(orRoleList)) {
			System.out.println("roles: "+roles);
			return roles;
		}

		for (Role or : orRoleList) {
			System.out.println("角色===>： "+or);
			roles.add(or.getRoleCode());
		}

		return roles;
	}

	/**
	 * 获取用户权限
	 * 
	 * @param userId
	 * @return
	 */
	private Set<String> getUserPermissions(String userId) {
		List<Permissions> permisList = perService.selectByUserId(userId);
		System.out.println("用户权限： permisList："+permisList);
		for(Permissions p:permisList)
		{
			System.out.println("p======>:"+p);
		}
		Set<String> stringPermissions = new HashSet<>();
		if (CollectionUtils.isEmpty(permisList)) {
			return stringPermissions;
		}

		for (Permissions op : permisList) {
			stringPermissions.add(op.getPermisCode());
		}

		return stringPermissions;
	}

}
