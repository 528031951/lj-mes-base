package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 班组人员表2
 */
@Data
@ApiModel(description = "班组人员表")
public class BaseTeamPersonDTO extends PageDTO {
    private Long id;

    /**
     * 用户ID
     */
    @ApiModelProperty("用户ID")
    private Integer userId;

    /**
     * 班组ID
     */
    @ApiModelProperty("班组ID")
    private Integer teamId;
    private Integer locationId;

    private Integer status;
    private Integer isEnable;
}