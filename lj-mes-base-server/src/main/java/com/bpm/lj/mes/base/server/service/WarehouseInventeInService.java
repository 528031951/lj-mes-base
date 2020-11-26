package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.WarehouseInventeInDTO;

public interface WarehouseInventeInService {
    ResultVO queryPageList(WarehouseInventeInDTO dto);
}