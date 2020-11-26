package com.bpm.lj.mes.base.server.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description: 物料属性维护导入EXECl
 * @author: hanmh
 * @time: 2020/11/25 11:02
 */
@Data
public class BaseInventoryAttributesExcel {
    @ApiModelProperty("物料档案ID")
    private Integer autoId;
    @Excel(name = "库龄(天)")
    private Integer libraryAge;
    @Excel(name = "最低库存量")
    private BigDecimal miniStock;
    @Excel(name = "最高库存量")
    private BigDecimal maxStock;
    @Excel(name = "物料代码")
    private String ciInvAddCode;
    @Excel(name = "存货编码")
    private String cinvCode;
    @Excel(name = "请购天数")
    private Integer requisitionDay;

}
