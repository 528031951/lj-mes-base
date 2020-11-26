package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.WarehouseBathNumQuery;
import com.bpm.lj.mes.base.server.domain.WarehouseBathNumQueryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseBathNumQueryMapper {
    long countByExample(WarehouseBathNumQueryExample example);

    int deleteByExample(WarehouseBathNumQueryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WarehouseBathNumQuery record);

    int insertSelective(WarehouseBathNumQuery record);

    List<WarehouseBathNumQuery> selectByExample(WarehouseBathNumQueryExample example);

    WarehouseBathNumQuery selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WarehouseBathNumQuery record, @Param("example") WarehouseBathNumQueryExample example);

    int updateByExample(@Param("record") WarehouseBathNumQuery record, @Param("example") WarehouseBathNumQueryExample example);

    int updateByPrimaryKeySelective(WarehouseBathNumQuery record);

    int updateByPrimaryKey(WarehouseBathNumQuery record);
}