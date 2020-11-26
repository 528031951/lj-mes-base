package com.bpm.lj.mes.base.server.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * 机型工序工时维护表
 */
@Data
public class BaseModelProcessTimeExcel {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 工作中心名称
     */
    @Excel(name = "工作中心编码")
    private String worhcenterCode;
    /**
     * 工作中心名称
     */
    @Excel(name = "工作中心名称")
    private String worhcenterName;

    /**
     * 工序编码
     */
    @Excel(name = "工序编码")
    private String processCode;

    /**
     * 工序名称
     */
    @Excel(name = "工序名称")
    private String processName;


    /**
     * 标准工时
     */
    @Excel(name = "标准工时")
    private Double stdTime;


    /**
     * 机器编码
     */
    @Excel(name = "机器型号")
    private String machineCode;


}