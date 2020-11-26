package com.bpm.lj.mes.base.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseModelProcessTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseModelProcessTimeExample() {
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

        public Criteria andWorhcenterCodeIsNull() {
            addCriterion("worhcenter_code is null");
            return (Criteria) this;
        }

        public Criteria andWorhcenterCodeIsNotNull() {
            addCriterion("worhcenter_code is not null");
            return (Criteria) this;
        }

        public Criteria andWorhcenterCodeEqualTo(String value) {
            addCriterion("worhcenter_code =", value, "worhcenterCode");
            return (Criteria) this;
        }

        public Criteria andWorhcenterCodeNotEqualTo(String value) {
            addCriterion("worhcenter_code <>", value, "worhcenterCode");
            return (Criteria) this;
        }

        public Criteria andWorhcenterCodeGreaterThan(String value) {
            addCriterion("worhcenter_code >", value, "worhcenterCode");
            return (Criteria) this;
        }

        public Criteria andWorhcenterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("worhcenter_code >=", value, "worhcenterCode");
            return (Criteria) this;
        }

        public Criteria andWorhcenterCodeLessThan(String value) {
            addCriterion("worhcenter_code <", value, "worhcenterCode");
            return (Criteria) this;
        }

        public Criteria andWorhcenterCodeLessThanOrEqualTo(String value) {
            addCriterion("worhcenter_code <=", value, "worhcenterCode");
            return (Criteria) this;
        }

        public Criteria andWorhcenterCodeLike(String value) {
            addCriterion("worhcenter_code like", value, "worhcenterCode");
            return (Criteria) this;
        }

        public Criteria andWorhcenterCodeNotLike(String value) {
            addCriterion("worhcenter_code not like", value, "worhcenterCode");
            return (Criteria) this;
        }

        public Criteria andWorhcenterCodeIn(List<String> values) {
            addCriterion("worhcenter_code in", values, "worhcenterCode");
            return (Criteria) this;
        }

        public Criteria andWorhcenterCodeNotIn(List<String> values) {
            addCriterion("worhcenter_code not in", values, "worhcenterCode");
            return (Criteria) this;
        }

        public Criteria andWorhcenterCodeBetween(String value1, String value2) {
            addCriterion("worhcenter_code between", value1, value2, "worhcenterCode");
            return (Criteria) this;
        }

        public Criteria andWorhcenterCodeNotBetween(String value1, String value2) {
            addCriterion("worhcenter_code not between", value1, value2, "worhcenterCode");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameIsNull() {
            addCriterion("worhcenter_name is null");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameIsNotNull() {
            addCriterion("worhcenter_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameEqualTo(String value) {
            addCriterion("worhcenter_name =", value, "worhcenterName");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameNotEqualTo(String value) {
            addCriterion("worhcenter_name <>", value, "worhcenterName");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameGreaterThan(String value) {
            addCriterion("worhcenter_name >", value, "worhcenterName");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("worhcenter_name >=", value, "worhcenterName");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameLessThan(String value) {
            addCriterion("worhcenter_name <", value, "worhcenterName");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameLessThanOrEqualTo(String value) {
            addCriterion("worhcenter_name <=", value, "worhcenterName");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameLike(String value) {
            addCriterion("worhcenter_name like", value, "worhcenterName");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameNotLike(String value) {
            addCriterion("worhcenter_name not like", value, "worhcenterName");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameIn(List<String> values) {
            addCriterion("worhcenter_name in", values, "worhcenterName");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameNotIn(List<String> values) {
            addCriterion("worhcenter_name not in", values, "worhcenterName");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameBetween(String value1, String value2) {
            addCriterion("worhcenter_name between", value1, value2, "worhcenterName");
            return (Criteria) this;
        }

        public Criteria andWorhcenterNameNotBetween(String value1, String value2) {
            addCriterion("worhcenter_name not between", value1, value2, "worhcenterName");
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

        public Criteria andBaseOperationIdIsNull() {
            addCriterion("base_operation_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseOperationIdIsNotNull() {
            addCriterion("base_operation_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseOperationIdEqualTo(Integer value) {
            addCriterion("base_operation_id =", value, "baseOperationId");
            return (Criteria) this;
        }

        public Criteria andBaseOperationIdNotEqualTo(Integer value) {
            addCriterion("base_operation_id <>", value, "baseOperationId");
            return (Criteria) this;
        }

        public Criteria andBaseOperationIdGreaterThan(Integer value) {
            addCriterion("base_operation_id >", value, "baseOperationId");
            return (Criteria) this;
        }

        public Criteria andBaseOperationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("base_operation_id >=", value, "baseOperationId");
            return (Criteria) this;
        }

        public Criteria andBaseOperationIdLessThan(Integer value) {
            addCriterion("base_operation_id <", value, "baseOperationId");
            return (Criteria) this;
        }

        public Criteria andBaseOperationIdLessThanOrEqualTo(Integer value) {
            addCriterion("base_operation_id <=", value, "baseOperationId");
            return (Criteria) this;
        }

        public Criteria andBaseOperationIdIn(List<Integer> values) {
            addCriterion("base_operation_id in", values, "baseOperationId");
            return (Criteria) this;
        }

        public Criteria andBaseOperationIdNotIn(List<Integer> values) {
            addCriterion("base_operation_id not in", values, "baseOperationId");
            return (Criteria) this;
        }

        public Criteria andBaseOperationIdBetween(Integer value1, Integer value2) {
            addCriterion("base_operation_id between", value1, value2, "baseOperationId");
            return (Criteria) this;
        }

        public Criteria andBaseOperationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("base_operation_id not between", value1, value2, "baseOperationId");
            return (Criteria) this;
        }

        public Criteria andStdTimeIsNull() {
            addCriterion("std_time is null");
            return (Criteria) this;
        }

        public Criteria andStdTimeIsNotNull() {
            addCriterion("std_time is not null");
            return (Criteria) this;
        }

        public Criteria andStdTimeEqualTo(Double value) {
            addCriterion("std_time =", value, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeNotEqualTo(Double value) {
            addCriterion("std_time <>", value, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeGreaterThan(Double value) {
            addCriterion("std_time >", value, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("std_time >=", value, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeLessThan(Double value) {
            addCriterion("std_time <", value, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeLessThanOrEqualTo(Double value) {
            addCriterion("std_time <=", value, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeIn(List<Double> values) {
            addCriterion("std_time in", values, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeNotIn(List<Double> values) {
            addCriterion("std_time not in", values, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeBetween(Double value1, Double value2) {
            addCriterion("std_time between", value1, value2, "stdTime");
            return (Criteria) this;
        }

        public Criteria andStdTimeNotBetween(Double value1, Double value2) {
            addCriterion("std_time not between", value1, value2, "stdTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Integer value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Integer value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Integer value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Integer value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Integer> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Integer> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Integer value1, Integer value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Integer value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Integer value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Integer value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Integer value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Integer> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Integer> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Integer value1, Integer value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andMachineCodeIsNull() {
            addCriterion("machine_code is null");
            return (Criteria) this;
        }

        public Criteria andMachineCodeIsNotNull() {
            addCriterion("machine_code is not null");
            return (Criteria) this;
        }

        public Criteria andMachineCodeEqualTo(String value) {
            addCriterion("machine_code =", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeNotEqualTo(String value) {
            addCriterion("machine_code <>", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeGreaterThan(String value) {
            addCriterion("machine_code >", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeGreaterThanOrEqualTo(String value) {
            addCriterion("machine_code >=", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeLessThan(String value) {
            addCriterion("machine_code <", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeLessThanOrEqualTo(String value) {
            addCriterion("machine_code <=", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeLike(String value) {
            addCriterion("machine_code like", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeNotLike(String value) {
            addCriterion("machine_code not like", value, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeIn(List<String> values) {
            addCriterion("machine_code in", values, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeNotIn(List<String> values) {
            addCriterion("machine_code not in", values, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeBetween(String value1, String value2) {
            addCriterion("machine_code between", value1, value2, "machineCode");
            return (Criteria) this;
        }

        public Criteria andMachineCodeNotBetween(String value1, String value2) {
            addCriterion("machine_code not between", value1, value2, "machineCode");
            return (Criteria) this;
        }

        public Criteria andSeriesIsNull() {
            addCriterion("series is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIsNotNull() {
            addCriterion("series is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesEqualTo(String value) {
            addCriterion("series =", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotEqualTo(String value) {
            addCriterion("series <>", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesGreaterThan(String value) {
            addCriterion("series >", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesGreaterThanOrEqualTo(String value) {
            addCriterion("series >=", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLessThan(String value) {
            addCriterion("series <", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLessThanOrEqualTo(String value) {
            addCriterion("series <=", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLike(String value) {
            addCriterion("series like", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotLike(String value) {
            addCriterion("series not like", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesIn(List<String> values) {
            addCriterion("series in", values, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotIn(List<String> values) {
            addCriterion("series not in", values, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesBetween(String value1, String value2) {
            addCriterion("series between", value1, value2, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotBetween(String value1, String value2) {
            addCriterion("series not between", value1, value2, "series");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andWorhcenterIdIsNull() {
            addCriterion("worhcenter_id is null");
            return (Criteria) this;
        }

        public Criteria andWorhcenterIdIsNotNull() {
            addCriterion("worhcenter_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorhcenterIdEqualTo(Integer value) {
            addCriterion("worhcenter_id =", value, "worhcenterId");
            return (Criteria) this;
        }

        public Criteria andWorhcenterIdNotEqualTo(Integer value) {
            addCriterion("worhcenter_id <>", value, "worhcenterId");
            return (Criteria) this;
        }

        public Criteria andWorhcenterIdGreaterThan(Integer value) {
            addCriterion("worhcenter_id >", value, "worhcenterId");
            return (Criteria) this;
        }

        public Criteria andWorhcenterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("worhcenter_id >=", value, "worhcenterId");
            return (Criteria) this;
        }

        public Criteria andWorhcenterIdLessThan(Integer value) {
            addCriterion("worhcenter_id <", value, "worhcenterId");
            return (Criteria) this;
        }

        public Criteria andWorhcenterIdLessThanOrEqualTo(Integer value) {
            addCriterion("worhcenter_id <=", value, "worhcenterId");
            return (Criteria) this;
        }

        public Criteria andWorhcenterIdIn(List<Integer> values) {
            addCriterion("worhcenter_id in", values, "worhcenterId");
            return (Criteria) this;
        }

        public Criteria andWorhcenterIdNotIn(List<Integer> values) {
            addCriterion("worhcenter_id not in", values, "worhcenterId");
            return (Criteria) this;
        }

        public Criteria andWorhcenterIdBetween(Integer value1, Integer value2) {
            addCriterion("worhcenter_id between", value1, value2, "worhcenterId");
            return (Criteria) this;
        }

        public Criteria andWorhcenterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("worhcenter_id not between", value1, value2, "worhcenterId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(Integer value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(Integer value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(Integer value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(Integer value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<Integer> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<Integer> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
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