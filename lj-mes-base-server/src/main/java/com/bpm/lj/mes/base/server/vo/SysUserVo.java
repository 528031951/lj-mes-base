package com.bpm.lj.mes.base.server.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户返回对象
 */
@Data
@ApiModel(description = "用户返回对象")
public class SysUserVo {
    private Long id;

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    private String name;
    private Integer teamId;
    private Integer isEnable;
    private Integer workCenterId;


}