package com.bpm.lj.mes.base.server.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "储位打印")
public class WarehousePrintingVo extends PageDTO {
    private Integer id;
    @Excel(name = "货架code")
    private String code;
    @Excel(name = "货架名称")
    private String name;
    @Excel(name = "储位code")
    private String locationCode;
    @Excel(name = "储位名称")
    private String locationName;
    private Date createTime;
}
