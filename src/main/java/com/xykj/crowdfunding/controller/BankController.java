package com.xykj.crowdfunding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xykj.crowdfunding.reverse.pojo.Bank;
import com.xykj.crowdfunding.service.BankService;
import com.xykj.crowdfunding.utils.P2PResult;

@Controller
@RequestMapping("/bank")
public class BankController {
	@Autowired
	private BankService bService;
	
	@RequestMapping("/getBankInfoByUserId")
	@ResponseBody
	public P2PResult getBankInfoByUserId(@RequestParam("userId")String userId)
	{
		List<Bank> list = bService.getBankInfoByUserId(userId);
		if (list!=null) {
			return P2PResult.build(1, "操作成功",list);
		}else {
			return P2PResult.build(0, "操作失败");
		}
	}

}
