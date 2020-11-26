package com.bpm.lj.mes.base.server.domain;

import java.util.Date;
import lombok.Data;

/**
 * 机型工序工时维护表
 */
@Data
public class BaseModelProcessTime {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 工作中心编码
     */
    private String worhcenterCode;

    /**
     * 工作中心名称

     */
    private String worhcenterName;

    /**
     * 工序编码
     */
    private String processCode;

    /**
     * 工序名称
     */
    private String processName;

    /**
     * 工序表id
     */
    private Integer baseOperationId;

    /**
     * 标准工时
     */
    private Double stdTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Integer createId;

    /**
     * 修改人
     */
    private Integer updateId;

    /**
     * 机器编码
     */
    private String machineCode;

    /**
     * 系列
     */
    private String series;

    /**
     * 状态0启用1停用
     */
    private Integer status;

    /**
     * 工作中心ID
     */
    private Integer worhcenterId;

    /**
     * 班组id
     */
    private Integer teamId;
}