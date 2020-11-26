package com.bpm.lj.mes.base.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierPurchaseDeliveryOrderDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierPurchaseDeliveryOrderDetailsExample() {
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

        public Criteria andCaccIdIsNull() {
            addCriterion("cAcc_Id is null");
            return (Criteria) this;
        }

        public Criteria andCaccIdIsNotNull() {
            addCriterion("cAcc_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCaccIdEqualTo(Integer value) {
            addCriterion("cAcc_Id =", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdNotEqualTo(Integer value) {
            addCriterion("cAcc_Id <>", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdGreaterThan(Integer value) {
            addCriterion("cAcc_Id >", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cAcc_Id >=", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdLessThan(Integer value) {
            addCriterion("cAcc_Id <", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdLessThanOrEqualTo(Integer value) {
            addCriterion("cAcc_Id <=", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdIn(List<Integer> values) {
            addCriterion("cAcc_Id in", values, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdNotIn(List<Integer> values) {
            addCriterion("cAcc_Id not in", values, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdBetween(Integer value1, Integer value2) {
            addCriterion("cAcc_Id between", value1, value2, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cAcc_Id not between", value1, value2, "caccId");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(BigDecimal value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(BigDecimal value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(BigDecimal value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(BigDecimal value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<BigDecimal> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<BigDecimal> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeliveryOrderIdIsNull() {
            addCriterion("purchase_delivery_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeliveryOrderIdIsNotNull() {
            addCriterion("purchase_delivery_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeliveryOrderIdEqualTo(Integer value) {
            addCriterion("purchase_delivery_order_id =", value, "purchaseDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeliveryOrderIdNotEqualTo(Integer value) {
            addCriterion("purchase_delivery_order_id <>", value, "purchaseDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeliveryOrderIdGreaterThan(Integer value) {
            addCriterion("purchase_delivery_order_id >", value, "purchaseDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeliveryOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_delivery_order_id >=", value, "purchaseDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeliveryOrderIdLessThan(Integer value) {
            addCriterion("purchase_delivery_order_id <", value, "purchaseDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeliveryOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_delivery_order_id <=", value, "purchaseDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeliveryOrderIdIn(List<Integer> values) {
            addCriterion("purchase_delivery_order_id in", values, "purchaseDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeliveryOrderIdNotIn(List<Integer> values) {
            addCriterion("purchase_delivery_order_id not in", values, "purchaseDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeliveryOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("purchase_delivery_order_id between", value1, value2, "purchaseDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeliveryOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_delivery_order_id not between", value1, value2, "purchaseDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andQuantityNumIsNull() {
            addCriterion("quantity_num is null");
            return (Criteria) this;
        }

        public Criteria andQuantityNumIsNotNull() {
            addCriterion("quantity_num is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityNumEqualTo(BigDecimal value) {
            addCriterion("quantity_num =", value, "quantityNum");
            return (Criteria) this;
        }

        public Criteria andQuantityNumNotEqualTo(BigDecimal value) {
            addCriterion("quantity_num <>", value, "quantityNum");
            return (Criteria) this;
        }

        public Criteria andQuantityNumGreaterThan(BigDecimal value) {
            addCriterion("quantity_num >", value, "quantityNum");
            return (Criteria) this;
        }

        public Criteria andQuantityNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quantity_num >=", value, "quantityNum");
            return (Criteria) this;
        }

        public Criteria andQuantityNumLessThan(BigDecimal value) {
            addCriterion("quantity_num <", value, "quantityNum");
            return (Criteria) this;
        }

        public Criteria andQuantityNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quantity_num <=", value, "quantityNum");
            return (Criteria) this;
        }

        public Criteria andQuantityNumIn(List<BigDecimal> values) {
            addCriterion("quantity_num in", values, "quantityNum");
            return (Criteria) this;
        }

        public Criteria andQuantityNumNotIn(List<BigDecimal> values) {
            addCriterion("quantity_num not in", values, "quantityNum");
            return (Criteria) this;
        }

        public Criteria andQuantityNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quantity_num between", value1, value2, "quantityNum");
            return (Criteria) this;
        }

        public Criteria andQuantityNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quantity_num not between", value1, value2, "quantityNum");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNull() {
            addCriterion("current_status is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNotNull() {
            addCriterion("current_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusEqualTo(Integer value) {
            addCriterion("current_status =", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualTo(Integer value) {
            addCriterion("current_status <>", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThan(Integer value) {
            addCriterion("current_status >", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_status >=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThan(Integer value) {
            addCriterion("current_status <", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("current_status <=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIn(List<Integer> values) {
            addCriterion("current_status in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotIn(List<Integer> values) {
            addCriterion("current_status not in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusBetween(Integer value1, Integer value2) {
            addCriterion("current_status between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("current_status not between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andUrgentIsNull() {
            addCriterion("urgent is null");
            return (Criteria) this;
        }

        public Criteria andUrgentIsNotNull() {
            addCriterion("urgent is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentEqualTo(Integer value) {
            addCriterion("urgent =", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotEqualTo(Integer value) {
            addCriterion("urgent <>", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentGreaterThan(Integer value) {
            addCriterion("urgent >", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentGreaterThanOrEqualTo(Integer value) {
            addCriterion("urgent >=", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentLessThan(Integer value) {
            addCriterion("urgent <", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentLessThanOrEqualTo(Integer value) {
            addCriterion("urgent <=", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentIn(List<Integer> values) {
            addCriterion("urgent in", values, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotIn(List<Integer> values) {
            addCriterion("urgent not in", values, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentBetween(Integer value1, Integer value2) {
            addCriterion("urgent between", value1, value2, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotBetween(Integer value1, Integer value2) {
            addCriterion("urgent not between", value1, value2, "urgent");
            return (Criteria) this;
        }

        public Criteria andDraweNoIsNull() {
            addCriterion("drawe_no is null");
            return (Criteria) this;
        }

        public Criteria andDraweNoIsNotNull() {
            addCriterion("drawe_no is not null");
            return (Criteria) this;
        }

        public Criteria andDraweNoEqualTo(String value) {
            addCriterion("drawe_no =", value, "draweNo");
            return (Criteria) this;
        }

        public Criteria andDraweNoNotEqualTo(String value) {
            addCriterion("drawe_no <>", value, "draweNo");
            return (Criteria) this;
        }

        public Criteria andDraweNoGreaterThan(String value) {
            addCriterion("drawe_no >", value, "draweNo");
            return (Criteria) this;
        }

        public Criteria andDraweNoGreaterThanOrEqualTo(String value) {
            addCriterion("drawe_no >=", value, "draweNo");
            return (Criteria) this;
        }

        public Criteria andDraweNoLessThan(String value) {
            addCriterion("drawe_no <", value, "draweNo");
            return (Criteria) this;
        }

        public Criteria andDraweNoLessThanOrEqualTo(String value) {
            addCriterion("drawe_no <=", value, "draweNo");
            return (Criteria) this;
        }

        public Criteria andDraweNoLike(String value) {
            addCriterion("drawe_no like", value, "draweNo");
            return (Criteria) this;
        }

        public Criteria andDraweNoNotLike(String value) {
            addCriterion("drawe_no not like", value, "draweNo");
            return (Criteria) this;
        }

        public Criteria andDraweNoIn(List<String> values) {
            addCriterion("drawe_no in", values, "draweNo");
            return (Criteria) this;
        }

        public Criteria andDraweNoNotIn(List<String> values) {
            addCriterion("drawe_no not in", values, "draweNo");
            return (Criteria) this;
        }

        public Criteria andDraweNoBetween(String value1, String value2) {
            addCriterion("drawe_no between", value1, value2, "draweNo");
            return (Criteria) this;
        }

        public Criteria andDraweNoNotBetween(String value1, String value2) {
            addCriterion("drawe_no not between", value1, value2, "draweNo");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNull() {
            addCriterion("qr_code is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNotNull() {
            addCriterion("qr_code is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeEqualTo(String value) {
            addCriterion("qr_code =", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotEqualTo(String value) {
            addCriterion("qr_code <>", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThan(String value) {
            addCriterion("qr_code >", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code >=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThan(String value) {
            addCriterion("qr_code <", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThanOrEqualTo(String value) {
            addCriterion("qr_code <=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLike(String value) {
            addCriterion("qr_code like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotLike(String value) {
            addCriterion("qr_code not like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeIn(List<String> values) {
            addCriterion("qr_code in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotIn(List<String> values) {
            addCriterion("qr_code not in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeBetween(String value1, String value2) {
            addCriterion("qr_code between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotBetween(String value1, String value2) {
            addCriterion("qr_code not between", value1, value2, "qrCode");
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

        public Criteria andMaterialBatchCodeIsNull() {
            addCriterion("material_batch_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeIsNotNull() {
            addCriterion("material_batch_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeEqualTo(String value) {
            addCriterion("material_batch_code =", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeNotEqualTo(String value) {
            addCriterion("material_batch_code <>", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeGreaterThan(String value) {
            addCriterion("material_batch_code >", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_batch_code >=", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeLessThan(String value) {
            addCriterion("material_batch_code <", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeLessThanOrEqualTo(String value) {
            addCriterion("material_batch_code <=", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeLike(String value) {
            addCriterion("material_batch_code like", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeNotLike(String value) {
            addCriterion("material_batch_code not like", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeIn(List<String> values) {
            addCriterion("material_batch_code in", values, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeNotIn(List<String> values) {
            addCriterion("material_batch_code not in", values, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeBetween(String value1, String value2) {
            addCriterion("material_batch_code between", value1, value2, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeNotBetween(String value1, String value2) {
            addCriterion("material_batch_code not between", value1, value2, "materialBatchCode");
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

        public Criteria andSpecialNumIsNull() {
            addCriterion("special_num is null");
            return (Criteria) this;
        }

        public Criteria andSpecialNumIsNotNull() {
            addCriterion("special_num is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialNumEqualTo(Integer value) {
            addCriterion("special_num =", value, "specialNum");
            return (Criteria) this;
        }

        public Criteria andSpecialNumNotEqualTo(Integer value) {
            addCriterion("special_num <>", value, "specialNum");
            return (Criteria) this;
        }

        public Criteria andSpecialNumGreaterThan(Integer value) {
            addCriterion("special_num >", value, "specialNum");
            return (Criteria) this;
        }

        public Criteria andSpecialNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("special_num >=", value, "specialNum");
            return (Criteria) this;
        }

        public Criteria andSpecialNumLessThan(Integer value) {
            addCriterion("special_num <", value, "specialNum");
            return (Criteria) this;
        }

        public Criteria andSpecialNumLessThanOrEqualTo(Integer value) {
            addCriterion("special_num <=", value, "specialNum");
            return (Criteria) this;
        }

        public Criteria andSpecialNumIn(List<Integer> values) {
            addCriterion("special_num in", values, "specialNum");
            return (Criteria) this;
        }

        public Criteria andSpecialNumNotIn(List<Integer> values) {
            addCriterion("special_num not in", values, "specialNum");
            return (Criteria) this;
        }

        public Criteria andSpecialNumBetween(Integer value1, Integer value2) {
            addCriterion("special_num between", value1, value2, "specialNum");
            return (Criteria) this;
        }

        public Criteria andSpecialNumNotBetween(Integer value1, Integer value2) {
            addCriterion("special_num not between", value1, value2, "specialNum");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeIsNull() {
            addCriterion("erp_batch_code is null");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeIsNotNull() {
            addCriterion("erp_batch_code is not null");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeEqualTo(String value) {
            addCriterion("erp_batch_code =", value, "erpBatchCode");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeNotEqualTo(String value) {
            addCriterion("erp_batch_code <>", value, "erpBatchCode");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeGreaterThan(String value) {
            addCriterion("erp_batch_code >", value, "erpBatchCode");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("erp_batch_code >=", value, "erpBatchCode");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeLessThan(String value) {
            addCriterion("erp_batch_code <", value, "erpBatchCode");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeLessThanOrEqualTo(String value) {
            addCriterion("erp_batch_code <=", value, "erpBatchCode");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeLike(String value) {
            addCriterion("erp_batch_code like", value, "erpBatchCode");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeNotLike(String value) {
            addCriterion("erp_batch_code not like", value, "erpBatchCode");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeIn(List<String> values) {
            addCriterion("erp_batch_code in", values, "erpBatchCode");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeNotIn(List<String> values) {
            addCriterion("erp_batch_code not in", values, "erpBatchCode");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeBetween(String value1, String value2) {
            addCriterion("erp_batch_code between", value1, value2, "erpBatchCode");
            return (Criteria) this;
        }

        public Criteria andErpBatchCodeNotBetween(String value1, String value2) {
            addCriterion("erp_batch_code not between", value1, value2, "erpBatchCode");
            return (Criteria) this;
        }

        public Criteria andFrozenStatusIsNull() {
            addCriterion("frozen_status is null");
            return (Criteria) this;
        }

        public Criteria andFrozenStatusIsNotNull() {
            addCriterion("frozen_status is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenStatusEqualTo(Integer value) {
            addCriterion("frozen_status =", value, "frozenStatus");
            return (Criteria) this;
        }

        public Criteria andFrozenStatusNotEqualTo(Integer value) {
            addCriterion("frozen_status <>", value, "frozenStatus");
            return (Criteria) this;
        }

        public Criteria andFrozenStatusGreaterThan(Integer value) {
            addCriterion("frozen_status >", value, "frozenStatus");
            return (Criteria) this;
        }

        public Criteria andFrozenStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("frozen_status >=", value, "frozenStatus");
            return (Criteria) this;
        }

        public Criteria andFrozenStatusLessThan(Integer value) {
            addCriterion("frozen_status <", value, "frozenStatus");
            return (Criteria) this;
        }

        public Criteria andFrozenStatusLessThanOrEqualTo(Integer value) {
            addCriterion("frozen_status <=", value, "frozenStatus");
            return (Criteria) this;
        }

        public Criteria andFrozenStatusIn(List<Integer> values) {
            addCriterion("frozen_status in", values, "frozenStatus");
            return (Criteria) this;
        }

        public Criteria andFrozenStatusNotIn(List<Integer> values) {
            addCriterion("frozen_status not in", values, "frozenStatus");
            return (Criteria) this;
        }

        public Criteria andFrozenStatusBetween(Integer value1, Integer value2) {
            addCriterion("frozen_status between", value1, value2, "frozenStatus");
            return (Criteria) this;
        }

        public Criteria andFrozenStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("frozen_status not between", value1, value2, "frozenStatus");
            return (Criteria) this;
        }

        public Criteria andCcodeIsNull() {
            addCriterion("cCode is null");
            return (Criteria) this;
        }

        public Criteria andCcodeIsNotNull() {
            addCriterion("cCode is not null");
            return (Criteria) this;
        }

        public Criteria andCcodeEqualTo(String value) {
            addCriterion("cCode =", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeNotEqualTo(String value) {
            addCriterion("cCode <>", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeGreaterThan(String value) {
            addCriterion("cCode >", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeGreaterThanOrEqualTo(String value) {
            addCriterion("cCode >=", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeLessThan(String value) {
            addCriterion("cCode <", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeLessThanOrEqualTo(String value) {
            addCriterion("cCode <=", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeLike(String value) {
            addCriterion("cCode like", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeNotLike(String value) {
            addCriterion("cCode not like", value, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeIn(List<String> values) {
            addCriterion("cCode in", values, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeNotIn(List<String> values) {
            addCriterion("cCode not in", values, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeBetween(String value1, String value2) {
            addCriterion("cCode between", value1, value2, "ccode");
            return (Criteria) this;
        }

        public Criteria andCcodeNotBetween(String value1, String value2) {
            addCriterion("cCode not between", value1, value2, "ccode");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNull() {
            addCriterion("version_no is null");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNotNull() {
            addCriterion("version_no is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualTo(String value) {
            addCriterion("version_no =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(String value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(String value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(String value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(String value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(String value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLike(String value) {
            addCriterion("version_no like", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotLike(String value) {
            addCriterion("version_no not like", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoIn(List<String> values) {
            addCriterion("version_no in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<String> values) {
            addCriterion("version_no not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(String value1, String value2) {
            addCriterion("version_no between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(String value1, String value2) {
            addCriterion("version_no not between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeIsNull() {
            addCriterion("cInvAddCode is null");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeIsNotNull() {
            addCriterion("cInvAddCode is not null");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeEqualTo(String value) {
            addCriterion("cInvAddCode =", value, "cinvaddcode");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeNotEqualTo(String value) {
            addCriterion("cInvAddCode <>", value, "cinvaddcode");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeGreaterThan(String value) {
            addCriterion("cInvAddCode >", value, "cinvaddcode");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeGreaterThanOrEqualTo(String value) {
            addCriterion("cInvAddCode >=", value, "cinvaddcode");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeLessThan(String value) {
            addCriterion("cInvAddCode <", value, "cinvaddcode");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeLessThanOrEqualTo(String value) {
            addCriterion("cInvAddCode <=", value, "cinvaddcode");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeLike(String value) {
            addCriterion("cInvAddCode like", value, "cinvaddcode");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeNotLike(String value) {
            addCriterion("cInvAddCode not like", value, "cinvaddcode");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeIn(List<String> values) {
            addCriterion("cInvAddCode in", values, "cinvaddcode");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeNotIn(List<String> values) {
            addCriterion("cInvAddCode not in", values, "cinvaddcode");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeBetween(String value1, String value2) {
            addCriterion("cInvAddCode between", value1, value2, "cinvaddcode");
            return (Criteria) this;
        }

        public Criteria andCinvaddcodeNotBetween(String value1, String value2) {
            addCriterion("cInvAddCode not between", value1, value2, "cinvaddcode");
            return (Criteria) this;
        }

        public Criteria andIpodidIsNull() {
            addCriterion("iPodId is null");
            return (Criteria) this;
        }

        public Criteria andIpodidIsNotNull() {
            addCriterion("iPodId is not null");
            return (Criteria) this;
        }

        public Criteria andIpodidEqualTo(Integer value) {
            addCriterion("iPodId =", value, "ipodid");
            return (Criteria) this;
        }

        public Criteria andIpodidNotEqualTo(Integer value) {
            addCriterion("iPodId <>", value, "ipodid");
            return (Criteria) this;
        }

        public Criteria andIpodidGreaterThan(Integer value) {
            addCriterion("iPodId >", value, "ipodid");
            return (Criteria) this;
        }

        public Criteria andIpodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iPodId >=", value, "ipodid");
            return (Criteria) this;
        }

        public Criteria andIpodidLessThan(Integer value) {
            addCriterion("iPodId <", value, "ipodid");
            return (Criteria) this;
        }

        public Criteria andIpodidLessThanOrEqualTo(Integer value) {
            addCriterion("iPodId <=", value, "ipodid");
            return (Criteria) this;
        }

        public Criteria andIpodidIn(List<Integer> values) {
            addCriterion("iPodId in", values, "ipodid");
            return (Criteria) this;
        }

        public Criteria andIpodidNotIn(List<Integer> values) {
            addCriterion("iPodId not in", values, "ipodid");
            return (Criteria) this;
        }

        public Criteria andIpodidBetween(Integer value1, Integer value2) {
            addCriterion("iPodId between", value1, value2, "ipodid");
            return (Criteria) this;
        }

        public Criteria andIpodidNotBetween(Integer value1, Integer value2) {
            addCriterion("iPodId not between", value1, value2, "ipodid");
            return (Criteria) this;
        }

        public Criteria andIrownoIsNull() {
            addCriterion("iRowNo is null");
            return (Criteria) this;
        }

        public Criteria andIrownoIsNotNull() {
            addCriterion("iRowNo is not null");
            return (Criteria) this;
        }

        public Criteria andIrownoEqualTo(Integer value) {
            addCriterion("iRowNo =", value, "irowno");
            return (Criteria) this;
        }

        public Criteria andIrownoNotEqualTo(Integer value) {
            addCriterion("iRowNo <>", value, "irowno");
            return (Criteria) this;
        }

        public Criteria andIrownoGreaterThan(Integer value) {
            addCriterion("iRowNo >", value, "irowno");
            return (Criteria) this;
        }

        public Criteria andIrownoGreaterThanOrEqualTo(Integer value) {
            addCriterion("iRowNo >=", value, "irowno");
            return (Criteria) this;
        }

        public Criteria andIrownoLessThan(Integer value) {
            addCriterion("iRowNo <", value, "irowno");
            return (Criteria) this;
        }

        public Criteria andIrownoLessThanOrEqualTo(Integer value) {
            addCriterion("iRowNo <=", value, "irowno");
            return (Criteria) this;
        }

        public Criteria andIrownoIn(List<Integer> values) {
            addCriterion("iRowNo in", values, "irowno");
            return (Criteria) this;
        }

        public Criteria andIrownoNotIn(List<Integer> values) {
            addCriterion("iRowNo not in", values, "irowno");
            return (Criteria) this;
        }

        public Criteria andIrownoBetween(Integer value1, Integer value2) {
            addCriterion("iRowNo between", value1, value2, "irowno");
            return (Criteria) this;
        }

        public Criteria andIrownoNotBetween(Integer value1, Integer value2) {
            addCriterion("iRowNo not between", value1, value2, "irowno");
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