package com.bpm.lj.mes.base.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseTeamExample() {
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

        public Criteria andCrewNameIsNull() {
            addCriterion("crew_name is null");
            return (Criteria) this;
        }

        public Criteria andCrewNameIsNotNull() {
            addCriterion("crew_name is not null");
            return (Criteria) this;
        }

        public Criteria andCrewNameEqualTo(String value) {
            addCriterion("crew_name =", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameNotEqualTo(String value) {
            addCriterion("crew_name <>", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameGreaterThan(String value) {
            addCriterion("crew_name >", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameGreaterThanOrEqualTo(String value) {
            addCriterion("crew_name >=", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameLessThan(String value) {
            addCriterion("crew_name <", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameLessThanOrEqualTo(String value) {
            addCriterion("crew_name <=", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameLike(String value) {
            addCriterion("crew_name like", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameNotLike(String value) {
            addCriterion("crew_name not like", value, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameIn(List<String> values) {
            addCriterion("crew_name in", values, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameNotIn(List<String> values) {
            addCriterion("crew_name not in", values, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameBetween(String value1, String value2) {
            addCriterion("crew_name between", value1, value2, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewNameNotBetween(String value1, String value2) {
            addCriterion("crew_name not between", value1, value2, "crewName");
            return (Criteria) this;
        }

        public Criteria andCrewTimeIsNull() {
            addCriterion("crew_time is null");
            return (Criteria) this;
        }

        public Criteria andCrewTimeIsNotNull() {
            addCriterion("crew_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrewTimeEqualTo(Date value) {
            addCriterion("crew_time =", value, "crewTime");
            return (Criteria) this;
        }

        public Criteria andCrewTimeNotEqualTo(Date value) {
            addCriterion("crew_time <>", value, "crewTime");
            return (Criteria) this;
        }

        public Criteria andCrewTimeGreaterThan(Date value) {
            addCriterion("crew_time >", value, "crewTime");
            return (Criteria) this;
        }

        public Criteria andCrewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crew_time >=", value, "crewTime");
            return (Criteria) this;
        }

        public Criteria andCrewTimeLessThan(Date value) {
            addCriterion("crew_time <", value, "crewTime");
            return (Criteria) this;
        }

        public Criteria andCrewTimeLessThanOrEqualTo(Date value) {
            addCriterion("crew_time <=", value, "crewTime");
            return (Criteria) this;
        }

        public Criteria andCrewTimeIn(List<Date> values) {
            addCriterion("crew_time in", values, "crewTime");
            return (Criteria) this;
        }

        public Criteria andCrewTimeNotIn(List<Date> values) {
            addCriterion("crew_time not in", values, "crewTime");
            return (Criteria) this;
        }

        public Criteria andCrewTimeBetween(Date value1, Date value2) {
            addCriterion("crew_time between", value1, value2, "crewTime");
            return (Criteria) this;
        }

        public Criteria andCrewTimeNotBetween(Date value1, Date value2) {
            addCriterion("crew_time not between", value1, value2, "crewTime");
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

        public Criteria andIsEnableIsNull() {
            addCriterion("is_enable is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("is_enable is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableEqualTo(Integer value) {
            addCriterion("is_enable =", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotEqualTo(Integer value) {
            addCriterion("is_enable <>", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThan(Integer value) {
            addCriterion("is_enable >", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_enable >=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThan(Integer value) {
            addCriterion("is_enable <", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(Integer value) {
            addCriterion("is_enable <=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableIn(List<Integer> values) {
            addCriterion("is_enable in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotIn(List<Integer> values) {
            addCriterion("is_enable not in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableBetween(Integer value1, Integer value2) {
            addCriterion("is_enable between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("is_enable not between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andTeamCodeIsNull() {
            addCriterion("team_code is null");
            return (Criteria) this;
        }

        public Criteria andTeamCodeIsNotNull() {
            addCriterion("team_code is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCodeEqualTo(String value) {
            addCriterion("team_code =", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeNotEqualTo(String value) {
            addCriterion("team_code <>", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeGreaterThan(String value) {
            addCriterion("team_code >", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeGreaterThanOrEqualTo(String value) {
            addCriterion("team_code >=", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeLessThan(String value) {
            addCriterion("team_code <", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeLessThanOrEqualTo(String value) {
            addCriterion("team_code <=", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeLike(String value) {
            addCriterion("team_code like", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeNotLike(String value) {
            addCriterion("team_code not like", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeIn(List<String> values) {
            addCriterion("team_code in", values, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeNotIn(List<String> values) {
            addCriterion("team_code not in", values, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeBetween(String value1, String value2) {
            addCriterion("team_code between", value1, value2, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeNotBetween(String value1, String value2) {
            addCriterion("team_code not between", value1, value2, "teamCode");
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

        public Criteria andTeamTypeIsNull() {
            addCriterion("team_type is null");
            return (Criteria) this;
        }

        public Criteria andTeamTypeIsNotNull() {
            addCriterion("team_type is not null");
            return (Criteria) this;
        }

        public Criteria andTeamTypeEqualTo(Integer value) {
            addCriterion("team_type =", value, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeNotEqualTo(Integer value) {
            addCriterion("team_type <>", value, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeGreaterThan(Integer value) {
            addCriterion("team_type >", value, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("team_type >=", value, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeLessThan(Integer value) {
            addCriterion("team_type <", value, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeLessThanOrEqualTo(Integer value) {
            addCriterion("team_type <=", value, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeIn(List<Integer> values) {
            addCriterion("team_type in", values, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeNotIn(List<Integer> values) {
            addCriterion("team_type not in", values, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeBetween(Integer value1, Integer value2) {
            addCriterion("team_type between", value1, value2, "teamType");
            return (Criteria) this;
        }

        public Criteria andTeamTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("team_type not between", value1, value2, "teamType");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andType1IsNull() {
            addCriterion("type1 is null");
            return (Criteria) this;
        }

        public Criteria andType1IsNotNull() {
            addCriterion("type1 is not null");
            return (Criteria) this;
        }

        public Criteria andType1EqualTo(String value) {
            addCriterion("type1 =", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotEqualTo(String value) {
            addCriterion("type1 <>", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThan(String value) {
            addCriterion("type1 >", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThanOrEqualTo(String value) {
            addCriterion("type1 >=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThan(String value) {
            addCriterion("type1 <", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThanOrEqualTo(String value) {
            addCriterion("type1 <=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Like(String value) {
            addCriterion("type1 like", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotLike(String value) {
            addCriterion("type1 not like", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1In(List<String> values) {
            addCriterion("type1 in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotIn(List<String> values) {
            addCriterion("type1 not in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Between(String value1, String value2) {
            addCriterion("type1 between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotBetween(String value1, String value2) {
            addCriterion("type1 not between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType2IsNull() {
            addCriterion("type2 is null");
            return (Criteria) this;
        }

        public Criteria andType2IsNotNull() {
            addCriterion("type2 is not null");
            return (Criteria) this;
        }

        public Criteria andType2EqualTo(String value) {
            addCriterion("type2 =", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotEqualTo(String value) {
            addCriterion("type2 <>", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThan(String value) {
            addCriterion("type2 >", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThanOrEqualTo(String value) {
            addCriterion("type2 >=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThan(String value) {
            addCriterion("type2 <", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThanOrEqualTo(String value) {
            addCriterion("type2 <=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Like(String value) {
            addCriterion("type2 like", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotLike(String value) {
            addCriterion("type2 not like", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2In(List<String> values) {
            addCriterion("type2 in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotIn(List<String> values) {
            addCriterion("type2 not in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Between(String value1, String value2) {
            addCriterion("type2 between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotBetween(String value1, String value2) {
            addCriterion("type2 not between", value1, value2, "type2");
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

        public Criteria andTeamNameIsNull() {
            addCriterion("team_name is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("team_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("team_name =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("team_name <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("team_name >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("team_name >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("team_name <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("team_name <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("team_name like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("team_name not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("team_name in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("team_name not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("team_name between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("team_name not between", value1, value2, "teamName");
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