package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 排班表
 */
@Data
@ApiModel(description = "排班表对象")
public class BaseSchedulingDTO extends PageDTO {
    private Long id;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("查询时间")
    private String formatTime;

    /**
     * 班组ID
     */
    @ApiModelProperty("班组ID")
    private Long teamId;
    private List<Integer> teamIds;

    /**
     * 产线Id
     */
    @ApiModelProperty("产线Id")
    private Long productionLineId;

    /**
     * 班次ID
     */
    @ApiModelProperty("班次ID")
    private Long shiftId;

    private List<Integer> shiftIds;
}