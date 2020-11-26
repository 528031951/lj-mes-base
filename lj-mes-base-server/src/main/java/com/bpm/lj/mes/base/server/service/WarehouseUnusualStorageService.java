package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.WarehouseSalesReturnDTO;
import com.bpm.lj.mes.base.server.dto.WarehouseUnusualStorageDTO;

public interface WarehouseUnusualStorageService {
   //分页查询列表
   ResultVO quepageList(WarehouseUnusualStorageDTO dto);
   //申请退货
   ResultVO salesReturn(WarehouseSalesReturnDTO dto);
   //申请特采
   ResultVO special(WarehouseSalesReturnDTO dto);
   //关闭
   ResultVO close(Integer id);
   //寄存
   ResultVO register(Integer id,Integer registerNum);
}