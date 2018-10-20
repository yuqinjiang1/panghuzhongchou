package com.xykj.crowdfunding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xykj.crowdfunding.reverse.dao.UserMapper;
import com.xykj.crowdfunding.reverse.pojo.User;
import com.xykj.crowdfunding.reverse.pojo.UserExample;
import com.xykj.crowdfunding.reverse.pojo.UserExample.Criteria;
import com.xykj.crowdfunding.service.EasyUIUserService;
import com.xykj.crowdfunding.utils.EasyUIResult;
import com.xykj.crowdfunding.utils.SymmetricEncoder;

@Service
public class EasyUIUserServiceImpl implements EasyUIUserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public EasyUIResult<User> getResult(int page, int rows) {
		UserExample example = new UserExample();
		//创建过滤条件
		Criteria criteria = example.createCriteria();
		//设置分页
		PageHelper.startPage(page, rows);
		List<User> list = userMapper.selectByExample(example);
		//取分页信息
		PageInfo<User> pageInfo = new PageInfo<User>(list);
		long total = pageInfo.getTotal();
		//将结果封装然后返回
		EasyUIResult<User> result = new EasyUIResult<User>(total,list);
		return result;
	}

	@Override
	public void addUser(User user) {
		user.setPassword(SymmetricEncoder.AESEncode(user.getPassword()));
		userMapper.insert(user);

	}

	@Override
	public EasyUIResult<User> getResult(String name, int page, int rows) {
		UserExample example = new UserExample();
		//创建过滤条件
		
		if (name!=null&&!name.equals("")) {
			Criteria criteria = example.createCriteria().andNameLike(name);
			
			System.out.println("创造过滤条件");
		}
		System.out.println("过滤条件name: "+name);
		//设置分页
		PageHelper.startPage(page, rows);
		List<User> list = userMapper.selectByExample(example);
		//取分页信息
		PageInfo<User> pageInfo = new PageInfo<User>(list);
		long total = pageInfo.getTotal();
		//将结果封装然后返回
		EasyUIResult<User> result = new EasyUIResult<User>(total,list);
		return result;
	}

}
