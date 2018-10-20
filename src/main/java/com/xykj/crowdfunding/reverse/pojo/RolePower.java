package com.xykj.crowdfunding.reverse.pojo;

import java.util.Date;

public class RolePower {
    private Integer rolePowerId;

    private Integer roleId;

    private Integer powerId;

    private Date createTime;

    private Date updateTime;

    public Integer getRolePowerId() {
        return rolePowerId;
    }

    public void setRolePowerId(Integer rolePowerId) {
        this.rolePowerId = rolePowerId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}