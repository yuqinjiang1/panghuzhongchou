package com.xykj.crowdfunding.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xykj.crowdfunding.reverse.dao.RealNameAuthenticationMapper;
import com.xykj.crowdfunding.reverse.pojo.RealNameAuthentication;
import com.xykj.crowdfunding.service.RealNameAuthenticationService;

@Service
public class RealNameAuthenticationServiceImpl implements
		RealNameAuthenticationService {
	@Autowired
	private RealNameAuthenticationMapper authenticationMapper;
	@Override
	public boolean addAuthInfo(RealNameAuthentication info) {
		int i = authenticationMapper.insert(info);
		if (i > 0) {
			return true;
		}
		return false;
	}

}
