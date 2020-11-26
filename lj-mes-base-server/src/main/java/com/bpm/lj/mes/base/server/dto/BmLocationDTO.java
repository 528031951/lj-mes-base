package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@ApiModel(description = "工厂模型对像")
public class BmLocationDTO extends PageDTO {
    private Integer id;

    /**
     * 类型，10：集团，20：工厂，30：车间，40：产线，50：工位，60：设备'
     */
    @ApiModelProperty("类型，10：集团，20：工厂，30：车间，40：产线，50：工位，60：设备")
    private Integer type;

    /**
     * 父ID
     */
    @ApiModelProperty("父ID")
    private Integer pId;

    /**
     * 编号
     */
    @ApiModelProperty("编号")
    private String code;

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    private String name;
    private String equipmentTypeName;
    private String equipmentCode;

    /**
     * 排序
     */
    @ApiModelProperty("排序")
    private Integer sort;
    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
     * 创建人id
     */
    @ApiModelProperty("创建人id")
    private Integer creatorId;
    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private Date updateTime;
    /**
     * 更新人id
     */
    @ApiModelProperty("更新人id")
    private Integer updaterId;
    private Integer processId;

   List<BmLocationDTO> list ;
   List<BmLocationDTO> equipmentLlist ;
}