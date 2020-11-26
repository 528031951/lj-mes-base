package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.domain.WarehouseBathNumQuery;
import com.bpm.lj.mes.base.server.domain.WarehouseNestingTaskDetails;
import com.bpm.lj.mes.base.server.vo.NestingTaskNumVo;
import com.bpm.lj.mes.base.server.vo.NestingTaskQueryVo;

import java.util.List;

public interface WarehouseNestingTaskDetailsExtMapper {
   List<WarehouseNestingTaskDetails> setailsList(Integer id);
   void urgent(List<Integer> ids);
    Integer queryIsSet(NestingTaskQueryVo vo);
    List<NestingTaskQueryVo> queryNlockedNum(NestingTaskQueryVo vo);
    List<WarehouseBathNumQuery> queryChoose(NestingTaskQueryVo vo);
    void updateNum(NestingTaskNumVo vo);
    void updateDetailNum(NestingTaskNumVo vo);
}