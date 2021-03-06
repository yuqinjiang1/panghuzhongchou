package com.xykj.crowdfunding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;








import com.xykj.crowdfunding.common.ConstantsInSession;
import com.xykj.crowdfunding.reverse.dao.UserMapper;
import com.xykj.crowdfunding.reverse.pojo.User;
import com.xykj.crowdfunding.reverse.pojo.UserExample;
import com.xykj.crowdfunding.reverse.pojo.UserExample.Criteria;
import com.xykj.crowdfunding.service.UserService;
import com.xykj.crowdfunding.utils.SymmetricEncoder;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public boolean register(User user) {
		/*int i = userDao.register(user);
		System.out.println("注册结果： "+i);
		if (i>0) {
			return true;
		}
		return false;*/
		//对密码进行加密
		user.setPassword(SymmetricEncoder.AESEncode(user.getPassword()));
		int i = userMapper.insert(user);
		System.out.println("插入数据结果："+i);
		if (i > 0) {
			return true;
		}
		return false;
	}
	@Override
	public boolean checkNameRegister(String name) {
/*		User user = userDao.getUserByName(name);
		if (user!=null) {
			System.out.println("用户名被注册了");
			return true;
		}
		return false;*/
		UserExample example = new UserExample();
		//创建过滤条件
		System.out.println("name: "+name);
		if (name!=null&&!name.equals("")) {
			Criteria criteria = example.createCriteria().andNameEqualTo(name);
			System.out.println("创造过滤条件");
		}
		List<User> list= userMapper.selectByExample(example);
		if (list!=null && list.size()>0) {
			System.out.println("用户名被注册了");
			return true;
		}
		System.out.println("用户名未注册:  ");
		return false;
	}
	@Override
	public boolean checkPhoneRegister(String phone){
/*		User user = userDao.getUserByPhone(phone);
		if (user!=null) {
			System.out.println("手机号被注册了");
			return true;
		}
		return false;*/
		
		UserExample example = new UserExample();
		//创建过滤条件
		
		if (phone!=null&&!phone.equals("")) {
			Criteria criteria = example.createCriteria().andPhoneEqualTo(phone);
			System.out.println("创造过滤条件");
		}
		List<User> list= userMapper.selectByExample(example);
		System.out.println("手机号查询结果:  "+list);
		if (list!=null&&list.size()>0) {
			System.out.println("手机号被注册了");
			return true;
		}
		return false;
	}
	@Override
	public User login(String name, String password) {
/*		User user = userDao.getUserByNameAndPassWord(name, password);
		System.out.println("user: "+user);
		return user;*/
		
		UserExample example = new UserExample();
		//创建过滤条件
		
		if (name!=null&&!name.equals("")&&password!=null &&!password.equals("")) {
			Criteria criteria = example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(SymmetricEncoder.AESEncode(password));
			System.out.println("  name: "+name);
		}else {
			return null;
		}
		List<User> list= userMapper.selectByExample(example);
		System.out.println("登录查询结果:size  "+list.size());
		User user = null;
		if (list!=null&&list.size()>0) {
			System.out.println("登录成功注册了");
			user = list.get(0);
		}
		System.out.println("登录的用户是是： "+user);
		return user;
	}
	@Override
	public User getUserById(String userId) {
		/*return userDao.getUserById(userId);*/
		return userMapper.selectByPrimaryKey(userId);
	}
	
	@Override
	public User getUserByName(String name) {
		
		if (name == null||name.equals("")) {
			return null;
		}
		UserExample example = new UserExample();
		//创建过滤条件
		
		Criteria criteria = example.createCriteria().andNameEqualTo(name);
			System.out.println("创造过滤条件 criteria"+criteria);
		
		List<User> list= userMapper.selectByExample(example);
		System.out.println("登录查询结果:  "+list);
		if (list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}
	
	@Override
	public List<User> getUsers() {
/*		List<User> list = userDao.getUsers();
		System.out.println("list:" + list);
		return list;*/
		UserExample example = new UserExample();
		List<User> list = userMapper.selectByExample(example);
		System.out.println("查询结果："+list);
		return list;
	}
	
	@Override
	public boolean updatePassword(User user) {
/*		int i = userDao.updatePassword(user);
		if (i > 0) {
			return true;
		}
		return false;*/
		User updateUser = new User();
		updateUser.setUserId(ConstantsInSession.loginUser.getUserId());
		updateUser.setPassword(SymmetricEncoder.AESEncode(user.getPassword()));
		int i = userMapper.updateByPrimaryKeySelective(updateUser);
		if (i > 0) {
			System.out.println("修改成功");
			return true;
		}
		System.out.println("修改失败");
		return false;
	}

	@Override
	public boolean updateUserInfo(User user) {
		System.out.println("修改的用户信息： "+user);
		user.setUserId(ConstantsInSession.loginUser.getUserId());
		/*int i = userMapper.updateByPrimaryKey(user);*/
		int i = userMapper.updateByPrimaryKeySelective(user);
		if (i > 0) {
			return true;
		}
		return false;
	}




}
