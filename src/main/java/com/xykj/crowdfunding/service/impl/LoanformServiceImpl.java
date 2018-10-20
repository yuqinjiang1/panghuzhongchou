package com.xykj.crowdfunding.service.impl;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xykj.crowdfunding.common.ConstantsInSession;
import com.xykj.crowdfunding.filter.shiro.UserAuthorizingRealm;
import com.xykj.crowdfunding.reverse.dao.LoanformMapper;
import com.xykj.crowdfunding.reverse.pojo.Loanform;
import com.xykj.crowdfunding.reverse.pojo.LoanformExample;
import com.xykj.crowdfunding.reverse.pojo.User;
import com.xykj.crowdfunding.reverse.pojo.LoanformExample.Criteria;
import com.xykj.crowdfunding.service.LoanformService;
import com.xykj.crowdfunding.utils.EasyUIResult;

@Service
public class LoanformServiceImpl implements LoanformService {
	@Autowired
	private LoanformMapper loanformMapper;
	@Override
	public EasyUIResult<Loanform> getResult(int page, int rows) {
		LoanformExample example = new LoanformExample();
		
		//System.out.println("查询借款ConstantsInSession.loginUser.getUserId(): "+ConstantsInSession.loginUser.getUserId());
		
		//创建过滤条件
		if (UserAuthorizingRealm.LOGINUSER!=null&&!UserAuthorizingRealm.LOGINUSER.getUserId().equals("")) {
			Criteria criteria = example.createCriteria().andBorrowUserIdEqualTo(UserAuthorizingRealm.LOGINUSER.getUserId());
		}
		
		//设置分页
		PageHelper.startPage(page, rows);
		List<Loanform> list = loanformMapper.selectByExample(example);
		//取分页信息
		PageInfo<Loanform> pageInfo = new PageInfo<Loanform>(list);
		long total = pageInfo.getTotal();
		//将结果封装然后返回
		EasyUIResult<Loanform> result = new EasyUIResult<Loanform>(total,list);
		for(Loanform f:result.getRows())
		{
			System.out.println("f==>"+f);
			long currentSum = f.getCurrentSum();
			System.out.println("currentSum:===>"+currentSum);
			
			float progr = (float) ((100.0)*f.getCurrentSum()/f.getBidRequestAmount());
			System.out.println("f.getCurrentRate():  "+f.getCurrentSum() +" f.getBidRequestAmount()"+f.getBidRequestAmount());
			DecimalFormat df = new DecimalFormat("0.00");
	        /*String num3 = df.format(num);*/
			String rateString = String.valueOf(f.getCurrentRate())+"%";
			f.setProgressStr(df.format(progr)+"%");
			f.setCurrentRateStr(rateString);
			System.out.println("progr:  "+progr+"  rateString: "+rateString);
			
			if (f.getRetrunType()==1) {
				f.setReturnTypeString("按月分期");
			}else {
				f.setReturnTypeString("按月到期");
			}
		}
		return result;
	}

	@Override
	public EasyUIResult<Loanform> getPreLoanAuditResult(int page, int rows) {
		LoanformExample example = new LoanformExample();
		//创建过滤条件
		Criteria criteria = example.createCriteria().andBidRequestStateEqualTo(0).andBorrowUserIdNotEqualTo(ConstantsInSession.loginUser.getUserId());
		//设置分页
		PageHelper.startPage(page, rows);
		List<Loanform> list = loanformMapper.selectByExample(example);
		//取分页信息
		PageInfo<Loanform> pageInfo = new PageInfo<Loanform>(list);
		long total = pageInfo.getTotal();
		//将结果封装然后返回
		EasyUIResult<Loanform> result = new EasyUIResult<Loanform>(total,list);
		for(Loanform f:result.getRows())
		{
			//var progress = parseInt(100*borrowInfo.currentSum/borrowInfo.bidRequestAmount);
			float progr = (float) ((100.0)*f.getCurrentSum()/f.getBidRequestAmount());
			String rateString = String.valueOf(f.getCurrentRate())+"%";
			System.out.println("f.getCurrentSum():  "+f.getCurrentSum() +" f.getBidRequestAmount()"+f.getBidRequestAmount());
			DecimalFormat df = new DecimalFormat("0.00");
			f.setProgressStr(df.format(progr)+"%");
			f.setCurrentRateStr(rateString+"%");
			System.out.println("progr:  "+progr+"  rateString: "+rateString);
			System.out.println("f==>"+f);
			
			if (f.getRetrunType()==1) {
				f.setReturnTypeString("按月分期");
			}else {
				f.setReturnTypeString("按月到期");
			}
		}
		return result;
	}
	@Override
	public boolean addLoanFormInfo(Loanform loanform) {
		/*loanform.setBorrowUserId(${user.name });*/
		int result = loanformMapper.insert(loanform);
		if (result > 0) {
			return true;
		}
		return false;
	}
	
	@Override
	public Loanform getLoanformInfoByLoanId(Integer loadId) {
		LoanformExample example = new LoanformExample();
		//创建过滤条件
		Criteria criteria = example.createCriteria().andLoanIdEqualTo(loadId);
		//设置分页
		
		Loanform loanformInfo = loanformMapper.selectByPrimaryKey(loadId);
		if (loanformInfo.getRetrunType()==1) {
			loanformInfo.setReturnTypeString("按月分期");
		}else {
			loanformInfo.setReturnTypeString("按月到期");
		}
		return loanformInfo;
	}

	@Override
	public boolean updateFormInfo(Loanform loanform) {
		LoanformExample example = new LoanformExample();
		//创建过滤条件
		Criteria criteria = example.createCriteria().andLoanIdEqualTo(loanform.getLoanId());
		//设置分页
		
		int i = loanformMapper.updateByExampleSelective(loanform, example);
		if (i > 0) {
			return true;
		}
		return false;
	}
}
