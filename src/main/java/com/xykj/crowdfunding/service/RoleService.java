package com.xykj.crowdfunding.service;

import java.util.List;

import com.xykj.crowdfunding.reverse.pojo.Role;


public interface RoleService {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    Role selectByPrimaryKey(Integer roleId);
    
    /**
     * 根据用户ID查询用户角色列表
     * @param userId
     * @return
     */
    List<Role> selectByUserId(String userId);
    
    List<Role> selectAll();

    int updateByPrimaryKeySelective(Role record);

}
