package com.xykj.crowdfunding.service;

import com.xykj.crowdfunding.reverse.pojo.Loanform;
import com.xykj.crowdfunding.utils.EasyUIResult;

public interface LoanformService {
	/**
	 * 我的借款
	 * @param page
	 * @param rows
	 * @return
	 */
	public EasyUIResult<Loanform> getResult(int page,int rows);
	/**
	 * 借款前审核的借款数据
	 * @param page
	 * @param rows
	 * @return
	 */
	public EasyUIResult<Loanform> getPreLoanAuditResult(int page,int rows);
	
	/**
	 * 借款
	 * @param loanform
	 * @return
	 */
	public boolean addLoanFormInfo(Loanform loanform);
	/**
	 * 更新借款信息
	 * @param loanform
	 * @return
	 */
	public boolean updateFormInfo(Loanform loanform);
	/**
	 * 通过id获取借款信息
	 * @param loadId
	 * @return
	 */
	public Loanform getLoanformInfoByLoanId(Integer loadId);

	
}
