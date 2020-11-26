package com.bpm.lj.mes.base.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "字典维护删除请求对象")
public class DictionaryMaintenanceDeleteDTO {

    @ApiModelProperty("主键id")
    private Integer id;

    @ApiModelProperty("状态(0-启用  1-停用)")
    private Integer status;


}
