package com.bpm.lj.mes.base.server.mapper.ext;


import com.bpm.lj.mes.base.server.dto.*;

import java.util.List;

public interface BaseLocationExtMapper {


    List<BmLocationDTO> queryNodeList(BmLocationDTO bmLocationDTO);

    List<BmLocationDTO> selectDelNodeList(Long id);

    List<BmLocationNodeDTO> selectLine(BmLocationDTO dto);

    List<BmLocationStationDTO> selectStationLine(Long pId);

    List<BmLocationEquipmentDTO> selectEquipmentLine(Long pId);

    List<BmLocationEquipmentDTO> selectRepeat(BmLocationDTO dto);

    List<BmLocationTreeNode> selectAllTree(BmLocationDTO bmLocationDTO);

    BmLocationEquipmentDTO selectLineName(Long id);

    void deleteEquipment(Long pId);

    void updateEquipmentInfo(BmLocationDTO bmLocationDto);
    void deleted(Integer id);
    BmLocationEquipmentDTO selectById(Integer id);
}