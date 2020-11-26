package com.bpm.lj.mes.base.server.vo;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 物料货位返回对象
 */
@Data
@ApiModel(description = "物料货位返回对象")
public class BaseMaterialPostionVo extends PageDTO {
    private Integer id;


    /**
     * 物料编码
     */
    @ApiModelProperty("物料编码")
    private String cInvCode;

    /**
     * 物料名称
     */
    @ApiModelProperty("物料名称")
    private String cInvName;
    /**
     * 物料ID
     */
    private Integer materialId;

    /**
     * 货位ID
     */
    private Integer postionId;
  /**
     * 存货分类编码
     */
    @ApiModelProperty("货位编码")
    private String cPosCode;
  /**
     * 存货分类名称
     */
    @ApiModelProperty("货位名称")
    private String cPosName;


}