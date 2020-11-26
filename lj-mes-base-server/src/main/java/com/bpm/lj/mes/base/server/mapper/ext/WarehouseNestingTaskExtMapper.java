package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.dto.WarehouseNestingTaskDTO;

import java.util.List;

public interface WarehouseNestingTaskExtMapper {
  List<WarehouseNestingTaskDTO> pageList(WarehouseNestingTaskDTO warehouseNestingTaskDTO);
}