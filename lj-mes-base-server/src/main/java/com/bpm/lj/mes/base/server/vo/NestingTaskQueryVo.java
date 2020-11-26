package com.bpm.lj.mes.base.server.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class NestingTaskQueryVo {
    private String  materialName;
    //
    private String  batchNo;
    //未锁定数量
    private BigDecimal inventoryNlockedNum;
    //锁定数量
    private BigDecimal  nlockedNum;
    private Integer detailId;
}
