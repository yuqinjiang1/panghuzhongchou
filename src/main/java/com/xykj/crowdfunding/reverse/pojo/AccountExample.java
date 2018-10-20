package com.xykj.crowdfunding.reverse.pojo;

import java.util.ArrayList;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andTotalAccountIsNull() {
            addCriterion("total_account is null");
            return (Criteria) this;
        }

        public Criteria andTotalAccountIsNotNull() {
            addCriterion("total_account is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAccountEqualTo(Long value) {
            addCriterion("total_account =", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountNotEqualTo(Long value) {
            addCriterion("total_account <>", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountGreaterThan(Long value) {
            addCriterion("total_account >", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_account >=", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountLessThan(Long value) {
            addCriterion("total_account <", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountLessThanOrEqualTo(Long value) {
            addCriterion("total_account <=", value, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountIn(List<Long> values) {
            addCriterion("total_account in", values, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountNotIn(List<Long> values) {
            addCriterion("total_account not in", values, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountBetween(Long value1, Long value2) {
            addCriterion("total_account between", value1, value2, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andTotalAccountNotBetween(Long value1, Long value2) {
            addCriterion("total_account not between", value1, value2, "totalAccount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountIsNull() {
            addCriterion("usable_amount is null");
            return (Criteria) this;
        }

        public Criteria andUsableAmountIsNotNull() {
            addCriterion("usable_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUsableAmountEqualTo(Long value) {
            addCriterion("usable_amount =", value, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountNotEqualTo(Long value) {
            addCriterion("usable_amount <>", value, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountGreaterThan(Long value) {
            addCriterion("usable_amount >", value, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("usable_amount >=", value, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountLessThan(Long value) {
            addCriterion("usable_amount <", value, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountLessThanOrEqualTo(Long value) {
            addCriterion("usable_amount <=", value, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountIn(List<Long> values) {
            addCriterion("usable_amount in", values, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountNotIn(List<Long> values) {
            addCriterion("usable_amount not in", values, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountBetween(Long value1, Long value2) {
            addCriterion("usable_amount between", value1, value2, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountNotBetween(Long value1, Long value2) {
            addCriterion("usable_amount not between", value1, value2, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUnReceiveInterestIsNull() {
            addCriterion("un_receive_interest is null");
            return (Criteria) this;
        }

        public Criteria andUnReceiveInterestIsNotNull() {
            addCriterion("un_receive_interest is not null");
            return (Criteria) this;
        }

        public Criteria andUnReceiveInterestEqualTo(Long value) {
            addCriterion("un_receive_interest =", value, "unReceiveInterest");
            return (Criteria) this;
        }

        public Criteria andUnReceiveInterestNotEqualTo(Long value) {
            addCriterion("un_receive_interest <>", value, "unReceiveInterest");
            return (Criteria) this;
        }

        public Criteria andUnReceiveInterestGreaterThan(Long value) {
            addCriterion("un_receive_interest >", value, "unReceiveInterest");
            return (Criteria) this;
        }

        public Criteria andUnReceiveInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("un_receive_interest >=", value, "unReceiveInterest");
            return (Criteria) this;
        }

        public Criteria andUnReceiveInterestLessThan(Long value) {
            addCriterion("un_receive_interest <", value, "unReceiveInterest");
            return (Criteria) this;
        }

        public Criteria andUnReceiveInterestLessThanOrEqualTo(Long value) {
            addCriterion("un_receive_interest <=", value, "unReceiveInterest");
            return (Criteria) this;
        }

        public Criteria andUnReceiveInterestIn(List<Long> values) {
            addCriterion("un_receive_interest in", values, "unReceiveInterest");
            return (Criteria) this;
        }

        public Criteria andUnReceiveInterestNotIn(List<Long> values) {
            addCriterion("un_receive_interest not in", values, "unReceiveInterest");
            return (Criteria) this;
        }

        public Criteria andUnReceiveInterestBetween(Long value1, Long value2) {
            addCriterion("un_receive_interest between", value1, value2, "unReceiveInterest");
            return (Criteria) this;
        }

        public Criteria andUnReceiveInterestNotBetween(Long value1, Long value2) {
            addCriterion("un_receive_interest not between", value1, value2, "unReceiveInterest");
            return (Criteria) this;
        }

        public Criteria andReceivePrincipalIsNull() {
            addCriterion("receive_principal is null");
            return (Criteria) this;
        }

        public Criteria andReceivePrincipalIsNotNull() {
            addCriterion("receive_principal is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePrincipalEqualTo(Long value) {
            addCriterion("receive_principal =", value, "receivePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivePrincipalNotEqualTo(Long value) {
            addCriterion("receive_principal <>", value, "receivePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivePrincipalGreaterThan(Long value) {
            addCriterion("receive_principal >", value, "receivePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivePrincipalGreaterThanOrEqualTo(Long value) {
            addCriterion("receive_principal >=", value, "receivePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivePrincipalLessThan(Long value) {
            addCriterion("receive_principal <", value, "receivePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivePrincipalLessThanOrEqualTo(Long value) {
            addCriterion("receive_principal <=", value, "receivePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivePrincipalIn(List<Long> values) {
            addCriterion("receive_principal in", values, "receivePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivePrincipalNotIn(List<Long> values) {
            addCriterion("receive_principal not in", values, "receivePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivePrincipalBetween(Long value1, Long value2) {
            addCriterion("receive_principal between", value1, value2, "receivePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivePrincipalNotBetween(Long value1, Long value2) {
            addCriterion("receive_principal not between", value1, value2, "receivePrincipal");
            return (Criteria) this;
        }

        public Criteria andToReturnToThePrincipalAndInterestIsNull() {
            addCriterion("to_return_to_the_principal_and_interest is null");
            return (Criteria) this;
        }

        public Criteria andToReturnToThePrincipalAndInterestIsNotNull() {
            addCriterion("to_return_to_the_principal_and_interest is not null");
            return (Criteria) this;
        }

        public Criteria andToReturnToThePrincipalAndInterestEqualTo(Long value) {
            addCriterion("to_return_to_the_principal_and_interest =", value, "toReturnToThePrincipalAndInterest");
            return (Criteria) this;
        }

        public Criteria andToReturnToThePrincipalAndInterestNotEqualTo(Long value) {
            addCriterion("to_return_to_the_principal_and_interest <>", value, "toReturnToThePrincipalAndInterest");
            return (Criteria) this;
        }

        public Criteria andToReturnToThePrincipalAndInterestGreaterThan(Long value) {
            addCriterion("to_return_to_the_principal_and_interest >", value, "toReturnToThePrincipalAndInterest");
            return (Criteria) this;
        }

        public Criteria andToReturnToThePrincipalAndInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("to_return_to_the_principal_and_interest >=", value, "toReturnToThePrincipalAndInterest");
            return (Criteria) this;
        }

        public Criteria andToReturnToThePrincipalAndInterestLessThan(Long value) {
            addCriterion("to_return_to_the_principal_and_interest <", value, "toReturnToThePrincipalAndInterest");
            return (Criteria) this;
        }

        public Criteria andToReturnToThePrincipalAndInterestLessThanOrEqualTo(Long value) {
            addCriterion("to_return_to_the_principal_and_interest <=", value, "toReturnToThePrincipalAndInterest");
            return (Criteria) this;
        }

        public Criteria andToReturnToThePrincipalAndInterestIn(List<Long> values) {
            addCriterion("to_return_to_the_principal_and_interest in", values, "toReturnToThePrincipalAndInterest");
            return (Criteria) this;
        }

        public Criteria andToReturnToThePrincipalAndInterestNotIn(List<Long> values) {
            addCriterion("to_return_to_the_principal_and_interest not in", values, "toReturnToThePrincipalAndInterest");
            return (Criteria) this;
        }

        public Criteria andToReturnToThePrincipalAndInterestBetween(Long value1, Long value2) {
            addCriterion("to_return_to_the_principal_and_interest between", value1, value2, "toReturnToThePrincipalAndInterest");
            return (Criteria) this;
        }

        public Criteria andToReturnToThePrincipalAndInterestNotBetween(Long value1, Long value2) {
            addCriterion("to_return_to_the_principal_and_interest not between", value1, value2, "toReturnToThePrincipalAndInterest");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordIsNull() {
            addCriterion("trader_password is null");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordIsNotNull() {
            addCriterion("trader_password is not null");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordEqualTo(String value) {
            addCriterion("trader_password =", value, "traderPassword");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordNotEqualTo(String value) {
            addCriterion("trader_password <>", value, "traderPassword");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordGreaterThan(String value) {
            addCriterion("trader_password >", value, "traderPassword");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("trader_password >=", value, "traderPassword");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordLessThan(String value) {
            addCriterion("trader_password <", value, "traderPassword");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordLessThanOrEqualTo(String value) {
            addCriterion("trader_password <=", value, "traderPassword");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordLike(String value) {
            addCriterion("trader_password like", value, "traderPassword");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordNotLike(String value) {
            addCriterion("trader_password not like", value, "traderPassword");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordIn(List<String> values) {
            addCriterion("trader_password in", values, "traderPassword");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordNotIn(List<String> values) {
            addCriterion("trader_password not in", values, "traderPassword");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordBetween(String value1, String value2) {
            addCriterion("trader_password between", value1, value2, "traderPassword");
            return (Criteria) this;
        }

        public Criteria andTraderPasswordNotBetween(String value1, String value2) {
            addCriterion("trader_password not between", value1, value2, "traderPassword");
            return (Criteria) this;
        }

        public Criteria andBlockAccountIsNull() {
            addCriterion("block_account is null");
            return (Criteria) this;
        }

        public Criteria andBlockAccountIsNotNull() {
            addCriterion("block_account is not null");
            return (Criteria) this;
        }

        public Criteria andBlockAccountEqualTo(Long value) {
            addCriterion("block_account =", value, "blockAccount");
            return (Criteria) this;
        }

        public Criteria andBlockAccountNotEqualTo(Long value) {
            addCriterion("block_account <>", value, "blockAccount");
            return (Criteria) this;
        }

        public Criteria andBlockAccountGreaterThan(Long value) {
            addCriterion("block_account >", value, "blockAccount");
            return (Criteria) this;
        }

        public Criteria andBlockAccountGreaterThanOrEqualTo(Long value) {
            addCriterion("block_account >=", value, "blockAccount");
            return (Criteria) this;
        }

        public Criteria andBlockAccountLessThan(Long value) {
            addCriterion("block_account <", value, "blockAccount");
            return (Criteria) this;
        }

        public Criteria andBlockAccountLessThanOrEqualTo(Long value) {
            addCriterion("block_account <=", value, "blockAccount");
            return (Criteria) this;
        }

        public Criteria andBlockAccountIn(List<Long> values) {
            addCriterion("block_account in", values, "blockAccount");
            return (Criteria) this;
        }

        public Criteria andBlockAccountNotIn(List<Long> values) {
            addCriterion("block_account not in", values, "blockAccount");
            return (Criteria) this;
        }

        public Criteria andBlockAccountBetween(Long value1, Long value2) {
            addCriterion("block_account between", value1, value2, "blockAccount");
            return (Criteria) this;
        }

        public Criteria andBlockAccountNotBetween(Long value1, Long value2) {
            addCriterion("block_account not between", value1, value2, "blockAccount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}