package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 打套料任务
 */
@Data
@ApiModel(description = "  打套料任务 ")
public class WarehouseNestingTaskDTO  extends PageDTO {
    private Integer id;

    /**
     * 批号
     */
    @ApiModelProperty("批号")
    private String batchNo;

    /**
     * 领料任务号
     */
    @ApiModelProperty("领料任务号")
    private String taskCode;

    /**
     * 任务状态1 新建 2发布 3进行中  4完成
     */
    @ApiModelProperty("任务状态1 新建 2发布 3进行中  4完成")
    private Integer taskStatus;

    /**
     * 物料状态
     */
    @ApiModelProperty("物料状态")
    private Integer materialStatus;

    /**
     * 生产工艺
     */
    @ApiModelProperty("生产工艺")
    private Integer productionProcesses;

    /**
     * 任务发起时间
     */
    @ApiModelProperty("任务发起时间")
    private Date taskLaunchDate;

    /**
     * 预期截止时间
     */
    @ApiModelProperty("预期截止时间")
    private Date expectedCompletionDate;

    /**
     * 任务完成时间
     */
    @ApiModelProperty("任务完成时间")
    private Date taskCompletionDate;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remarks;

    /**
     * 领料责任人
     */
    @ApiModelProperty("领料责任人")
    private Integer materialReqPerson;

    private Date createTime;

    private Integer createrId;

    private Date updateTime;

    private Integer updaterId;
}