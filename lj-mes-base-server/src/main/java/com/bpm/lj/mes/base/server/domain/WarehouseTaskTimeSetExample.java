package com.bpm.lj.mes.base.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseTaskTimeSetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseTaskTimeSetExample() {
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

        public Criteria andTimeTaskNumIsNull() {
            addCriterion("time_task_num is null");
            return (Criteria) this;
        }

        public Criteria andTimeTaskNumIsNotNull() {
            addCriterion("time_task_num is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTaskNumEqualTo(String value) {
            addCriterion("time_task_num =", value, "timeTaskNum");
            return (Criteria) this;
        }

        public Criteria andTimeTaskNumNotEqualTo(String value) {
            addCriterion("time_task_num <>", value, "timeTaskNum");
            return (Criteria) this;
        }

        public Criteria andTimeTaskNumGreaterThan(String value) {
            addCriterion("time_task_num >", value, "timeTaskNum");
            return (Criteria) this;
        }

        public Criteria andTimeTaskNumGreaterThanOrEqualTo(String value) {
            addCriterion("time_task_num >=", value, "timeTaskNum");
            return (Criteria) this;
        }

        public Criteria andTimeTaskNumLessThan(String value) {
            addCriterion("time_task_num <", value, "timeTaskNum");
            return (Criteria) this;
        }

        public Criteria andTimeTaskNumLessThanOrEqualTo(String value) {
            addCriterion("time_task_num <=", value, "timeTaskNum");
            return (Criteria) this;
        }

        public Criteria andTimeTaskNumLike(String value) {
            addCriterion("time_task_num like", value, "timeTaskNum");
            return (Criteria) this;
        }

        public Criteria andTimeTaskNumNotLike(String value) {
            addCriterion("time_task_num not like", value, "timeTaskNum");
            return (Criteria) this;
        }

        public Criteria andTimeTaskNumIn(List<String> values) {
            addCriterion("time_task_num in", values, "timeTaskNum");
            return (Criteria) this;
        }

        public Criteria andTimeTaskNumNotIn(List<String> values) {
            addCriterion("time_task_num not in", values, "timeTaskNum");
            return (Criteria) this;
        }

        public Criteria andTimeTaskNumBetween(String value1, String value2) {
            addCriterion("time_task_num between", value1, value2, "timeTaskNum");
            return (Criteria) this;
        }

        public Criteria andTimeTaskNumNotBetween(String value1, String value2) {
            addCriterion("time_task_num not between", value1, value2, "timeTaskNum");
            return (Criteria) this;
        }

        public Criteria andDayDateIsNull() {
            addCriterion("day_date is null");
            return (Criteria) this;
        }

        public Criteria andDayDateIsNotNull() {
            addCriterion("day_date is not null");
            return (Criteria) this;
        }

        public Criteria andDayDateEqualTo(Date value) {
            addCriterion("day_date =", value, "dayDate");
            return (Criteria) this;
        }

        public Criteria andDayDateNotEqualTo(Date value) {
            addCriterion("day_date <>", value, "dayDate");
            return (Criteria) this;
        }

        public Criteria andDayDateGreaterThan(Date value) {
            addCriterion("day_date >", value, "dayDate");
            return (Criteria) this;
        }

        public Criteria andDayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("day_date >=", value, "dayDate");
            return (Criteria) this;
        }

        public Criteria andDayDateLessThan(Date value) {
            addCriterion("day_date <", value, "dayDate");
            return (Criteria) this;
        }

        public Criteria andDayDateLessThanOrEqualTo(Date value) {
            addCriterion("day_date <=", value, "dayDate");
            return (Criteria) this;
        }

        public Criteria andDayDateIn(List<Date> values) {
            addCriterion("day_date in", values, "dayDate");
            return (Criteria) this;
        }

        public Criteria andDayDateNotIn(List<Date> values) {
            addCriterion("day_date not in", values, "dayDate");
            return (Criteria) this;
        }

        public Criteria andDayDateBetween(Date value1, Date value2) {
            addCriterion("day_date between", value1, value2, "dayDate");
            return (Criteria) this;
        }

        public Criteria andDayDateNotBetween(Date value1, Date value2) {
            addCriterion("day_date not between", value1, value2, "dayDate");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksIsNull() {
            addCriterion("time_task_remarks is null");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksIsNotNull() {
            addCriterion("time_task_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksEqualTo(String value) {
            addCriterion("time_task_remarks =", value, "timeTaskRemarks");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksNotEqualTo(String value) {
            addCriterion("time_task_remarks <>", value, "timeTaskRemarks");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksGreaterThan(String value) {
            addCriterion("time_task_remarks >", value, "timeTaskRemarks");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("time_task_remarks >=", value, "timeTaskRemarks");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksLessThan(String value) {
            addCriterion("time_task_remarks <", value, "timeTaskRemarks");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksLessThanOrEqualTo(String value) {
            addCriterion("time_task_remarks <=", value, "timeTaskRemarks");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksLike(String value) {
            addCriterion("time_task_remarks like", value, "timeTaskRemarks");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksNotLike(String value) {
            addCriterion("time_task_remarks not like", value, "timeTaskRemarks");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksIn(List<String> values) {
            addCriterion("time_task_remarks in", values, "timeTaskRemarks");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksNotIn(List<String> values) {
            addCriterion("time_task_remarks not in", values, "timeTaskRemarks");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksBetween(String value1, String value2) {
            addCriterion("time_task_remarks between", value1, value2, "timeTaskRemarks");
            return (Criteria) this;
        }

        public Criteria andTimeTaskRemarksNotBetween(String value1, String value2) {
            addCriterion("time_task_remarks not between", value1, value2, "timeTaskRemarks");
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