package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.WarehouseProtectionDTO;
import com.bpm.lj.mes.base.server.vo.WarehouseProtectionVo;

public interface WarehouseProtectionService {
    ResultVO selectPageList(WarehouseProtectionDTO dto);
    ResultVO  addProtectionGroup(WarehouseProtectionVo vo );
    ResultVO  deleted(Integer id );
}