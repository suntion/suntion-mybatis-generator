package com.ccclubs.tp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsProjectPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsProjectPersonExample() {
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

        public Criteria andCsppIdIsNull() {
            addCriterion("cspp_id is null");
            return (Criteria) this;
        }

        public Criteria andCsppIdIsNotNull() {
            addCriterion("cspp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCsppIdEqualTo(Long value) {
            addCriterion("cspp_id =", value, "csppId");
            return (Criteria) this;
        }

        public Criteria andCsppIdNotEqualTo(Long value) {
            addCriterion("cspp_id <>", value, "csppId");
            return (Criteria) this;
        }

        public Criteria andCsppIdGreaterThan(Long value) {
            addCriterion("cspp_id >", value, "csppId");
            return (Criteria) this;
        }

        public Criteria andCsppIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cspp_id >=", value, "csppId");
            return (Criteria) this;
        }

        public Criteria andCsppIdLessThan(Long value) {
            addCriterion("cspp_id <", value, "csppId");
            return (Criteria) this;
        }

        public Criteria andCsppIdLessThanOrEqualTo(Long value) {
            addCriterion("cspp_id <=", value, "csppId");
            return (Criteria) this;
        }

        public Criteria andCsppIdIn(List<Long> values) {
            addCriterion("cspp_id in", values, "csppId");
            return (Criteria) this;
        }

        public Criteria andCsppIdNotIn(List<Long> values) {
            addCriterion("cspp_id not in", values, "csppId");
            return (Criteria) this;
        }

        public Criteria andCsppIdBetween(Long value1, Long value2) {
            addCriterion("cspp_id between", value1, value2, "csppId");
            return (Criteria) this;
        }

        public Criteria andCsppIdNotBetween(Long value1, Long value2) {
            addCriterion("cspp_id not between", value1, value2, "csppId");
            return (Criteria) this;
        }

        public Criteria andCsppProjectInfoIsNull() {
            addCriterion("cspp_project_info is null");
            return (Criteria) this;
        }

        public Criteria andCsppProjectInfoIsNotNull() {
            addCriterion("cspp_project_info is not null");
            return (Criteria) this;
        }

        public Criteria andCsppProjectInfoEqualTo(Long value) {
            addCriterion("cspp_project_info =", value, "csppProjectInfo");
            return (Criteria) this;
        }

        public Criteria andCsppProjectInfoNotEqualTo(Long value) {
            addCriterion("cspp_project_info <>", value, "csppProjectInfo");
            return (Criteria) this;
        }

        public Criteria andCsppProjectInfoGreaterThan(Long value) {
            addCriterion("cspp_project_info >", value, "csppProjectInfo");
            return (Criteria) this;
        }

        public Criteria andCsppProjectInfoGreaterThanOrEqualTo(Long value) {
            addCriterion("cspp_project_info >=", value, "csppProjectInfo");
            return (Criteria) this;
        }

        public Criteria andCsppProjectInfoLessThan(Long value) {
            addCriterion("cspp_project_info <", value, "csppProjectInfo");
            return (Criteria) this;
        }

        public Criteria andCsppProjectInfoLessThanOrEqualTo(Long value) {
            addCriterion("cspp_project_info <=", value, "csppProjectInfo");
            return (Criteria) this;
        }

        public Criteria andCsppProjectInfoIn(List<Long> values) {
            addCriterion("cspp_project_info in", values, "csppProjectInfo");
            return (Criteria) this;
        }

        public Criteria andCsppProjectInfoNotIn(List<Long> values) {
            addCriterion("cspp_project_info not in", values, "csppProjectInfo");
            return (Criteria) this;
        }

        public Criteria andCsppProjectInfoBetween(Long value1, Long value2) {
            addCriterion("cspp_project_info between", value1, value2, "csppProjectInfo");
            return (Criteria) this;
        }

        public Criteria andCsppProjectInfoNotBetween(Long value1, Long value2) {
            addCriterion("cspp_project_info not between", value1, value2, "csppProjectInfo");
            return (Criteria) this;
        }

        public Criteria andCsppMemberIsNull() {
            addCriterion("cspp_member is null");
            return (Criteria) this;
        }

        public Criteria andCsppMemberIsNotNull() {
            addCriterion("cspp_member is not null");
            return (Criteria) this;
        }

        public Criteria andCsppMemberEqualTo(Long value) {
            addCriterion("cspp_member =", value, "csppMember");
            return (Criteria) this;
        }

        public Criteria andCsppMemberNotEqualTo(Long value) {
            addCriterion("cspp_member <>", value, "csppMember");
            return (Criteria) this;
        }

        public Criteria andCsppMemberGreaterThan(Long value) {
            addCriterion("cspp_member >", value, "csppMember");
            return (Criteria) this;
        }

        public Criteria andCsppMemberGreaterThanOrEqualTo(Long value) {
            addCriterion("cspp_member >=", value, "csppMember");
            return (Criteria) this;
        }

        public Criteria andCsppMemberLessThan(Long value) {
            addCriterion("cspp_member <", value, "csppMember");
            return (Criteria) this;
        }

        public Criteria andCsppMemberLessThanOrEqualTo(Long value) {
            addCriterion("cspp_member <=", value, "csppMember");
            return (Criteria) this;
        }

        public Criteria andCsppMemberIn(List<Long> values) {
            addCriterion("cspp_member in", values, "csppMember");
            return (Criteria) this;
        }

        public Criteria andCsppMemberNotIn(List<Long> values) {
            addCriterion("cspp_member not in", values, "csppMember");
            return (Criteria) this;
        }

        public Criteria andCsppMemberBetween(Long value1, Long value2) {
            addCriterion("cspp_member between", value1, value2, "csppMember");
            return (Criteria) this;
        }

        public Criteria andCsppMemberNotBetween(Long value1, Long value2) {
            addCriterion("cspp_member not between", value1, value2, "csppMember");
            return (Criteria) this;
        }

        public Criteria andCsppUnitPersonIsNull() {
            addCriterion("cspp_unit_person is null");
            return (Criteria) this;
        }

        public Criteria andCsppUnitPersonIsNotNull() {
            addCriterion("cspp_unit_person is not null");
            return (Criteria) this;
        }

        public Criteria andCsppUnitPersonEqualTo(Long value) {
            addCriterion("cspp_unit_person =", value, "csppUnitPerson");
            return (Criteria) this;
        }

        public Criteria andCsppUnitPersonNotEqualTo(Long value) {
            addCriterion("cspp_unit_person <>", value, "csppUnitPerson");
            return (Criteria) this;
        }

        public Criteria andCsppUnitPersonGreaterThan(Long value) {
            addCriterion("cspp_unit_person >", value, "csppUnitPerson");
            return (Criteria) this;
        }

        public Criteria andCsppUnitPersonGreaterThanOrEqualTo(Long value) {
            addCriterion("cspp_unit_person >=", value, "csppUnitPerson");
            return (Criteria) this;
        }

        public Criteria andCsppUnitPersonLessThan(Long value) {
            addCriterion("cspp_unit_person <", value, "csppUnitPerson");
            return (Criteria) this;
        }

        public Criteria andCsppUnitPersonLessThanOrEqualTo(Long value) {
            addCriterion("cspp_unit_person <=", value, "csppUnitPerson");
            return (Criteria) this;
        }

        public Criteria andCsppUnitPersonIn(List<Long> values) {
            addCriterion("cspp_unit_person in", values, "csppUnitPerson");
            return (Criteria) this;
        }

        public Criteria andCsppUnitPersonNotIn(List<Long> values) {
            addCriterion("cspp_unit_person not in", values, "csppUnitPerson");
            return (Criteria) this;
        }

        public Criteria andCsppUnitPersonBetween(Long value1, Long value2) {
            addCriterion("cspp_unit_person between", value1, value2, "csppUnitPerson");
            return (Criteria) this;
        }

        public Criteria andCsppUnitPersonNotBetween(Long value1, Long value2) {
            addCriterion("cspp_unit_person not between", value1, value2, "csppUnitPerson");
            return (Criteria) this;
        }

        public Criteria andCsppAddTimeIsNull() {
            addCriterion("cspp_add_time is null");
            return (Criteria) this;
        }

        public Criteria andCsppAddTimeIsNotNull() {
            addCriterion("cspp_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andCsppAddTimeEqualTo(Date value) {
            addCriterion("cspp_add_time =", value, "csppAddTime");
            return (Criteria) this;
        }

        public Criteria andCsppAddTimeNotEqualTo(Date value) {
            addCriterion("cspp_add_time <>", value, "csppAddTime");
            return (Criteria) this;
        }

        public Criteria andCsppAddTimeGreaterThan(Date value) {
            addCriterion("cspp_add_time >", value, "csppAddTime");
            return (Criteria) this;
        }

        public Criteria andCsppAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cspp_add_time >=", value, "csppAddTime");
            return (Criteria) this;
        }

        public Criteria andCsppAddTimeLessThan(Date value) {
            addCriterion("cspp_add_time <", value, "csppAddTime");
            return (Criteria) this;
        }

        public Criteria andCsppAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("cspp_add_time <=", value, "csppAddTime");
            return (Criteria) this;
        }

        public Criteria andCsppAddTimeIn(List<Date> values) {
            addCriterion("cspp_add_time in", values, "csppAddTime");
            return (Criteria) this;
        }

        public Criteria andCsppAddTimeNotIn(List<Date> values) {
            addCriterion("cspp_add_time not in", values, "csppAddTime");
            return (Criteria) this;
        }

        public Criteria andCsppAddTimeBetween(Date value1, Date value2) {
            addCriterion("cspp_add_time between", value1, value2, "csppAddTime");
            return (Criteria) this;
        }

        public Criteria andCsppAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("cspp_add_time not between", value1, value2, "csppAddTime");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserIsNull() {
            addCriterion("cspp_add_user is null");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserIsNotNull() {
            addCriterion("cspp_add_user is not null");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserEqualTo(String value) {
            addCriterion("cspp_add_user =", value, "csppAddUser");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserNotEqualTo(String value) {
            addCriterion("cspp_add_user <>", value, "csppAddUser");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserGreaterThan(String value) {
            addCriterion("cspp_add_user >", value, "csppAddUser");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserGreaterThanOrEqualTo(String value) {
            addCriterion("cspp_add_user >=", value, "csppAddUser");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserLessThan(String value) {
            addCriterion("cspp_add_user <", value, "csppAddUser");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserLessThanOrEqualTo(String value) {
            addCriterion("cspp_add_user <=", value, "csppAddUser");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserLike(String value) {
            addCriterion("cspp_add_user like", value, "csppAddUser");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserNotLike(String value) {
            addCriterion("cspp_add_user not like", value, "csppAddUser");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserIn(List<String> values) {
            addCriterion("cspp_add_user in", values, "csppAddUser");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserNotIn(List<String> values) {
            addCriterion("cspp_add_user not in", values, "csppAddUser");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserBetween(String value1, String value2) {
            addCriterion("cspp_add_user between", value1, value2, "csppAddUser");
            return (Criteria) this;
        }

        public Criteria andCsppAddUserNotBetween(String value1, String value2) {
            addCriterion("cspp_add_user not between", value1, value2, "csppAddUser");
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