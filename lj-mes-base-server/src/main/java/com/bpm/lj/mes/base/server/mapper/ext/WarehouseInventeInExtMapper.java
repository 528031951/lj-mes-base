package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.dto.WarehouseInventeInDTO;

import java.util.List;

public interface WarehouseInventeInExtMapper {

    List<WarehouseInventeInDTO> queryPageList(WarehouseInventeInDTO dto);

}