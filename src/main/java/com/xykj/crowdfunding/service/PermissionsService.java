package com.xykj.crowdfunding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xykj.crowdfunding.reverse.pojo.Permissions;


@Service
public interface PermissionsService {
	/**
	 * 按用户ID查询用户权限
	 * 
	 * @param userId
	 * @return
	 */
	List<Permissions> selectByUserId(String userId);

}
