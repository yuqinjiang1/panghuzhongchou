package com.xykj.crowdfunding.reverse.pojo;

import java.util.Date;

import com.xykj.crowdfunding.utils.P2pDateUtils;

public class RealNameAuthentication {
    private Integer realNameAuthenticationId;

    private String userId;

    private String username;

    private String name;

    private int sex;

    private String identificationNumber;

    private Date birthDate;

    private String identificationAddress;

    private String idCardPhoto;

    private String auditorId;

    private String auditor;

    private Integer auditStatus;

    public Integer getRealNameAuthenticationId() {
        return realNameAuthenticationId;
    }

    public void setRealNameAuthenticationId(Integer realNameAuthenticationId) {
        this.realNameAuthenticationId = realNameAuthenticationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber == null ? null : identificationNumber.trim();
    }

    public Date getBirthDate() {
        return birthDate;
    }

/*    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }*/
    public void setBirthDate(String birthDate) {
    	Date valueDate = P2pDateUtils.StrToDate(birthDate, "yyyy-MM-dd");
        this.birthDate = valueDate;
    }
    public String getIdentificationAddress() {
        return identificationAddress;
    }

    public void setIdentificationAddress(String identificationAddress) {
        this.identificationAddress = identificationAddress == null ? null : identificationAddress.trim();
    }

    public String getIdCardPhoto() {
        return idCardPhoto;
    }

    public void setIdCardPhoto(String idCardPhoto) {
        this.idCardPhoto = idCardPhoto == null ? null : idCardPhoto.trim();
    }

    public String getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId == null ? null : auditorId.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

	@Override
	public String toString() {
		return "RealNameAuthentication [realNameAuthenticationId="
				+ realNameAuthenticationId + ", userId=" + userId
				+ ", username=" + username + ", name=" + name + ", sex=" + sex
				+ ", identificationNumber=" + identificationNumber
				+ ", birthDate=" + birthDate + ", identificationAddress="
				+ identificationAddress + ", idCardPhoto=" + idCardPhoto
				+ ", auditorId=" + auditorId + ", auditor=" + auditor
				+ ", auditStatus=" + auditStatus + "]";
	}
    
    
}