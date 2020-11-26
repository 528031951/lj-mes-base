package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BaseInventoryAttributesDTO;
import com.bpm.lj.mes.base.server.dto.BaseInventoryAttributesExcel;
import com.bpm.lj.mes.base.server.dto.BaseInventoryAttributesQueryDTO;
import com.bpm.lj.mes.base.server.vo.BaseInventoryArchivesVo;
import com.bpm.lj.mes.base.server.vo.BaseInventoryAttributesExcelVo;

import java.util.List;

public interface BaseInventoryAttributesService {


    ResultVO selectPageList(BaseInventoryAttributesQueryDTO vo);

    ResultVO addInventory(BaseInventoryAttributesDTO dto);

    ResultVO deleted(Integer id);

    ResultVO materialList(String code);

    ResultVO materialType();

    ResultVO archivesList(BaseInventoryArchivesVo vo);

    /**
     * 导入
     * @param excelList
     */
    void addExcel(List<BaseInventoryAttributesExcel> excelList);

    /**
     * 查询导出数据
     * @return
     */
    List<BaseInventoryAttributesExcelVo> queryInventoryExcel();
}