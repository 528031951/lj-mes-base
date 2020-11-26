package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BaseWarehouseDTO;
import com.bpm.lj.mes.base.server.vo.DeptVo;
import com.bpm.lj.mes.base.server.vo.WarehousePrintingVo;

/***
 * @ClassName: BaseDepotManagementService
 * @Description: 库存管理
 * @Auther: tianjian
 * @Date: 2020/6/2 15:47
 * @version : V1.0
 */
public interface BaseWarehouseService {
    ResultVO addBaseDepotManagement(BaseWarehouseDTO baseDepotManagementDTO);

    ResultVO updateBaseDepotManagement(BaseWarehouseDTO baseDepotManagementDTO);

    ResultVO deleteBaseDepotManagement(Long id);

    ResultVO findBaseDepotManagements(Integer id);

    ResultVO findBaseDepotManagementById(Long id);

    ResultVO findBaseDepotManagementByParentId(Long parentId);

    ResultVO printBaseDepotManagements();

    ResultVO warehousePrinting(WarehousePrintingVo dto);

    ResultVO locationList(Integer type);

    ResultVO erpLocationList(DeptVo vo);

    ResultVO typeList();

//    ResultVO findAllRegion(Long id);
//
//    ResultVO findAllShelves(Long id);

//    ResultVO updateRegionById(BaseRegionDTO baseRegionDTO);
//
//    ResultVO updateShelvesById(BaseShelvesDTO baseShelvesDTO);
//
//    ResultVO deleteRegionById(BaseRegionDTO baseRegionDTO);
//
//    ResultVO deleteShelvesById(BaseShelvesDTO baseShelvesDTO);
//
//    ResultVO addRegion(BaseRegionDTO baseRegionDTO);
//
//    ResultVO addShelves(BaseShelvesDTO baseShelvesDTO);

//    ResultVO queryDepotList(Long id);
//
//    int findDownNodeCount(Long id);
//
//    ResultVO selectRegionById(Long id);
//
//    ResultVO selectShelvesById(Long id);
//
//    ResultVO findStorage(Long id);
//
//    ResultVO findStorageDetail(Long id);

//    ResultVO updateStorage(BaseHighLevelRackDTO baseHighLevelRackDTO);
//
//    ResultVO addStorage(BaseHighLevelRackDTO baseHighLevelRackDTO);
//
//    ResultVO deleteStorage(BaseHighLevelRackDTO baseHighLevelRackDTO);
}
