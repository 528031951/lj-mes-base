package com.bpm.lj.mes.base.server.service;


import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.DictionaryMaintenanceDTO;
import com.bpm.lj.mes.base.server.dto.DictionaryMaintenanceDeleteDTO;
import com.bpm.lj.mes.base.server.dto.DictionaryMaintenanceQueryDTO;

public interface DictionaryMaintenanceService {

    /**
     * 新增/修改字典维护
     *
     * @param dictionaryMaintenanceDTO
     * @return
     */
    ResultVO addDictionaryMaintenance(DictionaryMaintenanceDTO dictionaryMaintenanceDTO);

    /**
     * 删除字典维护
     *
     * @param dictionaryMaintenanceDeleteDTO
     * @return
     */
    ResultVO deleteDictionaryMaintenance(DictionaryMaintenanceDeleteDTO dictionaryMaintenanceDeleteDTO);

    /**
     * 查询字典维护
     *
     * @param dictionaryMaintenanceQueryDTO
     * @return
     */
    ResultVO selectDictionaryMaintenance(DictionaryMaintenanceQueryDTO dictionaryMaintenanceQueryDTO);

    /**
     * 根据名字查询字典维护
     *
     * @param dictionaryMaintenanceQueryDTO
     * @return
     */
    ResultVO selectDictionaryByName(DictionaryMaintenanceQueryDTO dictionaryMaintenanceQueryDTO);


}
