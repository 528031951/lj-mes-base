//package com.bpm.lj.mes.base.server.controller;
//
//import com.bpm.lj.mes.base.common.vo.ResultVO;
//import com.bpm.lj.mes.base.server.dto.WarehouseProtectionDTO;
//import com.bpm.lj.mes.base.server.service.WarehouseProtectionService;
//import com.bpm.lj.mes.base.server.vo.WarehouseProtectionVo;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// *仓库管理-劳保用品管理
// */
//@RestController
//@RequestMapping(value = "/protection")
//@Api(description = "仓库管理-劳保用品管理")
//public class WarehouseProtectionController {
//    @Resource
//    private WarehouseProtectionService warehouseProtectionService;
//    @ApiOperation("分页查询")
//    @RequestMapping(
//            value = {"/selectPageList"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO selectPageList(WarehouseProtectionDTO dto) {
//        return warehouseProtectionService.selectPageList(dto);
//    }
//    @ApiOperation("领取")
//    @RequestMapping(
//            value = {"/addProtectionGroup"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO addProtectionGroup(WarehouseProtectionVo dto) {
//        return warehouseProtectionService.addProtectionGroup(dto);
//    }
//    @ApiOperation("删除")
//    @RequestMapping(
//            value = {"/deleted"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO deleted(Integer id) {
//        return warehouseProtectionService.deleted(id);
//    }
//}