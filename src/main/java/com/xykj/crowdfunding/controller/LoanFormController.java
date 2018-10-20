package com.xykj.crowdfunding.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xykj.crowdfunding.common.ConstantsInSession;
import com.xykj.crowdfunding.filter.shiro.UserAuthorizingRealm;
import com.xykj.crowdfunding.reverse.pojo.Account;
import com.xykj.crowdfunding.reverse.pojo.Loanform;
import com.xykj.crowdfunding.service.AccountService;
import com.xykj.crowdfunding.service.LoanformService;
import com.xykj.crowdfunding.utils.EasyUIResult;
import com.xykj.crowdfunding.utils.P2PResult;
import com.xykj.crowdfunding.utils.P2pDateUtils;

@Controller
public class LoanFormController {
	@Autowired
	private LoanformService loanformService;
	@Autowired
	private AccountService accountService;
	/**
	 * 获取借款人标的详细信息
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getBorrowMarkInfos")
	public EasyUIResult<Loanform> demoList(@RequestParam(value="page",defaultValue="1") int page,
											@RequestParam(value="rows",defaultValue="20") int rows){
		
		System.out.println("进入了分页==============");
		//page 页数  默认显示第一页
		//rows 行数  默认显示20行
		return loanformService.getResult(page, rows);
	} 
	

	@ResponseBody
	@RequestMapping("/addLoanFormInfo")
	public P2PResult addLoanFormInfo(Loanform loanform)
	{
		if (ConstantsInSession.loginUser.getUserId()==null) {
			return P2PResult.build(0, "操作失败");
		}
		loanform.setBorrowUserId(ConstantsInSession.loginUser.getUserId());
		System.out.println("user: "+ConstantsInSession.loginUser.getName());
		loanform.setCreateUser(UserAuthorizingRealm.LOGINUSER.getName());
		loanform.setBidCount(0);
		loanform.setApplyTime(new Date());
		loanform.setPublishTime(new Date());
		loanform.setCurrentSum((long) 0);
		/*disable_date*/
		loanform.setDisableDate(P2pDateUtils.getExpireTimeWith(new Date(), loanform.getMonthes2Return()));
		System.out.println("loanform.getMonthes2Return(): "+loanform.getMonthes2Return());
		System.out.println("loanform: "+loanform);
		//判断金额是否足够
		List<Account> listAccount= accountService.getAccountByUserId(ConstantsInSession.loginUser.getUserId());
		if (listAccount==null||listAccount.size()==0) {
			return P2PResult.build(0, "操作失败");
		}
		Account userAccount = listAccount.get(0);
		
		boolean flag = loanformService.addLoanFormInfo(loanform);
		
		System.out.println("flag: "+flag);
		if (flag) {
			return P2PResult.build(1, "操作成功");
		}else {
			return P2PResult.build(0, "操作失败");
		}
	}
	
	@ResponseBody
	@RequestMapping("/getPreLoanAuditList")
	public EasyUIResult<Loanform> getPreLoanAuditList(@RequestParam(value="page",defaultValue="1") int page,
											@RequestParam(value="rows",defaultValue="20") int rows){
		
		System.out.println("进入了分页==============");
		//page 页数  默认显示第一页
		//rows 行数  默认显示20行
		return loanformService.getPreLoanAuditResult(page, rows);
	} 
	
	@ResponseBody
	@RequestMapping("/getLoanformInfoByLoanId")
	public P2PResult getLoanformInfoByLoanId(@RequestParam("loanId")Integer loanId)
	{
		Loanform lof = loanformService.getLoanformInfoByLoanId(loanId);
		System.out.println("lof: "+lof);
		if (lof != null) {
			return P2PResult.build(1, "操作成功", lof);
		}else {
			return P2PResult.build(0, "操作失败");
		}
	}
}
