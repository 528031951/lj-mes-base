package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.WarehouseTaskTimeSetDTO;

public interface WarehouseTaskTimeSetService {
   ResultVO quepageList(WarehouseTaskTimeSetDTO dto);
   ResultVO addWarehouseTaskTime(WarehouseTaskTimeSetDTO dto);
   ResultVO deleted(Integer id);
}