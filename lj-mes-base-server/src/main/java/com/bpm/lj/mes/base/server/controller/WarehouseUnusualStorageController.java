//package com.bpm.lj.mes.base.server.controller;
//
//import com.bpm.lj.mes.base.common.vo.ResultVO;
//import com.bpm.lj.mes.base.server.dto.WarehouseSalesReturnDTO;
//import com.bpm.lj.mes.base.server.dto.WarehouseUnusualStorageDTO;
//import com.bpm.lj.mes.base.server.service.WarehouseUnusualStorageService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// * 仓库管理-入库异常管理.
// */
//@RestController
//@RequestMapping(value = "/warehouseUnusual")
//@Api(description = "仓库管理-入库异常管理")
//public class WarehouseUnusualStorageController {
//    @Resource
//    private WarehouseUnusualStorageService warehouseUnusualStorageService;
//    @ApiOperation("分页查询")
//    @RequestMapping(
//            value = {"/quepageList"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO selectPageList(WarehouseUnusualStorageDTO dto) {
//        return warehouseUnusualStorageService.quepageList(dto);
//    }
//
//    @ApiOperation("申请退货")
//    @RequestMapping(
//            value = {"/salesReturn"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO salesReturn(WarehouseSalesReturnDTO dto) {
//        return warehouseUnusualStorageService.salesReturn(dto);
//    }
//    @ApiOperation("申请特采")
//    @RequestMapping(
//            value = {"/special"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO special(WarehouseSalesReturnDTO dto) {
//        return warehouseUnusualStorageService.special(dto);
//    }
//    @ApiOperation("寄存")
//    @RequestMapping(
//            value = {"/register"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO register(Integer id,Integer registerNum) {
//        return warehouseUnusualStorageService.register(id, registerNum);
//    }
//    @ApiOperation("关闭")
//    @RequestMapping(
//            value = {"/close"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO close(Integer id) {
//        return warehouseUnusualStorageService.close(id);
//    }
//
//
//}