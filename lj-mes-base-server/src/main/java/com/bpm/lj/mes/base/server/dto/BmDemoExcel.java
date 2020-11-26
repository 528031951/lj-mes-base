package com.bpm.lj.mes.base.server.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

@Data
public class BmDemoExcel {

    /**
     * 名字
     */
    @Excel(name = "姓名")
    private String name;
}
