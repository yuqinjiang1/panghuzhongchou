package com.xykj.crowdfunding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xykj.crowdfunding.reverse.pojo.Role;
import com.xykj.crowdfunding.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private RoleService rService;
	
	@RequestMapping("/testRole")
	public String testRole(@RequestParam("userId")String userId)
	{
		List<Role> list = rService.selectByUserId(userId);
		
		return "success";
	}

}
