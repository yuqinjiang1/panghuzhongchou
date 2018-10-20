package com.xykj.crowdfunding.reverse.pojo;

import java.util.Date;

public class Loanform {
    private Integer loanId;

    private String borrowUserId;

    private Integer version;

    private Integer retrunType;

    private Integer bidRequestType;

    private Integer bidRequestState;

    private Long bidRequestAmount;

    private Long currentRate;

    private Long minBidAmount;

    private Integer monthes2Return;

    private Integer bidCount;

    private Integer totalRewardAmount;

    private Long currentSum;

    private String title;

    private String description;

    private String note;

    private Date disableDate;

    private Integer disableDays;

    private String createUser;

    private String bids;

    private Date applyTime;

    private Date publishTime;

    private String auditorId;

    private String nameOfAuditor;
    
    private String currentRateStr;
    private String progressStr;
    private String returnTypeString;
    

    public String getCurrentRateStr() {
		return currentRateStr;
	}
    public void setCurrentRateStr(String currentRateStr) {
		this.currentRateStr = currentRateStr;
	}
    public String getProgressStr() {
		return progressStr;
	}
    public void setProgressStr(String progressStr) {
		this.progressStr = progressStr;
	}
    
    public void setReturnTypeString(String returnTypeString) {
		this.returnTypeString = returnTypeString;
	}
    public String getReturnTypeString() {
		return returnTypeString;
	}
    
    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public String getBorrowUserId() {
        return borrowUserId;
    }

    public void setBorrowUserId(String borrowUserId) {
        this.borrowUserId = borrowUserId == null ? null : borrowUserId.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getRetrunType() {
        return retrunType;
    }

    public void setRetrunType(Integer retrunType) {
    	if (retrunType == null) {
			retrunType = 1;
		}
        this.retrunType = retrunType;
    }

    public Integer getBidRequestType() {
        return bidRequestType;
    }

    public void setBidRequestType(Integer bidRequestType) {
        this.bidRequestType = bidRequestType;
    }

    public Integer getBidRequestState() {
        return bidRequestState;
    }

    public void setBidRequestState(Integer bidRequestState) {
        this.bidRequestState = bidRequestState;
    }

    public Long getBidRequestAmount() {
        return bidRequestAmount;
    }

    public void setBidRequestAmount(Long bidRequestAmount) {
        this.bidRequestAmount = bidRequestAmount;
    }

    public Long getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(Long currentRate) {
        this.currentRate = currentRate;
    }

    public Long getMinBidAmount() {
        return minBidAmount;
    }

    public void setMinBidAmount(Long minBidAmount) {
        this.minBidAmount = minBidAmount;
    }

    public Integer getMonthes2Return() {
        return monthes2Return;
    }

    public void setMonthes2Return(Integer monthes2Return) {
        this.monthes2Return = monthes2Return;
    }

    public Integer getBidCount() {
        return bidCount;
    }

    public void setBidCount(Integer bidCount) {
        this.bidCount = bidCount;
    }

    public Integer getTotalRewardAmount() {
        return totalRewardAmount;
    }

    public void setTotalRewardAmount(Integer totalRewardAmount) {
        this.totalRewardAmount = totalRewardAmount;
    }

    public Long getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(Long currentSum) {
    	if (currentSum==null) {
    		currentSum = (long) 0;
		}
        this.currentSum = currentSum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getDisableDate() {
        return disableDate;
    }

    public void setDisableDate(Date disableDate) {
        this.disableDate = disableDate;
    }

    public Integer getDisableDays() {
        return disableDays;
    }

    public void setDisableDays(Integer disableDays) {
        this.disableDays = disableDays;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getBids() {
        return bids;
    }

    public void setBids(String bids) {
        this.bids = bids == null ? null : bids.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId == null ? null : auditorId.trim();
    }

    public String getNameOfAuditor() {
        return nameOfAuditor;
    }

    public void setNameOfAuditor(String nameOfAuditor) {
        this.nameOfAuditor = nameOfAuditor == null ? null : nameOfAuditor.trim();
    }

	@Override
	public String toString() {
		return "Loanform [loanId=" + loanId + ", borrowUserId=" + borrowUserId
				+ ", version=" + version + ", retrunType=" + retrunType
				+ ", bidRequestType=" + bidRequestType + ", bidRequestState="
				+ bidRequestState + ", bidRequestAmount=" + bidRequestAmount
				+ ", currentRate=" + currentRate + ", minBidAmount="
				+ minBidAmount + ", monthes2Return=" + monthes2Return
				+ ", bidCount=" + bidCount + ", totalRewardAmount="
				+ totalRewardAmount + ", currentSum=" + currentSum + ", title="
				+ title + ", description=" + description + ", note=" + note
				+ ", disableDate=" + disableDate + ", disableDays="
				+ disableDays + ", createUser=" + createUser + ", bids=" + bids
				+ ", applyTime=" + applyTime + ", publishTime=" + publishTime
				+ ", auditorId=" + auditorId + ", nameOfAuditor="
				+ nameOfAuditor + "]";
	}
    
    
}