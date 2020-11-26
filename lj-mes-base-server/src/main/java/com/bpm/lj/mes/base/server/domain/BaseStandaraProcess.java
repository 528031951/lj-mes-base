package com.bpm.lj.mes.base.server.domain;

import lombok.Data;

/**
 * 标准工序表
 */
@Data
public class BaseStandaraProcess {
    private Integer id;

    /**
     * 工序编号
     */
    private String processCode;

    /**
     * 工序名称
     */
    private String processName;

    /**
     * 工作中心编号
     */
    private String workCenterCode;

    /**
     * 工作中心名称
     */
    private String workCenterName;

    /**
     * 报告点（0：否，1：是）
     */
    private Integer reportingPoint;

    /**
     * 倒冲工序（0：否，1：是）
     */
    private Integer backflushProcess;

    /**
     * 选项相关（0：否，1：是）
     */
    private Integer optionDependent;

    /**
     * 委外工序（0：否，1：是）
     */
    private Integer outsourcingProcess;

    /**
     * 计费点（0：否，1：是）
     */
    private Integer billingPoint;

    /**
     * 计划委外工序（0：否，1：是）
     */
    private Integer planOutsourcingProcess;

    /**
     * 备注
     */
    private String remark;
}