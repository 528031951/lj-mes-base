//package com.bpm.lj.mes.base.server.controller;
//
//import com.bpm.lj.mes.base.common.vo.ResultVO;
//import com.bpm.lj.mes.base.server.dto.WarehouseInventeInDTO;
//import com.bpm.lj.mes.base.server.service.WarehouseInventeInService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// * 仓库管理-成品机虚拟入库.
// */
//@RestController
//@RequestMapping(value = "/inventeIn")
//@Api(description = "仓库管理-成品机虚拟入库")
//public class WarehouseInventeInController {
//    @Resource
//    private WarehouseInventeInService warehouseInventeInService;
//    @ApiOperation("分页查询")
//    @RequestMapping(
//            value = {"/selectPageList"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO selectPageList(WarehouseInventeInDTO dto) {
//        return warehouseInventeInService.queryPageList(dto);
//    }
//
//}