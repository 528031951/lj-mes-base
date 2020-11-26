package com.bpm.lj.mes.base.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseNestingTaskDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseNestingTaskDetailsExample() {
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

        public Criteria andTaskCodeIsNull() {
            addCriterion("task_code is null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNotNull() {
            addCriterion("task_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeEqualTo(String value) {
            addCriterion("task_code =", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotEqualTo(String value) {
            addCriterion("task_code <>", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThan(String value) {
            addCriterion("task_code >", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("task_code >=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThan(String value) {
            addCriterion("task_code <", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThanOrEqualTo(String value) {
            addCriterion("task_code <=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLike(String value) {
            addCriterion("task_code like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotLike(String value) {
            addCriterion("task_code not like", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIn(List<String> values) {
            addCriterion("task_code in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotIn(List<String> values) {
            addCriterion("task_code not in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeBetween(String value1, String value2) {
            addCriterion("task_code between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotBetween(String value1, String value2) {
            addCriterion("task_code not between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNull() {
            addCriterion("warehouse_code is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNotNull() {
            addCriterion("warehouse_code is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeEqualTo(String value) {
            addCriterion("warehouse_code =", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotEqualTo(String value) {
            addCriterion("warehouse_code <>", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThan(String value) {
            addCriterion("warehouse_code >", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_code >=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThan(String value) {
            addCriterion("warehouse_code <", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThanOrEqualTo(String value) {
            addCriterion("warehouse_code <=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLike(String value) {
            addCriterion("warehouse_code like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotLike(String value) {
            addCriterion("warehouse_code not like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIn(List<String> values) {
            addCriterion("warehouse_code in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotIn(List<String> values) {
            addCriterion("warehouse_code not in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeBetween(String value1, String value2) {
            addCriterion("warehouse_code between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotBetween(String value1, String value2) {
            addCriterion("warehouse_code not between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNull() {
            addCriterion("material_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNotNull() {
            addCriterion("material_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeEqualTo(String value) {
            addCriterion("material_code =", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotEqualTo(String value) {
            addCriterion("material_code <>", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThan(String value) {
            addCriterion("material_code >", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_code >=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThan(String value) {
            addCriterion("material_code <", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanOrEqualTo(String value) {
            addCriterion("material_code <=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLike(String value) {
            addCriterion("material_code like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotLike(String value) {
            addCriterion("material_code not like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIn(List<String> values) {
            addCriterion("material_code in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotIn(List<String> values) {
            addCriterion("material_code not in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeBetween(String value1, String value2) {
            addCriterion("material_code between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotBetween(String value1, String value2) {
            addCriterion("material_code not between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeIsNull() {
            addCriterion("specs_type is null");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeIsNotNull() {
            addCriterion("specs_type is not null");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeEqualTo(String value) {
            addCriterion("specs_type =", value, "specsType");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeNotEqualTo(String value) {
            addCriterion("specs_type <>", value, "specsType");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeGreaterThan(String value) {
            addCriterion("specs_type >", value, "specsType");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("specs_type >=", value, "specsType");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeLessThan(String value) {
            addCriterion("specs_type <", value, "specsType");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeLessThanOrEqualTo(String value) {
            addCriterion("specs_type <=", value, "specsType");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeLike(String value) {
            addCriterion("specs_type like", value, "specsType");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeNotLike(String value) {
            addCriterion("specs_type not like", value, "specsType");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeIn(List<String> values) {
            addCriterion("specs_type in", values, "specsType");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeNotIn(List<String> values) {
            addCriterion("specs_type not in", values, "specsType");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeBetween(String value1, String value2) {
            addCriterion("specs_type between", value1, value2, "specsType");
            return (Criteria) this;
        }

        public Criteria andSpecsTypeNotBetween(String value1, String value2) {
            addCriterion("specs_type not between", value1, value2, "specsType");
            return (Criteria) this;
        }

        public Criteria andRealityLocationIsNull() {
            addCriterion("reality_location is null");
            return (Criteria) this;
        }

        public Criteria andRealityLocationIsNotNull() {
            addCriterion("reality_location is not null");
            return (Criteria) this;
        }

        public Criteria andRealityLocationEqualTo(String value) {
            addCriterion("reality_location =", value, "realityLocation");
            return (Criteria) this;
        }

        public Criteria andRealityLocationNotEqualTo(String value) {
            addCriterion("reality_location <>", value, "realityLocation");
            return (Criteria) this;
        }

        public Criteria andRealityLocationGreaterThan(String value) {
            addCriterion("reality_location >", value, "realityLocation");
            return (Criteria) this;
        }

        public Criteria andRealityLocationGreaterThanOrEqualTo(String value) {
            addCriterion("reality_location >=", value, "realityLocation");
            return (Criteria) this;
        }

        public Criteria andRealityLocationLessThan(String value) {
            addCriterion("reality_location <", value, "realityLocation");
            return (Criteria) this;
        }

        public Criteria andRealityLocationLessThanOrEqualTo(String value) {
            addCriterion("reality_location <=", value, "realityLocation");
            return (Criteria) this;
        }

        public Criteria andRealityLocationLike(String value) {
            addCriterion("reality_location like", value, "realityLocation");
            return (Criteria) this;
        }

        public Criteria andRealityLocationNotLike(String value) {
            addCriterion("reality_location not like", value, "realityLocation");
            return (Criteria) this;
        }

        public Criteria andRealityLocationIn(List<String> values) {
            addCriterion("reality_location in", values, "realityLocation");
            return (Criteria) this;
        }

        public Criteria andRealityLocationNotIn(List<String> values) {
            addCriterion("reality_location not in", values, "realityLocation");
            return (Criteria) this;
        }

        public Criteria andRealityLocationBetween(String value1, String value2) {
            addCriterion("reality_location between", value1, value2, "realityLocation");
            return (Criteria) this;
        }

        public Criteria andRealityLocationNotBetween(String value1, String value2) {
            addCriterion("reality_location not between", value1, value2, "realityLocation");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusIsNull() {
            addCriterion("receive_status is null");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusIsNotNull() {
            addCriterion("receive_status is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusEqualTo(Integer value) {
            addCriterion("receive_status =", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusNotEqualTo(Integer value) {
            addCriterion("receive_status <>", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusGreaterThan(Integer value) {
            addCriterion("receive_status >", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_status >=", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusLessThan(Integer value) {
            addCriterion("receive_status <", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusLessThanOrEqualTo(Integer value) {
            addCriterion("receive_status <=", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusIn(List<Integer> values) {
            addCriterion("receive_status in", values, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusNotIn(List<Integer> values) {
            addCriterion("receive_status not in", values, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusBetween(Integer value1, Integer value2) {
            addCriterion("receive_status between", value1, value2, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_status not between", value1, value2, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andIsitUrgentIsNull() {
            addCriterion("isIt_urgent is null");
            return (Criteria) this;
        }

        public Criteria andIsitUrgentIsNotNull() {
            addCriterion("isIt_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andIsitUrgentEqualTo(Integer value) {
            addCriterion("isIt_urgent =", value, "isitUrgent");
            return (Criteria) this;
        }

        public Criteria andIsitUrgentNotEqualTo(Integer value) {
            addCriterion("isIt_urgent <>", value, "isitUrgent");
            return (Criteria) this;
        }

        public Criteria andIsitUrgentGreaterThan(Integer value) {
            addCriterion("isIt_urgent >", value, "isitUrgent");
            return (Criteria) this;
        }

        public Criteria andIsitUrgentGreaterThanOrEqualTo(Integer value) {
            addCriterion("isIt_urgent >=", value, "isitUrgent");
            return (Criteria) this;
        }

        public Criteria andIsitUrgentLessThan(Integer value) {
            addCriterion("isIt_urgent <", value, "isitUrgent");
            return (Criteria) this;
        }

        public Criteria andIsitUrgentLessThanOrEqualTo(Integer value) {
            addCriterion("isIt_urgent <=", value, "isitUrgent");
            return (Criteria) this;
        }

        public Criteria andIsitUrgentIn(List<Integer> values) {
            addCriterion("isIt_urgent in", values, "isitUrgent");
            return (Criteria) this;
        }

        public Criteria andIsitUrgentNotIn(List<Integer> values) {
            addCriterion("isIt_urgent not in", values, "isitUrgent");
            return (Criteria) this;
        }

        public Criteria andIsitUrgentBetween(Integer value1, Integer value2) {
            addCriterion("isIt_urgent between", value1, value2, "isitUrgent");
            return (Criteria) this;
        }

        public Criteria andIsitUrgentNotBetween(Integer value1, Integer value2) {
            addCriterion("isIt_urgent not between", value1, value2, "isitUrgent");
            return (Criteria) this;
        }

        public Criteria andUrgeInspectionIsNull() {
            addCriterion("urge_inspection is null");
            return (Criteria) this;
        }

        public Criteria andUrgeInspectionIsNotNull() {
            addCriterion("urge_inspection is not null");
            return (Criteria) this;
        }

        public Criteria andUrgeInspectionEqualTo(Integer value) {
            addCriterion("urge_inspection =", value, "urgeInspection");
            return (Criteria) this;
        }

        public Criteria andUrgeInspectionNotEqualTo(Integer value) {
            addCriterion("urge_inspection <>", value, "urgeInspection");
            return (Criteria) this;
        }

        public Criteria andUrgeInspectionGreaterThan(Integer value) {
            addCriterion("urge_inspection >", value, "urgeInspection");
            return (Criteria) this;
        }

        public Criteria andUrgeInspectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("urge_inspection >=", value, "urgeInspection");
            return (Criteria) this;
        }

        public Criteria andUrgeInspectionLessThan(Integer value) {
            addCriterion("urge_inspection <", value, "urgeInspection");
            return (Criteria) this;
        }

        public Criteria andUrgeInspectionLessThanOrEqualTo(Integer value) {
            addCriterion("urge_inspection <=", value, "urgeInspection");
            return (Criteria) this;
        }

        public Criteria andUrgeInspectionIn(List<Integer> values) {
            addCriterion("urge_inspection in", values, "urgeInspection");
            return (Criteria) this;
        }

        public Criteria andUrgeInspectionNotIn(List<Integer> values) {
            addCriterion("urge_inspection not in", values, "urgeInspection");
            return (Criteria) this;
        }

        public Criteria andUrgeInspectionBetween(Integer value1, Integer value2) {
            addCriterion("urge_inspection between", value1, value2, "urgeInspection");
            return (Criteria) this;
        }

        public Criteria andUrgeInspectionNotBetween(Integer value1, Integer value2) {
            addCriterion("urge_inspection not between", value1, value2, "urgeInspection");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andPushLocationIsNull() {
            addCriterion("push_location is null");
            return (Criteria) this;
        }

        public Criteria andPushLocationIsNotNull() {
            addCriterion("push_location is not null");
            return (Criteria) this;
        }

        public Criteria andPushLocationEqualTo(String value) {
            addCriterion("push_location =", value, "pushLocation");
            return (Criteria) this;
        }

        public Criteria andPushLocationNotEqualTo(String value) {
            addCriterion("push_location <>", value, "pushLocation");
            return (Criteria) this;
        }

        public Criteria andPushLocationGreaterThan(String value) {
            addCriterion("push_location >", value, "pushLocation");
            return (Criteria) this;
        }

        public Criteria andPushLocationGreaterThanOrEqualTo(String value) {
            addCriterion("push_location >=", value, "pushLocation");
            return (Criteria) this;
        }

        public Criteria andPushLocationLessThan(String value) {
            addCriterion("push_location <", value, "pushLocation");
            return (Criteria) this;
        }

        public Criteria andPushLocationLessThanOrEqualTo(String value) {
            addCriterion("push_location <=", value, "pushLocation");
            return (Criteria) this;
        }

        public Criteria andPushLocationLike(String value) {
            addCriterion("push_location like", value, "pushLocation");
            return (Criteria) this;
        }

        public Criteria andPushLocationNotLike(String value) {
            addCriterion("push_location not like", value, "pushLocation");
            return (Criteria) this;
        }

        public Criteria andPushLocationIn(List<String> values) {
            addCriterion("push_location in", values, "pushLocation");
            return (Criteria) this;
        }

        public Criteria andPushLocationNotIn(List<String> values) {
            addCriterion("push_location not in", values, "pushLocation");
            return (Criteria) this;
        }

        public Criteria andPushLocationBetween(String value1, String value2) {
            addCriterion("push_location between", value1, value2, "pushLocation");
            return (Criteria) this;
        }

        public Criteria andPushLocationNotBetween(String value1, String value2) {
            addCriterion("push_location not between", value1, value2, "pushLocation");
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

        public Criteria andDeliveryOrderNoIsNull() {
            addCriterion("delivery_order_no is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoIsNotNull() {
            addCriterion("delivery_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoEqualTo(String value) {
            addCriterion("delivery_order_no =", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoNotEqualTo(String value) {
            addCriterion("delivery_order_no <>", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoGreaterThan(String value) {
            addCriterion("delivery_order_no >", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_order_no >=", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoLessThan(String value) {
            addCriterion("delivery_order_no <", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoLessThanOrEqualTo(String value) {
            addCriterion("delivery_order_no <=", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoLike(String value) {
            addCriterion("delivery_order_no like", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoNotLike(String value) {
            addCriterion("delivery_order_no not like", value, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoIn(List<String> values) {
            addCriterion("delivery_order_no in", values, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoNotIn(List<String> values) {
            addCriterion("delivery_order_no not in", values, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoBetween(String value1, String value2) {
            addCriterion("delivery_order_no between", value1, value2, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNoNotBetween(String value1, String value2) {
            addCriterion("delivery_order_no not between", value1, value2, "deliveryOrderNo");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("`number` is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("`number` is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(BigDecimal value) {
            addCriterion("`number` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(BigDecimal value) {
            addCriterion("`number` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(BigDecimal value) {
            addCriterion("`number` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("`number` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(BigDecimal value) {
            addCriterion("`number` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("`number` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<BigDecimal> values) {
            addCriterion("`number` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<BigDecimal> values) {
            addCriterion("`number` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`number` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`number` not between", value1, value2, "number");
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