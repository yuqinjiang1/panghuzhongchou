package com.xykj.crowdfunding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xykj.crowdfunding.reverse.pojo.RealNameAuthentication;
import com.xykj.crowdfunding.service.RealNameAuthenticationService;
import com.xykj.crowdfunding.utils.P2PResult;

@Controller
/*@RequestMapping("/Authentication")*/
public class RealNameAuthenticationController {
	@Autowired
	private RealNameAuthenticationService authenticationService;
	
	@RequestMapping("/addAuthInfo")
	@ResponseBody
	public P2PResult addAuthInfo(RealNameAuthentication info)
	{
		System.out.println("info: "+info);
		boolean flag = authenticationService.addAuthInfo(info);
		System.out.println("flag: "+flag);
	
		if (flag) {
			return P2PResult.build(1, "操作成功");
		}else {
			return P2PResult.build(0, "操作失败");
		}
	}

}
