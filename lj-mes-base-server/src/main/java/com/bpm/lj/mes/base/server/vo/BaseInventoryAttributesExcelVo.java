package com.bpm.lj.mes.base.server.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * @description:  物料属性维护导出
 * @author: hanmh
 * @time: 2020/11/25 13:43
 */
@Data
public class BaseInventoryAttributesExcelVo {
    @Excel(name = "存货编码")
    private String cinvCode;
    @Excel(name = "存货名称")
    private String cinvName;
    @Excel(name = "物料代码")
    private String cinvAddCode;
    @Excel(name = "规格型号")
    private String cinvStd;
    @Excel(name = "存货分类编码")
    private String cinvcCode;
    @Excel(name = "库龄(天)")
    private Integer libraryAge;
    @Excel(name = "最高库存量")
    private Integer maxStock;
    @Excel(name = "最低库存量")
    private Integer miniStock;
    @Excel(name = "请购天数")
    private Integer requisitionDay;
}
