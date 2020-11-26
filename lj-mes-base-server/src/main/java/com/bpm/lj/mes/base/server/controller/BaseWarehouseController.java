package com.bpm.lj.mes.base.server.controller;


import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BaseWarehouseDTO;
import com.bpm.lj.mes.base.server.service.BaseWarehouseService;
import com.bpm.lj.mes.base.server.vo.DeptVo;
import com.bpm.lj.mes.base.server.vo.WarehousePrintingVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/***
 * @ClassName: DepotManagementController
 * @Description: 库房管理
 * @Auther: tianjian
 * @Date: 2020/5/28 10:42
 * @version : V1.0
 */
@RestController
@RequestMapping(value = "/depotManagement")
@Api(description = "库房管理")
public class BaseWarehouseController {

    /*@Autowired
    DdSrmOrderClient ddSrmOrderClient;*/

    @Autowired
    BaseWarehouseService baseDepotManagementService;

//    @Autowired
//    BaseFluentRackService baseFluentRackService;
//
//    @Autowired
//    BaseHighLevelRackService baseHighLevelRackService;
//
//    @Autowired
//    BaseDepotToMatterService baseDepotToMatterService;

    @RequestMapping(
            value = {"/addDepot"},
            method = {RequestMethod.POST}
    )
    @ResponseBody
    @ApiOperation("新增仓库")
    public ResultVO addDepotManagement(@RequestBody BaseWarehouseDTO baseDepotManagementDTO) {
        return baseDepotManagementService.addBaseDepotManagement(baseDepotManagementDTO);
    }

    @RequestMapping(
            value = {"/updateDepotManagement"},
            method = {RequestMethod.PUT}
    )
    @ResponseBody
    @ApiOperation("修改仓库信息")
    public ResultVO updateDepotManagement(@RequestBody BaseWarehouseDTO baseDepotManagementDTO) {
        return baseDepotManagementService.updateBaseDepotManagement(baseDepotManagementDTO);
    }

    @RequestMapping(
            value = {"/deleteDepot"},
            method = {RequestMethod.DELETE}
    )
    @ApiOperation("删除仓库")
    public ResultVO deleteDepotManagement(@RequestParam Long id) {
        return baseDepotManagementService.deleteBaseDepotManagement(id);
    }

    @RequestMapping(
            value = {"/findDepot"},
            method = {RequestMethod.GET}
    )
    @ResponseBody
    @ApiOperation("查询储位树")
    public ResultVO findDepotManagement(Integer id) {
        return baseDepotManagementService.findBaseDepotManagements(id);
    }


    @RequestMapping(
            value = {"/warehousePrinting"},
            method = {RequestMethod.GET}
    )
    @ResponseBody
    @ApiOperation("储位标签打印")
    public ResultVO warehousePrinting(WarehousePrintingVo vo) {
        return baseDepotManagementService.warehousePrinting(vo);
    }

    @RequestMapping(
            value = {"/locationList"},
            method = {RequestMethod.GET}
    )
    @ResponseBody
    @ApiOperation("储位集合")
    public ResultVO locationList(Integer type) {
        return baseDepotManagementService.locationList(type);
    }

    @RequestMapping(
            value = {"/erpLocationList"},
            method = {RequestMethod.POST}
    )
    @ResponseBody
    @ApiOperation("erp仓库集合")
    public ResultVO erpLocationList(@RequestBody DeptVo vo) {
        return baseDepotManagementService.erpLocationList(vo);
    }

    @RequestMapping(
            value = {"/typeList"},
            method = {RequestMethod.POST}
    )
    @ResponseBody
    @ApiOperation("typeList")
    public ResultVO typeList() {
        return baseDepotManagementService.typeList();
    }
}
