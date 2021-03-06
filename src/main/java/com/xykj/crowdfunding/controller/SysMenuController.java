package com.xykj.crowdfunding.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xykj.crowdfunding.filter.shiro.UserAuthorizingRealm;
import com.xykj.crowdfunding.reverse.pojo.MenuTree;
import com.xykj.crowdfunding.reverse.pojo.SysMenu;
import com.xykj.crowdfunding.reverse.pojo.SysMenuTree;
import com.xykj.crowdfunding.reverse.pojo.User;
import com.xykj.crowdfunding.service.SysMenuService;
import com.xykj.crowdfunding.utils.P2PResult;

@Controller
@RequestMapping("menu")
public class SysMenuController {
	private static Logger logger = LoggerFactory.getLogger(SysMenuController.class);

	@Autowired
	private SysMenuService menuService;
	
	/**
	 * 获取用户菜单
	 */
	@RequestMapping("user_menu")
	@ResponseBody
	public P2PResult queryUseMenu(HttpServletRequest request) {
		User sysUser = (User) SecurityUtils.getSubject().getSession().getAttribute("sys_user");
		logger.info("获取用户菜单，用户ID：{}", sysUser.getUserId());
		
/*	
		List<SysMenu> menuList = menuService.queryUseMenu(sysUser.getUserId());
		if (menuList!=null && menuList.size()>0) {
			
	
			for(SysMenu m:menuList)
			{
				SysMenu parMenu = menuService.selectByPrimaryKey(m.getParentid());
				m.setParentMenuName(parMenu.getMenuName());
			}
		}*/
		List<SysMenu> menuList = menuService.getFirstClassAndSubMenus(sysUser.getUserId());
		List<SysMenuTree> sysTrees = new ArrayList<SysMenuTree>();
		
		for(SysMenu m:menuList)
		{
/*			MenuTree menuTree = new MenuTree();
			menuTree.setId(String.valueOf(m.getMenuId()));
			menuTree.setpId(String.valueOf(m.getParentid()));
			menuTree.setText(m.getMenuName());
			menuTree.setState("1");
			menuTree.setUrl(m.getMenuUrl());*/
			
			System.out.println("查询出来的菜单==============>:"+m);
		}
		if (menuList!=null&&menuList.size()>0) {
			return P2PResult.build(1, "操作成功", menuList);
		}
		return P2PResult.build(0, "操作失败");
	}
	
	/**
	 * 获取用户菜单
	 */
	@RequestMapping("sys_user_menu")
	@ResponseBody
	public P2PResult getSysMenuTree(HttpServletRequest request) {
		//User sysUser = (User) SecurityUtils.getSubject().getSession().getAttribute("sys_user");
		/*logger.info("获取用户菜单，用户ID：{}", sysUser.getUserId());*/
		User sysUser = UserAuthorizingRealm.LOGINUSER;
		if (sysUser==null) {
			return null;
		}
		System.out.println("user: "+sysUser);
		List<SysMenuTree> menuList = menuService.getSysMenuTree(sysUser.getUserId());
		
		System.out.println("哈哈哈哈+menuList： "+menuList.size());
		
		System.out.println("sysUser.getUserId(): "+sysUser.getUserId());
		for(SysMenuTree m:menuList)
		{
			System.out.println("查询出来的菜单==============>:"+m);
		}
		if (menuList!=null&&menuList.size()>0) {
			return P2PResult.build(1, "操作成功", menuList);
		}
		return P2PResult.build(0, "操作失败");
	}
	
	/**
	 * 管理页面
	 * 
	 * @return
	 */
	@RequiresPermissions("manater")
	@RequestMapping("dictionarymanage")
	public String personnelDepartment(HttpServletRequest request) {
		System.out.println("管理菜单界面：=======================");
		return "backstage/dictionarymanage";
	}
}
