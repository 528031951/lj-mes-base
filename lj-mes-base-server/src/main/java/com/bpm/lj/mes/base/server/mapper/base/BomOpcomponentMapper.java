package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BomOpcomponent;
import com.bpm.lj.mes.base.server.domain.BomOpcomponentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BomOpcomponentMapper {
    long countByExample(BomOpcomponentExample example);

    int deleteByExample(BomOpcomponentExample example);

    int deleteByPrimaryKey(Integer autoid);

    int insert(BomOpcomponent record);

    int insertSelective(BomOpcomponent record);

    List<BomOpcomponent> selectByExample(BomOpcomponentExample example);

    BomOpcomponent selectByPrimaryKey(Integer autoid);

    int updateByExampleSelective(@Param("record") BomOpcomponent record, @Param("example") BomOpcomponentExample example);

    int updateByExample(@Param("record") BomOpcomponent record, @Param("example") BomOpcomponentExample example);

    int updateByPrimaryKeySelective(BomOpcomponent record);

    int updateByPrimaryKey(BomOpcomponent record);
}