package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BaseDictionaryMaintenance;
import com.bpm.lj.mes.base.server.domain.BaseDictionaryMaintenanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseDictionaryMaintenanceMapper {
    long countByExample(BaseDictionaryMaintenanceExample example);

    int deleteByExample(BaseDictionaryMaintenanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseDictionaryMaintenance record);

    int insertSelective(BaseDictionaryMaintenance record);

    List<BaseDictionaryMaintenance> selectByExample(BaseDictionaryMaintenanceExample example);

    BaseDictionaryMaintenance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseDictionaryMaintenance record, @Param("example") BaseDictionaryMaintenanceExample example);

    int updateByExample(@Param("record") BaseDictionaryMaintenance record, @Param("example") BaseDictionaryMaintenanceExample example);

    int updateByPrimaryKeySelective(BaseDictionaryMaintenance record);

    int updateByPrimaryKey(BaseDictionaryMaintenance record);
}