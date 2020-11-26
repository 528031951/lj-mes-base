//package com.bpm.lj.mes.base.server.controller;
//
//import com.bpm.lj.mes.base.common.vo.ResultVO;
//import com.bpm.lj.mes.base.server.dto.WarehouseTaskTimeSetDTO;
//import com.bpm.lj.mes.base.server.service.WarehouseTaskTimeSetService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
///**
// * 物料属性维护.
// */
//@RestController
//@RequestMapping(value = "/warehouseTask")
//@Api(description = "仓库管理-任务时间设置")
//public class WarehouseTaskTimeSetController {
//    @Resource
//    private WarehouseTaskTimeSetService warehouseTaskTimeSetService;
//
//    @ApiOperation("新增/修改")
//    @RequestMapping(value = "/addWarehouseTaskTime", method = RequestMethod.POST)
//    public ResultVO add(@RequestBody WarehouseTaskTimeSetDTO dto) {
//
//        return warehouseTaskTimeSetService.addWarehouseTaskTime(dto);
//    }
//
//    @ApiOperation("分页查询")
//    @RequestMapping(
//            value = {"/quepageList"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO selectPageList(WarehouseTaskTimeSetDTO dto) {
//        return warehouseTaskTimeSetService.quepageList(dto);
//    }
//
//    @ApiOperation("删除")
//    @RequestMapping(
//            value = {"/deleted"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO deleted(Integer id) {
//        return warehouseTaskTimeSetService.deleted(id);
//    }
//
//
//}