package com.xykj.crowdfunding.reverse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoanformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanformExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andLoanIdIsNull() {
            addCriterion("loan_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(Integer value) {
            addCriterion("loan_id =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(Integer value) {
            addCriterion("loan_id <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(Integer value) {
            addCriterion("loan_id >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_id >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(Integer value) {
            addCriterion("loan_id <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(Integer value) {
            addCriterion("loan_id <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<Integer> values) {
            addCriterion("loan_id in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<Integer> values) {
            addCriterion("loan_id not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(Integer value1, Integer value2) {
            addCriterion("loan_id between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_id not between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdIsNull() {
            addCriterion("borrow_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdIsNotNull() {
            addCriterion("borrow_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdEqualTo(String value) {
            addCriterion("borrow_user_id =", value, "borrowUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdNotEqualTo(String value) {
            addCriterion("borrow_user_id <>", value, "borrowUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdGreaterThan(String value) {
            addCriterion("borrow_user_id >", value, "borrowUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_user_id >=", value, "borrowUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdLessThan(String value) {
            addCriterion("borrow_user_id <", value, "borrowUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdLessThanOrEqualTo(String value) {
            addCriterion("borrow_user_id <=", value, "borrowUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdLike(String value) {
            addCriterion("borrow_user_id like", value, "borrowUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdNotLike(String value) {
            addCriterion("borrow_user_id not like", value, "borrowUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdIn(List<String> values) {
            addCriterion("borrow_user_id in", values, "borrowUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdNotIn(List<String> values) {
            addCriterion("borrow_user_id not in", values, "borrowUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdBetween(String value1, String value2) {
            addCriterion("borrow_user_id between", value1, value2, "borrowUserId");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIdNotBetween(String value1, String value2) {
            addCriterion("borrow_user_id not between", value1, value2, "borrowUserId");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andRetrunTypeIsNull() {
            addCriterion("retrun_type is null");
            return (Criteria) this;
        }

        public Criteria andRetrunTypeIsNotNull() {
            addCriterion("retrun_type is not null");
            return (Criteria) this;
        }

        public Criteria andRetrunTypeEqualTo(Integer value) {
            addCriterion("retrun_type =", value, "retrunType");
            return (Criteria) this;
        }

        public Criteria andRetrunTypeNotEqualTo(Integer value) {
            addCriterion("retrun_type <>", value, "retrunType");
            return (Criteria) this;
        }

        public Criteria andRetrunTypeGreaterThan(Integer value) {
            addCriterion("retrun_type >", value, "retrunType");
            return (Criteria) this;
        }

        public Criteria andRetrunTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("retrun_type >=", value, "retrunType");
            return (Criteria) this;
        }

        public Criteria andRetrunTypeLessThan(Integer value) {
            addCriterion("retrun_type <", value, "retrunType");
            return (Criteria) this;
        }

        public Criteria andRetrunTypeLessThanOrEqualTo(Integer value) {
            addCriterion("retrun_type <=", value, "retrunType");
            return (Criteria) this;
        }

        public Criteria andRetrunTypeIn(List<Integer> values) {
            addCriterion("retrun_type in", values, "retrunType");
            return (Criteria) this;
        }

        public Criteria andRetrunTypeNotIn(List<Integer> values) {
            addCriterion("retrun_type not in", values, "retrunType");
            return (Criteria) this;
        }

        public Criteria andRetrunTypeBetween(Integer value1, Integer value2) {
            addCriterion("retrun_type between", value1, value2, "retrunType");
            return (Criteria) this;
        }

        public Criteria andRetrunTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("retrun_type not between", value1, value2, "retrunType");
            return (Criteria) this;
        }

        public Criteria andBidRequestTypeIsNull() {
            addCriterion("bid_request_type is null");
            return (Criteria) this;
        }

        public Criteria andBidRequestTypeIsNotNull() {
            addCriterion("bid_request_type is not null");
            return (Criteria) this;
        }

        public Criteria andBidRequestTypeEqualTo(Integer value) {
            addCriterion("bid_request_type =", value, "bidRequestType");
            return (Criteria) this;
        }

        public Criteria andBidRequestTypeNotEqualTo(Integer value) {
            addCriterion("bid_request_type <>", value, "bidRequestType");
            return (Criteria) this;
        }

        public Criteria andBidRequestTypeGreaterThan(Integer value) {
            addCriterion("bid_request_type >", value, "bidRequestType");
            return (Criteria) this;
        }

        public Criteria andBidRequestTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid_request_type >=", value, "bidRequestType");
            return (Criteria) this;
        }

        public Criteria andBidRequestTypeLessThan(Integer value) {
            addCriterion("bid_request_type <", value, "bidRequestType");
            return (Criteria) this;
        }

        public Criteria andBidRequestTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bid_request_type <=", value, "bidRequestType");
            return (Criteria) this;
        }

        public Criteria andBidRequestTypeIn(List<Integer> values) {
            addCriterion("bid_request_type in", values, "bidRequestType");
            return (Criteria) this;
        }

        public Criteria andBidRequestTypeNotIn(List<Integer> values) {
            addCriterion("bid_request_type not in", values, "bidRequestType");
            return (Criteria) this;
        }

        public Criteria andBidRequestTypeBetween(Integer value1, Integer value2) {
            addCriterion("bid_request_type between", value1, value2, "bidRequestType");
            return (Criteria) this;
        }

        public Criteria andBidRequestTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bid_request_type not between", value1, value2, "bidRequestType");
            return (Criteria) this;
        }

        public Criteria andBidRequestStateIsNull() {
            addCriterion("bid_request_state is null");
            return (Criteria) this;
        }

        public Criteria andBidRequestStateIsNotNull() {
            addCriterion("bid_request_state is not null");
            return (Criteria) this;
        }

        public Criteria andBidRequestStateEqualTo(Integer value) {
            addCriterion("bid_request_state =", value, "bidRequestState");
            return (Criteria) this;
        }

        public Criteria andBidRequestStateNotEqualTo(Integer value) {
            addCriterion("bid_request_state <>", value, "bidRequestState");
            return (Criteria) this;
        }

        public Criteria andBidRequestStateGreaterThan(Integer value) {
            addCriterion("bid_request_state >", value, "bidRequestState");
            return (Criteria) this;
        }

        public Criteria andBidRequestStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid_request_state >=", value, "bidRequestState");
            return (Criteria) this;
        }

        public Criteria andBidRequestStateLessThan(Integer value) {
            addCriterion("bid_request_state <", value, "bidRequestState");
            return (Criteria) this;
        }

        public Criteria andBidRequestStateLessThanOrEqualTo(Integer value) {
            addCriterion("bid_request_state <=", value, "bidRequestState");
            return (Criteria) this;
        }

        public Criteria andBidRequestStateIn(List<Integer> values) {
            addCriterion("bid_request_state in", values, "bidRequestState");
            return (Criteria) this;
        }

        public Criteria andBidRequestStateNotIn(List<Integer> values) {
            addCriterion("bid_request_state not in", values, "bidRequestState");
            return (Criteria) this;
        }

        public Criteria andBidRequestStateBetween(Integer value1, Integer value2) {
            addCriterion("bid_request_state between", value1, value2, "bidRequestState");
            return (Criteria) this;
        }

        public Criteria andBidRequestStateNotBetween(Integer value1, Integer value2) {
            addCriterion("bid_request_state not between", value1, value2, "bidRequestState");
            return (Criteria) this;
        }

        public Criteria andBidRequestAmountIsNull() {
            addCriterion("bid_request_amount is null");
            return (Criteria) this;
        }

        public Criteria andBidRequestAmountIsNotNull() {
            addCriterion("bid_request_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBidRequestAmountEqualTo(Long value) {
            addCriterion("bid_request_amount =", value, "bidRequestAmount");
            return (Criteria) this;
        }

        public Criteria andBidRequestAmountNotEqualTo(Long value) {
            addCriterion("bid_request_amount <>", value, "bidRequestAmount");
            return (Criteria) this;
        }

        public Criteria andBidRequestAmountGreaterThan(Long value) {
            addCriterion("bid_request_amount >", value, "bidRequestAmount");
            return (Criteria) this;
        }

        public Criteria andBidRequestAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("bid_request_amount >=", value, "bidRequestAmount");
            return (Criteria) this;
        }

        public Criteria andBidRequestAmountLessThan(Long value) {
            addCriterion("bid_request_amount <", value, "bidRequestAmount");
            return (Criteria) this;
        }

        public Criteria andBidRequestAmountLessThanOrEqualTo(Long value) {
            addCriterion("bid_request_amount <=", value, "bidRequestAmount");
            return (Criteria) this;
        }

        public Criteria andBidRequestAmountIn(List<Long> values) {
            addCriterion("bid_request_amount in", values, "bidRequestAmount");
            return (Criteria) this;
        }

        public Criteria andBidRequestAmountNotIn(List<Long> values) {
            addCriterion("bid_request_amount not in", values, "bidRequestAmount");
            return (Criteria) this;
        }

        public Criteria andBidRequestAmountBetween(Long value1, Long value2) {
            addCriterion("bid_request_amount between", value1, value2, "bidRequestAmount");
            return (Criteria) this;
        }

        public Criteria andBidRequestAmountNotBetween(Long value1, Long value2) {
            addCriterion("bid_request_amount not between", value1, value2, "bidRequestAmount");
            return (Criteria) this;
        }

        public Criteria andCurrentRateIsNull() {
            addCriterion("current_rate is null");
            return (Criteria) this;
        }

        public Criteria andCurrentRateIsNotNull() {
            addCriterion("current_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentRateEqualTo(Long value) {
            addCriterion("current_rate =", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateNotEqualTo(Long value) {
            addCriterion("current_rate <>", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateGreaterThan(Long value) {
            addCriterion("current_rate >", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateGreaterThanOrEqualTo(Long value) {
            addCriterion("current_rate >=", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateLessThan(Long value) {
            addCriterion("current_rate <", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateLessThanOrEqualTo(Long value) {
            addCriterion("current_rate <=", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateIn(List<Long> values) {
            addCriterion("current_rate in", values, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateNotIn(List<Long> values) {
            addCriterion("current_rate not in", values, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateBetween(Long value1, Long value2) {
            addCriterion("current_rate between", value1, value2, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateNotBetween(Long value1, Long value2) {
            addCriterion("current_rate not between", value1, value2, "currentRate");
            return (Criteria) this;
        }

        public Criteria andMinBidAmountIsNull() {
            addCriterion("min_bid_amount is null");
            return (Criteria) this;
        }

        public Criteria andMinBidAmountIsNotNull() {
            addCriterion("min_bid_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMinBidAmountEqualTo(Long value) {
            addCriterion("min_bid_amount =", value, "minBidAmount");
            return (Criteria) this;
        }

        public Criteria andMinBidAmountNotEqualTo(Long value) {
            addCriterion("min_bid_amount <>", value, "minBidAmount");
            return (Criteria) this;
        }

        public Criteria andMinBidAmountGreaterThan(Long value) {
            addCriterion("min_bid_amount >", value, "minBidAmount");
            return (Criteria) this;
        }

        public Criteria andMinBidAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("min_bid_amount >=", value, "minBidAmount");
            return (Criteria) this;
        }

        public Criteria andMinBidAmountLessThan(Long value) {
            addCriterion("min_bid_amount <", value, "minBidAmount");
            return (Criteria) this;
        }

        public Criteria andMinBidAmountLessThanOrEqualTo(Long value) {
            addCriterion("min_bid_amount <=", value, "minBidAmount");
            return (Criteria) this;
        }

        public Criteria andMinBidAmountIn(List<Long> values) {
            addCriterion("min_bid_amount in", values, "minBidAmount");
            return (Criteria) this;
        }

        public Criteria andMinBidAmountNotIn(List<Long> values) {
            addCriterion("min_bid_amount not in", values, "minBidAmount");
            return (Criteria) this;
        }

        public Criteria andMinBidAmountBetween(Long value1, Long value2) {
            addCriterion("min_bid_amount between", value1, value2, "minBidAmount");
            return (Criteria) this;
        }

        public Criteria andMinBidAmountNotBetween(Long value1, Long value2) {
            addCriterion("min_bid_amount not between", value1, value2, "minBidAmount");
            return (Criteria) this;
        }

        public Criteria andMonthes2ReturnIsNull() {
            addCriterion("monthes2_return is null");
            return (Criteria) this;
        }

        public Criteria andMonthes2ReturnIsNotNull() {
            addCriterion("monthes2_return is not null");
            return (Criteria) this;
        }

        public Criteria andMonthes2ReturnEqualTo(Integer value) {
            addCriterion("monthes2_return =", value, "monthes2Return");
            return (Criteria) this;
        }

        public Criteria andMonthes2ReturnNotEqualTo(Integer value) {
            addCriterion("monthes2_return <>", value, "monthes2Return");
            return (Criteria) this;
        }

        public Criteria andMonthes2ReturnGreaterThan(Integer value) {
            addCriterion("monthes2_return >", value, "monthes2Return");
            return (Criteria) this;
        }

        public Criteria andMonthes2ReturnGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthes2_return >=", value, "monthes2Return");
            return (Criteria) this;
        }

        public Criteria andMonthes2ReturnLessThan(Integer value) {
            addCriterion("monthes2_return <", value, "monthes2Return");
            return (Criteria) this;
        }

        public Criteria andMonthes2ReturnLessThanOrEqualTo(Integer value) {
            addCriterion("monthes2_return <=", value, "monthes2Return");
            return (Criteria) this;
        }

        public Criteria andMonthes2ReturnIn(List<Integer> values) {
            addCriterion("monthes2_return in", values, "monthes2Return");
            return (Criteria) this;
        }

        public Criteria andMonthes2ReturnNotIn(List<Integer> values) {
            addCriterion("monthes2_return not in", values, "monthes2Return");
            return (Criteria) this;
        }

        public Criteria andMonthes2ReturnBetween(Integer value1, Integer value2) {
            addCriterion("monthes2_return between", value1, value2, "monthes2Return");
            return (Criteria) this;
        }

        public Criteria andMonthes2ReturnNotBetween(Integer value1, Integer value2) {
            addCriterion("monthes2_return not between", value1, value2, "monthes2Return");
            return (Criteria) this;
        }

        public Criteria andBidCountIsNull() {
            addCriterion("bid_count is null");
            return (Criteria) this;
        }

        public Criteria andBidCountIsNotNull() {
            addCriterion("bid_count is not null");
            return (Criteria) this;
        }

        public Criteria andBidCountEqualTo(Integer value) {
            addCriterion("bid_count =", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountNotEqualTo(Integer value) {
            addCriterion("bid_count <>", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountGreaterThan(Integer value) {
            addCriterion("bid_count >", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid_count >=", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountLessThan(Integer value) {
            addCriterion("bid_count <", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountLessThanOrEqualTo(Integer value) {
            addCriterion("bid_count <=", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountIn(List<Integer> values) {
            addCriterion("bid_count in", values, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountNotIn(List<Integer> values) {
            addCriterion("bid_count not in", values, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountBetween(Integer value1, Integer value2) {
            addCriterion("bid_count between", value1, value2, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountNotBetween(Integer value1, Integer value2) {
            addCriterion("bid_count not between", value1, value2, "bidCount");
            return (Criteria) this;
        }

        public Criteria andTotalRewardAmountIsNull() {
            addCriterion("total_reward_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalRewardAmountIsNotNull() {
            addCriterion("total_reward_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRewardAmountEqualTo(Integer value) {
            addCriterion("total_reward_amount =", value, "totalRewardAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRewardAmountNotEqualTo(Integer value) {
            addCriterion("total_reward_amount <>", value, "totalRewardAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRewardAmountGreaterThan(Integer value) {
            addCriterion("total_reward_amount >", value, "totalRewardAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRewardAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_reward_amount >=", value, "totalRewardAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRewardAmountLessThan(Integer value) {
            addCriterion("total_reward_amount <", value, "totalRewardAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRewardAmountLessThanOrEqualTo(Integer value) {
            addCriterion("total_reward_amount <=", value, "totalRewardAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRewardAmountIn(List<Integer> values) {
            addCriterion("total_reward_amount in", values, "totalRewardAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRewardAmountNotIn(List<Integer> values) {
            addCriterion("total_reward_amount not in", values, "totalRewardAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRewardAmountBetween(Integer value1, Integer value2) {
            addCriterion("total_reward_amount between", value1, value2, "totalRewardAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRewardAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_reward_amount not between", value1, value2, "totalRewardAmount");
            return (Criteria) this;
        }

        public Criteria andCurrentSumIsNull() {
            addCriterion("current_sum is null");
            return (Criteria) this;
        }

        public Criteria andCurrentSumIsNotNull() {
            addCriterion("current_sum is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentSumEqualTo(Long value) {
            addCriterion("current_sum =", value, "currentSum");
            return (Criteria) this;
        }

        public Criteria andCurrentSumNotEqualTo(Long value) {
            addCriterion("current_sum <>", value, "currentSum");
            return (Criteria) this;
        }

        public Criteria andCurrentSumGreaterThan(Long value) {
            addCriterion("current_sum >", value, "currentSum");
            return (Criteria) this;
        }

        public Criteria andCurrentSumGreaterThanOrEqualTo(Long value) {
            addCriterion("current_sum >=", value, "currentSum");
            return (Criteria) this;
        }

        public Criteria andCurrentSumLessThan(Long value) {
            addCriterion("current_sum <", value, "currentSum");
            return (Criteria) this;
        }

        public Criteria andCurrentSumLessThanOrEqualTo(Long value) {
            addCriterion("current_sum <=", value, "currentSum");
            return (Criteria) this;
        }

        public Criteria andCurrentSumIn(List<Long> values) {
            addCriterion("current_sum in", values, "currentSum");
            return (Criteria) this;
        }

        public Criteria andCurrentSumNotIn(List<Long> values) {
            addCriterion("current_sum not in", values, "currentSum");
            return (Criteria) this;
        }

        public Criteria andCurrentSumBetween(Long value1, Long value2) {
            addCriterion("current_sum between", value1, value2, "currentSum");
            return (Criteria) this;
        }

        public Criteria andCurrentSumNotBetween(Long value1, Long value2) {
            addCriterion("current_sum not between", value1, value2, "currentSum");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andDisableDateIsNull() {
            addCriterion("disable_date is null");
            return (Criteria) this;
        }

        public Criteria andDisableDateIsNotNull() {
            addCriterion("disable_date is not null");
            return (Criteria) this;
        }

        public Criteria andDisableDateEqualTo(Date value) {
            addCriterionForJDBCDate("disable_date =", value, "disableDate");
            return (Criteria) this;
        }

        public Criteria andDisableDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("disable_date <>", value, "disableDate");
            return (Criteria) this;
        }

        public Criteria andDisableDateGreaterThan(Date value) {
            addCriterionForJDBCDate("disable_date >", value, "disableDate");
            return (Criteria) this;
        }

        public Criteria andDisableDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("disable_date >=", value, "disableDate");
            return (Criteria) this;
        }

        public Criteria andDisableDateLessThan(Date value) {
            addCriterionForJDBCDate("disable_date <", value, "disableDate");
            return (Criteria) this;
        }

        public Criteria andDisableDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("disable_date <=", value, "disableDate");
            return (Criteria) this;
        }

        public Criteria andDisableDateIn(List<Date> values) {
            addCriterionForJDBCDate("disable_date in", values, "disableDate");
            return (Criteria) this;
        }

        public Criteria andDisableDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("disable_date not in", values, "disableDate");
            return (Criteria) this;
        }

        public Criteria andDisableDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("disable_date between", value1, value2, "disableDate");
            return (Criteria) this;
        }

        public Criteria andDisableDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("disable_date not between", value1, value2, "disableDate");
            return (Criteria) this;
        }

        public Criteria andDisableDaysIsNull() {
            addCriterion("disable_days is null");
            return (Criteria) this;
        }

        public Criteria andDisableDaysIsNotNull() {
            addCriterion("disable_days is not null");
            return (Criteria) this;
        }

        public Criteria andDisableDaysEqualTo(Integer value) {
            addCriterion("disable_days =", value, "disableDays");
            return (Criteria) this;
        }

        public Criteria andDisableDaysNotEqualTo(Integer value) {
            addCriterion("disable_days <>", value, "disableDays");
            return (Criteria) this;
        }

        public Criteria andDisableDaysGreaterThan(Integer value) {
            addCriterion("disable_days >", value, "disableDays");
            return (Criteria) this;
        }

        public Criteria andDisableDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("disable_days >=", value, "disableDays");
            return (Criteria) this;
        }

        public Criteria andDisableDaysLessThan(Integer value) {
            addCriterion("disable_days <", value, "disableDays");
            return (Criteria) this;
        }

        public Criteria andDisableDaysLessThanOrEqualTo(Integer value) {
            addCriterion("disable_days <=", value, "disableDays");
            return (Criteria) this;
        }

        public Criteria andDisableDaysIn(List<Integer> values) {
            addCriterion("disable_days in", values, "disableDays");
            return (Criteria) this;
        }

        public Criteria andDisableDaysNotIn(List<Integer> values) {
            addCriterion("disable_days not in", values, "disableDays");
            return (Criteria) this;
        }

        public Criteria andDisableDaysBetween(Integer value1, Integer value2) {
            addCriterion("disable_days between", value1, value2, "disableDays");
            return (Criteria) this;
        }

        public Criteria andDisableDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("disable_days not between", value1, value2, "disableDays");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andBidsIsNull() {
            addCriterion("bids is null");
            return (Criteria) this;
        }

        public Criteria andBidsIsNotNull() {
            addCriterion("bids is not null");
            return (Criteria) this;
        }

        public Criteria andBidsEqualTo(String value) {
            addCriterion("bids =", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsNotEqualTo(String value) {
            addCriterion("bids <>", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsGreaterThan(String value) {
            addCriterion("bids >", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsGreaterThanOrEqualTo(String value) {
            addCriterion("bids >=", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsLessThan(String value) {
            addCriterion("bids <", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsLessThanOrEqualTo(String value) {
            addCriterion("bids <=", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsLike(String value) {
            addCriterion("bids like", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsNotLike(String value) {
            addCriterion("bids not like", value, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsIn(List<String> values) {
            addCriterion("bids in", values, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsNotIn(List<String> values) {
            addCriterion("bids not in", values, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsBetween(String value1, String value2) {
            addCriterion("bids between", value1, value2, "bids");
            return (Criteria) this;
        }

        public Criteria andBidsNotBetween(String value1, String value2) {
            addCriterion("bids not between", value1, value2, "bids");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNull() {
            addCriterion("auditor_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNotNull() {
            addCriterion("auditor_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdEqualTo(String value) {
            addCriterion("auditor_id =", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotEqualTo(String value) {
            addCriterion("auditor_id <>", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThan(String value) {
            addCriterion("auditor_id >", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThanOrEqualTo(String value) {
            addCriterion("auditor_id >=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThan(String value) {
            addCriterion("auditor_id <", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThanOrEqualTo(String value) {
            addCriterion("auditor_id <=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLike(String value) {
            addCriterion("auditor_id like", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotLike(String value) {
            addCriterion("auditor_id not like", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIn(List<String> values) {
            addCriterion("auditor_id in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotIn(List<String> values) {
            addCriterion("auditor_id not in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdBetween(String value1, String value2) {
            addCriterion("auditor_id between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotBetween(String value1, String value2) {
            addCriterion("auditor_id not between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorIsNull() {
            addCriterion("name_of_auditor is null");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorIsNotNull() {
            addCriterion("name_of_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorEqualTo(String value) {
            addCriterion("name_of_auditor =", value, "nameOfAuditor");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorNotEqualTo(String value) {
            addCriterion("name_of_auditor <>", value, "nameOfAuditor");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorGreaterThan(String value) {
            addCriterion("name_of_auditor >", value, "nameOfAuditor");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("name_of_auditor >=", value, "nameOfAuditor");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorLessThan(String value) {
            addCriterion("name_of_auditor <", value, "nameOfAuditor");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorLessThanOrEqualTo(String value) {
            addCriterion("name_of_auditor <=", value, "nameOfAuditor");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorLike(String value) {
            addCriterion("name_of_auditor like", value, "nameOfAuditor");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorNotLike(String value) {
            addCriterion("name_of_auditor not like", value, "nameOfAuditor");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorIn(List<String> values) {
            addCriterion("name_of_auditor in", values, "nameOfAuditor");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorNotIn(List<String> values) {
            addCriterion("name_of_auditor not in", values, "nameOfAuditor");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorBetween(String value1, String value2) {
            addCriterion("name_of_auditor between", value1, value2, "nameOfAuditor");
            return (Criteria) this;
        }

        public Criteria andNameOfAuditorNotBetween(String value1, String value2) {
            addCriterion("name_of_auditor not between", value1, value2, "nameOfAuditor");
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