package com.bpm.lj.mes.base.server.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class NestingTaskNumVo {
    private BigDecimal  number;
    private Integer detailId;
    private Integer chooseId;
}
