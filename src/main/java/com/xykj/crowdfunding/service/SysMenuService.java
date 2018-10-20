package com.xykj.crowdfunding.service;

import java.util.List;

import com.xykj.crowdfunding.reverse.pojo.SysMenu;
import com.xykj.crowdfunding.reverse.pojo.SysMenuTree;


public interface SysMenuService {
    int deleteByPrimaryKey(Integer menuId);

    int insert(SysMenu record);

    SysMenu selectByPrimaryKey(Integer menuId);
    
    List<SysMenu> queryUseMenu(String userId);
    
    List<SysMenu> selectAll();

    int updateByPrimaryKeySelective(SysMenu record);
    
    List<SysMenu> getFirstClassAndSubMenus(String userId);
    List<SysMenuTree> getSysMenuTree(String userId);
}
