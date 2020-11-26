package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BaseInventoryAttributes;
import com.bpm.lj.mes.base.server.domain.BaseInventoryAttributesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseInventoryAttributesMapper {
    long countByExample(BaseInventoryAttributesExample example);

    int deleteByExample(BaseInventoryAttributesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseInventoryAttributes record);

    int insertSelective(BaseInventoryAttributes record);

    List<BaseInventoryAttributes> selectByExample(BaseInventoryAttributesExample example);

    BaseInventoryAttributes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseInventoryAttributes record, @Param("example") BaseInventoryAttributesExample example);

    int updateByExample(@Param("record") BaseInventoryAttributes record, @Param("example") BaseInventoryAttributesExample example);

    int updateByPrimaryKeySelective(BaseInventoryAttributes record);

    int updateByPrimaryKey(BaseInventoryAttributes record);
}