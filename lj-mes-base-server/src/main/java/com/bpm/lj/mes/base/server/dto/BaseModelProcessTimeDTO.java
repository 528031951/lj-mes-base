package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 机型工序工时维护表
 */
@Data
@ApiModel(description = "机型工序工时维护表")
public class BaseModelProcessTimeDTO extends PageDTO {
    /**
     * 主键
     */
    private Integer id;
    private Integer worhcenterId;

    @ApiModelProperty("班组ID")
    private Integer teamId;
    @ApiModelProperty("班组名称")
    private String teamName;

    /**
     * 工作中心编码
     */
    @ApiModelProperty("工作中心编码")
    private String worhcenterCode;


    /**
     * 工作中心名称
     */
    @ApiModelProperty("工作中心名称")
    private String worhcenterName;


    /**
     * 工序编码
     */
    @ApiModelProperty("工序编码")
    private String processCode;

    /**
     * 工序名称
     */
    @ApiModelProperty("工序名称")
    private String processName;

    /**
     * 工序表id
     */
    @ApiModelProperty("工序表id")
    private Integer baseOperationId;

    /**
     * 标准工时
     */
    @ApiModelProperty("标准工时")
    private Double stdTime;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
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
    @ApiModelProperty("机器编码")
    private String machineCode;

    /**
     * 系列
     */
    @ApiModelProperty("系列")
    private String series;

    /**
     * 状态0启用1停用
     */
    @ApiModelProperty("状态0启用1停用")
    private Integer status;
}