package com.bpm.lj.mes.base.server.controller;

import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.bpm.common.service.util.ExcelExportStyle;
import com.bpm.common.service.util.ExcelUtil;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BaseInventoryAttributesDTO;
import com.bpm.lj.mes.base.server.dto.BaseInventoryAttributesExcel;
import com.bpm.lj.mes.base.server.dto.BaseInventoryAttributesQueryDTO;
import com.bpm.lj.mes.base.server.service.BaseInventoryAttributesService;
import com.bpm.lj.mes.base.server.vo.BaseInventoryArchivesVo;
import com.bpm.lj.mes.base.server.vo.BaseInventoryAttributesExcelVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

/**
 * 物料属性维护.
 */
@RestController
@RequestMapping(value = "/materialMaintenance")
@Api(description = "物料属性维护")
public class BaseInventoryAttributesController {
    @Resource
    private BaseInventoryAttributesService baseInventoryAttributesService;

    @ApiOperation("新增、修改")
    @RequestMapping(value = "/addInventory", method = RequestMethod.POST)
    public ResultVO addInventory(@RequestBody BaseInventoryAttributesDTO dto) {
        return baseInventoryAttributesService.addInventory(dto);
    }


    @ApiOperation("分页查询")
    @RequestMapping(
            value = {"/selectPageList"},
            method = {RequestMethod.GET}
    )
    public ResultVO selectPageList(BaseInventoryAttributesQueryDTO dto) {
        return baseInventoryAttributesService.selectPageList(dto);
    }

    @ApiOperation("删除")
    @RequestMapping(
            value = {"/deleted"},
            method = {RequestMethod.GET}
    )
    public ResultVO deleted(Integer id) {
        return baseInventoryAttributesService.deleted(id);
    }

    @ApiOperation("物料名称集合")
    @RequestMapping(
            value = {"/materialList"},
            method = {RequestMethod.GET}
    )
    public ResultVO materialList(String code) {
        return baseInventoryAttributesService.materialList(code);
    }

    @ApiOperation("物料分类集合")
    @RequestMapping(
            value = {"/materialType"},
            method = {RequestMethod.GET}
    )
    public ResultVO materialType() {
        return baseInventoryAttributesService.materialType();
    }

    @ApiOperation("物料档案打印")
    @RequestMapping(
            value = {"/archivesList"},
            method = {RequestMethod.GET}
    )
    public ResultVO archivesList(BaseInventoryArchivesVo vo) {
        return baseInventoryAttributesService.archivesList(vo);
    }


    @ApiOperation("导出物料属性维护EXCEL")
    @RequestMapping(
            value = {"/selectExportExcel"},
            method = {RequestMethod.GET}
    )
    public void selectExportExcel(HttpServletResponse response) throws IOException {
        List<BaseInventoryAttributesExcelVo> inventoryAttributesExcelVos = baseInventoryAttributesService.queryInventoryExcel();
        //设置样式参数
        ExportParams exportParams = new ExportParams(null, null, ExcelType.XSSF);
        exportParams.setStyle(ExcelExportStyle.class);
        //导出操作
        ExcelUtil.exportExcel(inventoryAttributesExcelVos, BaseInventoryAttributesExcelVo.class, "物料属性维护", exportParams, response);
    }

    @ApiOperation("导入excel数据")
    @RequestMapping(
            value = {"/importExcel"},
            method = {RequestMethod.POST}
    )
    public void importExcelDemo(@RequestParam("file") MultipartFile file) throws IOException {
        //导入操作
        List<BaseInventoryAttributesExcel> excelList = ExcelUtil.importExcel(file, 0, 1, BaseInventoryAttributesExcel.class);
        baseInventoryAttributesService.addExcel(excelList);
    }


    /**
     * 模板下载
     * @param
     * @author kaima2
     */
    @ApiOperation(value = "物料属性维护新增模板下载")
    @RequestMapping(value = "/downloadExcel", method = RequestMethod.GET)
    @ResponseBody
    public void downloadExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
        InputStream is= this.getClass().getResourceAsStream("/templates/物料属性维护模板.xlsx");
        byte[] fileData = input2byte(is);
        downloadFile(response, request, "物料属性维护模板.xlsx", fileData);
    }

    /**
     * inputstream转Byte[]
     * @param inStream
     * @return
     * @throws IOException
     */
    private  byte[] input2byte(InputStream inStream)
            throws IOException {
        ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
        byte[] buff = new byte[100];
        int rc = 0;
        while ((rc = inStream.read(buff, 0, 100)) > 0) {
            swapStream.write(buff, 0, rc);
        }
        byte[] in2b = swapStream.toByteArray();
        return in2b;
    }

    /**
     * 下载
     * @param response
     * @param request
     * @param filename
     * @param fileData
     * @return
     */
    private boolean downloadFile(HttpServletResponse response,HttpServletRequest request, String filename, byte[] fileData) {
        try {
            OutputStream myout = null;
            // 检查时候获取到数据
            if (fileData == null) {
                response.sendError(HttpStatus.NO_CONTENT.value());
                return false;
            }
            try {
                if(request.getHeader("User-Agent").toUpperCase().indexOf("MSIE") > 0) {
                    filename = new String(filename.getBytes("GBK"),"iso-8859-1");
                }else{
                    filename = URLEncoder.encode(filename, "utf-8");
                }
                //response.setContentType("multipart/form-data");
                response.setContentType("multipart/form-data;charset=utf-8");
                response.setHeader("content-disposition","attachment;filename="+filename);
                // 写明要下载的文件的大小
                response.setContentLength(fileData.length);
                // 从response对象中得到输出流,准备下载
                myout = response.getOutputStream();
                myout.write(fileData);
                myout.flush();
            } catch (Exception e) {
            } finally {
                if (myout != null) {
                    try {
                        myout.close();
                    } catch (Exception e) {
                    }
                }
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }

}