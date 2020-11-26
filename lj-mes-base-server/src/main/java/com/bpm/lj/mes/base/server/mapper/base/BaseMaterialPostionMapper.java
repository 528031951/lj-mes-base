package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BaseMaterialPostion;
import com.bpm.lj.mes.base.server.domain.BaseMaterialPostionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMaterialPostionMapper {
    long countByExample(BaseMaterialPostionExample example);

    int deleteByExample(BaseMaterialPostionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseMaterialPostion record);

    int insertSelective(BaseMaterialPostion record);

    List<BaseMaterialPostion> selectByExample(BaseMaterialPostionExample example);

    BaseMaterialPostion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseMaterialPostion record, @Param("example") BaseMaterialPostionExample example);

    int updateByExample(@Param("record") BaseMaterialPostion record, @Param("example") BaseMaterialPostionExample example);

    int updateByPrimaryKeySelective(BaseMaterialPostion record);

    int updateByPrimaryKey(BaseMaterialPostion record);
}