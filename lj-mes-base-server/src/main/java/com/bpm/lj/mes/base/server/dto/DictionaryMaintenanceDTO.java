package com.bpm.lj.mes.base.server.dto;


import com.bpm.lj.mes.base.common.dto.SysBaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "字典维护新增/修改请求对象")
public class DictionaryMaintenanceDTO extends SysBaseDTO {

    @ApiModelProperty("主键id")
    private Integer id;

    @ApiModelProperty("父级id")
    private Integer parentId;

    @ApiModelProperty("字典编码")
    private String code;

    @ApiModelProperty("字典名称")
    private String name;

    @ApiModelProperty("状态（0-启用，1-停用）")
    private Integer status = 0;

}
