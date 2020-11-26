package com.bpm.lj.mes.base.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseNestingTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseNestingTaskExample() {
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

        public Criteria andTaskStatusIsNull() {
            addCriterion("task_status is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("task_status is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(Integer value) {
            addCriterion("task_status =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(Integer value) {
            addCriterion("task_status <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(Integer value) {
            addCriterion("task_status >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_status >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(Integer value) {
            addCriterion("task_status <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(Integer value) {
            addCriterion("task_status <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<Integer> values) {
            addCriterion("task_status in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<Integer> values) {
            addCriterion("task_status not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(Integer value1, Integer value2) {
            addCriterion("task_status between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("task_status not between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusIsNull() {
            addCriterion("material_status is null");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusIsNotNull() {
            addCriterion("material_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusEqualTo(Integer value) {
            addCriterion("material_status =", value, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusNotEqualTo(Integer value) {
            addCriterion("material_status <>", value, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusGreaterThan(Integer value) {
            addCriterion("material_status >", value, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_status >=", value, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusLessThan(Integer value) {
            addCriterion("material_status <", value, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusLessThanOrEqualTo(Integer value) {
            addCriterion("material_status <=", value, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusIn(List<Integer> values) {
            addCriterion("material_status in", values, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusNotIn(List<Integer> values) {
            addCriterion("material_status not in", values, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusBetween(Integer value1, Integer value2) {
            addCriterion("material_status between", value1, value2, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("material_status not between", value1, value2, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andProductionProcessesIsNull() {
            addCriterion("production_processes is null");
            return (Criteria) this;
        }

        public Criteria andProductionProcessesIsNotNull() {
            addCriterion("production_processes is not null");
            return (Criteria) this;
        }

        public Criteria andProductionProcessesEqualTo(Integer value) {
            addCriterion("production_processes =", value, "productionProcesses");
            return (Criteria) this;
        }

        public Criteria andProductionProcessesNotEqualTo(Integer value) {
            addCriterion("production_processes <>", value, "productionProcesses");
            return (Criteria) this;
        }

        public Criteria andProductionProcessesGreaterThan(Integer value) {
            addCriterion("production_processes >", value, "productionProcesses");
            return (Criteria) this;
        }

        public Criteria andProductionProcessesGreaterThanOrEqualTo(Integer value) {
            addCriterion("production_processes >=", value, "productionProcesses");
            return (Criteria) this;
        }

        public Criteria andProductionProcessesLessThan(Integer value) {
            addCriterion("production_processes <", value, "productionProcesses");
            return (Criteria) this;
        }

        public Criteria andProductionProcessesLessThanOrEqualTo(Integer value) {
            addCriterion("production_processes <=", value, "productionProcesses");
            return (Criteria) this;
        }

        public Criteria andProductionProcessesIn(List<Integer> values) {
            addCriterion("production_processes in", values, "productionProcesses");
            return (Criteria) this;
        }

        public Criteria andProductionProcessesNotIn(List<Integer> values) {
            addCriterion("production_processes not in", values, "productionProcesses");
            return (Criteria) this;
        }

        public Criteria andProductionProcessesBetween(Integer value1, Integer value2) {
            addCriterion("production_processes between", value1, value2, "productionProcesses");
            return (Criteria) this;
        }

        public Criteria andProductionProcessesNotBetween(Integer value1, Integer value2) {
            addCriterion("production_processes not between", value1, value2, "productionProcesses");
            return (Criteria) this;
        }

        public Criteria andTaskLaunchDateIsNull() {
            addCriterion("task_launch_date is null");
            return (Criteria) this;
        }

        public Criteria andTaskLaunchDateIsNotNull() {
            addCriterion("task_launch_date is not null");
            return (Criteria) this;
        }

        public Criteria andTaskLaunchDateEqualTo(Date value) {
            addCriterion("task_launch_date =", value, "taskLaunchDate");
            return (Criteria) this;
        }

        public Criteria andTaskLaunchDateNotEqualTo(Date value) {
            addCriterion("task_launch_date <>", value, "taskLaunchDate");
            return (Criteria) this;
        }

        public Criteria andTaskLaunchDateGreaterThan(Date value) {
            addCriterion("task_launch_date >", value, "taskLaunchDate");
            return (Criteria) this;
        }

        public Criteria andTaskLaunchDateGreaterThanOrEqualTo(Date value) {
            addCriterion("task_launch_date >=", value, "taskLaunchDate");
            return (Criteria) this;
        }

        public Criteria andTaskLaunchDateLessThan(Date value) {
            addCriterion("task_launch_date <", value, "taskLaunchDate");
            return (Criteria) this;
        }

        public Criteria andTaskLaunchDateLessThanOrEqualTo(Date value) {
            addCriterion("task_launch_date <=", value, "taskLaunchDate");
            return (Criteria) this;
        }

        public Criteria andTaskLaunchDateIn(List<Date> values) {
            addCriterion("task_launch_date in", values, "taskLaunchDate");
            return (Criteria) this;
        }

        public Criteria andTaskLaunchDateNotIn(List<Date> values) {
            addCriterion("task_launch_date not in", values, "taskLaunchDate");
            return (Criteria) this;
        }

        public Criteria andTaskLaunchDateBetween(Date value1, Date value2) {
            addCriterion("task_launch_date between", value1, value2, "taskLaunchDate");
            return (Criteria) this;
        }

        public Criteria andTaskLaunchDateNotBetween(Date value1, Date value2) {
            addCriterion("task_launch_date not between", value1, value2, "taskLaunchDate");
            return (Criteria) this;
        }

        public Criteria andExpectedCompletionDateIsNull() {
            addCriterion("expected_completion_date is null");
            return (Criteria) this;
        }

        public Criteria andExpectedCompletionDateIsNotNull() {
            addCriterion("expected_completion_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedCompletionDateEqualTo(Date value) {
            addCriterion("expected_completion_date =", value, "expectedCompletionDate");
            return (Criteria) this;
        }

        public Criteria andExpectedCompletionDateNotEqualTo(Date value) {
            addCriterion("expected_completion_date <>", value, "expectedCompletionDate");
            return (Criteria) this;
        }

        public Criteria andExpectedCompletionDateGreaterThan(Date value) {
            addCriterion("expected_completion_date >", value, "expectedCompletionDate");
            return (Criteria) this;
        }

        public Criteria andExpectedCompletionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("expected_completion_date >=", value, "expectedCompletionDate");
            return (Criteria) this;
        }

        public Criteria andExpectedCompletionDateLessThan(Date value) {
            addCriterion("expected_completion_date <", value, "expectedCompletionDate");
            return (Criteria) this;
        }

        public Criteria andExpectedCompletionDateLessThanOrEqualTo(Date value) {
            addCriterion("expected_completion_date <=", value, "expectedCompletionDate");
            return (Criteria) this;
        }

        public Criteria andExpectedCompletionDateIn(List<Date> values) {
            addCriterion("expected_completion_date in", values, "expectedCompletionDate");
            return (Criteria) this;
        }

        public Criteria andExpectedCompletionDateNotIn(List<Date> values) {
            addCriterion("expected_completion_date not in", values, "expectedCompletionDate");
            return (Criteria) this;
        }

        public Criteria andExpectedCompletionDateBetween(Date value1, Date value2) {
            addCriterion("expected_completion_date between", value1, value2, "expectedCompletionDate");
            return (Criteria) this;
        }

        public Criteria andExpectedCompletionDateNotBetween(Date value1, Date value2) {
            addCriterion("expected_completion_date not between", value1, value2, "expectedCompletionDate");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionDateIsNull() {
            addCriterion("task_completion_date is null");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionDateIsNotNull() {
            addCriterion("task_completion_date is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionDateEqualTo(Date value) {
            addCriterion("task_completion_date =", value, "taskCompletionDate");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionDateNotEqualTo(Date value) {
            addCriterion("task_completion_date <>", value, "taskCompletionDate");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionDateGreaterThan(Date value) {
            addCriterion("task_completion_date >", value, "taskCompletionDate");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("task_completion_date >=", value, "taskCompletionDate");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionDateLessThan(Date value) {
            addCriterion("task_completion_date <", value, "taskCompletionDate");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionDateLessThanOrEqualTo(Date value) {
            addCriterion("task_completion_date <=", value, "taskCompletionDate");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionDateIn(List<Date> values) {
            addCriterion("task_completion_date in", values, "taskCompletionDate");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionDateNotIn(List<Date> values) {
            addCriterion("task_completion_date not in", values, "taskCompletionDate");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionDateBetween(Date value1, Date value2) {
            addCriterion("task_completion_date between", value1, value2, "taskCompletionDate");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionDateNotBetween(Date value1, Date value2) {
            addCriterion("task_completion_date not between", value1, value2, "taskCompletionDate");
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

        public Criteria andMaterialReqPersonIsNull() {
            addCriterion("material_req_person is null");
            return (Criteria) this;
        }

        public Criteria andMaterialReqPersonIsNotNull() {
            addCriterion("material_req_person is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialReqPersonEqualTo(Integer value) {
            addCriterion("material_req_person =", value, "materialReqPerson");
            return (Criteria) this;
        }

        public Criteria andMaterialReqPersonNotEqualTo(Integer value) {
            addCriterion("material_req_person <>", value, "materialReqPerson");
            return (Criteria) this;
        }

        public Criteria andMaterialReqPersonGreaterThan(Integer value) {
            addCriterion("material_req_person >", value, "materialReqPerson");
            return (Criteria) this;
        }

        public Criteria andMaterialReqPersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_req_person >=", value, "materialReqPerson");
            return (Criteria) this;
        }

        public Criteria andMaterialReqPersonLessThan(Integer value) {
            addCriterion("material_req_person <", value, "materialReqPerson");
            return (Criteria) this;
        }

        public Criteria andMaterialReqPersonLessThanOrEqualTo(Integer value) {
            addCriterion("material_req_person <=", value, "materialReqPerson");
            return (Criteria) this;
        }

        public Criteria andMaterialReqPersonIn(List<Integer> values) {
            addCriterion("material_req_person in", values, "materialReqPerson");
            return (Criteria) this;
        }

        public Criteria andMaterialReqPersonNotIn(List<Integer> values) {
            addCriterion("material_req_person not in", values, "materialReqPerson");
            return (Criteria) this;
        }

        public Criteria andMaterialReqPersonBetween(Integer value1, Integer value2) {
            addCriterion("material_req_person between", value1, value2, "materialReqPerson");
            return (Criteria) this;
        }

        public Criteria andMaterialReqPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("material_req_person not between", value1, value2, "materialReqPerson");
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