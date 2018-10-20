package com.xykj.crowdfunding.reverse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMailboxAuthenticationFlagIsNull() {
            addCriterion("mailbox_authentication_flag is null");
            return (Criteria) this;
        }

        public Criteria andMailboxAuthenticationFlagIsNotNull() {
            addCriterion("mailbox_authentication_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMailboxAuthenticationFlagEqualTo(Boolean value) {
            addCriterion("mailbox_authentication_flag =", value, "mailboxAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andMailboxAuthenticationFlagNotEqualTo(Boolean value) {
            addCriterion("mailbox_authentication_flag <>", value, "mailboxAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andMailboxAuthenticationFlagGreaterThan(Boolean value) {
            addCriterion("mailbox_authentication_flag >", value, "mailboxAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andMailboxAuthenticationFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mailbox_authentication_flag >=", value, "mailboxAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andMailboxAuthenticationFlagLessThan(Boolean value) {
            addCriterion("mailbox_authentication_flag <", value, "mailboxAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andMailboxAuthenticationFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("mailbox_authentication_flag <=", value, "mailboxAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andMailboxAuthenticationFlagIn(List<Boolean> values) {
            addCriterion("mailbox_authentication_flag in", values, "mailboxAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andMailboxAuthenticationFlagNotIn(List<Boolean> values) {
            addCriterion("mailbox_authentication_flag not in", values, "mailboxAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andMailboxAuthenticationFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("mailbox_authentication_flag between", value1, value2, "mailboxAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andMailboxAuthenticationFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mailbox_authentication_flag not between", value1, value2, "mailboxAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthenticationFlagIsNull() {
            addCriterion("phone_authentication_flag is null");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthenticationFlagIsNotNull() {
            addCriterion("phone_authentication_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthenticationFlagEqualTo(Boolean value) {
            addCriterion("phone_authentication_flag =", value, "phoneAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthenticationFlagNotEqualTo(Boolean value) {
            addCriterion("phone_authentication_flag <>", value, "phoneAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthenticationFlagGreaterThan(Boolean value) {
            addCriterion("phone_authentication_flag >", value, "phoneAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthenticationFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("phone_authentication_flag >=", value, "phoneAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthenticationFlagLessThan(Boolean value) {
            addCriterion("phone_authentication_flag <", value, "phoneAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthenticationFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("phone_authentication_flag <=", value, "phoneAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthenticationFlagIn(List<Boolean> values) {
            addCriterion("phone_authentication_flag in", values, "phoneAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthenticationFlagNotIn(List<Boolean> values) {
            addCriterion("phone_authentication_flag not in", values, "phoneAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthenticationFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("phone_authentication_flag between", value1, value2, "phoneAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andPhoneAuthenticationFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("phone_authentication_flag not between", value1, value2, "phoneAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andVipMemberFlagIsNull() {
            addCriterion("vip_member_flag is null");
            return (Criteria) this;
        }

        public Criteria andVipMemberFlagIsNotNull() {
            addCriterion("vip_member_flag is not null");
            return (Criteria) this;
        }

        public Criteria andVipMemberFlagEqualTo(Boolean value) {
            addCriterion("vip_member_flag =", value, "vipMemberFlag");
            return (Criteria) this;
        }

        public Criteria andVipMemberFlagNotEqualTo(Boolean value) {
            addCriterion("vip_member_flag <>", value, "vipMemberFlag");
            return (Criteria) this;
        }

        public Criteria andVipMemberFlagGreaterThan(Boolean value) {
            addCriterion("vip_member_flag >", value, "vipMemberFlag");
            return (Criteria) this;
        }

        public Criteria andVipMemberFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("vip_member_flag >=", value, "vipMemberFlag");
            return (Criteria) this;
        }

        public Criteria andVipMemberFlagLessThan(Boolean value) {
            addCriterion("vip_member_flag <", value, "vipMemberFlag");
            return (Criteria) this;
        }

        public Criteria andVipMemberFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("vip_member_flag <=", value, "vipMemberFlag");
            return (Criteria) this;
        }

        public Criteria andVipMemberFlagIn(List<Boolean> values) {
            addCriterion("vip_member_flag in", values, "vipMemberFlag");
            return (Criteria) this;
        }

        public Criteria andVipMemberFlagNotIn(List<Boolean> values) {
            addCriterion("vip_member_flag not in", values, "vipMemberFlag");
            return (Criteria) this;
        }

        public Criteria andVipMemberFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("vip_member_flag between", value1, value2, "vipMemberFlag");
            return (Criteria) this;
        }

        public Criteria andVipMemberFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("vip_member_flag not between", value1, value2, "vipMemberFlag");
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

        public Criteria andPersonalQualificationsIdIsNull() {
            addCriterion("personal_qualifications_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonalQualificationsIdIsNotNull() {
            addCriterion("personal_qualifications_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalQualificationsIdEqualTo(Integer value) {
            addCriterion("personal_qualifications_id =", value, "personalQualificationsId");
            return (Criteria) this;
        }

        public Criteria andPersonalQualificationsIdNotEqualTo(Integer value) {
            addCriterion("personal_qualifications_id <>", value, "personalQualificationsId");
            return (Criteria) this;
        }

        public Criteria andPersonalQualificationsIdGreaterThan(Integer value) {
            addCriterion("personal_qualifications_id >", value, "personalQualificationsId");
            return (Criteria) this;
        }

        public Criteria andPersonalQualificationsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("personal_qualifications_id >=", value, "personalQualificationsId");
            return (Criteria) this;
        }

        public Criteria andPersonalQualificationsIdLessThan(Integer value) {
            addCriterion("personal_qualifications_id <", value, "personalQualificationsId");
            return (Criteria) this;
        }

        public Criteria andPersonalQualificationsIdLessThanOrEqualTo(Integer value) {
            addCriterion("personal_qualifications_id <=", value, "personalQualificationsId");
            return (Criteria) this;
        }

        public Criteria andPersonalQualificationsIdIn(List<Integer> values) {
            addCriterion("personal_qualifications_id in", values, "personalQualificationsId");
            return (Criteria) this;
        }

        public Criteria andPersonalQualificationsIdNotIn(List<Integer> values) {
            addCriterion("personal_qualifications_id not in", values, "personalQualificationsId");
            return (Criteria) this;
        }

        public Criteria andPersonalQualificationsIdBetween(Integer value1, Integer value2) {
            addCriterion("personal_qualifications_id between", value1, value2, "personalQualificationsId");
            return (Criteria) this;
        }

        public Criteria andPersonalQualificationsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("personal_qualifications_id not between", value1, value2, "personalQualificationsId");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeIsNull() {
            addCriterion("monthly_income is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeIsNotNull() {
            addCriterion("monthly_income is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeEqualTo(Integer value) {
            addCriterion("monthly_income =", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeNotEqualTo(Integer value) {
            addCriterion("monthly_income <>", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeGreaterThan(Integer value) {
            addCriterion("monthly_income >", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_income >=", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeLessThan(Integer value) {
            addCriterion("monthly_income <", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_income <=", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeIn(List<Integer> values) {
            addCriterion("monthly_income in", values, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeNotIn(List<Integer> values) {
            addCriterion("monthly_income not in", values, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeBetween(Integer value1, Integer value2) {
            addCriterion("monthly_income between", value1, value2, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_income not between", value1, value2, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(Integer value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(Integer value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(Integer value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(Integer value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<Integer> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<Integer> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(Integer value1, Integer value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andChildrenSituationIsNull() {
            addCriterion("Children_situation is null");
            return (Criteria) this;
        }

        public Criteria andChildrenSituationIsNotNull() {
            addCriterion("Children_situation is not null");
            return (Criteria) this;
        }

        public Criteria andChildrenSituationEqualTo(Integer value) {
            addCriterion("Children_situation =", value, "childrenSituation");
            return (Criteria) this;
        }

        public Criteria andChildrenSituationNotEqualTo(Integer value) {
            addCriterion("Children_situation <>", value, "childrenSituation");
            return (Criteria) this;
        }

        public Criteria andChildrenSituationGreaterThan(Integer value) {
            addCriterion("Children_situation >", value, "childrenSituation");
            return (Criteria) this;
        }

        public Criteria andChildrenSituationGreaterThanOrEqualTo(Integer value) {
            addCriterion("Children_situation >=", value, "childrenSituation");
            return (Criteria) this;
        }

        public Criteria andChildrenSituationLessThan(Integer value) {
            addCriterion("Children_situation <", value, "childrenSituation");
            return (Criteria) this;
        }

        public Criteria andChildrenSituationLessThanOrEqualTo(Integer value) {
            addCriterion("Children_situation <=", value, "childrenSituation");
            return (Criteria) this;
        }

        public Criteria andChildrenSituationIn(List<Integer> values) {
            addCriterion("Children_situation in", values, "childrenSituation");
            return (Criteria) this;
        }

        public Criteria andChildrenSituationNotIn(List<Integer> values) {
            addCriterion("Children_situation not in", values, "childrenSituation");
            return (Criteria) this;
        }

        public Criteria andChildrenSituationBetween(Integer value1, Integer value2) {
            addCriterion("Children_situation between", value1, value2, "childrenSituation");
            return (Criteria) this;
        }

        public Criteria andChildrenSituationNotBetween(Integer value1, Integer value2) {
            addCriterion("Children_situation not between", value1, value2, "childrenSituation");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsIsNull() {
            addCriterion("housing_conditions is null");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsIsNotNull() {
            addCriterion("housing_conditions is not null");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsEqualTo(Integer value) {
            addCriterion("housing_conditions =", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsNotEqualTo(Integer value) {
            addCriterion("housing_conditions <>", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsGreaterThan(Integer value) {
            addCriterion("housing_conditions >", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("housing_conditions >=", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsLessThan(Integer value) {
            addCriterion("housing_conditions <", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsLessThanOrEqualTo(Integer value) {
            addCriterion("housing_conditions <=", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsIn(List<Integer> values) {
            addCriterion("housing_conditions in", values, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsNotIn(List<Integer> values) {
            addCriterion("housing_conditions not in", values, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsBetween(Integer value1, Integer value2) {
            addCriterion("housing_conditions between", value1, value2, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsNotBetween(Integer value1, Integer value2) {
            addCriterion("housing_conditions not between", value1, value2, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNull() {
            addCriterion("headimg is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNotNull() {
            addCriterion("headimg is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgEqualTo(String value) {
            addCriterion("headimg =", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotEqualTo(String value) {
            addCriterion("headimg <>", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThan(String value) {
            addCriterion("headimg >", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThanOrEqualTo(String value) {
            addCriterion("headimg >=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThan(String value) {
            addCriterion("headimg <", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThanOrEqualTo(String value) {
            addCriterion("headimg <=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLike(String value) {
            addCriterion("headimg like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotLike(String value) {
            addCriterion("headimg not like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgIn(List<String> values) {
            addCriterion("headimg in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotIn(List<String> values) {
            addCriterion("headimg not in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgBetween(String value1, String value2) {
            addCriterion("headimg between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotBetween(String value1, String value2) {
            addCriterion("headimg not between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIsNull() {
            addCriterion("education_background is null");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIsNotNull() {
            addCriterion("education_background is not null");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundEqualTo(String value) {
            addCriterion("education_background =", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotEqualTo(String value) {
            addCriterion("education_background <>", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundGreaterThan(String value) {
            addCriterion("education_background >", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("education_background >=", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLessThan(String value) {
            addCriterion("education_background <", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLessThanOrEqualTo(String value) {
            addCriterion("education_background <=", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLike(String value) {
            addCriterion("education_background like", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotLike(String value) {
            addCriterion("education_background not like", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIn(List<String> values) {
            addCriterion("education_background in", values, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotIn(List<String> values) {
            addCriterion("education_background not in", values, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundBetween(String value1, String value2) {
            addCriterion("education_background between", value1, value2, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotBetween(String value1, String value2) {
            addCriterion("education_background not between", value1, value2, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterionForJDBCDate("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterionForJDBCDate("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterionForJDBCDate("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterionForJDBCDate("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterionForJDBCDate("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterionForJDBCDate("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEmailsenddateIsNull() {
            addCriterion("emailsenddate is null");
            return (Criteria) this;
        }

        public Criteria andEmailsenddateIsNotNull() {
            addCriterion("emailsenddate is not null");
            return (Criteria) this;
        }

        public Criteria andEmailsenddateEqualTo(Date value) {
            addCriterion("emailsenddate =", value, "emailsenddate");
            return (Criteria) this;
        }

        public Criteria andEmailsenddateNotEqualTo(Date value) {
            addCriterion("emailsenddate <>", value, "emailsenddate");
            return (Criteria) this;
        }

        public Criteria andEmailsenddateGreaterThan(Date value) {
            addCriterion("emailsenddate >", value, "emailsenddate");
            return (Criteria) this;
        }

        public Criteria andEmailsenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("emailsenddate >=", value, "emailsenddate");
            return (Criteria) this;
        }

        public Criteria andEmailsenddateLessThan(Date value) {
            addCriterion("emailsenddate <", value, "emailsenddate");
            return (Criteria) this;
        }

        public Criteria andEmailsenddateLessThanOrEqualTo(Date value) {
            addCriterion("emailsenddate <=", value, "emailsenddate");
            return (Criteria) this;
        }

        public Criteria andEmailsenddateIn(List<Date> values) {
            addCriterion("emailsenddate in", values, "emailsenddate");
            return (Criteria) this;
        }

        public Criteria andEmailsenddateNotIn(List<Date> values) {
            addCriterion("emailsenddate not in", values, "emailsenddate");
            return (Criteria) this;
        }

        public Criteria andEmailsenddateBetween(Date value1, Date value2) {
            addCriterion("emailsenddate between", value1, value2, "emailsenddate");
            return (Criteria) this;
        }

        public Criteria andEmailsenddateNotBetween(Date value1, Date value2) {
            addCriterion("emailsenddate not between", value1, value2, "emailsenddate");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationFlagIsNull() {
            addCriterion("real_name_authentication_flag is null");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationFlagIsNotNull() {
            addCriterion("real_name_authentication_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationFlagEqualTo(Boolean value) {
            addCriterion("real_name_authentication_flag =", value, "realNameAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationFlagNotEqualTo(Boolean value) {
            addCriterion("real_name_authentication_flag <>", value, "realNameAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationFlagGreaterThan(Boolean value) {
            addCriterion("real_name_authentication_flag >", value, "realNameAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("real_name_authentication_flag >=", value, "realNameAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationFlagLessThan(Boolean value) {
            addCriterion("real_name_authentication_flag <", value, "realNameAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("real_name_authentication_flag <=", value, "realNameAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationFlagIn(List<Boolean> values) {
            addCriterion("real_name_authentication_flag in", values, "realNameAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationFlagNotIn(List<Boolean> values) {
            addCriterion("real_name_authentication_flag not in", values, "realNameAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("real_name_authentication_flag between", value1, value2, "realNameAuthenticationFlag");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("real_name_authentication_flag not between", value1, value2, "realNameAuthenticationFlag");
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