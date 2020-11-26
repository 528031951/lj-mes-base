package com.bpm.lj.mes.base.server.controller;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BaseTeamDTO;
import com.bpm.lj.mes.base.server.dto.BaseTeamQueryDTO;
import com.bpm.lj.mes.base.server.service.BaseTeamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>Title:  班组管理</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2020/4/6 4:42 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
@RestController
@RequestMapping(value = "/team")
@Api(description = "班组管理")
public class BaseTeamController {

    @Autowired
    private BaseTeamService baseTeamService;


    @ApiOperation("新增/修改班组")
    @RequestMapping(value = "/addTeam", method = RequestMethod.POST)
    public ResultVO add(@RequestBody BaseTeamDTO bmTeamDTO) {

        return baseTeamService.addTeam(bmTeamDTO);
    }

    @ApiOperation("根据设备id查询班组信息")
    @RequestMapping(
            value = {"/bmTeamById/{id}"},
            method = {RequestMethod.GET}
    )
    public ResultVO bmTeamById(@PathVariable Long id) {

        return baseTeamService.queryInfoById(id);
    }

    @ApiOperation("删除班组")
    @RequestMapping(value = "/deleteTeamID/{id}", method = RequestMethod.DELETE)
    public ResultVO deleteBmTeam(@PathVariable Long id) {
        return baseTeamService.deleteTeam(id);
    }

    @ApiOperation("班组查询")
    @RequestMapping(
            value = {"/queryTeam"},
            method = {RequestMethod.POST}
    )
    public ResultVO queryBmTeam(@RequestBody BaseTeamQueryDTO bmTeamDTO) {
        return baseTeamService.queryTeamList(bmTeamDTO);
    }

    @ApiOperation("班组查询下面的人员")
    @RequestMapping(
            value = {"/queryTeamPerson"},
            method = {RequestMethod.GET}
    )
    public ResultVO queryTeamPerson(Long id) {
        return baseTeamService.queryUserList(id);
    }
//    @ApiOperation("线长集合")
//    @RequestMapping(
//            value = {"/queryLineSupervisorList"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO queryLineSupervisorList() {
//        return baseTeamService.queryLineSupervisorList();
//    }

    @ApiOperation("班组所有的人员")
    @RequestMapping(
            value = {"/queryAllPerson"},
            method = {RequestMethod.GET}
    )
    public ResultVO queryAllPerson() {
        return baseTeamService.queryAllUserList();
    }

    @ApiOperation("工作中心集合")
    @RequestMapping(
            value = {"/queryWorkCenter"},
            method = {RequestMethod.GET}
    )
    public ResultVO queryWorkCenter(Integer id) {
        return baseTeamService.queryWorkCenter(id);
    }

    @ApiOperation("已选择的工作中心集合")
    @RequestMapping(
            value = {"/queryEnbleWorkCenter"},
            method = {RequestMethod.GET}
    )
    public ResultVO queryEnbleWorkCenter(Integer id) {
        return baseTeamService.queryEnbleWorkCenter(id);
    }


}
