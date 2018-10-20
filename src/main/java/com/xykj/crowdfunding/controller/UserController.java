package com.xykj.crowdfunding.controller;

import java.io.IOException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import com.xykj.crowdfunding.common.ConstantsInSession;
import com.xykj.crowdfunding.filter.shiro.UserAuthorizingRealm;
import com.xykj.crowdfunding.reverse.pojo.Account;
import com.xykj.crowdfunding.reverse.pojo.Loanform;
import com.xykj.crowdfunding.reverse.pojo.SysMenu;
import com.xykj.crowdfunding.reverse.pojo.User;
import com.xykj.crowdfunding.service.AccountService;
import com.xykj.crowdfunding.service.EasyUIUserService;
import com.xykj.crowdfunding.service.SysMenuService;
import com.xykj.crowdfunding.service.UserService;
import com.xykj.crowdfunding.utils.JavaMailUtil;
import com.xykj.crowdfunding.utils.P2PResult;
import com.xykj.crowdfunding.utils.P2pDateUtils;
import com.xykj.crowdfunding.utils.SendMsgUtil;
import com.xykj.crowdfunding.utils.SerializeUtil;


@Controller

public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private SysMenuService menuService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private JedisPool jedisPool;
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	/**
	 * 获取验证码
	 * @param response
	 * @param session
	 */
	@RequestMapping(value="/getVerifyCode")
	public void gerenate(HttpServletResponse response ,HttpSession session) {
		ByteArrayOutputStream  output = new ByteArrayOutputStream();
		System.out.println("获取验证码");
		@SuppressWarnings("unused")
		String verifyCodeValue = drawImg(output);
		session.setAttribute("verifyCodeValue", verifyCodeValue);
		try {
			ServletOutputStream out = response.getOutputStream();
			output.writeTo(out);
			/*ImageIO.write(buffImg, "jpeg", out);
			out.close();*/
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 绘画验证码
	 * @param output
	 * @return
	 */
	 
	private String drawImg(ByteArrayOutputStream output) {
		String code = "";
		for(int i = 0;i< 4;i++) {
			code+= randomChar();
		}
		int width = 70;
		int height = 35;
		BufferedImage bi = new BufferedImage(width, height,BufferedImage.TYPE_USHORT_555_RGB);
		Font font = new Font("Times new Roman", Font.PLAIN, 20);
	//调用Graphics2d绘画验证码
		Graphics2D g = bi.createGraphics();
		g.setFont(font);
	    Color color = new Color(0,0,205);
	    g.setColor(color);
	    g.setBackground(new Color(255,255,224));
	    g.clearRect(0,0, width, height);
	    FontRenderContext context = g.getFontRenderContext();
	    Rectangle2D bounds = font.getStringBounds(code, context);
	    double x = (width - bounds.getWidth())/2;
	    double y = (height - bounds.getHeight())/2;
	    double ascent = bounds.getY();
	    //干扰线
	    Random random = new Random();
	      for(int i=0;i<8;i++){
	         int x1=random.nextInt(width);
	         int y1=random.nextInt(height);
	         int x2=random.nextInt(width);
	         int y2=random.nextInt(height);
	         g.drawLine(x1, y1, x1+x2, y1+y2);
	      }
	    @SuppressWarnings("unused")
		double daseY = y - ascent;
	    g.drawString(code, (int)x, 20);
	    g.dispose();
	    try {
			ImageIO.write(bi, "jpg", output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return code;
	}
	
	/**
	 * 随机字符生成
	 * @return
	 */
	private char randomChar() {
		Random r = new Random();
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		return s.charAt(r.nextInt(s.length()));
	}
	
	/**
	 * 校验图形验证码
	 * @param request
	 * @param response
	 * @param session
	 * @throws IOException
	 */

	/**
	 * 注册
	 * @param name
	 * @param password
	 * @param phone
	 * @param request
	 * @return
	 */

	@RequestMapping("/checkVerifyCode")
	public void checkInputVerfiCode(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
		/*request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");*/
		String inputVerfiCode = request.getParameter("verifyCode");
		System.out.println("yanzhengmadezhi=====:"+inputVerfiCode);
		String verifyCodeValue = (String) session.getAttribute("verifyCodeValue");
	    System.out.println("sessionzhongd yanzhengmadezhi"+verifyCodeValue);
	    if(verifyCodeValue.equals(inputVerfiCode.toUpperCase())) {
	             
	    	/*return new Result<String>(true, "输入验证ok", null) ;*/
	    	System.out.println("验证码正确");
	    	response.setCharacterEncoding("utf-8");
	    	response.getWriter().write("√");
	    }else {
	    	System.out.println("验证码错误");
	    	/*return new Result<String>(false, "输入验证码不正确", null) ;    }*/
	    }
	}

	/**
	 * 校验用户名是否注册
	 * @param name
	 * @param response
	 * @throws IOException
	 * @throws ServletException 
	 */
	@RequestMapping("/checkNameRegister")
	public void checkNameRegister(@RequestParam("name")String name,HttpServletResponse response) throws IOException, ServletException
	{
		
		response.setCharacterEncoding("utf-8");
		
		if(name!=null | name.equals("")){
			//System.out.println("name===>"+name);
			
			boolean flag = userService.checkNameRegister(name);
			//System.out.println("flag=======>"+flag);
			if (flag) {
				System.out.println("用户名已注册");
				response.getWriter().write("×");
				
			}else {
				System.out.println("用户名可用");
				response.getWriter().write("√");
				
				
			}
			
			
		}
		
	}

	/**
	 * 校验手机号是否注册
	 * @param phone
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/checkPhoneRegister")
	public void checkPhoneRegister(@RequestParam("phone")String phone,HttpServletResponse response) throws IOException
	{
		boolean flag = userService.checkPhoneRegister(phone);
		if (flag) {
			System.out.println("手机号已注册");
			response.getWriter().write("手机号已注册");
		}else {
			System.out.println("手机号可用");
			response.getWriter().write("√");
		}
		
	}

	/**
	 * 注册
	 * @param name
	 * @param password
	 * @param phone
	 * @return
	 */
	@RequestMapping("/register")
	public String register(@RequestParam("name")String name,
			@RequestParam("password")String password,@RequestParam("phone") String phone,HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("注册");
		String name0 = request.getParameter("name");
		String password0 = request.getParameter("password");
		String phone0=request.getParameter("phone");
		System.out.println(name0+"------->"+password0+"-------->"+phone0);
		
	
		//User user = new User(UUID.randomUUID().toString(), name, password, phone);
		User user  = new User();
		String userIdString = UUID.randomUUID().toString();
		user.setUserId(userIdString);
		user.setName(name);
		user.setPassword(password);
		user.setPhone(phone);
		user.setRegisterTime(new Date());
		user.setTraderPassword(password);
		boolean flag = userService.register(user);
		if (flag) {
			//注册成功 跳转到登录界面
			System.out.println("注册成功。。");
			//注册成功，添加账户信息
			Account account = new Account();
			account.setUserId(userIdString);
			account.setNickName(name);
			boolean accountflag = accountService.addAccount(account);
			System.out.println("accountflag: "+accountflag);
			return "login";
		}
		//注册失败
		System.out.println("注册失败");
		return "register";
		
	}
	
	/**
	 * 登录
	 * @param name	用户名
	 * @param password	密码
	 * @param map
	 * @return
	 * @throws Exception 
	 * @throws ServletException 
	 */
	@RequestMapping("/login")



	public String login(@RequestParam("name")String name,@RequestParam("password")String password,HttpServletRequest request,HttpServletResponse response,Model model) throws ServletException, Exception{
		 
			//校验用户和密码
			if (name == null | name.equals("")) {
				System.out.println("====>");
				request.setAttribute("Message", "用户名不能为空!!!");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				return "login";
			}

		
			if (password == null | password.equals("")) {
				request.setAttribute("Messagepwd", "密码不能为空!!!");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				return "login";
			}
			User user = userService.login(name, password);
			/*Jedis jedis = jedisPool.getResource();
			String key  = "UserController.login"+name;
			System.out.println("UserController.login: "+key);
			byte[] userbytes = jedis.get(key.getBytes());
			if (userbytes!=null && userbytes.length>0) {
				User jedisuser = (User) SerializeUtil.unserialize(userbytes);
				System.out.println("jedisuser: "+jedisuser);
			}else {
				jedis.set(key.getBytes(), SerializeUtil.serialize(user));
			}
			jedis.close();*/
			if (user!=null) {
				//登录成功
				user.setLastLoginTime(new Date());
				ConstantsInSession.loginUser = user;
				UserAuthorizingRealm.LOGINUSER = user;
				
				//更新登录时间
				boolean flag = userService.updateUserInfo(user);
				System.out.println("更新登录时间结果flag:"+flag);
				request.getSession().setAttribute("user", user);
				System.out.println("登录成功 user"+user+" ConstantsInSession.loginUser getUserId: "+ConstantsInSession.loginUser.getUserId());
				//重定向到首页
				
				try {
					String username = request.getParameter("name");
					String pwd = request.getParameter("password");
					UsernamePasswordToken token = new UsernamePasswordToken(username, pwd);
					Subject currentUser = SecurityUtils.getSubject();
					
					System.out.println("currentUser.isAuthenticated(): "+currentUser.isAuthenticated());
					//没有登录的用户进行登录
					if (!currentUser.isAuthenticated()) {
						currentUser.login(token);
					}

					Locale locale = Locale.SIMPLIFIED_CHINESE;
					Date date = new Date();
					DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
					String formattedDate = dateFormat.format(date);

					model.addAttribute("currentUser", username);
					model.addAttribute("serverTime", formattedDate);
				} catch (UnknownAccountException uae) {
					// 用户名未知...
					logger.error("用户不存在", uae);
					model.addAttribute("errorMsg", "用户不存在");
					return "403";
				} catch (IncorrectCredentialsException ice) {
					// 凭据不正确，例如密码不正确 ...
					logger.error("密码不正确", ice);
					model.addAttribute("errorMsg", "密码不正确");
					return "403";
				} catch (LockedAccountException lae) {
					// 用户被锁定，例如管理员把某个用户禁用...
					logger.error("用户被禁用", lae);
					model.addAttribute("errorMsg", "用户被禁用");
					return "403";
				} catch (ExcessiveAttemptsException eae) {
					// 尝试认证次数多余系统指定次数 ...
					logger.error("请求次数过多，用户被锁定", eae);
					model.addAttribute("errorMsg", "请求次数过多，用户被锁定");
					return "403";
				} catch (Exception ex) {
					logger.error("未知错误，无法完成登录", ex);
					model.addAttribute("errorMsg", "未知错误，无法完成登录");
					return "403";
				}
				
				
				return "redirect:/index.jsp";
			}else {
				//登录失败
				request.setAttribute("Messagepwd", "用户密码不匹配!!!");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		
		return "success";
	}
	/**
	 *注销
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/logout")
	public String logOut(HttpServletRequest request,HttpServletResponse response){
		/*request.getSession().invalidate();*/
		ConstantsInSession.loginUser = null;
		UserAuthorizingRealm.LOGINUSER = null;
		System.out.println("注销了");
		return "redirect:/login.jsp";
	}
	/**
	 * 查询用户
	 * @param userid
	 * @param map
	 * @return
	 */
	@RequestMapping("/getUserById")
	@ResponseBody
	public P2PResult getUserById(HttpServletRequest request,@RequestParam("userid")String userid,Map<String,Object>map){
		User user = userService.getUserById(userid);
		map.put("user", user);
		System.out.println("====>user: "+user);
		
		if (user!=null) {
			return P2PResult.build(1, "操作成功", user);
		}else {
			return P2PResult.build(0, "操作失败");
		}
	}

	@RequestMapping("/emailTo")
	public String emailTo(@RequestParam("email")String email)
	{
		
		return "success";
	}
	
	

@ResponseBody
@RequestMapping(value="sendme" ,method = RequestMethod.GET)
public ModelAndView sendme(@RequestParam(value="phone") String phone,HttpServletRequest request) throws  IOException{
     ModelAndView model = new ModelAndView();
     if(!userService.checkPhoneRegister(phone)){//查找是否被注册
      HashMap<String, String> m = SendMsgUtil.getMessageStatus(phone); //应用发送短信接口  
      String result = m.get("result");   //获取到result值  
           if (result.trim().equals("1")) {  
                 String code = m.get("code");
                 System.out.println(code+"============================================================================");
 
                 HttpSession  session = request.getSession(); //设置session  
                 session.setAttribute(phone+"code", code);    //将短信验证码放到session中保存  
                 session.setMaxInactiveInterval(60 * 3); //缓存设置3分钟
                 System.out.println("发送成功");
                 model.addObject("flag", "短信发送成功");
              }else{
                 model.addObject("flag", "短信发送失败,请重试");
             }
                 model.addObject("phone", phone);
                 model.setViewName("phone");
          }else{
               model.addObject("flag1", "该手机号已被注册");
               model.addObject("phone", phone);
               model.setViewName("phone");
           }
               return model;
 
}
 

@RequestMapping(value="phone")
public String phone() {
	return "phone";
}

 
/*@RequestMapping(value="comparecode" ,method = RequestMethod.POST)
public ModelAndView comparecode(@RequestParam(value="code") String code,Phone pmodel,HttpServletRequest request){
ModelAndView model = new ModelAndView();
       //从session中比对发送的验证码
       HttpSession  session = request.getSession();//设置session
       String sessioncode =(String) session.getAttribute(pmodel.getPhone()+"code");
       System.out.println(sessioncode);
     if((code).equals(sessioncode)){//比对缓存
	       //注册
          service.registUser(pmodel);
          model.addObject("result", "注册成功");
      }else{
    	  
        model.addObject("result", "验证码不正确 ，注册失败");
        model.setViewName("phone");
 
      }
     model.setViewName("result");
     return model;
 
}*/


	@RequestMapping("/getUsers")
	public String getUsers(Map<String,Object>map)
	{
		List<User> list = userService.getUsers();
		map.put("list", list);
		return "success";
	}

	
	
	/**
	 * 修改密码
	 * @param userId	用户id
	 * @param oldPassword	旧密码
	 * @param newPassword	新密码
	 * @param confirmPassword	确认密码
	 * @param request
	 * @return
	 */
	@RequestMapping("/updatePassword")
	public String updatePassWord(@RequestParam("userId")String userId,@RequestParam("oldPassword")String oldPassword,@RequestParam("newPassword")String newPassword,@RequestParam("confirmPassword")String confirmPassword,HttpServletRequest request)
	{
		System.out.println(userId+"===>"+oldPassword+"===>"+newPassword+"===>"+confirmPassword);
	/*	if (userId == null || oldPassword == null|| newPassword == null|| confirmPassword == null) {
			
		}*/
		//补充判断 空/相等
		
		User user = userService.getUserById(userId);
		//判断 旧密码是否正确
		if (!user.getPassword().equals(oldPassword)) {
			
			//返回
			
		}else {
		
			
			
		}
		
		return "success";
	}

	
	@ResponseBody
	@RequestMapping("/updateUserInfo")
	public P2PResult updateUserInfo(User user)
	{
		boolean flag = userService.updateUserInfo(user);
		System.out.println("修改个人资料结果flag: "+flag);
		if (flag) {
			return P2PResult.ok("{\"success\":1,\"message\":\"操作成功\"}");
		}else {
			return P2PResult.build(0, "操作失败");
		}
	} 
	
	
	/**
	 * 加载content页面
	 * 
	 * @return
	 */
	@RequestMapping("content/data")
	@ResponseBody
	public P2PResult contentData(HttpServletRequest request) {
		logger.info("======content=data=========");
		Map<String, Object> data = new HashMap<>();
/*		data.put("userList", userService.selectAll());
		data.put("roleList", roleService.selectAll());
		data.put("userRoleList", userRoleService.selectAll());
		data.put("permissionList", permissionService.selectAll());
		data.put("rolePermisList", rolePermisService.selectAll());*/
		User user = ConstantsInSession.loginUser;
		System.out.println("用户是==========>: "+user);
		List<SysMenu> list = menuService.queryUseMenu(user.getUserId());
		System.out.println("list: "+list.size());
/*		for(SysMenu menu:list)
		{
			System.out.println("menu 0: "+list.get(0));
		}*/
		if (list!=null && list.size()>0) {
			System.out.println("menu 0: "+list.get(0));
			//menuService.selectAll()
		/*	data.put("menuList", list);*/
			for(SysMenu m:list)
			{
				SysMenu parMenu = menuService.selectByPrimaryKey(m.getParentid());
				m.setParentMenuName(parMenu.getMenuName());
			}
		}
		
/*		for(SysMenu m:list)
		{
			System.out.println("m===>"+m);
		}*/
//		return data;
		return new P2PResult(data);
	}
	/**
	 * 发送认证邮箱的邮件
	 * @param email
	 * @return
	 */
	@RequestMapping("/sendVerifyEmail")
	@ResponseBody
	public P2PResult sendVerifyEmail(@RequestParam("userId")String userId,@RequestParam("email")String email)
	//http://192.168.1.66:8080/jiang_crowd_funding/index.jsp
	{
		JavaMailUtil.sendEmail(new String[]{email}, "众筹网，请在24小时内完成验证", "<a href=\"http://192.168.1.66:8080/jiang_crowd_funding/verifyEmail?email="+email+"&userId="+userId+"\">点击验证</a>");
		//存储发送邮件的时间
		User updateUser = new User();
		updateUser.setUserId(userId);
		updateUser.setEmailsenddate(new Date());
		
		userService.updateUserInfo(updateUser);
		return P2PResult.build(1, "发送成功");
	}
	/**
	 * 验证邮箱
	 * @param userId
	 * @param email
	 * @param response
	 * @param request
	 * @throws IOException
	 */
	@RequestMapping("/verifyEmail")
	/*@ResponseBody*/
	public void verifyEmail(@RequestParam("userId")String userId,@RequestParam("email")String email,HttpServletResponse response,HttpServletRequest request) throws IOException
	//http://192.168.1.66:8080/jiang_crowd_funding/index.jsp
	{
		request.setCharacterEncoding("utf-8");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		
		Date currentDate = new Date();
		User dbUser = userService.getUserById(userId);
		System.out.println("dbUser: "+dbUser);
		Date sendDate = dbUser.getEmailsenddate();
		long hours = P2pDateUtils.hoursBetweenTwoDate(sendDate, currentDate);
		OutputStream ps = response.getOutputStream();
		
		if (hours <= 24) {
			
	        //这句话的意思，使得放入流的数据是utf8格式
	        ps.write("验证成功".getBytes("UTF-8"));
	        
			/*response.getWriter().write("验证成功");*/
			dbUser.setEmail(email);
			dbUser.setMailboxAuthenticationFlag(true);
			boolean flag = userService.updateUserInfo(dbUser);
			System.out.println("修改认证结果："+flag);
			/*return P2PResult.build(1, "验证成功");*/
		}else {
			 ps.write("连接已过期".getBytes("UTF-8"));
			/*response.getWriter().write("连接已过期");*/
			/*return P2PResult.build(0, "验证码已失效");*/
		}
	}
}
