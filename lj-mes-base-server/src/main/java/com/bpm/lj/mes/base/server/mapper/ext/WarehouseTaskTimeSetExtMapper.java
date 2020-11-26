package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.dto.WarehouseTaskTimeSetDTO;

import java.util.List;

public interface WarehouseTaskTimeSetExtMapper {
    List<WarehouseTaskTimeSetDTO> quepageList(WarehouseTaskTimeSetDTO dto);
}