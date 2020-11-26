package com.bpm.lj.mes.base.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseProtectionGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseProtectionGroupExample() {
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

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andProtectionIdIsNull() {
            addCriterion("protection_id is null");
            return (Criteria) this;
        }

        public Criteria andProtectionIdIsNotNull() {
            addCriterion("protection_id is not null");
            return (Criteria) this;
        }

        public Criteria andProtectionIdEqualTo(Integer value) {
            addCriterion("protection_id =", value, "protectionId");
            return (Criteria) this;
        }

        public Criteria andProtectionIdNotEqualTo(Integer value) {
            addCriterion("protection_id <>", value, "protectionId");
            return (Criteria) this;
        }

        public Criteria andProtectionIdGreaterThan(Integer value) {
            addCriterion("protection_id >", value, "protectionId");
            return (Criteria) this;
        }

        public Criteria andProtectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("protection_id >=", value, "protectionId");
            return (Criteria) this;
        }

        public Criteria andProtectionIdLessThan(Integer value) {
            addCriterion("protection_id <", value, "protectionId");
            return (Criteria) this;
        }

        public Criteria andProtectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("protection_id <=", value, "protectionId");
            return (Criteria) this;
        }

        public Criteria andProtectionIdIn(List<Integer> values) {
            addCriterion("protection_id in", values, "protectionId");
            return (Criteria) this;
        }

        public Criteria andProtectionIdNotIn(List<Integer> values) {
            addCriterion("protection_id not in", values, "protectionId");
            return (Criteria) this;
        }

        public Criteria andProtectionIdBetween(Integer value1, Integer value2) {
            addCriterion("protection_id between", value1, value2, "protectionId");
            return (Criteria) this;
        }

        public Criteria andProtectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("protection_id not between", value1, value2, "protectionId");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNull() {
            addCriterion("apply_num is null");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNotNull() {
            addCriterion("apply_num is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNumEqualTo(BigDecimal value) {
            addCriterion("apply_num =", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotEqualTo(BigDecimal value) {
            addCriterion("apply_num <>", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThan(BigDecimal value) {
            addCriterion("apply_num >", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_num >=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThan(BigDecimal value) {
            addCriterion("apply_num <", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_num <=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumIn(List<BigDecimal> values) {
            addCriterion("apply_num in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotIn(List<BigDecimal> values) {
            addCriterion("apply_num not in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_num between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_num not between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andGrandNumIsNull() {
            addCriterion("grand_num is null");
            return (Criteria) this;
        }

        public Criteria andGrandNumIsNotNull() {
            addCriterion("grand_num is not null");
            return (Criteria) this;
        }

        public Criteria andGrandNumEqualTo(BigDecimal value) {
            addCriterion("grand_num =", value, "grandNum");
            return (Criteria) this;
        }

        public Criteria andGrandNumNotEqualTo(BigDecimal value) {
            addCriterion("grand_num <>", value, "grandNum");
            return (Criteria) this;
        }

        public Criteria andGrandNumGreaterThan(BigDecimal value) {
            addCriterion("grand_num >", value, "grandNum");
            return (Criteria) this;
        }

        public Criteria andGrandNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grand_num >=", value, "grandNum");
            return (Criteria) this;
        }

        public Criteria andGrandNumLessThan(BigDecimal value) {
            addCriterion("grand_num <", value, "grandNum");
            return (Criteria) this;
        }

        public Criteria andGrandNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grand_num <=", value, "grandNum");
            return (Criteria) this;
        }

        public Criteria andGrandNumIn(List<BigDecimal> values) {
            addCriterion("grand_num in", values, "grandNum");
            return (Criteria) this;
        }

        public Criteria andGrandNumNotIn(List<BigDecimal> values) {
            addCriterion("grand_num not in", values, "grandNum");
            return (Criteria) this;
        }

        public Criteria andGrandNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grand_num between", value1, value2, "grandNum");
            return (Criteria) this;
        }

        public Criteria andGrandNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grand_num not between", value1, value2, "grandNum");
            return (Criteria) this;
        }

        public Criteria andGrandDateIsNull() {
            addCriterion("grand_date is null");
            return (Criteria) this;
        }

        public Criteria andGrandDateIsNotNull() {
            addCriterion("grand_date is not null");
            return (Criteria) this;
        }

        public Criteria andGrandDateEqualTo(Date value) {
            addCriterion("grand_date =", value, "grandDate");
            return (Criteria) this;
        }

        public Criteria andGrandDateNotEqualTo(Date value) {
            addCriterion("grand_date <>", value, "grandDate");
            return (Criteria) this;
        }

        public Criteria andGrandDateGreaterThan(Date value) {
            addCriterion("grand_date >", value, "grandDate");
            return (Criteria) this;
        }

        public Criteria andGrandDateGreaterThanOrEqualTo(Date value) {
            addCriterion("grand_date >=", value, "grandDate");
            return (Criteria) this;
        }

        public Criteria andGrandDateLessThan(Date value) {
            addCriterion("grand_date <", value, "grandDate");
            return (Criteria) this;
        }

        public Criteria andGrandDateLessThanOrEqualTo(Date value) {
            addCriterion("grand_date <=", value, "grandDate");
            return (Criteria) this;
        }

        public Criteria andGrandDateIn(List<Date> values) {
            addCriterion("grand_date in", values, "grandDate");
            return (Criteria) this;
        }

        public Criteria andGrandDateNotIn(List<Date> values) {
            addCriterion("grand_date not in", values, "grandDate");
            return (Criteria) this;
        }

        public Criteria andGrandDateBetween(Date value1, Date value2) {
            addCriterion("grand_date between", value1, value2, "grandDate");
            return (Criteria) this;
        }

        public Criteria andGrandDateNotBetween(Date value1, Date value2) {
            addCriterion("grand_date not between", value1, value2, "grandDate");
            return (Criteria) this;
        }

        public Criteria andInUseNumIsNull() {
            addCriterion("in_use_num is null");
            return (Criteria) this;
        }

        public Criteria andInUseNumIsNotNull() {
            addCriterion("in_use_num is not null");
            return (Criteria) this;
        }

        public Criteria andInUseNumEqualTo(BigDecimal value) {
            addCriterion("in_use_num =", value, "inUseNum");
            return (Criteria) this;
        }

        public Criteria andInUseNumNotEqualTo(BigDecimal value) {
            addCriterion("in_use_num <>", value, "inUseNum");
            return (Criteria) this;
        }

        public Criteria andInUseNumGreaterThan(BigDecimal value) {
            addCriterion("in_use_num >", value, "inUseNum");
            return (Criteria) this;
        }

        public Criteria andInUseNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("in_use_num >=", value, "inUseNum");
            return (Criteria) this;
        }

        public Criteria andInUseNumLessThan(BigDecimal value) {
            addCriterion("in_use_num <", value, "inUseNum");
            return (Criteria) this;
        }

        public Criteria andInUseNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("in_use_num <=", value, "inUseNum");
            return (Criteria) this;
        }

        public Criteria andInUseNumIn(List<BigDecimal> values) {
            addCriterion("in_use_num in", values, "inUseNum");
            return (Criteria) this;
        }

        public Criteria andInUseNumNotIn(List<BigDecimal> values) {
            addCriterion("in_use_num not in", values, "inUseNum");
            return (Criteria) this;
        }

        public Criteria andInUseNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("in_use_num between", value1, value2, "inUseNum");
            return (Criteria) this;
        }

        public Criteria andInUseNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("in_use_num not between", value1, value2, "inUseNum");
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

        public Criteria andCreaterIdIsNull() {
            addCriterion("creater_id is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNotNull() {
            addCriterion("creater_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdEqualTo(Integer value) {
            addCriterion("creater_id =", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotEqualTo(Integer value) {
            addCriterion("creater_id <>", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThan(Integer value) {
            addCriterion("creater_id >", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creater_id >=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThan(Integer value) {
            addCriterion("creater_id <", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("creater_id <=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIn(List<Integer> values) {
            addCriterion("creater_id in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotIn(List<Integer> values) {
            addCriterion("creater_id not in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdBetween(Integer value1, Integer value2) {
            addCriterion("creater_id between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creater_id not between", value1, value2, "createrId");
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

        public Criteria andUpdaterIdIsNull() {
            addCriterion("updater_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNotNull() {
            addCriterion("updater_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdEqualTo(Integer value) {
            addCriterion("updater_id =", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotEqualTo(Integer value) {
            addCriterion("updater_id <>", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThan(Integer value) {
            addCriterion("updater_id >", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("updater_id >=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThan(Integer value) {
            addCriterion("updater_id <", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("updater_id <=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIn(List<Integer> values) {
            addCriterion("updater_id in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotIn(List<Integer> values) {
            addCriterion("updater_id not in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdBetween(Integer value1, Integer value2) {
            addCriterion("updater_id between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("updater_id not between", value1, value2, "updaterId");
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