package com.xykj.crowdfunding.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xykj.crowdfunding.filter.shiro.UserAuthorizingRealm;
import com.xykj.crowdfunding.reverse.pojo.Account;
import com.xykj.crowdfunding.reverse.pojo.Bidobject;
import com.xykj.crowdfunding.reverse.pojo.Loanform;
import com.xykj.crowdfunding.service.AccountService;
import com.xykj.crowdfunding.service.BidobjectService;
import com.xykj.crowdfunding.service.LoanformService;
import com.xykj.crowdfunding.utils.P2PResult;

@Controller
@RequestMapping("/bid")
public class BidobjectController {
	@Autowired
	private BidobjectService oService;
	
	@Autowired
	private LoanformService lService;
	
	@Autowired
	private AccountService accountService;
	
	@ResponseBody
	@RequestMapping("/addBid")
	public P2PResult addSysDataDic(Bidobject bidobj)
	{
		System.out.println("bidobj.getActualRate():  "+bidobj.getActualRate());
		if (UserAuthorizingRealm.LOGINUSER.getUserId()==null) {
			return P2PResult.build(0, "请先登录");
		}
		System.out.println("bidobj: "+bidobj);
		bidobj.setBidTime(new Date());
		
		//查询账户的余额
		List<Account> listAccounts = accountService.getAccountByUserId(UserAuthorizingRealm.LOGINUSER.getUserId());
		if (listAccounts==null||listAccounts.size()==0) {
			 return P2PResult.build(0, "请先添加账号信息");
		}
		Account userAccount = listAccounts.get(0);
		if (bidobj.getAvailableAmount()>userAccount.getUsableAmount()) {
			 return P2PResult.build(0, "资金不够，请先充值！");
		}
		
		//查询标的信息
		Loanform loanform = lService.getLoanformInfoByLoanId(bidobj.getLoanId());
		
		bidobj.setActualRate(loanform.getCurrentRate());
		//投标
		boolean flag = oService.addBid(bidobj);
		
		
		
		System.out.println("loanForm: "+loanform);
		//更新投标信息
		int bidcount = loanform.getBidCount();
		System.out.println("bidcount: "+bidcount);
		bidcount+=1;
		loanform.setBidCount(bidcount);
		
		//更新已投金额
		Long currentSum = loanform.getCurrentSum();
		if (currentSum==null) {
			currentSum = (long) 0;
		}
		System.out.println("currentSum: "+currentSum +" bidobj.getAvailableAmount: "+bidobj.getAvailableAmount());
		currentSum+=bidobj.getAvailableAmount();
		loanform.setCurrentSum(currentSum);
		boolean updateFlag = lService.updateFormInfo(loanform);
		System.out.println("updateFlag: "+updateFlag);
		
		userAccount.setTotalAccount(userAccount.getTotalAccount()-bidobj.getAvailableAmount());
		userAccount.setUsableAmount(userAccount.getUsableAmount()-bidobj.getAvailableAmount());
		boolean accountFlag = accountService.updateAccountInfo(userAccount);
		System.out.println("更新账号信息结果： "+accountFlag);
		if (flag) {
				System.out.println("投标成功");
				return P2PResult.build(1, "投标成功");
		}else {
			System.out.println("投标失败");
			return P2PResult.build(0, "投标失败");
		}
	}
	
	
	@RequestMapping("/getBidsInfo")
	@ResponseBody
	public P2PResult getBidobjectsByLoanId(@RequestParam("loanId")Integer loanId)
	{
		List<Bidobject> list = oService.getBidobjectsByLoanId(loanId);
		if (list!=null && list.size()>0) {
			return P2PResult.build(1, "操作成功", list);
		}else {
			return P2PResult.build(0, "无数据");
		}
		
	}

}
