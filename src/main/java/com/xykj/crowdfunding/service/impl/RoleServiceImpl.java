package com.xykj.crowdfunding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xykj.crowdfunding.reverse.dao.RoleMapper;
import com.xykj.crowdfunding.reverse.pojo.Role;
import com.xykj.crowdfunding.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public int deleteByPrimaryKey(Integer roleId) {
		return 0;
	}

	@Override
	public int insert(Role record) {
		return 0;
	}

	@Override
	public Role selectByPrimaryKey(Integer roleId) {
		return null;
	}

	@Override
	public List<Role> selectByUserId(String userId) {
		List<Role> list = roleMapper.selectByUserId(userId);
		System.out.println("List<Role> selectByUserId list: "+list);
		return list;
	}

	@Override
	public List<Role> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Role record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
