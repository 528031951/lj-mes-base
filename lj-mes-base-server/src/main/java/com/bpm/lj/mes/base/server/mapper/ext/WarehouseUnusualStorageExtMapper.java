package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.dto.WarehouseUnusualStorageDTO;

import java.util.List;

public interface WarehouseUnusualStorageExtMapper {
    List<WarehouseUnusualStorageDTO> queryPageList(WarehouseUnusualStorageDTO dto);
}