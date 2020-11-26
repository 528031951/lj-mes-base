package com.bpm.lj.mes.base.server.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * 物料货位返回对象
 */
@Data
public class BaseMaterialPostionExcel {
    private Integer id;
    /**
     * 物料ID
     */
    private Integer materialId;

    /**
     * 货位ID
     */
    private Integer postionId;

    /**
     * 物料编码
     */
    @Excel(name = "物料编码")
    private String cInvCode;

    /**
     * 物料名称
     */
    @Excel(name = "物料名称")
    private String cInvName;

    /**
     * 存货分类编码
     */
    @Excel(name = "货位编码")
    private String cPosCode;
    /**
     * 存货分类名称
     */
    @Excel(name = "货位名称")
    private String cPosName;


}