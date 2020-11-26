package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * <p>Title: BmShiftDTO</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2020/5/22 7:57 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
@Data
@ApiModel(description = "班次模型对像")
public class BmShiftDTO extends PageDTO {
    /**
     * 主键
     */
    @ApiModelProperty("主键")
    private Integer id;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private Date updateTime;

    /**
     * 创建人
     */
    @ApiModelProperty("创建人")
    private Integer creatorId;

    /**
     * 修改人
     */
    @ApiModelProperty("修改人")
    private Integer updateId;

    /**
     * 车间id
     */
    @ApiModelProperty("车间id")
    private Integer workShopId;

    /**
     *  班次名称
     */
    @ApiModelProperty("班次名称")
    private String shiftName;

    /**
     * 开始时间
     */
    @ApiModelProperty("开始时间")
    private String startTime;

    /**
     * 结束时间
     */
    @ApiModelProperty("结束时间")
    private String endTime;

    /**
     * 班次编码
     */
    @ApiModelProperty("班次编码")
    private String shiftCode;

    /**
     * 是否启用
     */
    @ApiModelProperty("是否启用 1开启  0关闭")
    private String isEnable;

    /**
     * 产线id
     */
    @ApiModelProperty("产线id")
    private Integer productionLineId;

    //车间id
    @ApiModelProperty("车间id")
    private Integer factoryId;

    //
    @ApiModelProperty("")
    private Integer lineId;
    private Integer typeId;

}
