package com.xykj.crowdfunding.reverse.pojo;

import java.util.Date;

public class Bidobject {
    private Integer bidId;

    private Integer loanId;

    private String bidderId;

    private Long actualRate;

    private Long availableAmount;

    private Long bidRequestid;

    private String bidRequestTitle;

    private String biduser;

    private Date bidTime;

    private Integer bidRequestState;
    
    private String bidTimeString;
    
    public void setBidTimeString(String bidTimeString) {
		this.bidTimeString = bidTimeString;
	}
    
    public String getBidTimeString() {
		return bidTimeString;
	}

    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public String getBidderId() {
        return bidderId;
    }

    public void setBidderId(String bidderId) {
        this.bidderId = bidderId == null ? null : bidderId.trim();
    }

    public Long getActualRate() {
        return actualRate;
    }

    public void setActualRate(Long actualRate) {
        this.actualRate = actualRate;
    }

    public Long getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(Long availableAmount) {
        this.availableAmount = availableAmount;
    }

    public Long getBidRequestid() {
        return bidRequestid;
    }

    public void setBidRequestid(Long bidRequestid) {
        this.bidRequestid = bidRequestid;
    }

    public String getBidRequestTitle() {
        return bidRequestTitle;
    }

    public void setBidRequestTitle(String bidRequestTitle) {
        this.bidRequestTitle = bidRequestTitle == null ? null : bidRequestTitle.trim();
    }

    public String getBiduser() {
        return biduser;
    }

    public void setBiduser(String biduser) {
        this.biduser = biduser == null ? null : biduser.trim();
    }

    public Date getBidTime() {
        return bidTime;
    }

    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    public Integer getBidRequestState() {
        return bidRequestState;
    }

    public void setBidRequestState(Integer bidRequestState) {
        this.bidRequestState = bidRequestState;
    }
}