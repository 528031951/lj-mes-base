package com.bpm.lj.mes.base.server.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

@Data
public class MaterialPostionExcel {

    /**
     * 物料编码
     */
    @Excel(name = "物料编码")
    private String cinvCode;

    /**
     * 物料名称
     */
    @Excel(name = "物料名称")
    private String cinvName;

    /**
     * 存货分类编码
     */
    @Excel(name = "货位编码")
    private String cposCode;
    /**
     * 存货分类名称
     */
    @Excel(name = "货位名称")
    private String cposName;
}
