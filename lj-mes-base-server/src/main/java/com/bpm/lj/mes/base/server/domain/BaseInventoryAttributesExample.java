package com.bpm.lj.mes.base.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseInventoryAttributesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseInventoryAttributesExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andLibraryAgeIsNull() {
            addCriterion("library_age is null");
            return (Criteria) this;
        }

        public Criteria andLibraryAgeIsNotNull() {
            addCriterion("library_age is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryAgeEqualTo(Integer value) {
            addCriterion("library_age =", value, "libraryAge");
            return (Criteria) this;
        }

        public Criteria andLibraryAgeNotEqualTo(Integer value) {
            addCriterion("library_age <>", value, "libraryAge");
            return (Criteria) this;
        }

        public Criteria andLibraryAgeGreaterThan(Integer value) {
            addCriterion("library_age >", value, "libraryAge");
            return (Criteria) this;
        }

        public Criteria andLibraryAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("library_age >=", value, "libraryAge");
            return (Criteria) this;
        }

        public Criteria andLibraryAgeLessThan(Integer value) {
            addCriterion("library_age <", value, "libraryAge");
            return (Criteria) this;
        }

        public Criteria andLibraryAgeLessThanOrEqualTo(Integer value) {
            addCriterion("library_age <=", value, "libraryAge");
            return (Criteria) this;
        }

        public Criteria andLibraryAgeIn(List<Integer> values) {
            addCriterion("library_age in", values, "libraryAge");
            return (Criteria) this;
        }

        public Criteria andLibraryAgeNotIn(List<Integer> values) {
            addCriterion("library_age not in", values, "libraryAge");
            return (Criteria) this;
        }

        public Criteria andLibraryAgeBetween(Integer value1, Integer value2) {
            addCriterion("library_age between", value1, value2, "libraryAge");
            return (Criteria) this;
        }

        public Criteria andLibraryAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("library_age not between", value1, value2, "libraryAge");
            return (Criteria) this;
        }

        public Criteria andMiniStockIsNull() {
            addCriterion("mini_stock is null");
            return (Criteria) this;
        }

        public Criteria andMiniStockIsNotNull() {
            addCriterion("mini_stock is not null");
            return (Criteria) this;
        }

        public Criteria andMiniStockEqualTo(BigDecimal value) {
            addCriterion("mini_stock =", value, "miniStock");
            return (Criteria) this;
        }

        public Criteria andMiniStockNotEqualTo(BigDecimal value) {
            addCriterion("mini_stock <>", value, "miniStock");
            return (Criteria) this;
        }

        public Criteria andMiniStockGreaterThan(BigDecimal value) {
            addCriterion("mini_stock >", value, "miniStock");
            return (Criteria) this;
        }

        public Criteria andMiniStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mini_stock >=", value, "miniStock");
            return (Criteria) this;
        }

        public Criteria andMiniStockLessThan(BigDecimal value) {
            addCriterion("mini_stock <", value, "miniStock");
            return (Criteria) this;
        }

        public Criteria andMiniStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mini_stock <=", value, "miniStock");
            return (Criteria) this;
        }

        public Criteria andMiniStockIn(List<BigDecimal> values) {
            addCriterion("mini_stock in", values, "miniStock");
            return (Criteria) this;
        }

        public Criteria andMiniStockNotIn(List<BigDecimal> values) {
            addCriterion("mini_stock not in", values, "miniStock");
            return (Criteria) this;
        }

        public Criteria andMiniStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mini_stock between", value1, value2, "miniStock");
            return (Criteria) this;
        }

        public Criteria andMiniStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mini_stock not between", value1, value2, "miniStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockIsNull() {
            addCriterion("max_stock is null");
            return (Criteria) this;
        }

        public Criteria andMaxStockIsNotNull() {
            addCriterion("max_stock is not null");
            return (Criteria) this;
        }

        public Criteria andMaxStockEqualTo(BigDecimal value) {
            addCriterion("max_stock =", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockNotEqualTo(BigDecimal value) {
            addCriterion("max_stock <>", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockGreaterThan(BigDecimal value) {
            addCriterion("max_stock >", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_stock >=", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockLessThan(BigDecimal value) {
            addCriterion("max_stock <", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_stock <=", value, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockIn(List<BigDecimal> values) {
            addCriterion("max_stock in", values, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockNotIn(List<BigDecimal> values) {
            addCriterion("max_stock not in", values, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_stock between", value1, value2, "maxStock");
            return (Criteria) this;
        }

        public Criteria andMaxStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_stock not between", value1, value2, "maxStock");
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

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Integer value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Integer value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Integer value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Integer value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Integer> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Integer> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
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

        public Criteria andRequisitionDayIsNull() {
            addCriterion("requisition_day is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionDayIsNotNull() {
            addCriterion("requisition_day is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionDayEqualTo(Integer value) {
            addCriterion("requisition_day =", value, "requisitionDay");
            return (Criteria) this;
        }

        public Criteria andRequisitionDayNotEqualTo(Integer value) {
            addCriterion("requisition_day <>", value, "requisitionDay");
            return (Criteria) this;
        }

        public Criteria andRequisitionDayGreaterThan(Integer value) {
            addCriterion("requisition_day >", value, "requisitionDay");
            return (Criteria) this;
        }

        public Criteria andRequisitionDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("requisition_day >=", value, "requisitionDay");
            return (Criteria) this;
        }

        public Criteria andRequisitionDayLessThan(Integer value) {
            addCriterion("requisition_day <", value, "requisitionDay");
            return (Criteria) this;
        }

        public Criteria andRequisitionDayLessThanOrEqualTo(Integer value) {
            addCriterion("requisition_day <=", value, "requisitionDay");
            return (Criteria) this;
        }

        public Criteria andRequisitionDayIn(List<Integer> values) {
            addCriterion("requisition_day in", values, "requisitionDay");
            return (Criteria) this;
        }

        public Criteria andRequisitionDayNotIn(List<Integer> values) {
            addCriterion("requisition_day not in", values, "requisitionDay");
            return (Criteria) this;
        }

        public Criteria andRequisitionDayBetween(Integer value1, Integer value2) {
            addCriterion("requisition_day between", value1, value2, "requisitionDay");
            return (Criteria) this;
        }

        public Criteria andRequisitionDayNotBetween(Integer value1, Integer value2) {
            addCriterion("requisition_day not between", value1, value2, "requisitionDay");
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