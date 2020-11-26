package com.bpm.lj.mes.base.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "字典维护查询请求对象")
public class DictionaryMaintenanceQueryDTO {

    @ApiModelProperty("字典编码")
    private String code;

    @ApiModelProperty("字典名称")
    private String name;


}
