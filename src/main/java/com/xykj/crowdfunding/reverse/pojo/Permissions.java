package com.xykj.crowdfunding.reverse.pojo;

import java.util.Date;

public class Permissions {
    private Integer powerId;

    private Integer parentPermisId;

    private String permisName;

    private Boolean menuPermisFlag;

    private String permisCode;

    private String remark;

    private Integer permisOrder;

    private Date createTime;

    private Date updateTime;

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public Integer getParentPermisId() {
        return parentPermisId;
    }

    public void setParentPermisId(Integer parentPermisId) {
        this.parentPermisId = parentPermisId;
    }

    public String getPermisName() {
        return permisName;
    }

    public void setPermisName(String permisName) {
        this.permisName = permisName == null ? null : permisName.trim();
    }

    public Boolean getMenuPermisFlag() {
        return menuPermisFlag;
    }

    public void setMenuPermisFlag(Boolean menuPermisFlag) {
        this.menuPermisFlag = menuPermisFlag;
    }

    public String getPermisCode() {
        return permisCode;
    }

    public void setPermisCode(String permisCode) {
        this.permisCode = permisCode == null ? null : permisCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getPermisOrder() {
        return permisOrder;
    }

    public void setPermisOrder(Integer permisOrder) {
        this.permisOrder = permisOrder;
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

	@Override
	public String toString() {
		return "Permissions [powerId=" + powerId + ", parentPermisId="
				+ parentPermisId + ", permisName=" + permisName
				+ ", menuPermisFlag=" + menuPermisFlag + ", permisCode="
				+ permisCode + ", remark=" + remark + ", permisOrder="
				+ permisOrder + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}
    
    
}