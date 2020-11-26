package com.bpm.lj.mes.base.server.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 物料属性表
 */
@Data
@ApiModel(description = "物料属性表返回对象")
public class BaseMaterialVo {
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
    private String cIInvName;

  /**
     * 存货分类编码
     */
    @ApiModelProperty("存货分类编码")
    private String cInvCCode;
  /**
     * 存货分类名称
     */
    @ApiModelProperty("存货分类名称")
    private String cInvCName;


}