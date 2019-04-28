package com.ccclubs.tp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsProjectInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsProjectInfoExample() {
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

        public Criteria andCspiIdIsNull() {
            addCriterion("cspi_id is null");
            return (Criteria) this;
        }

        public Criteria andCspiIdIsNotNull() {
            addCriterion("cspi_id is not null");
            return (Criteria) this;
        }

        public Criteria andCspiIdEqualTo(Long value) {
            addCriterion("cspi_id =", value, "cspiId");
            return (Criteria) this;
        }

        public Criteria andCspiIdNotEqualTo(Long value) {
            addCriterion("cspi_id <>", value, "cspiId");
            return (Criteria) this;
        }

        public Criteria andCspiIdGreaterThan(Long value) {
            addCriterion("cspi_id >", value, "cspiId");
            return (Criteria) this;
        }

        public Criteria andCspiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cspi_id >=", value, "cspiId");
            return (Criteria) this;
        }

        public Criteria andCspiIdLessThan(Long value) {
            addCriterion("cspi_id <", value, "cspiId");
            return (Criteria) this;
        }

        public Criteria andCspiIdLessThanOrEqualTo(Long value) {
            addCriterion("cspi_id <=", value, "cspiId");
            return (Criteria) this;
        }

        public Criteria andCspiIdIn(List<Long> values) {
            addCriterion("cspi_id in", values, "cspiId");
            return (Criteria) this;
        }

        public Criteria andCspiIdNotIn(List<Long> values) {
            addCriterion("cspi_id not in", values, "cspiId");
            return (Criteria) this;
        }

        public Criteria andCspiIdBetween(Long value1, Long value2) {
            addCriterion("cspi_id between", value1, value2, "cspiId");
            return (Criteria) this;
        }

        public Criteria andCspiIdNotBetween(Long value1, Long value2) {
            addCriterion("cspi_id not between", value1, value2, "cspiId");
            return (Criteria) this;
        }

        public Criteria andCspiCodeIsNull() {
            addCriterion("cspi_code is null");
            return (Criteria) this;
        }

        public Criteria andCspiCodeIsNotNull() {
            addCriterion("cspi_code is not null");
            return (Criteria) this;
        }

        public Criteria andCspiCodeEqualTo(String value) {
            addCriterion("cspi_code =", value, "cspiCode");
            return (Criteria) this;
        }

        public Criteria andCspiCodeNotEqualTo(String value) {
            addCriterion("cspi_code <>", value, "cspiCode");
            return (Criteria) this;
        }

        public Criteria andCspiCodeGreaterThan(String value) {
            addCriterion("cspi_code >", value, "cspiCode");
            return (Criteria) this;
        }

        public Criteria andCspiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cspi_code >=", value, "cspiCode");
            return (Criteria) this;
        }

        public Criteria andCspiCodeLessThan(String value) {
            addCriterion("cspi_code <", value, "cspiCode");
            return (Criteria) this;
        }

        public Criteria andCspiCodeLessThanOrEqualTo(String value) {
            addCriterion("cspi_code <=", value, "cspiCode");
            return (Criteria) this;
        }

        public Criteria andCspiCodeLike(String value) {
            addCriterion("cspi_code like", value, "cspiCode");
            return (Criteria) this;
        }

        public Criteria andCspiCodeNotLike(String value) {
            addCriterion("cspi_code not like", value, "cspiCode");
            return (Criteria) this;
        }

        public Criteria andCspiCodeIn(List<String> values) {
            addCriterion("cspi_code in", values, "cspiCode");
            return (Criteria) this;
        }

        public Criteria andCspiCodeNotIn(List<String> values) {
            addCriterion("cspi_code not in", values, "cspiCode");
            return (Criteria) this;
        }

        public Criteria andCspiCodeBetween(String value1, String value2) {
            addCriterion("cspi_code between", value1, value2, "cspiCode");
            return (Criteria) this;
        }

        public Criteria andCspiCodeNotBetween(String value1, String value2) {
            addCriterion("cspi_code not between", value1, value2, "cspiCode");
            return (Criteria) this;
        }

        public Criteria andCspiNameIsNull() {
            addCriterion("cspi_name is null");
            return (Criteria) this;
        }

        public Criteria andCspiNameIsNotNull() {
            addCriterion("cspi_name is not null");
            return (Criteria) this;
        }

        public Criteria andCspiNameEqualTo(String value) {
            addCriterion("cspi_name =", value, "cspiName");
            return (Criteria) this;
        }

        public Criteria andCspiNameNotEqualTo(String value) {
            addCriterion("cspi_name <>", value, "cspiName");
            return (Criteria) this;
        }

        public Criteria andCspiNameGreaterThan(String value) {
            addCriterion("cspi_name >", value, "cspiName");
            return (Criteria) this;
        }

        public Criteria andCspiNameGreaterThanOrEqualTo(String value) {
            addCriterion("cspi_name >=", value, "cspiName");
            return (Criteria) this;
        }

        public Criteria andCspiNameLessThan(String value) {
            addCriterion("cspi_name <", value, "cspiName");
            return (Criteria) this;
        }

        public Criteria andCspiNameLessThanOrEqualTo(String value) {
            addCriterion("cspi_name <=", value, "cspiName");
            return (Criteria) this;
        }

        public Criteria andCspiNameLike(String value) {
            addCriterion("cspi_name like", value, "cspiName");
            return (Criteria) this;
        }

        public Criteria andCspiNameNotLike(String value) {
            addCriterion("cspi_name not like", value, "cspiName");
            return (Criteria) this;
        }

        public Criteria andCspiNameIn(List<String> values) {
            addCriterion("cspi_name in", values, "cspiName");
            return (Criteria) this;
        }

        public Criteria andCspiNameNotIn(List<String> values) {
            addCriterion("cspi_name not in", values, "cspiName");
            return (Criteria) this;
        }

        public Criteria andCspiNameBetween(String value1, String value2) {
            addCriterion("cspi_name between", value1, value2, "cspiName");
            return (Criteria) this;
        }

        public Criteria andCspiNameNotBetween(String value1, String value2) {
            addCriterion("cspi_name not between", value1, value2, "cspiName");
            return (Criteria) this;
        }

        public Criteria andCspiUnitInfoIsNull() {
            addCriterion("cspi_unit_info is null");
            return (Criteria) this;
        }

        public Criteria andCspiUnitInfoIsNotNull() {
            addCriterion("cspi_unit_info is not null");
            return (Criteria) this;
        }

        public Criteria andCspiUnitInfoEqualTo(Long value) {
            addCriterion("cspi_unit_info =", value, "cspiUnitInfo");
            return (Criteria) this;
        }

        public Criteria andCspiUnitInfoNotEqualTo(Long value) {
            addCriterion("cspi_unit_info <>", value, "cspiUnitInfo");
            return (Criteria) this;
        }

        public Criteria andCspiUnitInfoGreaterThan(Long value) {
            addCriterion("cspi_unit_info >", value, "cspiUnitInfo");
            return (Criteria) this;
        }

        public Criteria andCspiUnitInfoGreaterThanOrEqualTo(Long value) {
            addCriterion("cspi_unit_info >=", value, "cspiUnitInfo");
            return (Criteria) this;
        }

        public Criteria andCspiUnitInfoLessThan(Long value) {
            addCriterion("cspi_unit_info <", value, "cspiUnitInfo");
            return (Criteria) this;
        }

        public Criteria andCspiUnitInfoLessThanOrEqualTo(Long value) {
            addCriterion("cspi_unit_info <=", value, "cspiUnitInfo");
            return (Criteria) this;
        }

        public Criteria andCspiUnitInfoIn(List<Long> values) {
            addCriterion("cspi_unit_info in", values, "cspiUnitInfo");
            return (Criteria) this;
        }

        public Criteria andCspiUnitInfoNotIn(List<Long> values) {
            addCriterion("cspi_unit_info not in", values, "cspiUnitInfo");
            return (Criteria) this;
        }

        public Criteria andCspiUnitInfoBetween(Long value1, Long value2) {
            addCriterion("cspi_unit_info between", value1, value2, "cspiUnitInfo");
            return (Criteria) this;
        }

        public Criteria andCspiUnitInfoNotBetween(Long value1, Long value2) {
            addCriterion("cspi_unit_info not between", value1, value2, "cspiUnitInfo");
            return (Criteria) this;
        }

        public Criteria andCspiMemberIsNull() {
            addCriterion("cspi_member is null");
            return (Criteria) this;
        }

        public Criteria andCspiMemberIsNotNull() {
            addCriterion("cspi_member is not null");
            return (Criteria) this;
        }

        public Criteria andCspiMemberEqualTo(Long value) {
            addCriterion("cspi_member =", value, "cspiMember");
            return (Criteria) this;
        }

        public Criteria andCspiMemberNotEqualTo(Long value) {
            addCriterion("cspi_member <>", value, "cspiMember");
            return (Criteria) this;
        }

        public Criteria andCspiMemberGreaterThan(Long value) {
            addCriterion("cspi_member >", value, "cspiMember");
            return (Criteria) this;
        }

        public Criteria andCspiMemberGreaterThanOrEqualTo(Long value) {
            addCriterion("cspi_member >=", value, "cspiMember");
            return (Criteria) this;
        }

        public Criteria andCspiMemberLessThan(Long value) {
            addCriterion("cspi_member <", value, "cspiMember");
            return (Criteria) this;
        }

        public Criteria andCspiMemberLessThanOrEqualTo(Long value) {
            addCriterion("cspi_member <=", value, "cspiMember");
            return (Criteria) this;
        }

        public Criteria andCspiMemberIn(List<Long> values) {
            addCriterion("cspi_member in", values, "cspiMember");
            return (Criteria) this;
        }

        public Criteria andCspiMemberNotIn(List<Long> values) {
            addCriterion("cspi_member not in", values, "cspiMember");
            return (Criteria) this;
        }

        public Criteria andCspiMemberBetween(Long value1, Long value2) {
            addCriterion("cspi_member between", value1, value2, "cspiMember");
            return (Criteria) this;
        }

        public Criteria andCspiMemberNotBetween(Long value1, Long value2) {
            addCriterion("cspi_member not between", value1, value2, "cspiMember");
            return (Criteria) this;
        }

        public Criteria andCspiAduitMemberIsNull() {
            addCriterion("cspi_aduit_member is null");
            return (Criteria) this;
        }

        public Criteria andCspiAduitMemberIsNotNull() {
            addCriterion("cspi_aduit_member is not null");
            return (Criteria) this;
        }

        public Criteria andCspiAduitMemberEqualTo(Long value) {
            addCriterion("cspi_aduit_member =", value, "cspiAduitMember");
            return (Criteria) this;
        }

        public Criteria andCspiAduitMemberNotEqualTo(Long value) {
            addCriterion("cspi_aduit_member <>", value, "cspiAduitMember");
            return (Criteria) this;
        }

        public Criteria andCspiAduitMemberGreaterThan(Long value) {
            addCriterion("cspi_aduit_member >", value, "cspiAduitMember");
            return (Criteria) this;
        }

        public Criteria andCspiAduitMemberGreaterThanOrEqualTo(Long value) {
            addCriterion("cspi_aduit_member >=", value, "cspiAduitMember");
            return (Criteria) this;
        }

        public Criteria andCspiAduitMemberLessThan(Long value) {
            addCriterion("cspi_aduit_member <", value, "cspiAduitMember");
            return (Criteria) this;
        }

        public Criteria andCspiAduitMemberLessThanOrEqualTo(Long value) {
            addCriterion("cspi_aduit_member <=", value, "cspiAduitMember");
            return (Criteria) this;
        }

        public Criteria andCspiAduitMemberIn(List<Long> values) {
            addCriterion("cspi_aduit_member in", values, "cspiAduitMember");
            return (Criteria) this;
        }

        public Criteria andCspiAduitMemberNotIn(List<Long> values) {
            addCriterion("cspi_aduit_member not in", values, "cspiAduitMember");
            return (Criteria) this;
        }

        public Criteria andCspiAduitMemberBetween(Long value1, Long value2) {
            addCriterion("cspi_aduit_member between", value1, value2, "cspiAduitMember");
            return (Criteria) this;
        }

        public Criteria andCspiAduitMemberNotBetween(Long value1, Long value2) {
            addCriterion("cspi_aduit_member not between", value1, value2, "cspiAduitMember");
            return (Criteria) this;
        }

        public Criteria andCspiLimitIsNull() {
            addCriterion("cspi_limit is null");
            return (Criteria) this;
        }

        public Criteria andCspiLimitIsNotNull() {
            addCriterion("cspi_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCspiLimitEqualTo(Double value) {
            addCriterion("cspi_limit =", value, "cspiLimit");
            return (Criteria) this;
        }

        public Criteria andCspiLimitNotEqualTo(Double value) {
            addCriterion("cspi_limit <>", value, "cspiLimit");
            return (Criteria) this;
        }

        public Criteria andCspiLimitGreaterThan(Double value) {
            addCriterion("cspi_limit >", value, "cspiLimit");
            return (Criteria) this;
        }

        public Criteria andCspiLimitGreaterThanOrEqualTo(Double value) {
            addCriterion("cspi_limit >=", value, "cspiLimit");
            return (Criteria) this;
        }

        public Criteria andCspiLimitLessThan(Double value) {
            addCriterion("cspi_limit <", value, "cspiLimit");
            return (Criteria) this;
        }

        public Criteria andCspiLimitLessThanOrEqualTo(Double value) {
            addCriterion("cspi_limit <=", value, "cspiLimit");
            return (Criteria) this;
        }

        public Criteria andCspiLimitIn(List<Double> values) {
            addCriterion("cspi_limit in", values, "cspiLimit");
            return (Criteria) this;
        }

        public Criteria andCspiLimitNotIn(List<Double> values) {
            addCriterion("cspi_limit not in", values, "cspiLimit");
            return (Criteria) this;
        }

        public Criteria andCspiLimitBetween(Double value1, Double value2) {
            addCriterion("cspi_limit between", value1, value2, "cspiLimit");
            return (Criteria) this;
        }

        public Criteria andCspiLimitNotBetween(Double value1, Double value2) {
            addCriterion("cspi_limit not between", value1, value2, "cspiLimit");
            return (Criteria) this;
        }

        public Criteria andCspiQuotaIsNull() {
            addCriterion("cspi_quota is null");
            return (Criteria) this;
        }

        public Criteria andCspiQuotaIsNotNull() {
            addCriterion("cspi_quota is not null");
            return (Criteria) this;
        }

        public Criteria andCspiQuotaEqualTo(Double value) {
            addCriterion("cspi_quota =", value, "cspiQuota");
            return (Criteria) this;
        }

        public Criteria andCspiQuotaNotEqualTo(Double value) {
            addCriterion("cspi_quota <>", value, "cspiQuota");
            return (Criteria) this;
        }

        public Criteria andCspiQuotaGreaterThan(Double value) {
            addCriterion("cspi_quota >", value, "cspiQuota");
            return (Criteria) this;
        }

        public Criteria andCspiQuotaGreaterThanOrEqualTo(Double value) {
            addCriterion("cspi_quota >=", value, "cspiQuota");
            return (Criteria) this;
        }

        public Criteria andCspiQuotaLessThan(Double value) {
            addCriterion("cspi_quota <", value, "cspiQuota");
            return (Criteria) this;
        }

        public Criteria andCspiQuotaLessThanOrEqualTo(Double value) {
            addCriterion("cspi_quota <=", value, "cspiQuota");
            return (Criteria) this;
        }

        public Criteria andCspiQuotaIn(List<Double> values) {
            addCriterion("cspi_quota in", values, "cspiQuota");
            return (Criteria) this;
        }

        public Criteria andCspiQuotaNotIn(List<Double> values) {
            addCriterion("cspi_quota not in", values, "cspiQuota");
            return (Criteria) this;
        }

        public Criteria andCspiQuotaBetween(Double value1, Double value2) {
            addCriterion("cspi_quota between", value1, value2, "cspiQuota");
            return (Criteria) this;
        }

        public Criteria andCspiQuotaNotBetween(Double value1, Double value2) {
            addCriterion("cspi_quota not between", value1, value2, "cspiQuota");
            return (Criteria) this;
        }

        public Criteria andCspiPersonNumIsNull() {
            addCriterion("cspi_person_num is null");
            return (Criteria) this;
        }

        public Criteria andCspiPersonNumIsNotNull() {
            addCriterion("cspi_person_num is not null");
            return (Criteria) this;
        }

        public Criteria andCspiPersonNumEqualTo(Integer value) {
            addCriterion("cspi_person_num =", value, "cspiPersonNum");
            return (Criteria) this;
        }

        public Criteria andCspiPersonNumNotEqualTo(Integer value) {
            addCriterion("cspi_person_num <>", value, "cspiPersonNum");
            return (Criteria) this;
        }

        public Criteria andCspiPersonNumGreaterThan(Integer value) {
            addCriterion("cspi_person_num >", value, "cspiPersonNum");
            return (Criteria) this;
        }

        public Criteria andCspiPersonNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cspi_person_num >=", value, "cspiPersonNum");
            return (Criteria) this;
        }

        public Criteria andCspiPersonNumLessThan(Integer value) {
            addCriterion("cspi_person_num <", value, "cspiPersonNum");
            return (Criteria) this;
        }

        public Criteria andCspiPersonNumLessThanOrEqualTo(Integer value) {
            addCriterion("cspi_person_num <=", value, "cspiPersonNum");
            return (Criteria) this;
        }

        public Criteria andCspiPersonNumIn(List<Integer> values) {
            addCriterion("cspi_person_num in", values, "cspiPersonNum");
            return (Criteria) this;
        }

        public Criteria andCspiPersonNumNotIn(List<Integer> values) {
            addCriterion("cspi_person_num not in", values, "cspiPersonNum");
            return (Criteria) this;
        }

        public Criteria andCspiPersonNumBetween(Integer value1, Integer value2) {
            addCriterion("cspi_person_num between", value1, value2, "cspiPersonNum");
            return (Criteria) this;
        }

        public Criteria andCspiPersonNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cspi_person_num not between", value1, value2, "cspiPersonNum");
            return (Criteria) this;
        }

        public Criteria andCspiBegintimeIsNull() {
            addCriterion("cspi_begintime is null");
            return (Criteria) this;
        }

        public Criteria andCspiBegintimeIsNotNull() {
            addCriterion("cspi_begintime is not null");
            return (Criteria) this;
        }

        public Criteria andCspiBegintimeEqualTo(Date value) {
            addCriterion("cspi_begintime =", value, "cspiBegintime");
            return (Criteria) this;
        }

        public Criteria andCspiBegintimeNotEqualTo(Date value) {
            addCriterion("cspi_begintime <>", value, "cspiBegintime");
            return (Criteria) this;
        }

        public Criteria andCspiBegintimeGreaterThan(Date value) {
            addCriterion("cspi_begintime >", value, "cspiBegintime");
            return (Criteria) this;
        }

        public Criteria andCspiBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cspi_begintime >=", value, "cspiBegintime");
            return (Criteria) this;
        }

        public Criteria andCspiBegintimeLessThan(Date value) {
            addCriterion("cspi_begintime <", value, "cspiBegintime");
            return (Criteria) this;
        }

        public Criteria andCspiBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("cspi_begintime <=", value, "cspiBegintime");
            return (Criteria) this;
        }

        public Criteria andCspiBegintimeIn(List<Date> values) {
            addCriterion("cspi_begintime in", values, "cspiBegintime");
            return (Criteria) this;
        }

        public Criteria andCspiBegintimeNotIn(List<Date> values) {
            addCriterion("cspi_begintime not in", values, "cspiBegintime");
            return (Criteria) this;
        }

        public Criteria andCspiBegintimeBetween(Date value1, Date value2) {
            addCriterion("cspi_begintime between", value1, value2, "cspiBegintime");
            return (Criteria) this;
        }

        public Criteria andCspiBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("cspi_begintime not between", value1, value2, "cspiBegintime");
            return (Criteria) this;
        }

        public Criteria andCspiEndtimeIsNull() {
            addCriterion("cspi_endtime is null");
            return (Criteria) this;
        }

        public Criteria andCspiEndtimeIsNotNull() {
            addCriterion("cspi_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andCspiEndtimeEqualTo(Date value) {
            addCriterion("cspi_endtime =", value, "cspiEndtime");
            return (Criteria) this;
        }

        public Criteria andCspiEndtimeNotEqualTo(Date value) {
            addCriterion("cspi_endtime <>", value, "cspiEndtime");
            return (Criteria) this;
        }

        public Criteria andCspiEndtimeGreaterThan(Date value) {
            addCriterion("cspi_endtime >", value, "cspiEndtime");
            return (Criteria) this;
        }

        public Criteria andCspiEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cspi_endtime >=", value, "cspiEndtime");
            return (Criteria) this;
        }

        public Criteria andCspiEndtimeLessThan(Date value) {
            addCriterion("cspi_endtime <", value, "cspiEndtime");
            return (Criteria) this;
        }

        public Criteria andCspiEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("cspi_endtime <=", value, "cspiEndtime");
            return (Criteria) this;
        }

        public Criteria andCspiEndtimeIn(List<Date> values) {
            addCriterion("cspi_endtime in", values, "cspiEndtime");
            return (Criteria) this;
        }

        public Criteria andCspiEndtimeNotIn(List<Date> values) {
            addCriterion("cspi_endtime not in", values, "cspiEndtime");
            return (Criteria) this;
        }

        public Criteria andCspiEndtimeBetween(Date value1, Date value2) {
            addCriterion("cspi_endtime between", value1, value2, "cspiEndtime");
            return (Criteria) this;
        }

        public Criteria andCspiEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("cspi_endtime not between", value1, value2, "cspiEndtime");
            return (Criteria) this;
        }

        public Criteria andCspiAutoproveIsNull() {
            addCriterion("cspi_autoprove is null");
            return (Criteria) this;
        }

        public Criteria andCspiAutoproveIsNotNull() {
            addCriterion("cspi_autoprove is not null");
            return (Criteria) this;
        }

        public Criteria andCspiAutoproveEqualTo(Short value) {
            addCriterion("cspi_autoprove =", value, "cspiAutoprove");
            return (Criteria) this;
        }

        public Criteria andCspiAutoproveNotEqualTo(Short value) {
            addCriterion("cspi_autoprove <>", value, "cspiAutoprove");
            return (Criteria) this;
        }

        public Criteria andCspiAutoproveGreaterThan(Short value) {
            addCriterion("cspi_autoprove >", value, "cspiAutoprove");
            return (Criteria) this;
        }

        public Criteria andCspiAutoproveGreaterThanOrEqualTo(Short value) {
            addCriterion("cspi_autoprove >=", value, "cspiAutoprove");
            return (Criteria) this;
        }

        public Criteria andCspiAutoproveLessThan(Short value) {
            addCriterion("cspi_autoprove <", value, "cspiAutoprove");
            return (Criteria) this;
        }

        public Criteria andCspiAutoproveLessThanOrEqualTo(Short value) {
            addCriterion("cspi_autoprove <=", value, "cspiAutoprove");
            return (Criteria) this;
        }

        public Criteria andCspiAutoproveIn(List<Short> values) {
            addCriterion("cspi_autoprove in", values, "cspiAutoprove");
            return (Criteria) this;
        }

        public Criteria andCspiAutoproveNotIn(List<Short> values) {
            addCriterion("cspi_autoprove not in", values, "cspiAutoprove");
            return (Criteria) this;
        }

        public Criteria andCspiAutoproveBetween(Short value1, Short value2) {
            addCriterion("cspi_autoprove between", value1, value2, "cspiAutoprove");
            return (Criteria) this;
        }

        public Criteria andCspiAutoproveNotBetween(Short value1, Short value2) {
            addCriterion("cspi_autoprove not between", value1, value2, "cspiAutoprove");
            return (Criteria) this;
        }

        public Criteria andCspiEnableIsNull() {
            addCriterion("cspi_enable is null");
            return (Criteria) this;
        }

        public Criteria andCspiEnableIsNotNull() {
            addCriterion("cspi_enable is not null");
            return (Criteria) this;
        }

        public Criteria andCspiEnableEqualTo(Short value) {
            addCriterion("cspi_enable =", value, "cspiEnable");
            return (Criteria) this;
        }

        public Criteria andCspiEnableNotEqualTo(Short value) {
            addCriterion("cspi_enable <>", value, "cspiEnable");
            return (Criteria) this;
        }

        public Criteria andCspiEnableGreaterThan(Short value) {
            addCriterion("cspi_enable >", value, "cspiEnable");
            return (Criteria) this;
        }

        public Criteria andCspiEnableGreaterThanOrEqualTo(Short value) {
            addCriterion("cspi_enable >=", value, "cspiEnable");
            return (Criteria) this;
        }

        public Criteria andCspiEnableLessThan(Short value) {
            addCriterion("cspi_enable <", value, "cspiEnable");
            return (Criteria) this;
        }

        public Criteria andCspiEnableLessThanOrEqualTo(Short value) {
            addCriterion("cspi_enable <=", value, "cspiEnable");
            return (Criteria) this;
        }

        public Criteria andCspiEnableIn(List<Short> values) {
            addCriterion("cspi_enable in", values, "cspiEnable");
            return (Criteria) this;
        }

        public Criteria andCspiEnableNotIn(List<Short> values) {
            addCriterion("cspi_enable not in", values, "cspiEnable");
            return (Criteria) this;
        }

        public Criteria andCspiEnableBetween(Short value1, Short value2) {
            addCriterion("cspi_enable between", value1, value2, "cspiEnable");
            return (Criteria) this;
        }

        public Criteria andCspiEnableNotBetween(Short value1, Short value2) {
            addCriterion("cspi_enable not between", value1, value2, "cspiEnable");
            return (Criteria) this;
        }

        public Criteria andCspiAddTimeIsNull() {
            addCriterion("cspi_add_time is null");
            return (Criteria) this;
        }

        public Criteria andCspiAddTimeIsNotNull() {
            addCriterion("cspi_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andCspiAddTimeEqualTo(Date value) {
            addCriterion("cspi_add_time =", value, "cspiAddTime");
            return (Criteria) this;
        }

        public Criteria andCspiAddTimeNotEqualTo(Date value) {
            addCriterion("cspi_add_time <>", value, "cspiAddTime");
            return (Criteria) this;
        }

        public Criteria andCspiAddTimeGreaterThan(Date value) {
            addCriterion("cspi_add_time >", value, "cspiAddTime");
            return (Criteria) this;
        }

        public Criteria andCspiAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cspi_add_time >=", value, "cspiAddTime");
            return (Criteria) this;
        }

        public Criteria andCspiAddTimeLessThan(Date value) {
            addCriterion("cspi_add_time <", value, "cspiAddTime");
            return (Criteria) this;
        }

        public Criteria andCspiAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("cspi_add_time <=", value, "cspiAddTime");
            return (Criteria) this;
        }

        public Criteria andCspiAddTimeIn(List<Date> values) {
            addCriterion("cspi_add_time in", values, "cspiAddTime");
            return (Criteria) this;
        }

        public Criteria andCspiAddTimeNotIn(List<Date> values) {
            addCriterion("cspi_add_time not in", values, "cspiAddTime");
            return (Criteria) this;
        }

        public Criteria andCspiAddTimeBetween(Date value1, Date value2) {
            addCriterion("cspi_add_time between", value1, value2, "cspiAddTime");
            return (Criteria) this;
        }

        public Criteria andCspiAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("cspi_add_time not between", value1, value2, "cspiAddTime");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserIsNull() {
            addCriterion("cspi_add_user is null");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserIsNotNull() {
            addCriterion("cspi_add_user is not null");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserEqualTo(String value) {
            addCriterion("cspi_add_user =", value, "cspiAddUser");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserNotEqualTo(String value) {
            addCriterion("cspi_add_user <>", value, "cspiAddUser");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserGreaterThan(String value) {
            addCriterion("cspi_add_user >", value, "cspiAddUser");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserGreaterThanOrEqualTo(String value) {
            addCriterion("cspi_add_user >=", value, "cspiAddUser");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserLessThan(String value) {
            addCriterion("cspi_add_user <", value, "cspiAddUser");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserLessThanOrEqualTo(String value) {
            addCriterion("cspi_add_user <=", value, "cspiAddUser");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserLike(String value) {
            addCriterion("cspi_add_user like", value, "cspiAddUser");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserNotLike(String value) {
            addCriterion("cspi_add_user not like", value, "cspiAddUser");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserIn(List<String> values) {
            addCriterion("cspi_add_user in", values, "cspiAddUser");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserNotIn(List<String> values) {
            addCriterion("cspi_add_user not in", values, "cspiAddUser");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserBetween(String value1, String value2) {
            addCriterion("cspi_add_user between", value1, value2, "cspiAddUser");
            return (Criteria) this;
        }

        public Criteria andCspiAddUserNotBetween(String value1, String value2) {
            addCriterion("cspi_add_user not between", value1, value2, "cspiAddUser");
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