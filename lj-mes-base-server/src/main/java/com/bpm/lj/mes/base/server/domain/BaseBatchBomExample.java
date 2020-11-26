package com.bpm.lj.mes.base.server.domain;

import java.util.ArrayList;
import java.util.List;

public class BaseBatchBomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseBatchBomExample() {
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

        public Criteria andBomIdIsNull() {
            addCriterion("bom_id is null");
            return (Criteria) this;
        }

        public Criteria andBomIdIsNotNull() {
            addCriterion("bom_id is not null");
            return (Criteria) this;
        }

        public Criteria andBomIdEqualTo(String value) {
            addCriterion("bom_id =", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotEqualTo(String value) {
            addCriterion("bom_id <>", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdGreaterThan(String value) {
            addCriterion("bom_id >", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdGreaterThanOrEqualTo(String value) {
            addCriterion("bom_id >=", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdLessThan(String value) {
            addCriterion("bom_id <", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdLessThanOrEqualTo(String value) {
            addCriterion("bom_id <=", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdLike(String value) {
            addCriterion("bom_id like", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotLike(String value) {
            addCriterion("bom_id not like", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdIn(List<String> values) {
            addCriterion("bom_id in", values, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotIn(List<String> values) {
            addCriterion("bom_id not in", values, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdBetween(String value1, String value2) {
            addCriterion("bom_id between", value1, value2, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotBetween(String value1, String value2) {
            addCriterion("bom_id not between", value1, value2, "bomId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
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

        public Criteria andCustomize1IsNull() {
            addCriterion("customize1 is null");
            return (Criteria) this;
        }

        public Criteria andCustomize1IsNotNull() {
            addCriterion("customize1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomize1EqualTo(String value) {
            addCriterion("customize1 =", value, "customize1");
            return (Criteria) this;
        }

        public Criteria andCustomize1NotEqualTo(String value) {
            addCriterion("customize1 <>", value, "customize1");
            return (Criteria) this;
        }

        public Criteria andCustomize1GreaterThan(String value) {
            addCriterion("customize1 >", value, "customize1");
            return (Criteria) this;
        }

        public Criteria andCustomize1GreaterThanOrEqualTo(String value) {
            addCriterion("customize1 >=", value, "customize1");
            return (Criteria) this;
        }

        public Criteria andCustomize1LessThan(String value) {
            addCriterion("customize1 <", value, "customize1");
            return (Criteria) this;
        }

        public Criteria andCustomize1LessThanOrEqualTo(String value) {
            addCriterion("customize1 <=", value, "customize1");
            return (Criteria) this;
        }

        public Criteria andCustomize1Like(String value) {
            addCriterion("customize1 like", value, "customize1");
            return (Criteria) this;
        }

        public Criteria andCustomize1NotLike(String value) {
            addCriterion("customize1 not like", value, "customize1");
            return (Criteria) this;
        }

        public Criteria andCustomize1In(List<String> values) {
            addCriterion("customize1 in", values, "customize1");
            return (Criteria) this;
        }

        public Criteria andCustomize1NotIn(List<String> values) {
            addCriterion("customize1 not in", values, "customize1");
            return (Criteria) this;
        }

        public Criteria andCustomize1Between(String value1, String value2) {
            addCriterion("customize1 between", value1, value2, "customize1");
            return (Criteria) this;
        }

        public Criteria andCustomize1NotBetween(String value1, String value2) {
            addCriterion("customize1 not between", value1, value2, "customize1");
            return (Criteria) this;
        }

        public Criteria andCustomize2IsNull() {
            addCriterion("customize2 is null");
            return (Criteria) this;
        }

        public Criteria andCustomize2IsNotNull() {
            addCriterion("customize2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomize2EqualTo(String value) {
            addCriterion("customize2 =", value, "customize2");
            return (Criteria) this;
        }

        public Criteria andCustomize2NotEqualTo(String value) {
            addCriterion("customize2 <>", value, "customize2");
            return (Criteria) this;
        }

        public Criteria andCustomize2GreaterThan(String value) {
            addCriterion("customize2 >", value, "customize2");
            return (Criteria) this;
        }

        public Criteria andCustomize2GreaterThanOrEqualTo(String value) {
            addCriterion("customize2 >=", value, "customize2");
            return (Criteria) this;
        }

        public Criteria andCustomize2LessThan(String value) {
            addCriterion("customize2 <", value, "customize2");
            return (Criteria) this;
        }

        public Criteria andCustomize2LessThanOrEqualTo(String value) {
            addCriterion("customize2 <=", value, "customize2");
            return (Criteria) this;
        }

        public Criteria andCustomize2Like(String value) {
            addCriterion("customize2 like", value, "customize2");
            return (Criteria) this;
        }

        public Criteria andCustomize2NotLike(String value) {
            addCriterion("customize2 not like", value, "customize2");
            return (Criteria) this;
        }

        public Criteria andCustomize2In(List<String> values) {
            addCriterion("customize2 in", values, "customize2");
            return (Criteria) this;
        }

        public Criteria andCustomize2NotIn(List<String> values) {
            addCriterion("customize2 not in", values, "customize2");
            return (Criteria) this;
        }

        public Criteria andCustomize2Between(String value1, String value2) {
            addCriterion("customize2 between", value1, value2, "customize2");
            return (Criteria) this;
        }

        public Criteria andCustomize2NotBetween(String value1, String value2) {
            addCriterion("customize2 not between", value1, value2, "customize2");
            return (Criteria) this;
        }

        public Criteria andCustomize3IsNull() {
            addCriterion("customize3 is null");
            return (Criteria) this;
        }

        public Criteria andCustomize3IsNotNull() {
            addCriterion("customize3 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomize3EqualTo(String value) {
            addCriterion("customize3 =", value, "customize3");
            return (Criteria) this;
        }

        public Criteria andCustomize3NotEqualTo(String value) {
            addCriterion("customize3 <>", value, "customize3");
            return (Criteria) this;
        }

        public Criteria andCustomize3GreaterThan(String value) {
            addCriterion("customize3 >", value, "customize3");
            return (Criteria) this;
        }

        public Criteria andCustomize3GreaterThanOrEqualTo(String value) {
            addCriterion("customize3 >=", value, "customize3");
            return (Criteria) this;
        }

        public Criteria andCustomize3LessThan(String value) {
            addCriterion("customize3 <", value, "customize3");
            return (Criteria) this;
        }

        public Criteria andCustomize3LessThanOrEqualTo(String value) {
            addCriterion("customize3 <=", value, "customize3");
            return (Criteria) this;
        }

        public Criteria andCustomize3Like(String value) {
            addCriterion("customize3 like", value, "customize3");
            return (Criteria) this;
        }

        public Criteria andCustomize3NotLike(String value) {
            addCriterion("customize3 not like", value, "customize3");
            return (Criteria) this;
        }

        public Criteria andCustomize3In(List<String> values) {
            addCriterion("customize3 in", values, "customize3");
            return (Criteria) this;
        }

        public Criteria andCustomize3NotIn(List<String> values) {
            addCriterion("customize3 not in", values, "customize3");
            return (Criteria) this;
        }

        public Criteria andCustomize3Between(String value1, String value2) {
            addCriterion("customize3 between", value1, value2, "customize3");
            return (Criteria) this;
        }

        public Criteria andCustomize3NotBetween(String value1, String value2) {
            addCriterion("customize3 not between", value1, value2, "customize3");
            return (Criteria) this;
        }

        public Criteria andCustomize4IsNull() {
            addCriterion("customize4 is null");
            return (Criteria) this;
        }

        public Criteria andCustomize4IsNotNull() {
            addCriterion("customize4 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomize4EqualTo(String value) {
            addCriterion("customize4 =", value, "customize4");
            return (Criteria) this;
        }

        public Criteria andCustomize4NotEqualTo(String value) {
            addCriterion("customize4 <>", value, "customize4");
            return (Criteria) this;
        }

        public Criteria andCustomize4GreaterThan(String value) {
            addCriterion("customize4 >", value, "customize4");
            return (Criteria) this;
        }

        public Criteria andCustomize4GreaterThanOrEqualTo(String value) {
            addCriterion("customize4 >=", value, "customize4");
            return (Criteria) this;
        }

        public Criteria andCustomize4LessThan(String value) {
            addCriterion("customize4 <", value, "customize4");
            return (Criteria) this;
        }

        public Criteria andCustomize4LessThanOrEqualTo(String value) {
            addCriterion("customize4 <=", value, "customize4");
            return (Criteria) this;
        }

        public Criteria andCustomize4Like(String value) {
            addCriterion("customize4 like", value, "customize4");
            return (Criteria) this;
        }

        public Criteria andCustomize4NotLike(String value) {
            addCriterion("customize4 not like", value, "customize4");
            return (Criteria) this;
        }

        public Criteria andCustomize4In(List<String> values) {
            addCriterion("customize4 in", values, "customize4");
            return (Criteria) this;
        }

        public Criteria andCustomize4NotIn(List<String> values) {
            addCriterion("customize4 not in", values, "customize4");
            return (Criteria) this;
        }

        public Criteria andCustomize4Between(String value1, String value2) {
            addCriterion("customize4 between", value1, value2, "customize4");
            return (Criteria) this;
        }

        public Criteria andCustomize4NotBetween(String value1, String value2) {
            addCriterion("customize4 not between", value1, value2, "customize4");
            return (Criteria) this;
        }

        public Criteria andCustomize5IsNull() {
            addCriterion("customize5 is null");
            return (Criteria) this;
        }

        public Criteria andCustomize5IsNotNull() {
            addCriterion("customize5 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomize5EqualTo(Integer value) {
            addCriterion("customize5 =", value, "customize5");
            return (Criteria) this;
        }

        public Criteria andCustomize5NotEqualTo(Integer value) {
            addCriterion("customize5 <>", value, "customize5");
            return (Criteria) this;
        }

        public Criteria andCustomize5GreaterThan(Integer value) {
            addCriterion("customize5 >", value, "customize5");
            return (Criteria) this;
        }

        public Criteria andCustomize5GreaterThanOrEqualTo(Integer value) {
            addCriterion("customize5 >=", value, "customize5");
            return (Criteria) this;
        }

        public Criteria andCustomize5LessThan(Integer value) {
            addCriterion("customize5 <", value, "customize5");
            return (Criteria) this;
        }

        public Criteria andCustomize5LessThanOrEqualTo(Integer value) {
            addCriterion("customize5 <=", value, "customize5");
            return (Criteria) this;
        }

        public Criteria andCustomize5In(List<Integer> values) {
            addCriterion("customize5 in", values, "customize5");
            return (Criteria) this;
        }

        public Criteria andCustomize5NotIn(List<Integer> values) {
            addCriterion("customize5 not in", values, "customize5");
            return (Criteria) this;
        }

        public Criteria andCustomize5Between(Integer value1, Integer value2) {
            addCriterion("customize5 between", value1, value2, "customize5");
            return (Criteria) this;
        }

        public Criteria andCustomize5NotBetween(Integer value1, Integer value2) {
            addCriterion("customize5 not between", value1, value2, "customize5");
            return (Criteria) this;
        }

        public Criteria andCustomize6IsNull() {
            addCriterion("customize6 is null");
            return (Criteria) this;
        }

        public Criteria andCustomize6IsNotNull() {
            addCriterion("customize6 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomize6EqualTo(Integer value) {
            addCriterion("customize6 =", value, "customize6");
            return (Criteria) this;
        }

        public Criteria andCustomize6NotEqualTo(Integer value) {
            addCriterion("customize6 <>", value, "customize6");
            return (Criteria) this;
        }

        public Criteria andCustomize6GreaterThan(Integer value) {
            addCriterion("customize6 >", value, "customize6");
            return (Criteria) this;
        }

        public Criteria andCustomize6GreaterThanOrEqualTo(Integer value) {
            addCriterion("customize6 >=", value, "customize6");
            return (Criteria) this;
        }

        public Criteria andCustomize6LessThan(Integer value) {
            addCriterion("customize6 <", value, "customize6");
            return (Criteria) this;
        }

        public Criteria andCustomize6LessThanOrEqualTo(Integer value) {
            addCriterion("customize6 <=", value, "customize6");
            return (Criteria) this;
        }

        public Criteria andCustomize6In(List<Integer> values) {
            addCriterion("customize6 in", values, "customize6");
            return (Criteria) this;
        }

        public Criteria andCustomize6NotIn(List<Integer> values) {
            addCriterion("customize6 not in", values, "customize6");
            return (Criteria) this;
        }

        public Criteria andCustomize6Between(Integer value1, Integer value2) {
            addCriterion("customize6 between", value1, value2, "customize6");
            return (Criteria) this;
        }

        public Criteria andCustomize6NotBetween(Integer value1, Integer value2) {
            addCriterion("customize6 not between", value1, value2, "customize6");
            return (Criteria) this;
        }

        public Criteria andCustomize7IsNull() {
            addCriterion("customize7 is null");
            return (Criteria) this;
        }

        public Criteria andCustomize7IsNotNull() {
            addCriterion("customize7 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomize7EqualTo(Integer value) {
            addCriterion("customize7 =", value, "customize7");
            return (Criteria) this;
        }

        public Criteria andCustomize7NotEqualTo(Integer value) {
            addCriterion("customize7 <>", value, "customize7");
            return (Criteria) this;
        }

        public Criteria andCustomize7GreaterThan(Integer value) {
            addCriterion("customize7 >", value, "customize7");
            return (Criteria) this;
        }

        public Criteria andCustomize7GreaterThanOrEqualTo(Integer value) {
            addCriterion("customize7 >=", value, "customize7");
            return (Criteria) this;
        }

        public Criteria andCustomize7LessThan(Integer value) {
            addCriterion("customize7 <", value, "customize7");
            return (Criteria) this;
        }

        public Criteria andCustomize7LessThanOrEqualTo(Integer value) {
            addCriterion("customize7 <=", value, "customize7");
            return (Criteria) this;
        }

        public Criteria andCustomize7In(List<Integer> values) {
            addCriterion("customize7 in", values, "customize7");
            return (Criteria) this;
        }

        public Criteria andCustomize7NotIn(List<Integer> values) {
            addCriterion("customize7 not in", values, "customize7");
            return (Criteria) this;
        }

        public Criteria andCustomize7Between(Integer value1, Integer value2) {
            addCriterion("customize7 between", value1, value2, "customize7");
            return (Criteria) this;
        }

        public Criteria andCustomize7NotBetween(Integer value1, Integer value2) {
            addCriterion("customize7 not between", value1, value2, "customize7");
            return (Criteria) this;
        }

        public Criteria andCustomize8IsNull() {
            addCriterion("customize8 is null");
            return (Criteria) this;
        }

        public Criteria andCustomize8IsNotNull() {
            addCriterion("customize8 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomize8EqualTo(Integer value) {
            addCriterion("customize8 =", value, "customize8");
            return (Criteria) this;
        }

        public Criteria andCustomize8NotEqualTo(Integer value) {
            addCriterion("customize8 <>", value, "customize8");
            return (Criteria) this;
        }

        public Criteria andCustomize8GreaterThan(Integer value) {
            addCriterion("customize8 >", value, "customize8");
            return (Criteria) this;
        }

        public Criteria andCustomize8GreaterThanOrEqualTo(Integer value) {
            addCriterion("customize8 >=", value, "customize8");
            return (Criteria) this;
        }

        public Criteria andCustomize8LessThan(Integer value) {
            addCriterion("customize8 <", value, "customize8");
            return (Criteria) this;
        }

        public Criteria andCustomize8LessThanOrEqualTo(Integer value) {
            addCriterion("customize8 <=", value, "customize8");
            return (Criteria) this;
        }

        public Criteria andCustomize8In(List<Integer> values) {
            addCriterion("customize8 in", values, "customize8");
            return (Criteria) this;
        }

        public Criteria andCustomize8NotIn(List<Integer> values) {
            addCriterion("customize8 not in", values, "customize8");
            return (Criteria) this;
        }

        public Criteria andCustomize8Between(Integer value1, Integer value2) {
            addCriterion("customize8 between", value1, value2, "customize8");
            return (Criteria) this;
        }

        public Criteria andCustomize8NotBetween(Integer value1, Integer value2) {
            addCriterion("customize8 not between", value1, value2, "customize8");
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