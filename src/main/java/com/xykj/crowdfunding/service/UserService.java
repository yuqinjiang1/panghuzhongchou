package com.xykj.crowdfunding.service;

import java.util.List;

import com.xykj.crowdfunding.reverse.pojo.User;

/*import com.xykj.crowdfunding.pojo.User;*/

public interface UserService {
	/**
	 * 注册用户
	 * @param user
	 */
	public boolean register(User user);
	/**
	 * 验证用户名是否被注册
	 * @param name
	 * @return
	 */
	public boolean checkNameRegister(String name);
	/**
	 * 验证手机是否被注册
	 * @param phone
	 * @return
	 */
	public boolean checkPhoneRegister(String phone);
	/**
	 * 登录
	 * @param name
	 * @param password
	 * @return	是否登录成功
	 */
	public User login(String name,String password);
	/**
	 * 根据id查用户
	 * @param userId
	 * @return
	 */
	public User getUserById(String userId);
	/**
	 * 根据名称获取用户
	 * @param name
	 * @return
	 */
	public User getUserByName(String name);
	/**
	 * 获取所有的用户
	 * @return
	 */
	public List<User> getUsers();
	/**
	 * 修改密码
	 * @param user
	 * @return
	 */
	public boolean updatePassword(User user);
	
	/**
	 * 修改个人资料
	 * @param user
	 * @return
	 */
	public boolean updateUserInfo(User user);
	

}
