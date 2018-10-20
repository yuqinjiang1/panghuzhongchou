package com.xykj.crowdfunding.service;

import java.util.List;

import com.xykj.crowdfunding.reverse.pojo.Account;

public interface AccountService {
	/**
	 * 添加账户
	 * @param account
	 * @return
	 */
	public boolean addAccount(Account account);
	/**
	 * 修改账号信息
	 * @param account
	 * @return
	 */
	public boolean updateAccountInfo(Account account);
	/**
	 * 根据用户id查找账户
	 * @param userId
	 * @return
	 */
	public List<Account> getAccountByUserId(String userId);

}
