package com.bpm.lj.mes.base.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseUnusualStorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseUnusualStorageExample() {
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

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andReceiptDateIsNull() {
            addCriterion("receipt_date is null");
            return (Criteria) this;
        }

        public Criteria andReceiptDateIsNotNull() {
            addCriterion("receipt_date is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptDateEqualTo(Date value) {
            addCriterion("receipt_date =", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateNotEqualTo(Date value) {
            addCriterion("receipt_date <>", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateGreaterThan(Date value) {
            addCriterion("receipt_date >", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateGreaterThanOrEqualTo(Date value) {
            addCriterion("receipt_date >=", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateLessThan(Date value) {
            addCriterion("receipt_date <", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateLessThanOrEqualTo(Date value) {
            addCriterion("receipt_date <=", value, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateIn(List<Date> values) {
            addCriterion("receipt_date in", values, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateNotIn(List<Date> values) {
            addCriterion("receipt_date not in", values, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateBetween(Date value1, Date value2) {
            addCriterion("receipt_date between", value1, value2, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andReceiptDateNotBetween(Date value1, Date value2) {
            addCriterion("receipt_date not between", value1, value2, "receiptDate");
            return (Criteria) this;
        }

        public Criteria andStockNoIsNull() {
            addCriterion("stock_no is null");
            return (Criteria) this;
        }

        public Criteria andStockNoIsNotNull() {
            addCriterion("stock_no is not null");
            return (Criteria) this;
        }

        public Criteria andStockNoEqualTo(String value) {
            addCriterion("stock_no =", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoNotEqualTo(String value) {
            addCriterion("stock_no <>", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoGreaterThan(String value) {
            addCriterion("stock_no >", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoGreaterThanOrEqualTo(String value) {
            addCriterion("stock_no >=", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoLessThan(String value) {
            addCriterion("stock_no <", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoLessThanOrEqualTo(String value) {
            addCriterion("stock_no <=", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoLike(String value) {
            addCriterion("stock_no like", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoNotLike(String value) {
            addCriterion("stock_no not like", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoIn(List<String> values) {
            addCriterion("stock_no in", values, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoNotIn(List<String> values) {
            addCriterion("stock_no not in", values, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoBetween(String value1, String value2) {
            addCriterion("stock_no between", value1, value2, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoNotBetween(String value1, String value2) {
            addCriterion("stock_no not between", value1, value2, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("stock_name is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("stock_name =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("stock_name <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("stock_name >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_name >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("stock_name <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("stock_name <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("stock_name like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("stock_name not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("stock_name in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("stock_name not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("stock_name between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("stock_name not between", value1, value2, "stockName");
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

        public Criteria andCountNumIsNull() {
            addCriterion("count_num is null");
            return (Criteria) this;
        }

        public Criteria andCountNumIsNotNull() {
            addCriterion("count_num is not null");
            return (Criteria) this;
        }

        public Criteria andCountNumEqualTo(BigDecimal value) {
            addCriterion("count_num =", value, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumNotEqualTo(BigDecimal value) {
            addCriterion("count_num <>", value, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumGreaterThan(BigDecimal value) {
            addCriterion("count_num >", value, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_num >=", value, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumLessThan(BigDecimal value) {
            addCriterion("count_num <", value, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_num <=", value, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumIn(List<BigDecimal> values) {
            addCriterion("count_num in", values, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumNotIn(List<BigDecimal> values) {
            addCriterion("count_num not in", values, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_num between", value1, value2, "countNum");
            return (Criteria) this;
        }

        public Criteria andCountNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_num not between", value1, value2, "countNum");
            return (Criteria) this;
        }

        public Criteria andCheckOnumIsNull() {
            addCriterion("check_onum is null");
            return (Criteria) this;
        }

        public Criteria andCheckOnumIsNotNull() {
            addCriterion("check_onum is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOnumEqualTo(BigDecimal value) {
            addCriterion("check_onum =", value, "checkOnum");
            return (Criteria) this;
        }

        public Criteria andCheckOnumNotEqualTo(BigDecimal value) {
            addCriterion("check_onum <>", value, "checkOnum");
            return (Criteria) this;
        }

        public Criteria andCheckOnumGreaterThan(BigDecimal value) {
            addCriterion("check_onum >", value, "checkOnum");
            return (Criteria) this;
        }

        public Criteria andCheckOnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("check_onum >=", value, "checkOnum");
            return (Criteria) this;
        }

        public Criteria andCheckOnumLessThan(BigDecimal value) {
            addCriterion("check_onum <", value, "checkOnum");
            return (Criteria) this;
        }

        public Criteria andCheckOnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("check_onum <=", value, "checkOnum");
            return (Criteria) this;
        }

        public Criteria andCheckOnumIn(List<BigDecimal> values) {
            addCriterion("check_onum in", values, "checkOnum");
            return (Criteria) this;
        }

        public Criteria andCheckOnumNotIn(List<BigDecimal> values) {
            addCriterion("check_onum not in", values, "checkOnum");
            return (Criteria) this;
        }

        public Criteria andCheckOnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("check_onum between", value1, value2, "checkOnum");
            return (Criteria) this;
        }

        public Criteria andCheckOnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("check_onum not between", value1, value2, "checkOnum");
            return (Criteria) this;
        }

        public Criteria andUnCodeIsNull() {
            addCriterion("un_code is null");
            return (Criteria) this;
        }

        public Criteria andUnCodeIsNotNull() {
            addCriterion("un_code is not null");
            return (Criteria) this;
        }

        public Criteria andUnCodeEqualTo(String value) {
            addCriterion("un_code =", value, "unCode");
            return (Criteria) this;
        }

        public Criteria andUnCodeNotEqualTo(String value) {
            addCriterion("un_code <>", value, "unCode");
            return (Criteria) this;
        }

        public Criteria andUnCodeGreaterThan(String value) {
            addCriterion("un_code >", value, "unCode");
            return (Criteria) this;
        }

        public Criteria andUnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("un_code >=", value, "unCode");
            return (Criteria) this;
        }

        public Criteria andUnCodeLessThan(String value) {
            addCriterion("un_code <", value, "unCode");
            return (Criteria) this;
        }

        public Criteria andUnCodeLessThanOrEqualTo(String value) {
            addCriterion("un_code <=", value, "unCode");
            return (Criteria) this;
        }

        public Criteria andUnCodeLike(String value) {
            addCriterion("un_code like", value, "unCode");
            return (Criteria) this;
        }

        public Criteria andUnCodeNotLike(String value) {
            addCriterion("un_code not like", value, "unCode");
            return (Criteria) this;
        }

        public Criteria andUnCodeIn(List<String> values) {
            addCriterion("un_code in", values, "unCode");
            return (Criteria) this;
        }

        public Criteria andUnCodeNotIn(List<String> values) {
            addCriterion("un_code not in", values, "unCode");
            return (Criteria) this;
        }

        public Criteria andUnCodeBetween(String value1, String value2) {
            addCriterion("un_code between", value1, value2, "unCode");
            return (Criteria) this;
        }

        public Criteria andUnCodeNotBetween(String value1, String value2) {
            addCriterion("un_code not between", value1, value2, "unCode");
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

        public Criteria andPersonLiableIsNull() {
            addCriterion("person_liable is null");
            return (Criteria) this;
        }

        public Criteria andPersonLiableIsNotNull() {
            addCriterion("person_liable is not null");
            return (Criteria) this;
        }

        public Criteria andPersonLiableEqualTo(Integer value) {
            addCriterion("person_liable =", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableNotEqualTo(Integer value) {
            addCriterion("person_liable <>", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableGreaterThan(Integer value) {
            addCriterion("person_liable >", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_liable >=", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableLessThan(Integer value) {
            addCriterion("person_liable <", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableLessThanOrEqualTo(Integer value) {
            addCriterion("person_liable <=", value, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableIn(List<Integer> values) {
            addCriterion("person_liable in", values, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableNotIn(List<Integer> values) {
            addCriterion("person_liable not in", values, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableBetween(Integer value1, Integer value2) {
            addCriterion("person_liable between", value1, value2, "personLiable");
            return (Criteria) this;
        }

        public Criteria andPersonLiableNotBetween(Integer value1, Integer value2) {
            addCriterion("person_liable not between", value1, value2, "personLiable");
            return (Criteria) this;
        }

        public Criteria andExceptionDateIsNull() {
            addCriterion("exception_date is null");
            return (Criteria) this;
        }

        public Criteria andExceptionDateIsNotNull() {
            addCriterion("exception_date is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionDateEqualTo(Date value) {
            addCriterion("exception_date =", value, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateNotEqualTo(Date value) {
            addCriterion("exception_date <>", value, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateGreaterThan(Date value) {
            addCriterion("exception_date >", value, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("exception_date >=", value, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateLessThan(Date value) {
            addCriterion("exception_date <", value, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateLessThanOrEqualTo(Date value) {
            addCriterion("exception_date <=", value, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateIn(List<Date> values) {
            addCriterion("exception_date in", values, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateNotIn(List<Date> values) {
            addCriterion("exception_date not in", values, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateBetween(Date value1, Date value2) {
            addCriterion("exception_date between", value1, value2, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionDateNotBetween(Date value1, Date value2) {
            addCriterion("exception_date not between", value1, value2, "exceptionDate");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksIsNull() {
            addCriterion("exception_remarks is null");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksIsNotNull() {
            addCriterion("exception_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksEqualTo(String value) {
            addCriterion("exception_remarks =", value, "exceptionRemarks");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksNotEqualTo(String value) {
            addCriterion("exception_remarks <>", value, "exceptionRemarks");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksGreaterThan(String value) {
            addCriterion("exception_remarks >", value, "exceptionRemarks");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("exception_remarks >=", value, "exceptionRemarks");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksLessThan(String value) {
            addCriterion("exception_remarks <", value, "exceptionRemarks");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksLessThanOrEqualTo(String value) {
            addCriterion("exception_remarks <=", value, "exceptionRemarks");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksLike(String value) {
            addCriterion("exception_remarks like", value, "exceptionRemarks");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksNotLike(String value) {
            addCriterion("exception_remarks not like", value, "exceptionRemarks");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksIn(List<String> values) {
            addCriterion("exception_remarks in", values, "exceptionRemarks");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksNotIn(List<String> values) {
            addCriterion("exception_remarks not in", values, "exceptionRemarks");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksBetween(String value1, String value2) {
            addCriterion("exception_remarks between", value1, value2, "exceptionRemarks");
            return (Criteria) this;
        }

        public Criteria andExceptionRemarksNotBetween(String value1, String value2) {
            addCriterion("exception_remarks not between", value1, value2, "exceptionRemarks");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeIsNull() {
            addCriterion("exception_type is null");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeIsNotNull() {
            addCriterion("exception_type is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeEqualTo(String value) {
            addCriterion("exception_type =", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNotEqualTo(String value) {
            addCriterion("exception_type <>", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeGreaterThan(String value) {
            addCriterion("exception_type >", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("exception_type >=", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeLessThan(String value) {
            addCriterion("exception_type <", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeLessThanOrEqualTo(String value) {
            addCriterion("exception_type <=", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeLike(String value) {
            addCriterion("exception_type like", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNotLike(String value) {
            addCriterion("exception_type not like", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeIn(List<String> values) {
            addCriterion("exception_type in", values, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNotIn(List<String> values) {
            addCriterion("exception_type not in", values, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeBetween(String value1, String value2) {
            addCriterion("exception_type between", value1, value2, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNotBetween(String value1, String value2) {
            addCriterion("exception_type not between", value1, value2, "exceptionType");
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

        public Criteria andAbnormalNumIsNull() {
            addCriterion("abnormal_num is null");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumIsNotNull() {
            addCriterion("abnormal_num is not null");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumEqualTo(Integer value) {
            addCriterion("abnormal_num =", value, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumNotEqualTo(Integer value) {
            addCriterion("abnormal_num <>", value, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumGreaterThan(Integer value) {
            addCriterion("abnormal_num >", value, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("abnormal_num >=", value, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumLessThan(Integer value) {
            addCriterion("abnormal_num <", value, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumLessThanOrEqualTo(Integer value) {
            addCriterion("abnormal_num <=", value, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumIn(List<Integer> values) {
            addCriterion("abnormal_num in", values, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumNotIn(List<Integer> values) {
            addCriterion("abnormal_num not in", values, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumBetween(Integer value1, Integer value2) {
            addCriterion("abnormal_num between", value1, value2, "abnormalNum");
            return (Criteria) this;
        }

        public Criteria andAbnormalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("abnormal_num not between", value1, value2, "abnormalNum");
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

        public Criteria andRegisterNumIsNull() {
            addCriterion("register_num is null");
            return (Criteria) this;
        }

        public Criteria andRegisterNumIsNotNull() {
            addCriterion("register_num is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterNumEqualTo(Integer value) {
            addCriterion("register_num =", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumNotEqualTo(Integer value) {
            addCriterion("register_num <>", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumGreaterThan(Integer value) {
            addCriterion("register_num >", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_num >=", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumLessThan(Integer value) {
            addCriterion("register_num <", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumLessThanOrEqualTo(Integer value) {
            addCriterion("register_num <=", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumIn(List<Integer> values) {
            addCriterion("register_num in", values, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumNotIn(List<Integer> values) {
            addCriterion("register_num not in", values, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumBetween(Integer value1, Integer value2) {
            addCriterion("register_num between", value1, value2, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumNotBetween(Integer value1, Integer value2) {
            addCriterion("register_num not between", value1, value2, "registerNum");
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