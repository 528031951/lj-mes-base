package com.bpm.lj.mes.base.server.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * 机型工序工时维护表
 */
@Data
public class BaseBatchBomExcel {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 行号
     */
    @Excel(name = "行号")
    private String irowNo;
    /**
     * 级次
     */
    @Excel(name = "级次")
    private String cbomGrade;

    /**
     * 子件编码
     */
    @Excel(name = "子件编码")
    private String cinvCodeSub;

    /**
     * 子件属性(自制 采购 委外等)
     */
    @Excel(name = "子件属性(自制 采购 委外等)")
    private String cbomAttr;


}