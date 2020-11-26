package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 班组查询
 */
@Data
@ApiModel(description = "班组查询")
public class BaseTeamQueryDTO extends PageDTO {
    private Integer typeId;
    private String code;
    private Integer id;
}