package com.xykj.crowdfunding.reverse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BidobjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BidobjectExample() {
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

        public Criteria andBidIdIsNull() {
            addCriterion("bid_id is null");
            return (Criteria) this;
        }

        public Criteria andBidIdIsNotNull() {
            addCriterion("bid_id is not null");
            return (Criteria) this;
        }

        public Criteria andBidIdEqualTo(Integer value) {
            addCriterion("bid_id =", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotEqualTo(Integer value) {
            addCriterion("bid_id <>", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThan(Integer value) {
            addCriterion("bid_id >", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid_id >=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThan(Integer value) {
            addCriterion("bid_id <", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThanOrEqualTo(Integer value) {
            addCriterion("bid_id <=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdIn(List<Integer> values) {
            addCriterion("bid_id in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotIn(List<Integer> values) {
            addCriterion("bid_id not in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdBetween(Integer value1, Integer value2) {
            addCriterion("bid_id between", value1, value2, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bid_id not between", value1, value2, "bidId");
            return (Criteria) this;
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

        public Criteria andBidderIdIsNull() {
            addCriterion("bidder_id is null");
            return (Criteria) this;
        }

        public Criteria andBidderIdIsNotNull() {
            addCriterion("bidder_id is not null");
            return (Criteria) this;
        }

        public Criteria andBidderIdEqualTo(String value) {
            addCriterion("bidder_id =", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdNotEqualTo(String value) {
            addCriterion("bidder_id <>", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdGreaterThan(String value) {
            addCriterion("bidder_id >", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdGreaterThanOrEqualTo(String value) {
            addCriterion("bidder_id >=", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdLessThan(String value) {
            addCriterion("bidder_id <", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdLessThanOrEqualTo(String value) {
            addCriterion("bidder_id <=", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdLike(String value) {
            addCriterion("bidder_id like", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdNotLike(String value) {
            addCriterion("bidder_id not like", value, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdIn(List<String> values) {
            addCriterion("bidder_id in", values, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdNotIn(List<String> values) {
            addCriterion("bidder_id not in", values, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdBetween(String value1, String value2) {
            addCriterion("bidder_id between", value1, value2, "bidderId");
            return (Criteria) this;
        }

        public Criteria andBidderIdNotBetween(String value1, String value2) {
            addCriterion("bidder_id not between", value1, value2, "bidderId");
            return (Criteria) this;
        }

        public Criteria andActualRateIsNull() {
            addCriterion("actual_rate is null");
            return (Criteria) this;
        }

        public Criteria andActualRateIsNotNull() {
            addCriterion("actual_rate is not null");
            return (Criteria) this;
        }

        public Criteria andActualRateEqualTo(Long value) {
            addCriterion("actual_rate =", value, "actualRate");
            return (Criteria) this;
        }

        public Criteria andActualRateNotEqualTo(Long value) {
            addCriterion("actual_rate <>", value, "actualRate");
            return (Criteria) this;
        }

        public Criteria andActualRateGreaterThan(Long value) {
            addCriterion("actual_rate >", value, "actualRate");
            return (Criteria) this;
        }

        public Criteria andActualRateGreaterThanOrEqualTo(Long value) {
            addCriterion("actual_rate >=", value, "actualRate");
            return (Criteria) this;
        }

        public Criteria andActualRateLessThan(Long value) {
            addCriterion("actual_rate <", value, "actualRate");
            return (Criteria) this;
        }

        public Criteria andActualRateLessThanOrEqualTo(Long value) {
            addCriterion("actual_rate <=", value, "actualRate");
            return (Criteria) this;
        }

        public Criteria andActualRateIn(List<Long> values) {
            addCriterion("actual_rate in", values, "actualRate");
            return (Criteria) this;
        }

        public Criteria andActualRateNotIn(List<Long> values) {
            addCriterion("actual_rate not in", values, "actualRate");
            return (Criteria) this;
        }

        public Criteria andActualRateBetween(Long value1, Long value2) {
            addCriterion("actual_rate between", value1, value2, "actualRate");
            return (Criteria) this;
        }

        public Criteria andActualRateNotBetween(Long value1, Long value2) {
            addCriterion("actual_rate not between", value1, value2, "actualRate");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountIsNull() {
            addCriterion("available_amount is null");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountIsNotNull() {
            addCriterion("available_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountEqualTo(Long value) {
            addCriterion("available_amount =", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountNotEqualTo(Long value) {
            addCriterion("available_amount <>", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountGreaterThan(Long value) {
            addCriterion("available_amount >", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("available_amount >=", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountLessThan(Long value) {
            addCriterion("available_amount <", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountLessThanOrEqualTo(Long value) {
            addCriterion("available_amount <=", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountIn(List<Long> values) {
            addCriterion("available_amount in", values, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountNotIn(List<Long> values) {
            addCriterion("available_amount not in", values, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountBetween(Long value1, Long value2) {
            addCriterion("available_amount between", value1, value2, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountNotBetween(Long value1, Long value2) {
            addCriterion("available_amount not between", value1, value2, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andBidRequestidIsNull() {
            addCriterion("bid_requestid is null");
            return (Criteria) this;
        }

        public Criteria andBidRequestidIsNotNull() {
            addCriterion("bid_requestid is not null");
            return (Criteria) this;
        }

        public Criteria andBidRequestidEqualTo(Long value) {
            addCriterion("bid_requestid =", value, "bidRequestid");
            return (Criteria) this;
        }

        public Criteria andBidRequestidNotEqualTo(Long value) {
            addCriterion("bid_requestid <>", value, "bidRequestid");
            return (Criteria) this;
        }

        public Criteria andBidRequestidGreaterThan(Long value) {
            addCriterion("bid_requestid >", value, "bidRequestid");
            return (Criteria) this;
        }

        public Criteria andBidRequestidGreaterThanOrEqualTo(Long value) {
            addCriterion("bid_requestid >=", value, "bidRequestid");
            return (Criteria) this;
        }

        public Criteria andBidRequestidLessThan(Long value) {
            addCriterion("bid_requestid <", value, "bidRequestid");
            return (Criteria) this;
        }

        public Criteria andBidRequestidLessThanOrEqualTo(Long value) {
            addCriterion("bid_requestid <=", value, "bidRequestid");
            return (Criteria) this;
        }

        public Criteria andBidRequestidIn(List<Long> values) {
            addCriterion("bid_requestid in", values, "bidRequestid");
            return (Criteria) this;
        }

        public Criteria andBidRequestidNotIn(List<Long> values) {
            addCriterion("bid_requestid not in", values, "bidRequestid");
            return (Criteria) this;
        }

        public Criteria andBidRequestidBetween(Long value1, Long value2) {
            addCriterion("bid_requestid between", value1, value2, "bidRequestid");
            return (Criteria) this;
        }

        public Criteria andBidRequestidNotBetween(Long value1, Long value2) {
            addCriterion("bid_requestid not between", value1, value2, "bidRequestid");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleIsNull() {
            addCriterion("bid_request_title is null");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleIsNotNull() {
            addCriterion("bid_request_title is not null");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleEqualTo(String value) {
            addCriterion("bid_request_title =", value, "bidRequestTitle");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleNotEqualTo(String value) {
            addCriterion("bid_request_title <>", value, "bidRequestTitle");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleGreaterThan(String value) {
            addCriterion("bid_request_title >", value, "bidRequestTitle");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleGreaterThanOrEqualTo(String value) {
            addCriterion("bid_request_title >=", value, "bidRequestTitle");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleLessThan(String value) {
            addCriterion("bid_request_title <", value, "bidRequestTitle");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleLessThanOrEqualTo(String value) {
            addCriterion("bid_request_title <=", value, "bidRequestTitle");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleLike(String value) {
            addCriterion("bid_request_title like", value, "bidRequestTitle");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleNotLike(String value) {
            addCriterion("bid_request_title not like", value, "bidRequestTitle");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleIn(List<String> values) {
            addCriterion("bid_request_title in", values, "bidRequestTitle");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleNotIn(List<String> values) {
            addCriterion("bid_request_title not in", values, "bidRequestTitle");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleBetween(String value1, String value2) {
            addCriterion("bid_request_title between", value1, value2, "bidRequestTitle");
            return (Criteria) this;
        }

        public Criteria andBidRequestTitleNotBetween(String value1, String value2) {
            addCriterion("bid_request_title not between", value1, value2, "bidRequestTitle");
            return (Criteria) this;
        }

        public Criteria andBiduserIsNull() {
            addCriterion("biduser is null");
            return (Criteria) this;
        }

        public Criteria andBiduserIsNotNull() {
            addCriterion("biduser is not null");
            return (Criteria) this;
        }

        public Criteria andBiduserEqualTo(String value) {
            addCriterion("biduser =", value, "biduser");
            return (Criteria) this;
        }

        public Criteria andBiduserNotEqualTo(String value) {
            addCriterion("biduser <>", value, "biduser");
            return (Criteria) this;
        }

        public Criteria andBiduserGreaterThan(String value) {
            addCriterion("biduser >", value, "biduser");
            return (Criteria) this;
        }

        public Criteria andBiduserGreaterThanOrEqualTo(String value) {
            addCriterion("biduser >=", value, "biduser");
            return (Criteria) this;
        }

        public Criteria andBiduserLessThan(String value) {
            addCriterion("biduser <", value, "biduser");
            return (Criteria) this;
        }

        public Criteria andBiduserLessThanOrEqualTo(String value) {
            addCriterion("biduser <=", value, "biduser");
            return (Criteria) this;
        }

        public Criteria andBiduserLike(String value) {
            addCriterion("biduser like", value, "biduser");
            return (Criteria) this;
        }

        public Criteria andBiduserNotLike(String value) {
            addCriterion("biduser not like", value, "biduser");
            return (Criteria) this;
        }

        public Criteria andBiduserIn(List<String> values) {
            addCriterion("biduser in", values, "biduser");
            return (Criteria) this;
        }

        public Criteria andBiduserNotIn(List<String> values) {
            addCriterion("biduser not in", values, "biduser");
            return (Criteria) this;
        }

        public Criteria andBiduserBetween(String value1, String value2) {
            addCriterion("biduser between", value1, value2, "biduser");
            return (Criteria) this;
        }

        public Criteria andBiduserNotBetween(String value1, String value2) {
            addCriterion("biduser not between", value1, value2, "biduser");
            return (Criteria) this;
        }

        public Criteria andBidTimeIsNull() {
            addCriterion("bid_time is null");
            return (Criteria) this;
        }

        public Criteria andBidTimeIsNotNull() {
            addCriterion("bid_time is not null");
            return (Criteria) this;
        }

        public Criteria andBidTimeEqualTo(Date value) {
            addCriterionForJDBCDate("bid_time =", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("bid_time <>", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("bid_time >", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bid_time >=", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeLessThan(Date value) {
            addCriterionForJDBCDate("bid_time <", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bid_time <=", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeIn(List<Date> values) {
            addCriterionForJDBCDate("bid_time in", values, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("bid_time not in", values, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bid_time between", value1, value2, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bid_time not between", value1, value2, "bidTime");
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