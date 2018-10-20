package com.xykj.crowdfunding.reverse.dao;

import com.xykj.crowdfunding.reverse.pojo.SysMenu;
import com.xykj.crowdfunding.reverse.pojo.SysMenuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {
    int countByExample(SysMenuExample example);

    int deleteByExample(SysMenuExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuExample example);

    SysMenu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
    
    List<SysMenu> selectAll();
    List<SysMenu> queryUseMenu(@Param("userId")String userId);
    
    List<SysMenu> getFirstClassMenuByUserId(@Param("userId")String userId);
    
    List<SysMenu> getSubMenusByParentIdAndUserId(@Param("menuId")Integer menuId,@Param("userId")String userId);
}