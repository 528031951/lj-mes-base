package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.SysBaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "demo新增对象")
public class DemoAddDTO extends SysBaseDTO {

    @ApiModelProperty("名称")
    private String name;

}
