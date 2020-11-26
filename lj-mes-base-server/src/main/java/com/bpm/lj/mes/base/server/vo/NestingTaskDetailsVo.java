package com.bpm.lj.mes.base.server.vo;

import com.bpm.lj.mes.base.server.domain.WarehouseNestingTaskDetails;
import lombok.Data;

import java.util.List;

@Data
public class NestingTaskDetailsVo {
    private List<WarehouseNestingTaskDetails> warehouseNestingTaskDetails;
    private Integer isSet;
}
