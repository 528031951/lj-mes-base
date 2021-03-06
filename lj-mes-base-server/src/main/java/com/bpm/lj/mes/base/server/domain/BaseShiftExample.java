package com.bpm.lj.mes.base.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseShiftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseShiftExample() {
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

        public Criteria andWorkShopIdIsNull() {
            addCriterion("work_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkShopIdIsNotNull() {
            addCriterion("work_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkShopIdEqualTo(Integer value) {
            addCriterion("work_shop_id =", value, "workShopId");
            return (Criteria) this;
        }

        public Criteria andWorkShopIdNotEqualTo(Integer value) {
            addCriterion("work_shop_id <>", value, "workShopId");
            return (Criteria) this;
        }

        public Criteria andWorkShopIdGreaterThan(Integer value) {
            addCriterion("work_shop_id >", value, "workShopId");
            return (Criteria) this;
        }

        public Criteria andWorkShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_shop_id >=", value, "workShopId");
            return (Criteria) this;
        }

        public Criteria andWorkShopIdLessThan(Integer value) {
            addCriterion("work_shop_id <", value, "workShopId");
            return (Criteria) this;
        }

        public Criteria andWorkShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("work_shop_id <=", value, "workShopId");
            return (Criteria) this;
        }

        public Criteria andWorkShopIdIn(List<Integer> values) {
            addCriterion("work_shop_id in", values, "workShopId");
            return (Criteria) this;
        }

        public Criteria andWorkShopIdNotIn(List<Integer> values) {
            addCriterion("work_shop_id not in", values, "workShopId");
            return (Criteria) this;
        }

        public Criteria andWorkShopIdBetween(Integer value1, Integer value2) {
            addCriterion("work_shop_id between", value1, value2, "workShopId");
            return (Criteria) this;
        }

        public Criteria andWorkShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("work_shop_id not between", value1, value2, "workShopId");
            return (Criteria) this;
        }

        public Criteria andShiftNameIsNull() {
            addCriterion("shift_name is null");
            return (Criteria) this;
        }

        public Criteria andShiftNameIsNotNull() {
            addCriterion("shift_name is not null");
            return (Criteria) this;
        }

        public Criteria andShiftNameEqualTo(String value) {
            addCriterion("shift_name =", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameNotEqualTo(String value) {
            addCriterion("shift_name <>", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameGreaterThan(String value) {
            addCriterion("shift_name >", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameGreaterThanOrEqualTo(String value) {
            addCriterion("shift_name >=", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameLessThan(String value) {
            addCriterion("shift_name <", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameLessThanOrEqualTo(String value) {
            addCriterion("shift_name <=", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameLike(String value) {
            addCriterion("shift_name like", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameNotLike(String value) {
            addCriterion("shift_name not like", value, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameIn(List<String> values) {
            addCriterion("shift_name in", values, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameNotIn(List<String> values) {
            addCriterion("shift_name not in", values, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameBetween(String value1, String value2) {
            addCriterion("shift_name between", value1, value2, "shiftName");
            return (Criteria) this;
        }

        public Criteria andShiftNameNotBetween(String value1, String value2) {
            addCriterion("shift_name not between", value1, value2, "shiftName");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andShiftCodeIsNull() {
            addCriterion("shift_code is null");
            return (Criteria) this;
        }

        public Criteria andShiftCodeIsNotNull() {
            addCriterion("shift_code is not null");
            return (Criteria) this;
        }

        public Criteria andShiftCodeEqualTo(String value) {
            addCriterion("shift_code =", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeNotEqualTo(String value) {
            addCriterion("shift_code <>", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeGreaterThan(String value) {
            addCriterion("shift_code >", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shift_code >=", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeLessThan(String value) {
            addCriterion("shift_code <", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeLessThanOrEqualTo(String value) {
            addCriterion("shift_code <=", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeLike(String value) {
            addCriterion("shift_code like", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeNotLike(String value) {
            addCriterion("shift_code not like", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeIn(List<String> values) {
            addCriterion("shift_code in", values, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeNotIn(List<String> values) {
            addCriterion("shift_code not in", values, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeBetween(String value1, String value2) {
            addCriterion("shift_code between", value1, value2, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeNotBetween(String value1, String value2) {
            addCriterion("shift_code not between", value1, value2, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("is_enable is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("is_enable is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableEqualTo(String value) {
            addCriterion("is_enable =", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotEqualTo(String value) {
            addCriterion("is_enable <>", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThan(String value) {
            addCriterion("is_enable >", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(String value) {
            addCriterion("is_enable >=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThan(String value) {
            addCriterion("is_enable <", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(String value) {
            addCriterion("is_enable <=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLike(String value) {
            addCriterion("is_enable like", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotLike(String value) {
            addCriterion("is_enable not like", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableIn(List<String> values) {
            addCriterion("is_enable in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotIn(List<String> values) {
            addCriterion("is_enable not in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableBetween(String value1, String value2) {
            addCriterion("is_enable between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotBetween(String value1, String value2) {
            addCriterion("is_enable not between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andProductionLineIdIsNull() {
            addCriterion("production_line_id is null");
            return (Criteria) this;
        }

        public Criteria andProductionLineIdIsNotNull() {
            addCriterion("production_line_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductionLineIdEqualTo(Integer value) {
            addCriterion("production_line_id =", value, "productionLineId");
            return (Criteria) this;
        }

        public Criteria andProductionLineIdNotEqualTo(Integer value) {
            addCriterion("production_line_id <>", value, "productionLineId");
            return (Criteria) this;
        }

        public Criteria andProductionLineIdGreaterThan(Integer value) {
            addCriterion("production_line_id >", value, "productionLineId");
            return (Criteria) this;
        }

        public Criteria andProductionLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("production_line_id >=", value, "productionLineId");
            return (Criteria) this;
        }

        public Criteria andProductionLineIdLessThan(Integer value) {
            addCriterion("production_line_id <", value, "productionLineId");
            return (Criteria) this;
        }

        public Criteria andProductionLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("production_line_id <=", value, "productionLineId");
            return (Criteria) this;
        }

        public Criteria andProductionLineIdIn(List<Integer> values) {
            addCriterion("production_line_id in", values, "productionLineId");
            return (Criteria) this;
        }

        public Criteria andProductionLineIdNotIn(List<Integer> values) {
            addCriterion("production_line_id not in", values, "productionLineId");
            return (Criteria) this;
        }

        public Criteria andProductionLineIdBetween(Integer value1, Integer value2) {
            addCriterion("production_line_id between", value1, value2, "productionLineId");
            return (Criteria) this;
        }

        public Criteria andProductionLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("production_line_id not between", value1, value2, "productionLineId");
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