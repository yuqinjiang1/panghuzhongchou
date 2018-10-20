package com.xykj.crowdfunding.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xykj.crowdfunding.reverse.dao.SysMenuMapper;
import com.xykj.crowdfunding.reverse.pojo.MenuChildrenTree;
import com.xykj.crowdfunding.reverse.pojo.SysMenu;
import com.xykj.crowdfunding.reverse.pojo.SysMenuTree;
import com.xykj.crowdfunding.service.SysMenuService;

@Service
public class SysMenuServiceImpl implements SysMenuService{
	@Autowired
	private SysMenuMapper menuMapper;

	@Override
	public int deleteByPrimaryKey(Integer menuId) {
		return 0;
	}

	@Override
	public int insert(SysMenu record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysMenu selectByPrimaryKey(Integer menuId) {
		return menuMapper.selectByPrimaryKey(menuId);
	}

	@Override
	public List<SysMenu> queryUseMenu(String userId) {
		
		return menuMapper.queryUseMenu(userId);
	}

	@Override
	public List<SysMenu> selectAll() {
		return menuMapper.selectAll();
	}

	@Override
	public int updateByPrimaryKeySelective(SysMenu record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SysMenu> getFirstClassAndSubMenus(String userId) {
		List<SysMenu> list = menuMapper.getFirstClassMenuByUserId(userId);
		for(SysMenu m:list)
		{
			List<SysMenu> subMenus = menuMapper.getSubMenusByParentIdAndUserId(m.getMenuId(), userId);
			m.setSubMenus(subMenus);
		}
		return list;
	}

	@Override
	public List<SysMenuTree> getSysMenuTree(String userId) {
		List<SysMenu> list = menuMapper.getFirstClassMenuByUserId(userId);
		List<SysMenuTree> sysTrees = new ArrayList<SysMenuTree>();
		for(SysMenu m:list)
		{
			SysMenuTree sysParentTree = new SysMenuTree();
			sysParentTree.setText(m.getMenuName());
			List<MenuChildrenTree> childrenList = new ArrayList<MenuChildrenTree>();
			
			
			List<SysMenu> subMenus = menuMapper.getSubMenusByParentIdAndUserId(m.getMenuId(), userId);
			for(SysMenu sb:subMenus)
			{
				MenuChildrenTree cTree = new MenuChildrenTree();
				cTree.setText(sb.getMenuName());
				Map<String, String> map = new HashMap<String, String>();
				map.put("url", sb.getMenuUrl());
				cTree.setAttributes(map);
				childrenList.add(cTree);
			}
			sysParentTree.setChildren(childrenList);
			/*m.setSubMenus(subMenus);*/
			sysTrees .add(sysParentTree);
		}
		return sysTrees;
	
	}

}
