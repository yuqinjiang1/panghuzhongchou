package com.xykj.crowdfunding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xykj.crowdfunding.common.ConstantsInSession;
import com.xykj.crowdfunding.reverse.dao.BankMapper;
import com.xykj.crowdfunding.reverse.pojo.Bank;
import com.xykj.crowdfunding.reverse.pojo.BankExample;
import com.xykj.crowdfunding.reverse.pojo.BankExample.Criteria;
import com.xykj.crowdfunding.service.BankService;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankMapper bMapper;
	@Override
	public List<Bank> getBankInfoByUserId(String userId) {
		if (userId == null) {
			return null;
		}
		BankExample example = new BankExample();
		//创建过滤条件
		Criteria criteria = example.createCriteria().andUserIdEqualTo(userId);

		List<Bank> list = bMapper.selectByExample(example);
		return list;
	}

}
