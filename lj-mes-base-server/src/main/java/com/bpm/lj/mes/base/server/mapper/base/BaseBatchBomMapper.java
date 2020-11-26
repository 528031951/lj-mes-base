package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BaseBatchBom;
import com.bpm.lj.mes.base.server.domain.BaseBatchBomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseBatchBomMapper {
    long countByExample(BaseBatchBomExample example);

    int deleteByExample(BaseBatchBomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseBatchBom record);

    int insertSelective(BaseBatchBom record);

    List<BaseBatchBom> selectByExample(BaseBatchBomExample example);

    BaseBatchBom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseBatchBom record, @Param("example") BaseBatchBomExample example);

    int updateByExample(@Param("record") BaseBatchBom record, @Param("example") BaseBatchBomExample example);

    int updateByPrimaryKeySelective(BaseBatchBom record);

    int updateByPrimaryKey(BaseBatchBom record);
}