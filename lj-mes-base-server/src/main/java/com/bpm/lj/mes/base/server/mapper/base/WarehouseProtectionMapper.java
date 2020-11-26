package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.WarehouseProtection;
import com.bpm.lj.mes.base.server.domain.WarehouseProtectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseProtectionMapper {
    long countByExample(WarehouseProtectionExample example);

    int deleteByExample(WarehouseProtectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WarehouseProtection record);

    int insertSelective(WarehouseProtection record);

    List<WarehouseProtection> selectByExample(WarehouseProtectionExample example);

    WarehouseProtection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WarehouseProtection record, @Param("example") WarehouseProtectionExample example);

    int updateByExample(@Param("record") WarehouseProtection record, @Param("example") WarehouseProtectionExample example);

    int updateByPrimaryKeySelective(WarehouseProtection record);

    int updateByPrimaryKey(WarehouseProtection record);
}