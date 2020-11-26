package com.bpm.lj.mes.base.server.controller;

import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.bpm.common.service.util.ExcelExportStyle;
import com.bpm.common.service.util.ExcelUtil;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BomOpcomponent;
import com.bpm.lj.mes.base.server.dto.BaseBatchBomDTO;
import com.bpm.lj.mes.base.server.service.BaseBatchBomService;
import com.bpm.lj.mes.base.server.vo.BaseBatchBomExcel;
import com.bpm.lj.mes.base.server.vo.BaseBatchBomVo;
import com.bpm.lj.mes.base.server.vo.DeleteBomVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 批号管理.
 */
@RestController
@RequestMapping(value = "/batchBom")
@Api(description = "批号管理")
public class BaseBatchBomController {
    @Resource
    private BaseBatchBomService baseBatchBomService;


    @ApiOperation("分页查询")
    @RequestMapping(
            value = {"/queryPageList"},
            method = {RequestMethod.GET}
    )
    public ResultVO selectPageList(BaseBatchBomDTO dto) {
        return baseBatchBomService.pageList(dto);
    }

    @ApiOperation("bomList")
    @RequestMapping(
            value = {"/bomList"},
            method = {RequestMethod.GET}
    )
    public ResultVO bomList(BaseBatchBomVo vo) {
        return baseBatchBomService.bomList(vo);
    }

    @ApiOperation("绑定BOM")
    @RequestMapping(
            value = {"/bindingBom"},
            method = {RequestMethod.GET}
    )
    public ResultVO bindingBom(Integer id, Integer bomId) {
        return baseBatchBomService.bindingBom(id, bomId);
    }

    @ApiOperation("配置bom")
    @RequestMapping(
            value = {"/chrildBom"},
            method = {RequestMethod.GET}
    )
    public ResultVO chrildBom(Integer bomId) {
        return baseBatchBomService.chrildBom(bomId);
    }

    @ApiOperation("子件下拉")
    @RequestMapping(
            value = {"/componentList"},
            method = {RequestMethod.GET}
    )
    public ResultVO componentList(String name) {
        return baseBatchBomService.componentList(name);
    }

    @ApiOperation("新增bom")
    @RequestMapping(
            value = {"/addBom"},
            method = {RequestMethod.POST}
    )
    public ResultVO addBom(@RequestBody BomOpcomponent bomOpcomponent) {
        return baseBatchBomService.addBom(bomOpcomponent);
    }

    @ApiOperation("删除bom")
    @RequestMapping(
            value = {"/deleteBom"},
            method = {RequestMethod.POST}
    )
    public ResultVO deleteBom(@RequestBody DeleteBomVo vo) {
        return baseBatchBomService.deleteBom(vo.getIds());
    }

    @ApiOperation("模板导出excel数据")
    @RequestMapping(
            value = {"/exportExcelDemo"},
            method = {RequestMethod.GET}
    )
    public void exportExcelDemo(HttpServletResponse response) throws IOException {
        List<BaseBatchBomExcel> bmDemoExcelList = new ArrayList<>();
        BaseBatchBomExcel bmDemoExcel = new BaseBatchBomExcel();
        bmDemoExcelList.add(bmDemoExcel);
        //设置样式参数
        ExportParams exportParams = new ExportParams(null, null, ExcelType.XSSF);
        exportParams.setStyle(ExcelExportStyle.class);
        //导出操作
        ExcelUtil.exportExcel(bmDemoExcelList, BaseBatchBomExcel.class, "test", exportParams, response);
    }


    @ApiOperation("导入excel数据")
    @RequestMapping(
            value = {"/importExcel"},
            method = {RequestMethod.POST}
    )
    public ResultVO importExcelDemo(@RequestParam("file") MultipartFile file, Integer bomId) throws IOException {
        //导入操作
        List<BaseBatchBomExcel> bmDemoExcelList = ExcelUtil.importExcel(file, 0, 1, BaseBatchBomExcel.class);

        return baseBatchBomService.addBomExcel(bmDemoExcelList, bomId);

    }

}