package com.xykj.crowdfunding.reverse.pojo;

public class Account {
    private Integer accountId;

    private String userId;

    private String nickName;

    private String realName;

    private Long totalAccount;

    private Long usableAmount;

    private Long unReceiveInterest;

    private Long receivePrincipal;

    private Long toReturnToThePrincipalAndInterest;

    private String traderPassword;

    private Long blockAccount;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Long getTotalAccount() {
        return totalAccount;
    }

    public void setTotalAccount(Long totalAccount) {
        this.totalAccount = totalAccount;
    }

    public Long getUsableAmount() {
        return usableAmount;
    }

    public void setUsableAmount(Long usableAmount) {
        this.usableAmount = usableAmount;
    }

    public Long getUnReceiveInterest() {
        return unReceiveInterest;
    }

    public void setUnReceiveInterest(Long unReceiveInterest) {
        this.unReceiveInterest = unReceiveInterest;
    }

    public Long getReceivePrincipal() {
        return receivePrincipal;
    }

    public void setReceivePrincipal(Long receivePrincipal) {
        this.receivePrincipal = receivePrincipal;
    }

    public Long getToReturnToThePrincipalAndInterest() {
        return toReturnToThePrincipalAndInterest;
    }

    public void setToReturnToThePrincipalAndInterest(Long toReturnToThePrincipalAndInterest) {
        this.toReturnToThePrincipalAndInterest = toReturnToThePrincipalAndInterest;
    }

    public String getTraderPassword() {
        return traderPassword;
    }

    public void setTraderPassword(String traderPassword) {
        this.traderPassword = traderPassword == null ? null : traderPassword.trim();
    }

    public Long getBlockAccount() {
        return blockAccount;
    }

    public void setBlockAccount(Long blockAccount) {
        this.blockAccount = blockAccount;
    }
}