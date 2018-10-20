package com.xykj.crowdfunding.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xykj.crowdfunding.reverse.pojo.Account;
import com.xykj.crowdfunding.service.AccountService;
import com.xykj.crowdfunding.utils.P2PResult;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService cService;
	
	/**
	 * 添加账户
	 * @param account
	 * @return
	 */
	@RequestMapping("/addAccount")
	@ResponseBody
	public P2PResult addAccount(Account account){
		
		boolean flag = cService.addAccount(account);
		System.out.println("flag: "+flag);
		if (flag) {
			return P2PResult.build(1, "操作成功");
		}else {
			return P2PResult.build(0, "操作失败");
		}
	}

	/**
	 * 充值
	 * @param account
	 * @return
	 */
	@RequestMapping("/recharge")
	@ResponseBody
	public P2PResult rechargeAccount(Account account){
		if (account.getUserId()==null||account.getUserId().equals("")) {
			return P2PResult.build(0, "操作失败");
		}
		List<Account> list = cService.getAccountByUserId(account.getUserId());
		//判断是否有数据，没有进行插入
		boolean flag = false;
		if (list==null || list.size()==0) {
			  long totalaccount = account.getTotalAccount();
			  account.setUsableAmount(totalaccount);
			  flag = cService.addAccount(account);
		}else {
			//有数据进行更新
			Account dbAccount = list.get(0);
			account.setAccountId(dbAccount.getAccountId());
			long totalAccount = dbAccount.getTotalAccount();
			System.out.println("totalAccount: "+totalAccount);
			
			totalAccount+=account.getTotalAccount();
			long usableAccount = dbAccount.getUsableAmount();
			usableAccount+=account.getTotalAccount();
			
			//重新赋值
			dbAccount.setTotalAccount(totalAccount);
			dbAccount.setUsableAmount(usableAccount);
			 flag = cService.updateAccountInfo(dbAccount);
			
			System.out.println("flag: "+flag);
			
		}
		if (flag) {
			return P2PResult.build(1, "操作成功");
		}else {
			return P2PResult.build(0, "操作失败");
		}
		
	}
	/**
	 * 查询账户信息
	 * @param userId
	 * @return
	 */
	@RequestMapping("/getAccountInfo")
	@ResponseBody
	public P2PResult getAccountInfo(@RequestParam("userId")String userId){
		System.out.println("查询账户信息");
		if (userId==null||userId.equals("")) {
			return P2PResult.build(0, "操作失败");
		}
		List<Account> list = cService.getAccountByUserId(userId);
		System.out.println("list: "+list);
		if (list!=null) {
			return P2PResult.build(1, "操作成功",list.get(0));
		}else {
			return P2PResult.build(0, "操作失败");
		}
	}
}
