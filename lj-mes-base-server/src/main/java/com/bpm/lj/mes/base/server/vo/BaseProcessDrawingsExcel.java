package com.bpm.lj.mes.base.server.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * 工艺图纸管理
 */
@Data
public class BaseProcessDrawingsExcel {
    private Integer id;


    /**
     * 存货分类编码
     */
    @Excel(name = "存货分类编码")
    private String cinvccode;

    /**
     * 存货分类名称
     */
    @Excel(name = "存货分类名称")
    private String cinvcname;

    /**
     * 物料编码
     */
    @Excel(name = "物料编码")
    private String cinvcode;

    /**
     * 物料代码
     */
    @Excel(name = "物料代码")
    private String ciinvaddcode;

    /**
     * 物料名称
     */
    @Excel(name = "物料名称")
    private String ciinvname;

    /**
     * 规格型号
     */
    @Excel(name = "规格型号")
    private String cinvstd;

    /**
     * 图号
     */
    @Excel(name = "图号")
    private String drawingNo;

    /**
     * 版本号
     */
    @Excel(name = "版本号")
    private String versionNo;

    /**
     * 是否保存工艺图纸,
     */
    @Excel(name = "是否保存工艺图纸", replace = {"是_1", "否_0"})
    private Integer isDrawing;

    /**
     * 是否保存工艺卡
     */
    @Excel(name = "是否保存工艺卡", replace = {"是_1", "否_0"})
    private Integer isCard;
    /**
     * 工艺图纸路径
     */
    @Excel(name = "工艺图纸路径")
    private String drawingPath;
}