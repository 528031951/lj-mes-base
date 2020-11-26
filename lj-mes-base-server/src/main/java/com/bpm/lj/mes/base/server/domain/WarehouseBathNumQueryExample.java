package com.bpm.lj.mes.base.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseBathNumQueryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseBathNumQueryExample() {
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

        public Criteria andBillNoIsNull() {
            addCriterion("bill_no is null");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNotNull() {
            addCriterion("bill_no is not null");
            return (Criteria) this;
        }

        public Criteria andBillNoEqualTo(String value) {
            addCriterion("bill_no =", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotEqualTo(String value) {
            addCriterion("bill_no <>", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThan(String value) {
            addCriterion("bill_no >", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("bill_no >=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThan(String value) {
            addCriterion("bill_no <", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThanOrEqualTo(String value) {
            addCriterion("bill_no <=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLike(String value) {
            addCriterion("bill_no like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotLike(String value) {
            addCriterion("bill_no not like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoIn(List<String> values) {
            addCriterion("bill_no in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotIn(List<String> values) {
            addCriterion("bill_no not in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoBetween(String value1, String value2) {
            addCriterion("bill_no between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotBetween(String value1, String value2) {
            addCriterion("bill_no not between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("contract_no is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("contract_no =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("contract_no <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("contract_no >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("contract_no >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("contract_no <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("contract_no <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("contract_no like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("contract_no not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("contract_no in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("contract_no not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("contract_no between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("contract_no not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNull() {
            addCriterion("batch_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(String value) {
            addCriterion("batch_no =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(String value) {
            addCriterion("batch_no <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(String value) {
            addCriterion("batch_no >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_no >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(String value) {
            addCriterion("batch_no <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(String value) {
            addCriterion("batch_no <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLike(String value) {
            addCriterion("batch_no like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotLike(String value) {
            addCriterion("batch_no not like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<String> values) {
            addCriterion("batch_no in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<String> values) {
            addCriterion("batch_no not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(String value1, String value2) {
            addCriterion("batch_no between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(String value1, String value2) {
            addCriterion("batch_no not between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBomNoIsNull() {
            addCriterion("bom_no is null");
            return (Criteria) this;
        }

        public Criteria andBomNoIsNotNull() {
            addCriterion("bom_no is not null");
            return (Criteria) this;
        }

        public Criteria andBomNoEqualTo(String value) {
            addCriterion("bom_no =", value, "bomNo");
            return (Criteria) this;
        }

        public Criteria andBomNoNotEqualTo(String value) {
            addCriterion("bom_no <>", value, "bomNo");
            return (Criteria) this;
        }

        public Criteria andBomNoGreaterThan(String value) {
            addCriterion("bom_no >", value, "bomNo");
            return (Criteria) this;
        }

        public Criteria andBomNoGreaterThanOrEqualTo(String value) {
            addCriterion("bom_no >=", value, "bomNo");
            return (Criteria) this;
        }

        public Criteria andBomNoLessThan(String value) {
            addCriterion("bom_no <", value, "bomNo");
            return (Criteria) this;
        }

        public Criteria andBomNoLessThanOrEqualTo(String value) {
            addCriterion("bom_no <=", value, "bomNo");
            return (Criteria) this;
        }

        public Criteria andBomNoLike(String value) {
            addCriterion("bom_no like", value, "bomNo");
            return (Criteria) this;
        }

        public Criteria andBomNoNotLike(String value) {
            addCriterion("bom_no not like", value, "bomNo");
            return (Criteria) this;
        }

        public Criteria andBomNoIn(List<String> values) {
            addCriterion("bom_no in", values, "bomNo");
            return (Criteria) this;
        }

        public Criteria andBomNoNotIn(List<String> values) {
            addCriterion("bom_no not in", values, "bomNo");
            return (Criteria) this;
        }

        public Criteria andBomNoBetween(String value1, String value2) {
            addCriterion("bom_no between", value1, value2, "bomNo");
            return (Criteria) this;
        }

        public Criteria andBomNoNotBetween(String value1, String value2) {
            addCriterion("bom_no not between", value1, value2, "bomNo");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNull() {
            addCriterion("material_type is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNotNull() {
            addCriterion("material_type is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeEqualTo(String value) {
            addCriterion("material_type =", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotEqualTo(String value) {
            addCriterion("material_type <>", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThan(String value) {
            addCriterion("material_type >", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("material_type >=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThan(String value) {
            addCriterion("material_type <", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThanOrEqualTo(String value) {
            addCriterion("material_type <=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLike(String value) {
            addCriterion("material_type like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotLike(String value) {
            addCriterion("material_type not like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIn(List<String> values) {
            addCriterion("material_type in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotIn(List<String> values) {
            addCriterion("material_type not in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeBetween(String value1, String value2) {
            addCriterion("material_type between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotBetween(String value1, String value2) {
            addCriterion("material_type not between", value1, value2, "materialType");
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

        public Criteria andMaterialModelIsNull() {
            addCriterion("material_model is null");
            return (Criteria) this;
        }

        public Criteria andMaterialModelIsNotNull() {
            addCriterion("material_model is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialModelEqualTo(String value) {
            addCriterion("material_model =", value, "materialModel");
            return (Criteria) this;
        }

        public Criteria andMaterialModelNotEqualTo(String value) {
            addCriterion("material_model <>", value, "materialModel");
            return (Criteria) this;
        }

        public Criteria andMaterialModelGreaterThan(String value) {
            addCriterion("material_model >", value, "materialModel");
            return (Criteria) this;
        }

        public Criteria andMaterialModelGreaterThanOrEqualTo(String value) {
            addCriterion("material_model >=", value, "materialModel");
            return (Criteria) this;
        }

        public Criteria andMaterialModelLessThan(String value) {
            addCriterion("material_model <", value, "materialModel");
            return (Criteria) this;
        }

        public Criteria andMaterialModelLessThanOrEqualTo(String value) {
            addCriterion("material_model <=", value, "materialModel");
            return (Criteria) this;
        }

        public Criteria andMaterialModelLike(String value) {
            addCriterion("material_model like", value, "materialModel");
            return (Criteria) this;
        }

        public Criteria andMaterialModelNotLike(String value) {
            addCriterion("material_model not like", value, "materialModel");
            return (Criteria) this;
        }

        public Criteria andMaterialModelIn(List<String> values) {
            addCriterion("material_model in", values, "materialModel");
            return (Criteria) this;
        }

        public Criteria andMaterialModelNotIn(List<String> values) {
            addCriterion("material_model not in", values, "materialModel");
            return (Criteria) this;
        }

        public Criteria andMaterialModelBetween(String value1, String value2) {
            addCriterion("material_model between", value1, value2, "materialModel");
            return (Criteria) this;
        }

        public Criteria andMaterialModelNotBetween(String value1, String value2) {
            addCriterion("material_model not between", value1, value2, "materialModel");
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

        public Criteria andDemandNoIsNull() {
            addCriterion("demand_no is null");
            return (Criteria) this;
        }

        public Criteria andDemandNoIsNotNull() {
            addCriterion("demand_no is not null");
            return (Criteria) this;
        }

        public Criteria andDemandNoEqualTo(BigDecimal value) {
            addCriterion("demand_no =", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoNotEqualTo(BigDecimal value) {
            addCriterion("demand_no <>", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoGreaterThan(BigDecimal value) {
            addCriterion("demand_no >", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_no >=", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoLessThan(BigDecimal value) {
            addCriterion("demand_no <", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_no <=", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoIn(List<BigDecimal> values) {
            addCriterion("demand_no in", values, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoNotIn(List<BigDecimal> values) {
            addCriterion("demand_no not in", values, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_no between", value1, value2, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_no not between", value1, value2, "demandNo");
            return (Criteria) this;
        }

        public Criteria andInventoryNlockedNumIsNull() {
            addCriterion("inventory_nlocked_num is null");
            return (Criteria) this;
        }

        public Criteria andInventoryNlockedNumIsNotNull() {
            addCriterion("inventory_nlocked_num is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryNlockedNumEqualTo(Integer value) {
            addCriterion("inventory_nlocked_num =", value, "inventoryNlockedNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNlockedNumNotEqualTo(Integer value) {
            addCriterion("inventory_nlocked_num <>", value, "inventoryNlockedNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNlockedNumGreaterThan(Integer value) {
            addCriterion("inventory_nlocked_num >", value, "inventoryNlockedNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNlockedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory_nlocked_num >=", value, "inventoryNlockedNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNlockedNumLessThan(Integer value) {
            addCriterion("inventory_nlocked_num <", value, "inventoryNlockedNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNlockedNumLessThanOrEqualTo(Integer value) {
            addCriterion("inventory_nlocked_num <=", value, "inventoryNlockedNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNlockedNumIn(List<Integer> values) {
            addCriterion("inventory_nlocked_num in", values, "inventoryNlockedNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNlockedNumNotIn(List<Integer> values) {
            addCriterion("inventory_nlocked_num not in", values, "inventoryNlockedNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNlockedNumBetween(Integer value1, Integer value2) {
            addCriterion("inventory_nlocked_num between", value1, value2, "inventoryNlockedNum");
            return (Criteria) this;
        }

        public Criteria andInventoryNlockedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory_nlocked_num not between", value1, value2, "inventoryNlockedNum");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryIsNull() {
            addCriterion("total_inventory is null");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryIsNotNull() {
            addCriterion("total_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryEqualTo(BigDecimal value) {
            addCriterion("total_inventory =", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryNotEqualTo(BigDecimal value) {
            addCriterion("total_inventory <>", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryGreaterThan(BigDecimal value) {
            addCriterion("total_inventory >", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_inventory >=", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryLessThan(BigDecimal value) {
            addCriterion("total_inventory <", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_inventory <=", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryIn(List<BigDecimal> values) {
            addCriterion("total_inventory in", values, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryNotIn(List<BigDecimal> values) {
            addCriterion("total_inventory not in", values, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_inventory between", value1, value2, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_inventory not between", value1, value2, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andMakeNoIsNull() {
            addCriterion("make_no is null");
            return (Criteria) this;
        }

        public Criteria andMakeNoIsNotNull() {
            addCriterion("make_no is not null");
            return (Criteria) this;
        }

        public Criteria andMakeNoEqualTo(BigDecimal value) {
            addCriterion("make_no =", value, "makeNo");
            return (Criteria) this;
        }

        public Criteria andMakeNoNotEqualTo(BigDecimal value) {
            addCriterion("make_no <>", value, "makeNo");
            return (Criteria) this;
        }

        public Criteria andMakeNoGreaterThan(BigDecimal value) {
            addCriterion("make_no >", value, "makeNo");
            return (Criteria) this;
        }

        public Criteria andMakeNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("make_no >=", value, "makeNo");
            return (Criteria) this;
        }

        public Criteria andMakeNoLessThan(BigDecimal value) {
            addCriterion("make_no <", value, "makeNo");
            return (Criteria) this;
        }

        public Criteria andMakeNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("make_no <=", value, "makeNo");
            return (Criteria) this;
        }

        public Criteria andMakeNoIn(List<BigDecimal> values) {
            addCriterion("make_no in", values, "makeNo");
            return (Criteria) this;
        }

        public Criteria andMakeNoNotIn(List<BigDecimal> values) {
            addCriterion("make_no not in", values, "makeNo");
            return (Criteria) this;
        }

        public Criteria andMakeNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("make_no between", value1, value2, "makeNo");
            return (Criteria) this;
        }

        public Criteria andMakeNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("make_no not between", value1, value2, "makeNo");
            return (Criteria) this;
        }

        public Criteria andFictitiousInventoryQuantityIsNull() {
            addCriterion("fictitious_inventory_quantity is null");
            return (Criteria) this;
        }

        public Criteria andFictitiousInventoryQuantityIsNotNull() {
            addCriterion("fictitious_inventory_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andFictitiousInventoryQuantityEqualTo(BigDecimal value) {
            addCriterion("fictitious_inventory_quantity =", value, "fictitiousInventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andFictitiousInventoryQuantityNotEqualTo(BigDecimal value) {
            addCriterion("fictitious_inventory_quantity <>", value, "fictitiousInventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andFictitiousInventoryQuantityGreaterThan(BigDecimal value) {
            addCriterion("fictitious_inventory_quantity >", value, "fictitiousInventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andFictitiousInventoryQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fictitious_inventory_quantity >=", value, "fictitiousInventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andFictitiousInventoryQuantityLessThan(BigDecimal value) {
            addCriterion("fictitious_inventory_quantity <", value, "fictitiousInventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andFictitiousInventoryQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fictitious_inventory_quantity <=", value, "fictitiousInventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andFictitiousInventoryQuantityIn(List<BigDecimal> values) {
            addCriterion("fictitious_inventory_quantity in", values, "fictitiousInventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andFictitiousInventoryQuantityNotIn(List<BigDecimal> values) {
            addCriterion("fictitious_inventory_quantity not in", values, "fictitiousInventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andFictitiousInventoryQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fictitious_inventory_quantity between", value1, value2, "fictitiousInventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andFictitiousInventoryQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fictitious_inventory_quantity not between", value1, value2, "fictitiousInventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andConsignmentStockIsNull() {
            addCriterion("consignment_stock is null");
            return (Criteria) this;
        }

        public Criteria andConsignmentStockIsNotNull() {
            addCriterion("consignment_stock is not null");
            return (Criteria) this;
        }

        public Criteria andConsignmentStockEqualTo(BigDecimal value) {
            addCriterion("consignment_stock =", value, "consignmentStock");
            return (Criteria) this;
        }

        public Criteria andConsignmentStockNotEqualTo(BigDecimal value) {
            addCriterion("consignment_stock <>", value, "consignmentStock");
            return (Criteria) this;
        }

        public Criteria andConsignmentStockGreaterThan(BigDecimal value) {
            addCriterion("consignment_stock >", value, "consignmentStock");
            return (Criteria) this;
        }

        public Criteria andConsignmentStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("consignment_stock >=", value, "consignmentStock");
            return (Criteria) this;
        }

        public Criteria andConsignmentStockLessThan(BigDecimal value) {
            addCriterion("consignment_stock <", value, "consignmentStock");
            return (Criteria) this;
        }

        public Criteria andConsignmentStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("consignment_stock <=", value, "consignmentStock");
            return (Criteria) this;
        }

        public Criteria andConsignmentStockIn(List<BigDecimal> values) {
            addCriterion("consignment_stock in", values, "consignmentStock");
            return (Criteria) this;
        }

        public Criteria andConsignmentStockNotIn(List<BigDecimal> values) {
            addCriterion("consignment_stock not in", values, "consignmentStock");
            return (Criteria) this;
        }

        public Criteria andConsignmentStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consignment_stock between", value1, value2, "consignmentStock");
            return (Criteria) this;
        }

        public Criteria andConsignmentStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consignment_stock not between", value1, value2, "consignmentStock");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDeliveredIsNull() {
            addCriterion("purchase_order_not_delivered is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDeliveredIsNotNull() {
            addCriterion("purchase_order_not_delivered is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDeliveredEqualTo(BigDecimal value) {
            addCriterion("purchase_order_not_delivered =", value, "purchaseOrderNotDelivered");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDeliveredNotEqualTo(BigDecimal value) {
            addCriterion("purchase_order_not_delivered <>", value, "purchaseOrderNotDelivered");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDeliveredGreaterThan(BigDecimal value) {
            addCriterion("purchase_order_not_delivered >", value, "purchaseOrderNotDelivered");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDeliveredGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_order_not_delivered >=", value, "purchaseOrderNotDelivered");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDeliveredLessThan(BigDecimal value) {
            addCriterion("purchase_order_not_delivered <", value, "purchaseOrderNotDelivered");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDeliveredLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_order_not_delivered <=", value, "purchaseOrderNotDelivered");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDeliveredIn(List<BigDecimal> values) {
            addCriterion("purchase_order_not_delivered in", values, "purchaseOrderNotDelivered");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDeliveredNotIn(List<BigDecimal> values) {
            addCriterion("purchase_order_not_delivered not in", values, "purchaseOrderNotDelivered");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDeliveredBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_order_not_delivered between", value1, value2, "purchaseOrderNotDelivered");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDeliveredNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_order_not_delivered not between", value1, value2, "purchaseOrderNotDelivered");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDepositIsNull() {
            addCriterion("purchase_order_not_deposit is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDepositIsNotNull() {
            addCriterion("purchase_order_not_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDepositEqualTo(BigDecimal value) {
            addCriterion("purchase_order_not_deposit =", value, "purchaseOrderNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDepositNotEqualTo(BigDecimal value) {
            addCriterion("purchase_order_not_deposit <>", value, "purchaseOrderNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDepositGreaterThan(BigDecimal value) {
            addCriterion("purchase_order_not_deposit >", value, "purchaseOrderNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_order_not_deposit >=", value, "purchaseOrderNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDepositLessThan(BigDecimal value) {
            addCriterion("purchase_order_not_deposit <", value, "purchaseOrderNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_order_not_deposit <=", value, "purchaseOrderNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDepositIn(List<BigDecimal> values) {
            addCriterion("purchase_order_not_deposit in", values, "purchaseOrderNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDepositNotIn(List<BigDecimal> values) {
            addCriterion("purchase_order_not_deposit not in", values, "purchaseOrderNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_order_not_deposit between", value1, value2, "purchaseOrderNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNotDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_order_not_deposit not between", value1, value2, "purchaseOrderNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotDepositIsNull() {
            addCriterion("purchase_quantity_not_deposit is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotDepositIsNotNull() {
            addCriterion("purchase_quantity_not_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotDepositEqualTo(BigDecimal value) {
            addCriterion("purchase_quantity_not_deposit =", value, "purchaseQuantityNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotDepositNotEqualTo(BigDecimal value) {
            addCriterion("purchase_quantity_not_deposit <>", value, "purchaseQuantityNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotDepositGreaterThan(BigDecimal value) {
            addCriterion("purchase_quantity_not_deposit >", value, "purchaseQuantityNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_quantity_not_deposit >=", value, "purchaseQuantityNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotDepositLessThan(BigDecimal value) {
            addCriterion("purchase_quantity_not_deposit <", value, "purchaseQuantityNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_quantity_not_deposit <=", value, "purchaseQuantityNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotDepositIn(List<BigDecimal> values) {
            addCriterion("purchase_quantity_not_deposit in", values, "purchaseQuantityNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotDepositNotIn(List<BigDecimal> values) {
            addCriterion("purchase_quantity_not_deposit not in", values, "purchaseQuantityNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_quantity_not_deposit between", value1, value2, "purchaseQuantityNotDeposit");
            return (Criteria) this;
        }

        public Criteria andPurchaseQuantityNotDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_quantity_not_deposit not between", value1, value2, "purchaseQuantityNotDeposit");
            return (Criteria) this;
        }

        public Criteria andNPurchaseNumIsNull() {
            addCriterion("n_purchase_num is null");
            return (Criteria) this;
        }

        public Criteria andNPurchaseNumIsNotNull() {
            addCriterion("n_purchase_num is not null");
            return (Criteria) this;
        }

        public Criteria andNPurchaseNumEqualTo(BigDecimal value) {
            addCriterion("n_purchase_num =", value, "nPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andNPurchaseNumNotEqualTo(BigDecimal value) {
            addCriterion("n_purchase_num <>", value, "nPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andNPurchaseNumGreaterThan(BigDecimal value) {
            addCriterion("n_purchase_num >", value, "nPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andNPurchaseNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("n_purchase_num >=", value, "nPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andNPurchaseNumLessThan(BigDecimal value) {
            addCriterion("n_purchase_num <", value, "nPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andNPurchaseNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("n_purchase_num <=", value, "nPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andNPurchaseNumIn(List<BigDecimal> values) {
            addCriterion("n_purchase_num in", values, "nPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andNPurchaseNumNotIn(List<BigDecimal> values) {
            addCriterion("n_purchase_num not in", values, "nPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andNPurchaseNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("n_purchase_num between", value1, value2, "nPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andNPurchaseNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("n_purchase_num not between", value1, value2, "nPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andMiniInventoryNumIsNull() {
            addCriterion("mini_inventory_num is null");
            return (Criteria) this;
        }

        public Criteria andMiniInventoryNumIsNotNull() {
            addCriterion("mini_inventory_num is not null");
            return (Criteria) this;
        }

        public Criteria andMiniInventoryNumEqualTo(BigDecimal value) {
            addCriterion("mini_inventory_num =", value, "miniInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMiniInventoryNumNotEqualTo(BigDecimal value) {
            addCriterion("mini_inventory_num <>", value, "miniInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMiniInventoryNumGreaterThan(BigDecimal value) {
            addCriterion("mini_inventory_num >", value, "miniInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMiniInventoryNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mini_inventory_num >=", value, "miniInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMiniInventoryNumLessThan(BigDecimal value) {
            addCriterion("mini_inventory_num <", value, "miniInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMiniInventoryNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mini_inventory_num <=", value, "miniInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMiniInventoryNumIn(List<BigDecimal> values) {
            addCriterion("mini_inventory_num in", values, "miniInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMiniInventoryNumNotIn(List<BigDecimal> values) {
            addCriterion("mini_inventory_num not in", values, "miniInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMiniInventoryNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mini_inventory_num between", value1, value2, "miniInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMiniInventoryNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mini_inventory_num not between", value1, value2, "miniInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMaxInventoryNumIsNull() {
            addCriterion("max_inventory_num is null");
            return (Criteria) this;
        }

        public Criteria andMaxInventoryNumIsNotNull() {
            addCriterion("max_inventory_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaxInventoryNumEqualTo(BigDecimal value) {
            addCriterion("max_inventory_num =", value, "maxInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMaxInventoryNumNotEqualTo(BigDecimal value) {
            addCriterion("max_inventory_num <>", value, "maxInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMaxInventoryNumGreaterThan(BigDecimal value) {
            addCriterion("max_inventory_num >", value, "maxInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMaxInventoryNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_inventory_num >=", value, "maxInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMaxInventoryNumLessThan(BigDecimal value) {
            addCriterion("max_inventory_num <", value, "maxInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMaxInventoryNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_inventory_num <=", value, "maxInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMaxInventoryNumIn(List<BigDecimal> values) {
            addCriterion("max_inventory_num in", values, "maxInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMaxInventoryNumNotIn(List<BigDecimal> values) {
            addCriterion("max_inventory_num not in", values, "maxInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMaxInventoryNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_inventory_num between", value1, value2, "maxInventoryNum");
            return (Criteria) this;
        }

        public Criteria andMaxInventoryNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_inventory_num not between", value1, value2, "maxInventoryNum");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleIsNull() {
            addCriterion("procurement_cycle is null");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleIsNotNull() {
            addCriterion("procurement_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleEqualTo(String value) {
            addCriterion("procurement_cycle =", value, "procurementCycle");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleNotEqualTo(String value) {
            addCriterion("procurement_cycle <>", value, "procurementCycle");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleGreaterThan(String value) {
            addCriterion("procurement_cycle >", value, "procurementCycle");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleGreaterThanOrEqualTo(String value) {
            addCriterion("procurement_cycle >=", value, "procurementCycle");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleLessThan(String value) {
            addCriterion("procurement_cycle <", value, "procurementCycle");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleLessThanOrEqualTo(String value) {
            addCriterion("procurement_cycle <=", value, "procurementCycle");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleLike(String value) {
            addCriterion("procurement_cycle like", value, "procurementCycle");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleNotLike(String value) {
            addCriterion("procurement_cycle not like", value, "procurementCycle");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleIn(List<String> values) {
            addCriterion("procurement_cycle in", values, "procurementCycle");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleNotIn(List<String> values) {
            addCriterion("procurement_cycle not in", values, "procurementCycle");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleBetween(String value1, String value2) {
            addCriterion("procurement_cycle between", value1, value2, "procurementCycle");
            return (Criteria) this;
        }

        public Criteria andProcurementCycleNotBetween(String value1, String value2) {
            addCriterion("procurement_cycle not between", value1, value2, "procurementCycle");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNull() {
            addCriterion("lock_status is null");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNotNull() {
            addCriterion("lock_status is not null");
            return (Criteria) this;
        }

        public Criteria andLockStatusEqualTo(Integer value) {
            addCriterion("lock_status =", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotEqualTo(Integer value) {
            addCriterion("lock_status <>", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThan(Integer value) {
            addCriterion("lock_status >", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("lock_status >=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThan(Integer value) {
            addCriterion("lock_status <", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThanOrEqualTo(Integer value) {
            addCriterion("lock_status <=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusIn(List<Integer> values) {
            addCriterion("lock_status in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotIn(List<Integer> values) {
            addCriterion("lock_status not in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusBetween(Integer value1, Integer value2) {
            addCriterion("lock_status between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("lock_status not between", value1, value2, "lockStatus");
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

        public Criteria andNlockedNumIsNull() {
            addCriterion("nlocked_num is null");
            return (Criteria) this;
        }

        public Criteria andNlockedNumIsNotNull() {
            addCriterion("nlocked_num is not null");
            return (Criteria) this;
        }

        public Criteria andNlockedNumEqualTo(BigDecimal value) {
            addCriterion("nlocked_num =", value, "nlockedNum");
            return (Criteria) this;
        }

        public Criteria andNlockedNumNotEqualTo(BigDecimal value) {
            addCriterion("nlocked_num <>", value, "nlockedNum");
            return (Criteria) this;
        }

        public Criteria andNlockedNumGreaterThan(BigDecimal value) {
            addCriterion("nlocked_num >", value, "nlockedNum");
            return (Criteria) this;
        }

        public Criteria andNlockedNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nlocked_num >=", value, "nlockedNum");
            return (Criteria) this;
        }

        public Criteria andNlockedNumLessThan(BigDecimal value) {
            addCriterion("nlocked_num <", value, "nlockedNum");
            return (Criteria) this;
        }

        public Criteria andNlockedNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nlocked_num <=", value, "nlockedNum");
            return (Criteria) this;
        }

        public Criteria andNlockedNumIn(List<BigDecimal> values) {
            addCriterion("nlocked_num in", values, "nlockedNum");
            return (Criteria) this;
        }

        public Criteria andNlockedNumNotIn(List<BigDecimal> values) {
            addCriterion("nlocked_num not in", values, "nlockedNum");
            return (Criteria) this;
        }

        public Criteria andNlockedNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nlocked_num between", value1, value2, "nlockedNum");
            return (Criteria) this;
        }

        public Criteria andNlockedNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nlocked_num not between", value1, value2, "nlockedNum");
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