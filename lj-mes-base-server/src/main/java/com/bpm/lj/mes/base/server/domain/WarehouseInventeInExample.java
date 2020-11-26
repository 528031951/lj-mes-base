package com.bpm.lj.mes.base.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseInventeInExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseInventeInExample() {
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

        public Criteria andMachineModelIsNull() {
            addCriterion("machine_model is null");
            return (Criteria) this;
        }

        public Criteria andMachineModelIsNotNull() {
            addCriterion("machine_model is not null");
            return (Criteria) this;
        }

        public Criteria andMachineModelEqualTo(String value) {
            addCriterion("machine_model =", value, "machineModel");
            return (Criteria) this;
        }

        public Criteria andMachineModelNotEqualTo(String value) {
            addCriterion("machine_model <>", value, "machineModel");
            return (Criteria) this;
        }

        public Criteria andMachineModelGreaterThan(String value) {
            addCriterion("machine_model >", value, "machineModel");
            return (Criteria) this;
        }

        public Criteria andMachineModelGreaterThanOrEqualTo(String value) {
            addCriterion("machine_model >=", value, "machineModel");
            return (Criteria) this;
        }

        public Criteria andMachineModelLessThan(String value) {
            addCriterion("machine_model <", value, "machineModel");
            return (Criteria) this;
        }

        public Criteria andMachineModelLessThanOrEqualTo(String value) {
            addCriterion("machine_model <=", value, "machineModel");
            return (Criteria) this;
        }

        public Criteria andMachineModelLike(String value) {
            addCriterion("machine_model like", value, "machineModel");
            return (Criteria) this;
        }

        public Criteria andMachineModelNotLike(String value) {
            addCriterion("machine_model not like", value, "machineModel");
            return (Criteria) this;
        }

        public Criteria andMachineModelIn(List<String> values) {
            addCriterion("machine_model in", values, "machineModel");
            return (Criteria) this;
        }

        public Criteria andMachineModelNotIn(List<String> values) {
            addCriterion("machine_model not in", values, "machineModel");
            return (Criteria) this;
        }

        public Criteria andMachineModelBetween(String value1, String value2) {
            addCriterion("machine_model between", value1, value2, "machineModel");
            return (Criteria) this;
        }

        public Criteria andMachineModelNotBetween(String value1, String value2) {
            addCriterion("machine_model not between", value1, value2, "machineModel");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andReqDepartureDateIsNull() {
            addCriterion("req_departure_date is null");
            return (Criteria) this;
        }

        public Criteria andReqDepartureDateIsNotNull() {
            addCriterion("req_departure_date is not null");
            return (Criteria) this;
        }

        public Criteria andReqDepartureDateEqualTo(Date value) {
            addCriterion("req_departure_date =", value, "reqDepartureDate");
            return (Criteria) this;
        }

        public Criteria andReqDepartureDateNotEqualTo(Date value) {
            addCriterion("req_departure_date <>", value, "reqDepartureDate");
            return (Criteria) this;
        }

        public Criteria andReqDepartureDateGreaterThan(Date value) {
            addCriterion("req_departure_date >", value, "reqDepartureDate");
            return (Criteria) this;
        }

        public Criteria andReqDepartureDateGreaterThanOrEqualTo(Date value) {
            addCriterion("req_departure_date >=", value, "reqDepartureDate");
            return (Criteria) this;
        }

        public Criteria andReqDepartureDateLessThan(Date value) {
            addCriterion("req_departure_date <", value, "reqDepartureDate");
            return (Criteria) this;
        }

        public Criteria andReqDepartureDateLessThanOrEqualTo(Date value) {
            addCriterion("req_departure_date <=", value, "reqDepartureDate");
            return (Criteria) this;
        }

        public Criteria andReqDepartureDateIn(List<Date> values) {
            addCriterion("req_departure_date in", values, "reqDepartureDate");
            return (Criteria) this;
        }

        public Criteria andReqDepartureDateNotIn(List<Date> values) {
            addCriterion("req_departure_date not in", values, "reqDepartureDate");
            return (Criteria) this;
        }

        public Criteria andReqDepartureDateBetween(Date value1, Date value2) {
            addCriterion("req_departure_date between", value1, value2, "reqDepartureDate");
            return (Criteria) this;
        }

        public Criteria andReqDepartureDateNotBetween(Date value1, Date value2) {
            addCriterion("req_departure_date not between", value1, value2, "reqDepartureDate");
            return (Criteria) this;
        }

        public Criteria andMachineStatusIsNull() {
            addCriterion("machine_status is null");
            return (Criteria) this;
        }

        public Criteria andMachineStatusIsNotNull() {
            addCriterion("machine_status is not null");
            return (Criteria) this;
        }

        public Criteria andMachineStatusEqualTo(Integer value) {
            addCriterion("machine_status =", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusNotEqualTo(Integer value) {
            addCriterion("machine_status <>", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusGreaterThan(Integer value) {
            addCriterion("machine_status >", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_status >=", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusLessThan(Integer value) {
            addCriterion("machine_status <", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusLessThanOrEqualTo(Integer value) {
            addCriterion("machine_status <=", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusIn(List<Integer> values) {
            addCriterion("machine_status in", values, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusNotIn(List<Integer> values) {
            addCriterion("machine_status not in", values, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusBetween(Integer value1, Integer value2) {
            addCriterion("machine_status between", value1, value2, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_status not between", value1, value2, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andBatchOperationDateIsNull() {
            addCriterion("batch_operation_date is null");
            return (Criteria) this;
        }

        public Criteria andBatchOperationDateIsNotNull() {
            addCriterion("batch_operation_date is not null");
            return (Criteria) this;
        }

        public Criteria andBatchOperationDateEqualTo(Date value) {
            addCriterion("batch_operation_date =", value, "batchOperationDate");
            return (Criteria) this;
        }

        public Criteria andBatchOperationDateNotEqualTo(Date value) {
            addCriterion("batch_operation_date <>", value, "batchOperationDate");
            return (Criteria) this;
        }

        public Criteria andBatchOperationDateGreaterThan(Date value) {
            addCriterion("batch_operation_date >", value, "batchOperationDate");
            return (Criteria) this;
        }

        public Criteria andBatchOperationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("batch_operation_date >=", value, "batchOperationDate");
            return (Criteria) this;
        }

        public Criteria andBatchOperationDateLessThan(Date value) {
            addCriterion("batch_operation_date <", value, "batchOperationDate");
            return (Criteria) this;
        }

        public Criteria andBatchOperationDateLessThanOrEqualTo(Date value) {
            addCriterion("batch_operation_date <=", value, "batchOperationDate");
            return (Criteria) this;
        }

        public Criteria andBatchOperationDateIn(List<Date> values) {
            addCriterion("batch_operation_date in", values, "batchOperationDate");
            return (Criteria) this;
        }

        public Criteria andBatchOperationDateNotIn(List<Date> values) {
            addCriterion("batch_operation_date not in", values, "batchOperationDate");
            return (Criteria) this;
        }

        public Criteria andBatchOperationDateBetween(Date value1, Date value2) {
            addCriterion("batch_operation_date between", value1, value2, "batchOperationDate");
            return (Criteria) this;
        }

        public Criteria andBatchOperationDateNotBetween(Date value1, Date value2) {
            addCriterion("batch_operation_date not between", value1, value2, "batchOperationDate");
            return (Criteria) this;
        }

        public Criteria andFeedeEndDateIsNull() {
            addCriterion("feede_end_date is null");
            return (Criteria) this;
        }

        public Criteria andFeedeEndDateIsNotNull() {
            addCriterion("feede_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andFeedeEndDateEqualTo(Date value) {
            addCriterion("feede_end_date =", value, "feedeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeedeEndDateNotEqualTo(Date value) {
            addCriterion("feede_end_date <>", value, "feedeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeedeEndDateGreaterThan(Date value) {
            addCriterion("feede_end_date >", value, "feedeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeedeEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("feede_end_date >=", value, "feedeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeedeEndDateLessThan(Date value) {
            addCriterion("feede_end_date <", value, "feedeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeedeEndDateLessThanOrEqualTo(Date value) {
            addCriterion("feede_end_date <=", value, "feedeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeedeEndDateIn(List<Date> values) {
            addCriterion("feede_end_date in", values, "feedeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeedeEndDateNotIn(List<Date> values) {
            addCriterion("feede_end_date not in", values, "feedeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeedeEndDateBetween(Date value1, Date value2) {
            addCriterion("feede_end_date between", value1, value2, "feedeEndDate");
            return (Criteria) this;
        }

        public Criteria andFeedeEndDateNotBetween(Date value1, Date value2) {
            addCriterion("feede_end_date not between", value1, value2, "feedeEndDate");
            return (Criteria) this;
        }

        public Criteria andInventeInDateIsNull() {
            addCriterion("invente_in_date is null");
            return (Criteria) this;
        }

        public Criteria andInventeInDateIsNotNull() {
            addCriterion("invente_in_date is not null");
            return (Criteria) this;
        }

        public Criteria andInventeInDateEqualTo(Date value) {
            addCriterion("invente_in_date =", value, "inventeInDate");
            return (Criteria) this;
        }

        public Criteria andInventeInDateNotEqualTo(Date value) {
            addCriterion("invente_in_date <>", value, "inventeInDate");
            return (Criteria) this;
        }

        public Criteria andInventeInDateGreaterThan(Date value) {
            addCriterion("invente_in_date >", value, "inventeInDate");
            return (Criteria) this;
        }

        public Criteria andInventeInDateGreaterThanOrEqualTo(Date value) {
            addCriterion("invente_in_date >=", value, "inventeInDate");
            return (Criteria) this;
        }

        public Criteria andInventeInDateLessThan(Date value) {
            addCriterion("invente_in_date <", value, "inventeInDate");
            return (Criteria) this;
        }

        public Criteria andInventeInDateLessThanOrEqualTo(Date value) {
            addCriterion("invente_in_date <=", value, "inventeInDate");
            return (Criteria) this;
        }

        public Criteria andInventeInDateIn(List<Date> values) {
            addCriterion("invente_in_date in", values, "inventeInDate");
            return (Criteria) this;
        }

        public Criteria andInventeInDateNotIn(List<Date> values) {
            addCriterion("invente_in_date not in", values, "inventeInDate");
            return (Criteria) this;
        }

        public Criteria andInventeInDateBetween(Date value1, Date value2) {
            addCriterion("invente_in_date between", value1, value2, "inventeInDate");
            return (Criteria) this;
        }

        public Criteria andInventeInDateNotBetween(Date value1, Date value2) {
            addCriterion("invente_in_date not between", value1, value2, "inventeInDate");
            return (Criteria) this;
        }

        public Criteria andInventeInStatusIsNull() {
            addCriterion("invente_in_status is null");
            return (Criteria) this;
        }

        public Criteria andInventeInStatusIsNotNull() {
            addCriterion("invente_in_status is not null");
            return (Criteria) this;
        }

        public Criteria andInventeInStatusEqualTo(Integer value) {
            addCriterion("invente_in_status =", value, "inventeInStatus");
            return (Criteria) this;
        }

        public Criteria andInventeInStatusNotEqualTo(Integer value) {
            addCriterion("invente_in_status <>", value, "inventeInStatus");
            return (Criteria) this;
        }

        public Criteria andInventeInStatusGreaterThan(Integer value) {
            addCriterion("invente_in_status >", value, "inventeInStatus");
            return (Criteria) this;
        }

        public Criteria andInventeInStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("invente_in_status >=", value, "inventeInStatus");
            return (Criteria) this;
        }

        public Criteria andInventeInStatusLessThan(Integer value) {
            addCriterion("invente_in_status <", value, "inventeInStatus");
            return (Criteria) this;
        }

        public Criteria andInventeInStatusLessThanOrEqualTo(Integer value) {
            addCriterion("invente_in_status <=", value, "inventeInStatus");
            return (Criteria) this;
        }

        public Criteria andInventeInStatusIn(List<Integer> values) {
            addCriterion("invente_in_status in", values, "inventeInStatus");
            return (Criteria) this;
        }

        public Criteria andInventeInStatusNotIn(List<Integer> values) {
            addCriterion("invente_in_status not in", values, "inventeInStatus");
            return (Criteria) this;
        }

        public Criteria andInventeInStatusBetween(Integer value1, Integer value2) {
            addCriterion("invente_in_status between", value1, value2, "inventeInStatus");
            return (Criteria) this;
        }

        public Criteria andInventeInStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("invente_in_status not between", value1, value2, "inventeInStatus");
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