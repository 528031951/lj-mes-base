package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.WarehouseNestingTaskDTO;
import com.bpm.lj.mes.base.server.vo.NestingTaskNumVo;

import java.util.List;

public interface WarehouseNestingTaskService {
  ResultVO pageList(WarehouseNestingTaskDTO warehouseNestingTaskDTO);
  ResultVO updateStatus(Integer id);
  ResultVO details(Integer id);
  ResultVO taskDetails(Integer id);
  ResultVO urgent(List<Integer> ids);
  //齐套详情
  ResultVO setDetails(Integer id);
  //选择挪用
  ResultVO selectChoose(String materialName);
  //确认挪用
  ResultVO confirm(NestingTaskNumVo vo);
}