package com.xykj.crowdfunding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xykj.crowdfunding.common.ConstantsInSession;
import com.xykj.crowdfunding.reverse.dao.AccountMapper;
import com.xykj.crowdfunding.reverse.pojo.Account;
import com.xykj.crowdfunding.reverse.pojo.AccountExample;
import com.xykj.crowdfunding.reverse.pojo.AccountExample.Criteria;
import com.xykj.crowdfunding.service.AccountService;
import com.xykj.crowdfunding.utils.SymmetricEncoder;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountMapper accountMapper;
	@Override
	public boolean addAccount(Account account) {
		account.setTraderPassword(SymmetricEncoder.AESEncode(account.getTraderPassword()));
		int i = accountMapper.insert(account);
		if (i > 0) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean updateAccountInfo(Account account) {
		int i = accountMapper.updateByPrimaryKeySelective(account);
		if (i > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Account> getAccountByUserId(String userId) {
		if (userId==null||userId.equals("")) {
			return null;
		}
		AccountExample example = new AccountExample();
		//创建过滤条件
		Criteria criteria = example.createCriteria().andUserIdEqualTo(userId);
		List<Account> list =accountMapper.selectByExample(example);
		return list;
	}
}
