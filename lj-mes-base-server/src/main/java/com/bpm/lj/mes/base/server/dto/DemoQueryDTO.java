package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "demo条件对象")
public class DemoQueryDTO extends PageDTO {

    @ApiModelProperty("名称")
    private String name;

}
