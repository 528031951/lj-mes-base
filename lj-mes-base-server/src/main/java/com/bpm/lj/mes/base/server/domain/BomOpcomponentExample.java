package com.bpm.lj.mes.base.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BomOpcomponentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BomOpcomponentExample() {
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

        public Criteria andAutoidIsNull() {
            addCriterion("AutoId is null");
            return (Criteria) this;
        }

        public Criteria andAutoidIsNotNull() {
            addCriterion("AutoId is not null");
            return (Criteria) this;
        }

        public Criteria andAutoidEqualTo(Integer value) {
            addCriterion("AutoId =", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidNotEqualTo(Integer value) {
            addCriterion("AutoId <>", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidGreaterThan(Integer value) {
            addCriterion("AutoId >", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AutoId >=", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidLessThan(Integer value) {
            addCriterion("AutoId <", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidLessThanOrEqualTo(Integer value) {
            addCriterion("AutoId <=", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidIn(List<Integer> values) {
            addCriterion("AutoId in", values, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidNotIn(List<Integer> values) {
            addCriterion("AutoId not in", values, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidBetween(Integer value1, Integer value2) {
            addCriterion("AutoId between", value1, value2, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidNotBetween(Integer value1, Integer value2) {
            addCriterion("AutoId not between", value1, value2, "autoid");
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

        public Criteria andCaccIdEqualTo(String value) {
            addCriterion("cAcc_Id =", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdNotEqualTo(String value) {
            addCriterion("cAcc_Id <>", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdGreaterThan(String value) {
            addCriterion("cAcc_Id >", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdGreaterThanOrEqualTo(String value) {
            addCriterion("cAcc_Id >=", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdLessThan(String value) {
            addCriterion("cAcc_Id <", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdLessThanOrEqualTo(String value) {
            addCriterion("cAcc_Id <=", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdLike(String value) {
            addCriterion("cAcc_Id like", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdNotLike(String value) {
            addCriterion("cAcc_Id not like", value, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdIn(List<String> values) {
            addCriterion("cAcc_Id in", values, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdNotIn(List<String> values) {
            addCriterion("cAcc_Id not in", values, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdBetween(String value1, String value2) {
            addCriterion("cAcc_Id between", value1, value2, "caccId");
            return (Criteria) this;
        }

        public Criteria andCaccIdNotBetween(String value1, String value2) {
            addCriterion("cAcc_Id not between", value1, value2, "caccId");
            return (Criteria) this;
        }

        public Criteria andOpcomponentidIsNull() {
            addCriterion("OpcomponentId is null");
            return (Criteria) this;
        }

        public Criteria andOpcomponentidIsNotNull() {
            addCriterion("OpcomponentId is not null");
            return (Criteria) this;
        }

        public Criteria andOpcomponentidEqualTo(Integer value) {
            addCriterion("OpcomponentId =", value, "opcomponentid");
            return (Criteria) this;
        }

        public Criteria andOpcomponentidNotEqualTo(Integer value) {
            addCriterion("OpcomponentId <>", value, "opcomponentid");
            return (Criteria) this;
        }

        public Criteria andOpcomponentidGreaterThan(Integer value) {
            addCriterion("OpcomponentId >", value, "opcomponentid");
            return (Criteria) this;
        }

        public Criteria andOpcomponentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OpcomponentId >=", value, "opcomponentid");
            return (Criteria) this;
        }

        public Criteria andOpcomponentidLessThan(Integer value) {
            addCriterion("OpcomponentId <", value, "opcomponentid");
            return (Criteria) this;
        }

        public Criteria andOpcomponentidLessThanOrEqualTo(Integer value) {
            addCriterion("OpcomponentId <=", value, "opcomponentid");
            return (Criteria) this;
        }

        public Criteria andOpcomponentidIn(List<Integer> values) {
            addCriterion("OpcomponentId in", values, "opcomponentid");
            return (Criteria) this;
        }

        public Criteria andOpcomponentidNotIn(List<Integer> values) {
            addCriterion("OpcomponentId not in", values, "opcomponentid");
            return (Criteria) this;
        }

        public Criteria andOpcomponentidBetween(Integer value1, Integer value2) {
            addCriterion("OpcomponentId between", value1, value2, "opcomponentid");
            return (Criteria) this;
        }

        public Criteria andOpcomponentidNotBetween(Integer value1, Integer value2) {
            addCriterion("OpcomponentId not between", value1, value2, "opcomponentid");
            return (Criteria) this;
        }

        public Criteria andCinvcodeIsNull() {
            addCriterion("cInvCode is null");
            return (Criteria) this;
        }

        public Criteria andCinvcodeIsNotNull() {
            addCriterion("cInvCode is not null");
            return (Criteria) this;
        }

        public Criteria andCinvcodeEqualTo(String value) {
            addCriterion("cInvCode =", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNotEqualTo(String value) {
            addCriterion("cInvCode <>", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeGreaterThan(String value) {
            addCriterion("cInvCode >", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeGreaterThanOrEqualTo(String value) {
            addCriterion("cInvCode >=", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeLessThan(String value) {
            addCriterion("cInvCode <", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeLessThanOrEqualTo(String value) {
            addCriterion("cInvCode <=", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeLike(String value) {
            addCriterion("cInvCode like", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNotLike(String value) {
            addCriterion("cInvCode not like", value, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeIn(List<String> values) {
            addCriterion("cInvCode in", values, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNotIn(List<String> values) {
            addCriterion("cInvCode not in", values, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeBetween(String value1, String value2) {
            addCriterion("cInvCode between", value1, value2, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andCinvcodeNotBetween(String value1, String value2) {
            addCriterion("cInvCode not between", value1, value2, "cinvcode");
            return (Criteria) this;
        }

        public Criteria andPartidIsNull() {
            addCriterion("PartId is null");
            return (Criteria) this;
        }

        public Criteria andPartidIsNotNull() {
            addCriterion("PartId is not null");
            return (Criteria) this;
        }

        public Criteria andPartidEqualTo(Integer value) {
            addCriterion("PartId =", value, "partid");
            return (Criteria) this;
        }

        public Criteria andPartidNotEqualTo(Integer value) {
            addCriterion("PartId <>", value, "partid");
            return (Criteria) this;
        }

        public Criteria andPartidGreaterThan(Integer value) {
            addCriterion("PartId >", value, "partid");
            return (Criteria) this;
        }

        public Criteria andPartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PartId >=", value, "partid");
            return (Criteria) this;
        }

        public Criteria andPartidLessThan(Integer value) {
            addCriterion("PartId <", value, "partid");
            return (Criteria) this;
        }

        public Criteria andPartidLessThanOrEqualTo(Integer value) {
            addCriterion("PartId <=", value, "partid");
            return (Criteria) this;
        }

        public Criteria andPartidIn(List<Integer> values) {
            addCriterion("PartId in", values, "partid");
            return (Criteria) this;
        }

        public Criteria andPartidNotIn(List<Integer> values) {
            addCriterion("PartId not in", values, "partid");
            return (Criteria) this;
        }

        public Criteria andPartidBetween(Integer value1, Integer value2) {
            addCriterion("PartId between", value1, value2, "partid");
            return (Criteria) this;
        }

        public Criteria andPartidNotBetween(Integer value1, Integer value2) {
            addCriterion("PartId not between", value1, value2, "partid");
            return (Criteria) this;
        }

        public Criteria andBomidIsNull() {
            addCriterion("BomId is null");
            return (Criteria) this;
        }

        public Criteria andBomidIsNotNull() {
            addCriterion("BomId is not null");
            return (Criteria) this;
        }

        public Criteria andBomidEqualTo(Integer value) {
            addCriterion("BomId =", value, "bomid");
            return (Criteria) this;
        }

        public Criteria andBomidNotEqualTo(Integer value) {
            addCriterion("BomId <>", value, "bomid");
            return (Criteria) this;
        }

        public Criteria andBomidGreaterThan(Integer value) {
            addCriterion("BomId >", value, "bomid");
            return (Criteria) this;
        }

        public Criteria andBomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BomId >=", value, "bomid");
            return (Criteria) this;
        }

        public Criteria andBomidLessThan(Integer value) {
            addCriterion("BomId <", value, "bomid");
            return (Criteria) this;
        }

        public Criteria andBomidLessThanOrEqualTo(Integer value) {
            addCriterion("BomId <=", value, "bomid");
            return (Criteria) this;
        }

        public Criteria andBomidIn(List<Integer> values) {
            addCriterion("BomId in", values, "bomid");
            return (Criteria) this;
        }

        public Criteria andBomidNotIn(List<Integer> values) {
            addCriterion("BomId not in", values, "bomid");
            return (Criteria) this;
        }

        public Criteria andBomidBetween(Integer value1, Integer value2) {
            addCriterion("BomId between", value1, value2, "bomid");
            return (Criteria) this;
        }

        public Criteria andBomidNotBetween(Integer value1, Integer value2) {
            addCriterion("BomId not between", value1, value2, "bomid");
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

        public Criteria andCbomgradeIsNull() {
            addCriterion("cBomGrade is null");
            return (Criteria) this;
        }

        public Criteria andCbomgradeIsNotNull() {
            addCriterion("cBomGrade is not null");
            return (Criteria) this;
        }

        public Criteria andCbomgradeEqualTo(String value) {
            addCriterion("cBomGrade =", value, "cbomgrade");
            return (Criteria) this;
        }

        public Criteria andCbomgradeNotEqualTo(String value) {
            addCriterion("cBomGrade <>", value, "cbomgrade");
            return (Criteria) this;
        }

        public Criteria andCbomgradeGreaterThan(String value) {
            addCriterion("cBomGrade >", value, "cbomgrade");
            return (Criteria) this;
        }

        public Criteria andCbomgradeGreaterThanOrEqualTo(String value) {
            addCriterion("cBomGrade >=", value, "cbomgrade");
            return (Criteria) this;
        }

        public Criteria andCbomgradeLessThan(String value) {
            addCriterion("cBomGrade <", value, "cbomgrade");
            return (Criteria) this;
        }

        public Criteria andCbomgradeLessThanOrEqualTo(String value) {
            addCriterion("cBomGrade <=", value, "cbomgrade");
            return (Criteria) this;
        }

        public Criteria andCbomgradeLike(String value) {
            addCriterion("cBomGrade like", value, "cbomgrade");
            return (Criteria) this;
        }

        public Criteria andCbomgradeNotLike(String value) {
            addCriterion("cBomGrade not like", value, "cbomgrade");
            return (Criteria) this;
        }

        public Criteria andCbomgradeIn(List<String> values) {
            addCriterion("cBomGrade in", values, "cbomgrade");
            return (Criteria) this;
        }

        public Criteria andCbomgradeNotIn(List<String> values) {
            addCriterion("cBomGrade not in", values, "cbomgrade");
            return (Criteria) this;
        }

        public Criteria andCbomgradeBetween(String value1, String value2) {
            addCriterion("cBomGrade between", value1, value2, "cbomgrade");
            return (Criteria) this;
        }

        public Criteria andCbomgradeNotBetween(String value1, String value2) {
            addCriterion("cBomGrade not between", value1, value2, "cbomgrade");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubIsNull() {
            addCriterion("cInvCode_Sub is null");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubIsNotNull() {
            addCriterion("cInvCode_Sub is not null");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubEqualTo(String value) {
            addCriterion("cInvCode_Sub =", value, "cinvcodeSub");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubNotEqualTo(String value) {
            addCriterion("cInvCode_Sub <>", value, "cinvcodeSub");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubGreaterThan(String value) {
            addCriterion("cInvCode_Sub >", value, "cinvcodeSub");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubGreaterThanOrEqualTo(String value) {
            addCriterion("cInvCode_Sub >=", value, "cinvcodeSub");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubLessThan(String value) {
            addCriterion("cInvCode_Sub <", value, "cinvcodeSub");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubLessThanOrEqualTo(String value) {
            addCriterion("cInvCode_Sub <=", value, "cinvcodeSub");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubLike(String value) {
            addCriterion("cInvCode_Sub like", value, "cinvcodeSub");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubNotLike(String value) {
            addCriterion("cInvCode_Sub not like", value, "cinvcodeSub");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubIn(List<String> values) {
            addCriterion("cInvCode_Sub in", values, "cinvcodeSub");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubNotIn(List<String> values) {
            addCriterion("cInvCode_Sub not in", values, "cinvcodeSub");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubBetween(String value1, String value2) {
            addCriterion("cInvCode_Sub between", value1, value2, "cinvcodeSub");
            return (Criteria) this;
        }

        public Criteria andCinvcodeSubNotBetween(String value1, String value2) {
            addCriterion("cInvCode_Sub not between", value1, value2, "cinvcodeSub");
            return (Criteria) this;
        }

        public Criteria andPartidSubIsNull() {
            addCriterion("PartId_Sub is null");
            return (Criteria) this;
        }

        public Criteria andPartidSubIsNotNull() {
            addCriterion("PartId_Sub is not null");
            return (Criteria) this;
        }

        public Criteria andPartidSubEqualTo(Integer value) {
            addCriterion("PartId_Sub =", value, "partidSub");
            return (Criteria) this;
        }

        public Criteria andPartidSubNotEqualTo(Integer value) {
            addCriterion("PartId_Sub <>", value, "partidSub");
            return (Criteria) this;
        }

        public Criteria andPartidSubGreaterThan(Integer value) {
            addCriterion("PartId_Sub >", value, "partidSub");
            return (Criteria) this;
        }

        public Criteria andPartidSubGreaterThanOrEqualTo(Integer value) {
            addCriterion("PartId_Sub >=", value, "partidSub");
            return (Criteria) this;
        }

        public Criteria andPartidSubLessThan(Integer value) {
            addCriterion("PartId_Sub <", value, "partidSub");
            return (Criteria) this;
        }

        public Criteria andPartidSubLessThanOrEqualTo(Integer value) {
            addCriterion("PartId_Sub <=", value, "partidSub");
            return (Criteria) this;
        }

        public Criteria andPartidSubIn(List<Integer> values) {
            addCriterion("PartId_Sub in", values, "partidSub");
            return (Criteria) this;
        }

        public Criteria andPartidSubNotIn(List<Integer> values) {
            addCriterion("PartId_Sub not in", values, "partidSub");
            return (Criteria) this;
        }

        public Criteria andPartidSubBetween(Integer value1, Integer value2) {
            addCriterion("PartId_Sub between", value1, value2, "partidSub");
            return (Criteria) this;
        }

        public Criteria andPartidSubNotBetween(Integer value1, Integer value2) {
            addCriterion("PartId_Sub not between", value1, value2, "partidSub");
            return (Criteria) this;
        }

        public Criteria andCbomattrIsNull() {
            addCriterion("cBomAttr is null");
            return (Criteria) this;
        }

        public Criteria andCbomattrIsNotNull() {
            addCriterion("cBomAttr is not null");
            return (Criteria) this;
        }

        public Criteria andCbomattrEqualTo(String value) {
            addCriterion("cBomAttr =", value, "cbomattr");
            return (Criteria) this;
        }

        public Criteria andCbomattrNotEqualTo(String value) {
            addCriterion("cBomAttr <>", value, "cbomattr");
            return (Criteria) this;
        }

        public Criteria andCbomattrGreaterThan(String value) {
            addCriterion("cBomAttr >", value, "cbomattr");
            return (Criteria) this;
        }

        public Criteria andCbomattrGreaterThanOrEqualTo(String value) {
            addCriterion("cBomAttr >=", value, "cbomattr");
            return (Criteria) this;
        }

        public Criteria andCbomattrLessThan(String value) {
            addCriterion("cBomAttr <", value, "cbomattr");
            return (Criteria) this;
        }

        public Criteria andCbomattrLessThanOrEqualTo(String value) {
            addCriterion("cBomAttr <=", value, "cbomattr");
            return (Criteria) this;
        }

        public Criteria andCbomattrLike(String value) {
            addCriterion("cBomAttr like", value, "cbomattr");
            return (Criteria) this;
        }

        public Criteria andCbomattrNotLike(String value) {
            addCriterion("cBomAttr not like", value, "cbomattr");
            return (Criteria) this;
        }

        public Criteria andCbomattrIn(List<String> values) {
            addCriterion("cBomAttr in", values, "cbomattr");
            return (Criteria) this;
        }

        public Criteria andCbomattrNotIn(List<String> values) {
            addCriterion("cBomAttr not in", values, "cbomattr");
            return (Criteria) this;
        }

        public Criteria andCbomattrBetween(String value1, String value2) {
            addCriterion("cBomAttr between", value1, value2, "cbomattr");
            return (Criteria) this;
        }

        public Criteria andCbomattrNotBetween(String value1, String value2) {
            addCriterion("cBomAttr not between", value1, value2, "cbomattr");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeIsNull() {
            addCriterion("cSupplyType is null");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeIsNotNull() {
            addCriterion("cSupplyType is not null");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeEqualTo(String value) {
            addCriterion("cSupplyType =", value, "csupplytype");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeNotEqualTo(String value) {
            addCriterion("cSupplyType <>", value, "csupplytype");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeGreaterThan(String value) {
            addCriterion("cSupplyType >", value, "csupplytype");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeGreaterThanOrEqualTo(String value) {
            addCriterion("cSupplyType >=", value, "csupplytype");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeLessThan(String value) {
            addCriterion("cSupplyType <", value, "csupplytype");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeLessThanOrEqualTo(String value) {
            addCriterion("cSupplyType <=", value, "csupplytype");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeLike(String value) {
            addCriterion("cSupplyType like", value, "csupplytype");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeNotLike(String value) {
            addCriterion("cSupplyType not like", value, "csupplytype");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeIn(List<String> values) {
            addCriterion("cSupplyType in", values, "csupplytype");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeNotIn(List<String> values) {
            addCriterion("cSupplyType not in", values, "csupplytype");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeBetween(String value1, String value2) {
            addCriterion("cSupplyType between", value1, value2, "csupplytype");
            return (Criteria) this;
        }

        public Criteria andCsupplytypeNotBetween(String value1, String value2) {
            addCriterion("cSupplyType not between", value1, value2, "csupplytype");
            return (Criteria) this;
        }

        public Criteria andBaseqtynIsNull() {
            addCriterion("BaseQtyN is null");
            return (Criteria) this;
        }

        public Criteria andBaseqtynIsNotNull() {
            addCriterion("BaseQtyN is not null");
            return (Criteria) this;
        }

        public Criteria andBaseqtynEqualTo(BigDecimal value) {
            addCriterion("BaseQtyN =", value, "baseqtyn");
            return (Criteria) this;
        }

        public Criteria andBaseqtynNotEqualTo(BigDecimal value) {
            addCriterion("BaseQtyN <>", value, "baseqtyn");
            return (Criteria) this;
        }

        public Criteria andBaseqtynGreaterThan(BigDecimal value) {
            addCriterion("BaseQtyN >", value, "baseqtyn");
            return (Criteria) this;
        }

        public Criteria andBaseqtynGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BaseQtyN >=", value, "baseqtyn");
            return (Criteria) this;
        }

        public Criteria andBaseqtynLessThan(BigDecimal value) {
            addCriterion("BaseQtyN <", value, "baseqtyn");
            return (Criteria) this;
        }

        public Criteria andBaseqtynLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BaseQtyN <=", value, "baseqtyn");
            return (Criteria) this;
        }

        public Criteria andBaseqtynIn(List<BigDecimal> values) {
            addCriterion("BaseQtyN in", values, "baseqtyn");
            return (Criteria) this;
        }

        public Criteria andBaseqtynNotIn(List<BigDecimal> values) {
            addCriterion("BaseQtyN not in", values, "baseqtyn");
            return (Criteria) this;
        }

        public Criteria andBaseqtynBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BaseQtyN between", value1, value2, "baseqtyn");
            return (Criteria) this;
        }

        public Criteria andBaseqtynNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BaseQtyN not between", value1, value2, "baseqtyn");
            return (Criteria) this;
        }

        public Criteria andBaseqtydIsNull() {
            addCriterion("BaseQtyD is null");
            return (Criteria) this;
        }

        public Criteria andBaseqtydIsNotNull() {
            addCriterion("BaseQtyD is not null");
            return (Criteria) this;
        }

        public Criteria andBaseqtydEqualTo(BigDecimal value) {
            addCriterion("BaseQtyD =", value, "baseqtyd");
            return (Criteria) this;
        }

        public Criteria andBaseqtydNotEqualTo(BigDecimal value) {
            addCriterion("BaseQtyD <>", value, "baseqtyd");
            return (Criteria) this;
        }

        public Criteria andBaseqtydGreaterThan(BigDecimal value) {
            addCriterion("BaseQtyD >", value, "baseqtyd");
            return (Criteria) this;
        }

        public Criteria andBaseqtydGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BaseQtyD >=", value, "baseqtyd");
            return (Criteria) this;
        }

        public Criteria andBaseqtydLessThan(BigDecimal value) {
            addCriterion("BaseQtyD <", value, "baseqtyd");
            return (Criteria) this;
        }

        public Criteria andBaseqtydLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BaseQtyD <=", value, "baseqtyd");
            return (Criteria) this;
        }

        public Criteria andBaseqtydIn(List<BigDecimal> values) {
            addCriterion("BaseQtyD in", values, "baseqtyd");
            return (Criteria) this;
        }

        public Criteria andBaseqtydNotIn(List<BigDecimal> values) {
            addCriterion("BaseQtyD not in", values, "baseqtyd");
            return (Criteria) this;
        }

        public Criteria andBaseqtydBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BaseQtyD between", value1, value2, "baseqtyd");
            return (Criteria) this;
        }

        public Criteria andBaseqtydNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BaseQtyD not between", value1, value2, "baseqtyd");
            return (Criteria) this;
        }

        public Criteria andCompscrapIsNull() {
            addCriterion("CompScrap is null");
            return (Criteria) this;
        }

        public Criteria andCompscrapIsNotNull() {
            addCriterion("CompScrap is not null");
            return (Criteria) this;
        }

        public Criteria andCompscrapEqualTo(BigDecimal value) {
            addCriterion("CompScrap =", value, "compscrap");
            return (Criteria) this;
        }

        public Criteria andCompscrapNotEqualTo(BigDecimal value) {
            addCriterion("CompScrap <>", value, "compscrap");
            return (Criteria) this;
        }

        public Criteria andCompscrapGreaterThan(BigDecimal value) {
            addCriterion("CompScrap >", value, "compscrap");
            return (Criteria) this;
        }

        public Criteria andCompscrapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CompScrap >=", value, "compscrap");
            return (Criteria) this;
        }

        public Criteria andCompscrapLessThan(BigDecimal value) {
            addCriterion("CompScrap <", value, "compscrap");
            return (Criteria) this;
        }

        public Criteria andCompscrapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CompScrap <=", value, "compscrap");
            return (Criteria) this;
        }

        public Criteria andCompscrapIn(List<BigDecimal> values) {
            addCriterion("CompScrap in", values, "compscrap");
            return (Criteria) this;
        }

        public Criteria andCompscrapNotIn(List<BigDecimal> values) {
            addCriterion("CompScrap not in", values, "compscrap");
            return (Criteria) this;
        }

        public Criteria andCompscrapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CompScrap between", value1, value2, "compscrap");
            return (Criteria) this;
        }

        public Criteria andCompscrapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CompScrap not between", value1, value2, "compscrap");
            return (Criteria) this;
        }

        public Criteria andIbomqtyIsNull() {
            addCriterion("iBomQty is null");
            return (Criteria) this;
        }

        public Criteria andIbomqtyIsNotNull() {
            addCriterion("iBomQty is not null");
            return (Criteria) this;
        }

        public Criteria andIbomqtyEqualTo(BigDecimal value) {
            addCriterion("iBomQty =", value, "ibomqty");
            return (Criteria) this;
        }

        public Criteria andIbomqtyNotEqualTo(BigDecimal value) {
            addCriterion("iBomQty <>", value, "ibomqty");
            return (Criteria) this;
        }

        public Criteria andIbomqtyGreaterThan(BigDecimal value) {
            addCriterion("iBomQty >", value, "ibomqty");
            return (Criteria) this;
        }

        public Criteria andIbomqtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("iBomQty >=", value, "ibomqty");
            return (Criteria) this;
        }

        public Criteria andIbomqtyLessThan(BigDecimal value) {
            addCriterion("iBomQty <", value, "ibomqty");
            return (Criteria) this;
        }

        public Criteria andIbomqtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("iBomQty <=", value, "ibomqty");
            return (Criteria) this;
        }

        public Criteria andIbomqtyIn(List<BigDecimal> values) {
            addCriterion("iBomQty in", values, "ibomqty");
            return (Criteria) this;
        }

        public Criteria andIbomqtyNotIn(List<BigDecimal> values) {
            addCriterion("iBomQty not in", values, "ibomqty");
            return (Criteria) this;
        }

        public Criteria andIbomqtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iBomQty between", value1, value2, "ibomqty");
            return (Criteria) this;
        }

        public Criteria andIbomqtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iBomQty not between", value1, value2, "ibomqty");
            return (Criteria) this;
        }

        public Criteria andDcreatedateIsNull() {
            addCriterion("dCreateDate is null");
            return (Criteria) this;
        }

        public Criteria andDcreatedateIsNotNull() {
            addCriterion("dCreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andDcreatedateEqualTo(Date value) {
            addCriterion("dCreateDate =", value, "dcreatedate");
            return (Criteria) this;
        }

        public Criteria andDcreatedateNotEqualTo(Date value) {
            addCriterion("dCreateDate <>", value, "dcreatedate");
            return (Criteria) this;
        }

        public Criteria andDcreatedateGreaterThan(Date value) {
            addCriterion("dCreateDate >", value, "dcreatedate");
            return (Criteria) this;
        }

        public Criteria andDcreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("dCreateDate >=", value, "dcreatedate");
            return (Criteria) this;
        }

        public Criteria andDcreatedateLessThan(Date value) {
            addCriterion("dCreateDate <", value, "dcreatedate");
            return (Criteria) this;
        }

        public Criteria andDcreatedateLessThanOrEqualTo(Date value) {
            addCriterion("dCreateDate <=", value, "dcreatedate");
            return (Criteria) this;
        }

        public Criteria andDcreatedateIn(List<Date> values) {
            addCriterion("dCreateDate in", values, "dcreatedate");
            return (Criteria) this;
        }

        public Criteria andDcreatedateNotIn(List<Date> values) {
            addCriterion("dCreateDate not in", values, "dcreatedate");
            return (Criteria) this;
        }

        public Criteria andDcreatedateBetween(Date value1, Date value2) {
            addCriterion("dCreateDate between", value1, value2, "dcreatedate");
            return (Criteria) this;
        }

        public Criteria andDcreatedateNotBetween(Date value1, Date value2) {
            addCriterion("dCreateDate not between", value1, value2, "dcreatedate");
            return (Criteria) this;
        }

        public Criteria andCfree1IsNull() {
            addCriterion("cFree1 is null");
            return (Criteria) this;
        }

        public Criteria andCfree1IsNotNull() {
            addCriterion("cFree1 is not null");
            return (Criteria) this;
        }

        public Criteria andCfree1EqualTo(String value) {
            addCriterion("cFree1 =", value, "cfree1");
            return (Criteria) this;
        }

        public Criteria andCfree1NotEqualTo(String value) {
            addCriterion("cFree1 <>", value, "cfree1");
            return (Criteria) this;
        }

        public Criteria andCfree1GreaterThan(String value) {
            addCriterion("cFree1 >", value, "cfree1");
            return (Criteria) this;
        }

        public Criteria andCfree1GreaterThanOrEqualTo(String value) {
            addCriterion("cFree1 >=", value, "cfree1");
            return (Criteria) this;
        }

        public Criteria andCfree1LessThan(String value) {
            addCriterion("cFree1 <", value, "cfree1");
            return (Criteria) this;
        }

        public Criteria andCfree1LessThanOrEqualTo(String value) {
            addCriterion("cFree1 <=", value, "cfree1");
            return (Criteria) this;
        }

        public Criteria andCfree1Like(String value) {
            addCriterion("cFree1 like", value, "cfree1");
            return (Criteria) this;
        }

        public Criteria andCfree1NotLike(String value) {
            addCriterion("cFree1 not like", value, "cfree1");
            return (Criteria) this;
        }

        public Criteria andCfree1In(List<String> values) {
            addCriterion("cFree1 in", values, "cfree1");
            return (Criteria) this;
        }

        public Criteria andCfree1NotIn(List<String> values) {
            addCriterion("cFree1 not in", values, "cfree1");
            return (Criteria) this;
        }

        public Criteria andCfree1Between(String value1, String value2) {
            addCriterion("cFree1 between", value1, value2, "cfree1");
            return (Criteria) this;
        }

        public Criteria andCfree1NotBetween(String value1, String value2) {
            addCriterion("cFree1 not between", value1, value2, "cfree1");
            return (Criteria) this;
        }

        public Criteria andCfree2IsNull() {
            addCriterion("cFree2 is null");
            return (Criteria) this;
        }

        public Criteria andCfree2IsNotNull() {
            addCriterion("cFree2 is not null");
            return (Criteria) this;
        }

        public Criteria andCfree2EqualTo(String value) {
            addCriterion("cFree2 =", value, "cfree2");
            return (Criteria) this;
        }

        public Criteria andCfree2NotEqualTo(String value) {
            addCriterion("cFree2 <>", value, "cfree2");
            return (Criteria) this;
        }

        public Criteria andCfree2GreaterThan(String value) {
            addCriterion("cFree2 >", value, "cfree2");
            return (Criteria) this;
        }

        public Criteria andCfree2GreaterThanOrEqualTo(String value) {
            addCriterion("cFree2 >=", value, "cfree2");
            return (Criteria) this;
        }

        public Criteria andCfree2LessThan(String value) {
            addCriterion("cFree2 <", value, "cfree2");
            return (Criteria) this;
        }

        public Criteria andCfree2LessThanOrEqualTo(String value) {
            addCriterion("cFree2 <=", value, "cfree2");
            return (Criteria) this;
        }

        public Criteria andCfree2Like(String value) {
            addCriterion("cFree2 like", value, "cfree2");
            return (Criteria) this;
        }

        public Criteria andCfree2NotLike(String value) {
            addCriterion("cFree2 not like", value, "cfree2");
            return (Criteria) this;
        }

        public Criteria andCfree2In(List<String> values) {
            addCriterion("cFree2 in", values, "cfree2");
            return (Criteria) this;
        }

        public Criteria andCfree2NotIn(List<String> values) {
            addCriterion("cFree2 not in", values, "cfree2");
            return (Criteria) this;
        }

        public Criteria andCfree2Between(String value1, String value2) {
            addCriterion("cFree2 between", value1, value2, "cfree2");
            return (Criteria) this;
        }

        public Criteria andCfree2NotBetween(String value1, String value2) {
            addCriterion("cFree2 not between", value1, value2, "cfree2");
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