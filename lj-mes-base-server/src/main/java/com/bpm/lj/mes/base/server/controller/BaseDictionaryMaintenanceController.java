package com.bpm.lj.mes.base.server.controller;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.DictionaryMaintenanceDTO;
import com.bpm.lj.mes.base.server.dto.DictionaryMaintenanceDeleteDTO;
import com.bpm.lj.mes.base.server.dto.DictionaryMaintenanceQueryDTO;
import com.bpm.lj.mes.base.server.service.DictionaryMaintenanceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: BaseDictionaryMaintenanceController</p>
 * <p>Description: 字典维护控制类</p>
 * <p>Company: http://www.wootion.com/</p>
 * <p>create date: 2020/09/15</p>
 *
 * @author :wushuang
 * @version :1.0
 */
@RestController
@RequestMapping(value = "/dictionary-maintenance")
@Api(description = "字典维护控制类")
public class BaseDictionaryMaintenanceController {
    @Autowired
    private DictionaryMaintenanceService dictionaryMaintenanceService;


    @ApiOperation("新增/修改字典维护")
    @RequestMapping(
            value = {"/addDictionaryMaintenance"},
            method = {RequestMethod.POST}
    )
    public ResultVO addDictionaryMaintenance(@RequestBody DictionaryMaintenanceDTO dictionaryMaintenanceDTO) {
        return dictionaryMaintenanceService.addDictionaryMaintenance(dictionaryMaintenanceDTO);
    }

    @ApiOperation("删除字典维护")
    @RequestMapping(
            value = {"/deleteDictionaryMaintenance"},
            method = {RequestMethod.DELETE}
    )
    public ResultVO deleteDictionaryMaintenance(DictionaryMaintenanceDeleteDTO dictionaryMaintenanceDeleteDTO) {
        return dictionaryMaintenanceService.deleteDictionaryMaintenance(dictionaryMaintenanceDeleteDTO);
    }

    @ApiOperation("查询字典维护")
    @RequestMapping(
            value = {"/selectDictionaryMaintenance"},
            method = {RequestMethod.GET}
    )
    public ResultVO selectDictionaryMaintenance(DictionaryMaintenanceQueryDTO dictionaryMaintenanceQueryDTO) {
        return dictionaryMaintenanceService.selectDictionaryMaintenance(dictionaryMaintenanceQueryDTO);
    }

    @ApiOperation("根据字典名称查字典")
    @RequestMapping(
            value = {"/selectDictionaryMaintenanceByName"},
            method = {RequestMethod.GET}
    )
    public ResultVO selectDictionaryMaintenanceByName(DictionaryMaintenanceQueryDTO dictionaryMaintenanceQueryDTO) {
        return ResultUtil.success(dictionaryMaintenanceService.selectDictionaryByName(dictionaryMaintenanceQueryDTO));
    }


}
