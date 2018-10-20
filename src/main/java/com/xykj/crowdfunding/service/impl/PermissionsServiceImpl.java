package com.xykj.crowdfunding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xykj.crowdfunding.reverse.dao.PermissionsMapper;
import com.xykj.crowdfunding.reverse.pojo.Permissions;
import com.xykj.crowdfunding.service.PermissionsService;

@Service
public class PermissionsServiceImpl implements PermissionsService {
	@Autowired
	private PermissionsMapper permissionsMapper;

	@Override
	public List<Permissions> selectByUserId(String userId) {
		List<Permissions> list = permissionsMapper.selectByUserId(userId);
		System.out.println("list"+list+" size: "+list.size());
		return list;
	}

}
