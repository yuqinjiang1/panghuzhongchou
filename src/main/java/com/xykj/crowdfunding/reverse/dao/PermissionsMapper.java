package com.xykj.crowdfunding.reverse.dao;

import com.xykj.crowdfunding.reverse.pojo.Permissions;
import com.xykj.crowdfunding.reverse.pojo.PermissionsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PermissionsMapper {
    int countByExample(PermissionsExample example);

    int deleteByExample(PermissionsExample example);

    int deleteByPrimaryKey(Integer powerId);

    int insert(Permissions record);

    int insertSelective(Permissions record);

    List<Permissions> selectByExample(PermissionsExample example);

    Permissions selectByPrimaryKey(Integer powerId);

    int updateByExampleSelective(@Param("record") Permissions record, @Param("example") PermissionsExample example);

    int updateByExample(@Param("record") Permissions record, @Param("example") PermissionsExample example);

    int updateByPrimaryKeySelective(Permissions record);

    int updateByPrimaryKey(Permissions record);
    
    List<Permissions> selectByUserId(@Param("userId")String userId);
}