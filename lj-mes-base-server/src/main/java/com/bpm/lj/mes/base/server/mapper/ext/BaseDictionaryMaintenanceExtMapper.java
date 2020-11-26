package com.bpm.lj.mes.base.server.mapper.ext;


import com.bpm.lj.mes.base.server.domain.BaseDictionaryMaintenance;
import com.bpm.lj.mes.base.server.dto.DictionaryMaintenanceDTO;
import com.bpm.lj.mes.base.server.dto.DictionaryMaintenanceDeleteDTO;
import com.bpm.lj.mes.base.server.dto.DictionaryMaintenanceQueryDTO;
import com.bpm.lj.mes.base.server.vo.DictionaryMaintenanceTreeNode;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseDictionaryMaintenanceExtMapper {
    /**
     * 分页查询dictionaryMaintenanceDTO
     *
     * @param dictionaryMaintenanceQueryDTO
     * @return
     */
    List<DictionaryMaintenanceTreeNode> selectDictionaryMaintenancePageList(DictionaryMaintenanceQueryDTO dictionaryMaintenanceQueryDTO);

    /**
     * 查询是否重复
     *
     * @param dictionaryMaintenanceDTO
     * @return
     */
    BaseDictionaryMaintenance selectIsRepate(DictionaryMaintenanceDTO dictionaryMaintenanceDTO);

    /**
     * 删除请求对象
     *
     * @param dictionaryMaintenanceDeleteDTO
     * @return
     */
    void deleteByPrimaryKey(DictionaryMaintenanceDeleteDTO dictionaryMaintenanceDeleteDTO);


    /**
     * 根据名字查主键
     *
     * @param name
     * @return
     */
    Integer selectByName(@Param(value = "name") String name);

    /**
     * 根据名字查字典
     *
     * @param name
     * @return
     */
    DictionaryMaintenanceTreeNode selectDicByName(@Param(value = "name") String name);


}