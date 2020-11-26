package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.dto.BaseProcessDrawingsDTO;

import java.util.List;

public interface BaseProcessDrawingsExtMapper {
    List<BaseProcessDrawingsDTO> quueryPageList(BaseProcessDrawingsDTO dto);

    List<BaseProcessDrawingsDTO> addInventoryList(BaseProcessDrawingsDTO dto);

    Integer queryId(String code);

    Integer queryRemoval(String code);
}