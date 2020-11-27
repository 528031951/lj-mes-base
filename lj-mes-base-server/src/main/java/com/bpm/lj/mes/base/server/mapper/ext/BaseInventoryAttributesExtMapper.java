package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.domain.BaseInventoryAttributes;
import com.bpm.lj.mes.base.server.dto.BaseInventoryAttributesExcel;
import com.bpm.lj.mes.base.server.dto.BaseInventoryAttributesQueryDTO;
import com.bpm.lj.mes.base.server.vo.*;

import java.util.List;

public interface BaseInventoryAttributesExtMapper {


    List<BaseInventoryAttributesVo> selectPageList(BaseInventoryAttributesQueryDTO vo);

    List<BaseMaterialVo> materialList(BaseInventoryAttributesQueryDTO dto);

    List<BaseMaterialVo> materialType();

    List<BaseInventoryArchivesVo> archivesList(BaseInventoryArchivesVo vo);

    List<InventoryVo> selectAllByMateria(List<BaseInventoryAttributesExcel> list);

    List<BaseInventoryAttributes> selectInventoryAttributes(List<InventoryVo> list);


    void addInventoryAttributes(List<BaseInventoryAttributes> list);

    List<BaseInventoryAttributesExcelVo> selectListInventoryAttributes();


    void updateInventoryAttributes(List<BaseInventoryAttributes> list);
}