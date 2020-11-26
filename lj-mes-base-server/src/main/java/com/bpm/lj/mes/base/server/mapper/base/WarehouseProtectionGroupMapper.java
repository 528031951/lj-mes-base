package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.WarehouseProtectionGroup;
import com.bpm.lj.mes.base.server.domain.WarehouseProtectionGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseProtectionGroupMapper {
    long countByExample(WarehouseProtectionGroupExample example);

    int deleteByExample(WarehouseProtectionGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WarehouseProtectionGroup record);

    int insertSelective(WarehouseProtectionGroup record);

    List<WarehouseProtectionGroup> selectByExample(WarehouseProtectionGroupExample example);

    WarehouseProtectionGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WarehouseProtectionGroup record, @Param("example") WarehouseProtectionGroupExample example);

    int updateByExample(@Param("record") WarehouseProtectionGroup record, @Param("example") WarehouseProtectionGroupExample example);

    int updateByPrimaryKeySelective(WarehouseProtectionGroup record);

    int updateByPrimaryKey(WarehouseProtectionGroup record);
}