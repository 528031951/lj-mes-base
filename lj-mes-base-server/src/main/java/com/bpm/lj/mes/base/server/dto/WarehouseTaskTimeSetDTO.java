package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 任务时间设置
 */
@Data
@ApiModel(description = "任务时间设置")
public class WarehouseTaskTimeSetDTO extends PageDTO {
    private Integer id;

    /**
     * 时间任务编号
     */
    @ApiModelProperty("时间任务编号")
    private String timeTaskNum;

    /**
     * 天数
     */
    @ApiModelProperty("天数")
    private Date dayDate;

    /**
     * 时间任务描述
     */
    @ApiModelProperty("时间任务描述")
    private String timeTaskRemarks;


}