package com.bpm.lj.mes.base.server.domain;

import java.util.ArrayList;
import java.util.List;

public class BaseStandaraProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseStandaraProcessExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIsNull() {
            addCriterion("process_code is null");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIsNotNull() {
            addCriterion("process_code is not null");
            return (Criteria) this;
        }

        public Criteria andProcessCodeEqualTo(String value) {
            addCriterion("process_code =", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotEqualTo(String value) {
            addCriterion("process_code <>", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeGreaterThan(String value) {
            addCriterion("process_code >", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("process_code >=", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLessThan(String value) {
            addCriterion("process_code <", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLessThanOrEqualTo(String value) {
            addCriterion("process_code <=", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLike(String value) {
            addCriterion("process_code like", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotLike(String value) {
            addCriterion("process_code not like", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIn(List<String> values) {
            addCriterion("process_code in", values, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotIn(List<String> values) {
            addCriterion("process_code not in", values, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeBetween(String value1, String value2) {
            addCriterion("process_code between", value1, value2, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotBetween(String value1, String value2) {
            addCriterion("process_code not between", value1, value2, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNull() {
            addCriterion("process_name is null");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNotNull() {
            addCriterion("process_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNameEqualTo(String value) {
            addCriterion("process_name =", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotEqualTo(String value) {
            addCriterion("process_name <>", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThan(String value) {
            addCriterion("process_name >", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThanOrEqualTo(String value) {
            addCriterion("process_name >=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThan(String value) {
            addCriterion("process_name <", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThanOrEqualTo(String value) {
            addCriterion("process_name <=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLike(String value) {
            addCriterion("process_name like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotLike(String value) {
            addCriterion("process_name not like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameIn(List<String> values) {
            addCriterion("process_name in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotIn(List<String> values) {
            addCriterion("process_name not in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameBetween(String value1, String value2) {
            addCriterion("process_name between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotBetween(String value1, String value2) {
            addCriterion("process_name not between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeIsNull() {
            addCriterion("work_center_code is null");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeIsNotNull() {
            addCriterion("work_center_code is not null");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeEqualTo(String value) {
            addCriterion("work_center_code =", value, "workCenterCode");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeNotEqualTo(String value) {
            addCriterion("work_center_code <>", value, "workCenterCode");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeGreaterThan(String value) {
            addCriterion("work_center_code >", value, "workCenterCode");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("work_center_code >=", value, "workCenterCode");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeLessThan(String value) {
            addCriterion("work_center_code <", value, "workCenterCode");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeLessThanOrEqualTo(String value) {
            addCriterion("work_center_code <=", value, "workCenterCode");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeLike(String value) {
            addCriterion("work_center_code like", value, "workCenterCode");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeNotLike(String value) {
            addCriterion("work_center_code not like", value, "workCenterCode");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeIn(List<String> values) {
            addCriterion("work_center_code in", values, "workCenterCode");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeNotIn(List<String> values) {
            addCriterion("work_center_code not in", values, "workCenterCode");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeBetween(String value1, String value2) {
            addCriterion("work_center_code between", value1, value2, "workCenterCode");
            return (Criteria) this;
        }

        public Criteria andWorkCenterCodeNotBetween(String value1, String value2) {
            addCriterion("work_center_code not between", value1, value2, "workCenterCode");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameIsNull() {
            addCriterion("work_center_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameIsNotNull() {
            addCriterion("work_center_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameEqualTo(String value) {
            addCriterion("work_center_name =", value, "workCenterName");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameNotEqualTo(String value) {
            addCriterion("work_center_name <>", value, "workCenterName");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameGreaterThan(String value) {
            addCriterion("work_center_name >", value, "workCenterName");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("work_center_name >=", value, "workCenterName");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameLessThan(String value) {
            addCriterion("work_center_name <", value, "workCenterName");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameLessThanOrEqualTo(String value) {
            addCriterion("work_center_name <=", value, "workCenterName");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameLike(String value) {
            addCriterion("work_center_name like", value, "workCenterName");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameNotLike(String value) {
            addCriterion("work_center_name not like", value, "workCenterName");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameIn(List<String> values) {
            addCriterion("work_center_name in", values, "workCenterName");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameNotIn(List<String> values) {
            addCriterion("work_center_name not in", values, "workCenterName");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameBetween(String value1, String value2) {
            addCriterion("work_center_name between", value1, value2, "workCenterName");
            return (Criteria) this;
        }

        public Criteria andWorkCenterNameNotBetween(String value1, String value2) {
            addCriterion("work_center_name not between", value1, value2, "workCenterName");
            return (Criteria) this;
        }

        public Criteria andReportingPointIsNull() {
            addCriterion("reporting_point is null");
            return (Criteria) this;
        }

        public Criteria andReportingPointIsNotNull() {
            addCriterion("reporting_point is not null");
            return (Criteria) this;
        }

        public Criteria andReportingPointEqualTo(Integer value) {
            addCriterion("reporting_point =", value, "reportingPoint");
            return (Criteria) this;
        }

        public Criteria andReportingPointNotEqualTo(Integer value) {
            addCriterion("reporting_point <>", value, "reportingPoint");
            return (Criteria) this;
        }

        public Criteria andReportingPointGreaterThan(Integer value) {
            addCriterion("reporting_point >", value, "reportingPoint");
            return (Criteria) this;
        }

        public Criteria andReportingPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("reporting_point >=", value, "reportingPoint");
            return (Criteria) this;
        }

        public Criteria andReportingPointLessThan(Integer value) {
            addCriterion("reporting_point <", value, "reportingPoint");
            return (Criteria) this;
        }

        public Criteria andReportingPointLessThanOrEqualTo(Integer value) {
            addCriterion("reporting_point <=", value, "reportingPoint");
            return (Criteria) this;
        }

        public Criteria andReportingPointIn(List<Integer> values) {
            addCriterion("reporting_point in", values, "reportingPoint");
            return (Criteria) this;
        }

        public Criteria andReportingPointNotIn(List<Integer> values) {
            addCriterion("reporting_point not in", values, "reportingPoint");
            return (Criteria) this;
        }

        public Criteria andReportingPointBetween(Integer value1, Integer value2) {
            addCriterion("reporting_point between", value1, value2, "reportingPoint");
            return (Criteria) this;
        }

        public Criteria andReportingPointNotBetween(Integer value1, Integer value2) {
            addCriterion("reporting_point not between", value1, value2, "reportingPoint");
            return (Criteria) this;
        }

        public Criteria andBackflushProcessIsNull() {
            addCriterion("backflush_process is null");
            return (Criteria) this;
        }

        public Criteria andBackflushProcessIsNotNull() {
            addCriterion("backflush_process is not null");
            return (Criteria) this;
        }

        public Criteria andBackflushProcessEqualTo(Integer value) {
            addCriterion("backflush_process =", value, "backflushProcess");
            return (Criteria) this;
        }

        public Criteria andBackflushProcessNotEqualTo(Integer value) {
            addCriterion("backflush_process <>", value, "backflushProcess");
            return (Criteria) this;
        }

        public Criteria andBackflushProcessGreaterThan(Integer value) {
            addCriterion("backflush_process >", value, "backflushProcess");
            return (Criteria) this;
        }

        public Criteria andBackflushProcessGreaterThanOrEqualTo(Integer value) {
            addCriterion("backflush_process >=", value, "backflushProcess");
            return (Criteria) this;
        }

        public Criteria andBackflushProcessLessThan(Integer value) {
            addCriterion("backflush_process <", value, "backflushProcess");
            return (Criteria) this;
        }

        public Criteria andBackflushProcessLessThanOrEqualTo(Integer value) {
            addCriterion("backflush_process <=", value, "backflushProcess");
            return (Criteria) this;
        }

        public Criteria andBackflushProcessIn(List<Integer> values) {
            addCriterion("backflush_process in", values, "backflushProcess");
            return (Criteria) this;
        }

        public Criteria andBackflushProcessNotIn(List<Integer> values) {
            addCriterion("backflush_process not in", values, "backflushProcess");
            return (Criteria) this;
        }

        public Criteria andBackflushProcessBetween(Integer value1, Integer value2) {
            addCriterion("backflush_process between", value1, value2, "backflushProcess");
            return (Criteria) this;
        }

        public Criteria andBackflushProcessNotBetween(Integer value1, Integer value2) {
            addCriterion("backflush_process not between", value1, value2, "backflushProcess");
            return (Criteria) this;
        }

        public Criteria andOptionDependentIsNull() {
            addCriterion("option_dependent is null");
            return (Criteria) this;
        }

        public Criteria andOptionDependentIsNotNull() {
            addCriterion("option_dependent is not null");
            return (Criteria) this;
        }

        public Criteria andOptionDependentEqualTo(Integer value) {
            addCriterion("option_dependent =", value, "optionDependent");
            return (Criteria) this;
        }

        public Criteria andOptionDependentNotEqualTo(Integer value) {
            addCriterion("option_dependent <>", value, "optionDependent");
            return (Criteria) this;
        }

        public Criteria andOptionDependentGreaterThan(Integer value) {
            addCriterion("option_dependent >", value, "optionDependent");
            return (Criteria) this;
        }

        public Criteria andOptionDependentGreaterThanOrEqualTo(Integer value) {
            addCriterion("option_dependent >=", value, "optionDependent");
            return (Criteria) this;
        }

        public Criteria andOptionDependentLessThan(Integer value) {
            addCriterion("option_dependent <", value, "optionDependent");
            return (Criteria) this;
        }

        public Criteria andOptionDependentLessThanOrEqualTo(Integer value) {
            addCriterion("option_dependent <=", value, "optionDependent");
            return (Criteria) this;
        }

        public Criteria andOptionDependentIn(List<Integer> values) {
            addCriterion("option_dependent in", values, "optionDependent");
            return (Criteria) this;
        }

        public Criteria andOptionDependentNotIn(List<Integer> values) {
            addCriterion("option_dependent not in", values, "optionDependent");
            return (Criteria) this;
        }

        public Criteria andOptionDependentBetween(Integer value1, Integer value2) {
            addCriterion("option_dependent between", value1, value2, "optionDependent");
            return (Criteria) this;
        }

        public Criteria andOptionDependentNotBetween(Integer value1, Integer value2) {
            addCriterion("option_dependent not between", value1, value2, "optionDependent");
            return (Criteria) this;
        }

        public Criteria andOutsourcingProcessIsNull() {
            addCriterion("outsourcing_process is null");
            return (Criteria) this;
        }

        public Criteria andOutsourcingProcessIsNotNull() {
            addCriterion("outsourcing_process is not null");
            return (Criteria) this;
        }

        public Criteria andOutsourcingProcessEqualTo(Integer value) {
            addCriterion("outsourcing_process =", value, "outsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andOutsourcingProcessNotEqualTo(Integer value) {
            addCriterion("outsourcing_process <>", value, "outsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andOutsourcingProcessGreaterThan(Integer value) {
            addCriterion("outsourcing_process >", value, "outsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andOutsourcingProcessGreaterThanOrEqualTo(Integer value) {
            addCriterion("outsourcing_process >=", value, "outsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andOutsourcingProcessLessThan(Integer value) {
            addCriterion("outsourcing_process <", value, "outsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andOutsourcingProcessLessThanOrEqualTo(Integer value) {
            addCriterion("outsourcing_process <=", value, "outsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andOutsourcingProcessIn(List<Integer> values) {
            addCriterion("outsourcing_process in", values, "outsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andOutsourcingProcessNotIn(List<Integer> values) {
            addCriterion("outsourcing_process not in", values, "outsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andOutsourcingProcessBetween(Integer value1, Integer value2) {
            addCriterion("outsourcing_process between", value1, value2, "outsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andOutsourcingProcessNotBetween(Integer value1, Integer value2) {
            addCriterion("outsourcing_process not between", value1, value2, "outsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andBillingPointIsNull() {
            addCriterion("billing_point is null");
            return (Criteria) this;
        }

        public Criteria andBillingPointIsNotNull() {
            addCriterion("billing_point is not null");
            return (Criteria) this;
        }

        public Criteria andBillingPointEqualTo(Integer value) {
            addCriterion("billing_point =", value, "billingPoint");
            return (Criteria) this;
        }

        public Criteria andBillingPointNotEqualTo(Integer value) {
            addCriterion("billing_point <>", value, "billingPoint");
            return (Criteria) this;
        }

        public Criteria andBillingPointGreaterThan(Integer value) {
            addCriterion("billing_point >", value, "billingPoint");
            return (Criteria) this;
        }

        public Criteria andBillingPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("billing_point >=", value, "billingPoint");
            return (Criteria) this;
        }

        public Criteria andBillingPointLessThan(Integer value) {
            addCriterion("billing_point <", value, "billingPoint");
            return (Criteria) this;
        }

        public Criteria andBillingPointLessThanOrEqualTo(Integer value) {
            addCriterion("billing_point <=", value, "billingPoint");
            return (Criteria) this;
        }

        public Criteria andBillingPointIn(List<Integer> values) {
            addCriterion("billing_point in", values, "billingPoint");
            return (Criteria) this;
        }

        public Criteria andBillingPointNotIn(List<Integer> values) {
            addCriterion("billing_point not in", values, "billingPoint");
            return (Criteria) this;
        }

        public Criteria andBillingPointBetween(Integer value1, Integer value2) {
            addCriterion("billing_point between", value1, value2, "billingPoint");
            return (Criteria) this;
        }

        public Criteria andBillingPointNotBetween(Integer value1, Integer value2) {
            addCriterion("billing_point not between", value1, value2, "billingPoint");
            return (Criteria) this;
        }

        public Criteria andPlanOutsourcingProcessIsNull() {
            addCriterion("plan_outsourcing_process is null");
            return (Criteria) this;
        }

        public Criteria andPlanOutsourcingProcessIsNotNull() {
            addCriterion("plan_outsourcing_process is not null");
            return (Criteria) this;
        }

        public Criteria andPlanOutsourcingProcessEqualTo(Integer value) {
            addCriterion("plan_outsourcing_process =", value, "planOutsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andPlanOutsourcingProcessNotEqualTo(Integer value) {
            addCriterion("plan_outsourcing_process <>", value, "planOutsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andPlanOutsourcingProcessGreaterThan(Integer value) {
            addCriterion("plan_outsourcing_process >", value, "planOutsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andPlanOutsourcingProcessGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_outsourcing_process >=", value, "planOutsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andPlanOutsourcingProcessLessThan(Integer value) {
            addCriterion("plan_outsourcing_process <", value, "planOutsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andPlanOutsourcingProcessLessThanOrEqualTo(Integer value) {
            addCriterion("plan_outsourcing_process <=", value, "planOutsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andPlanOutsourcingProcessIn(List<Integer> values) {
            addCriterion("plan_outsourcing_process in", values, "planOutsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andPlanOutsourcingProcessNotIn(List<Integer> values) {
            addCriterion("plan_outsourcing_process not in", values, "planOutsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andPlanOutsourcingProcessBetween(Integer value1, Integer value2) {
            addCriterion("plan_outsourcing_process between", value1, value2, "planOutsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andPlanOutsourcingProcessNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_outsourcing_process not between", value1, value2, "planOutsourcingProcess");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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