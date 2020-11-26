package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.dto.WarehouseProtectionDTO;
import com.bpm.lj.mes.base.server.vo.WarehouseProtectionVo;

import java.util.List;

public interface WarehouseProtectionExtMapper {
    List<WarehouseProtectionVo> selectPageList(WarehouseProtectionDTO dto);

}