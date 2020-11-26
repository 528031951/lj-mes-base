package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BaseTeam;
import com.bpm.lj.mes.base.server.domain.BaseTeamChildren;
import com.bpm.lj.mes.base.server.domain.BaseTeamPerson;
import com.bpm.lj.mes.base.server.dto.BaseTeamDTO;
import com.bpm.lj.mes.base.server.dto.BaseTeamPersonDTO;
import com.bpm.lj.mes.base.server.dto.BaseTeamQueryDTO;
import com.bpm.lj.mes.base.server.mapper.base.BaseTeamChildrenMapper;
import com.bpm.lj.mes.base.server.mapper.base.BaseTeamMapper;
import com.bpm.lj.mes.base.server.mapper.base.BaseTeamPersonMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BaseTeamExtMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BaseTeamPersonExtMapper;
import com.bpm.lj.mes.base.server.service.BaseTeamService;
import com.bpm.lj.mes.base.server.vo.BaseTeamVo;
import com.bpm.lj.mes.base.server.vo.SysUserVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class BaseTeamServiceImpl implements BaseTeamService {
    @Resource
    private BaseTeamExtMapper teamExtMapper;
    @Resource
    private BaseTeamMapper teamMapper;
//    @Resource
//    private BaseLineSupervisorExtMapper baseLineSupervisorExtMapper;

    @Resource
    private BaseTeamPersonMapper baseTeamPersonMapper;
    @Resource
    private BaseTeamPersonExtMapper baseTeamPersonExtMapper;
    @Resource
    private BaseTeamChildrenMapper baseTeamChildrenMapper;


    @Transactional
    @Override
    public ResultVO addTeam(BaseTeamDTO dto) {
        BaseTeam baseTeam = new BaseTeam();
        BeanUtils.copyProperties(dto, baseTeam);
        baseTeam.setUpdateTime(new Date());
        baseTeam.setCrewTime(new Date());
        int byCode = teamExtMapper.queryByCode(dto);
        if (byCode != 0) {
            return ResultUtil.error("编码重复");
        }
        if (dto.getId() == null) {
//            baseTeam.setCreateTime(new Date());
            teamMapper.insertSelective(baseTeam);
            for (Long userId : dto.getUserIds()) {
                BaseTeamPerson baseTeamPerson = new BaseTeamPerson();
                baseTeamPerson.setUserId(userId.intValue());
                baseTeamPerson.setTeamId(baseTeam.getId());
                baseTeamPerson.setStatus(1);
                baseTeamPerson.setCreatTime(new Date());
                baseTeamPersonMapper.insertSelective(baseTeamPerson);
            }
            for (Integer integer : dto.getWorkCenter()) {
                BaseTeamChildren baseTeamChildren = new BaseTeamChildren();
                baseTeamChildren.setCreatorTime(new Date());
                baseTeamChildren.setIsEnable(1);
                baseTeamChildren.setLocationId(integer);
                baseTeamChildren.setTeamId(baseTeam.getId());
                baseTeamChildrenMapper.insertSelective(baseTeamChildren);
            }

        } else {
            teamMapper.updateByPrimaryKeySelective(baseTeam);
            //接收的用户ID
            if (dto.getUserIds().size() > 0) {
                List<Long> productionLineIds = dto.getUserIds();
                BaseTeamPersonDTO baseTeamPersonDTO = new BaseTeamPersonDTO();
                baseTeamPersonDTO.setTeamId(dto.getId());
                baseTeamPersonDTO.setStatus(0);
                //删除该班组原有的人

                baseTeamPersonExtMapper.updateStatus(baseTeamPersonDTO);
                //新增选择的人员
                for (Long userId : productionLineIds) {
                    BaseTeamPerson baseTeamPerson = new BaseTeamPerson();
                    baseTeamPerson.setUserId(userId.intValue());
                    baseTeamPerson.setTeamId(baseTeam.getId());
                    baseTeamPerson.setStatus(1);
                    BaseTeamPersonDTO personDTO = new BaseTeamPersonDTO();
                    BeanUtils.copyProperties(baseTeamPerson, personDTO);
                    List<BaseTeamPersonDTO> dtoList = baseTeamPersonExtMapper.queryUserId(personDTO);
                    if (dtoList.size() == 0) {
                        baseTeamPerson.setCreatTime(new Date());
                        baseTeamPersonMapper.insertSelective(baseTeamPerson);
                    } else {
                        baseTeamPersonExtMapper.updateStatus(personDTO);
                    }
                }

            } else {
                BaseTeamPersonDTO baseTeamPersonDTO = new BaseTeamPersonDTO();
                baseTeamPersonDTO.setTeamId(dto.getId());
                baseTeamPersonDTO.setStatus(0);
                //删除该班组原有的人
                baseTeamPersonExtMapper.updateStatus(baseTeamPersonDTO);
            }

            addWorkCenterTeam(baseTeam, dto);
        }

        return ResultUtil.success();
    }

    private void addWorkCenterTeam(BaseTeam baseTeam, BaseTeamDTO dto) {
        //接收的用户ID
        if (dto.getWorkCenter().size() > 0) {
            List<Integer> workCenterIds = dto.getWorkCenter();
            BaseTeamPersonDTO baseTeamPersonDTO = new BaseTeamPersonDTO();
            baseTeamPersonDTO.setTeamId(dto.getId());
            baseTeamPersonDTO.setIsEnable(0);
            //删除该班组原有的人
            baseTeamPersonExtMapper.updateWorlCenterTeamStatus(baseTeamPersonDTO);
            //新增选择的人员
            for (Integer workCenterId : workCenterIds) {
                BaseTeamChildren baseTeamChildren = new BaseTeamChildren();
                baseTeamChildren.setLocationId(workCenterId);
                baseTeamChildren.setTeamId(baseTeam.getId());
                baseTeamChildren.setIsEnable(1);
                BaseTeamPersonDTO personDTO = new BaseTeamPersonDTO();
                BeanUtils.copyProperties(baseTeamChildren, personDTO);
                List<BaseTeamPersonDTO> dtoList = baseTeamPersonExtMapper.queryWorkCenterId(personDTO);
                if (dtoList.size() == 0) {
                    baseTeamChildren.setCreatorTime(new Date());
                    baseTeamChildrenMapper.insertSelective(baseTeamChildren);
                } else {
                    baseTeamPersonExtMapper.updateWorlCenterTeamStatus(personDTO);
                }
            }

        } else {
            BaseTeamPersonDTO baseTeamPersonDTO = new BaseTeamPersonDTO();
            baseTeamPersonDTO.setTeamId(dto.getId());
            baseTeamPersonDTO.setIsEnable(0);
            //删除该班组原有的人
            baseTeamPersonExtMapper.updateWorlCenterTeamStatus(baseTeamPersonDTO);
        }
    }


    @Transactional
    @Override
    public ResultVO deleteTeam(Long id) {
        BaseTeamPersonDTO baseTeamPersonDTO = new BaseTeamPersonDTO();
        baseTeamPersonDTO.setTeamId(id.intValue());
        BaseTeam baseTeam = teamMapper.selectByPrimaryKey(id.intValue());
        if (baseTeam.getStatus() != null) {
            if (baseTeam.getStatus() == 1) {
                return ResultUtil.error("启用状态不能删除");
            }
        }
        baseTeamPersonExtMapper.deleteBy(baseTeamPersonDTO);
        teamMapper.deleteByPrimaryKey(id.intValue());
        return ResultUtil.success();
    }

    @Override
    public ResultVO queryTeamList(BaseTeamQueryDTO dto) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<BaseTeamVo> baseTeamVos = teamExtMapper.queryBaseTeam(dto);
        PageInfo<BaseTeamVo> pageInfo = new PageInfo<>(baseTeamVos);
        PageInfoVO<Object> pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }

//    @Override
//    public ResultVO queryLineSupervisorList() {
//        List<BaseLineSupervisor> baseLineSupervisorList = baseLineSupervisorExtMapper.selectPageList(new BaseLineSupervisorDTO());
//        return ResultUtil.success(baseLineSupervisorList);
//    }

    @Override
    public ResultVO queryAllUserList() {
        List<SysUserVo> sysUserVos = teamExtMapper.queryAllUser();
        List<SysUserVo> sysUser = new ArrayList<>(sysUserVos);
//        List<Integer> list = teamExtMapper.queryChoosedUser();
//        for (SysUserVo sysUserVo : sysUserVos) {
//            for (Integer iter : list) {
//                if (sysUserVo.getId().intValue() == iter) {
//                    sysUser.remove(sysUserVo);
//                }
//            }
//        }
        return ResultUtil.success(sysUser);
    }

    @Override
    public ResultVO queryUserList(Long id) {
        return ResultUtil.success(teamExtMapper.queryUser(id));
    }

    @Override
    public ResultVO queryInfoById(Long id) {
        return ResultUtil.success(teamMapper.selectByPrimaryKey(id.intValue()));
    }

    @Override
    public ResultVO queryWorkCenter(Integer id) {
        List<SysUserVo> sysUserVos = teamExtMapper.queryWorkCenter();
        return ResultUtil.success(sysUserVos);
    }

    @Override
    public ResultVO queryEnbleWorkCenter(Integer id) {
        SysUserVo sysUserVo = new SysUserVo();
        sysUserVo.setTeamId(id);
        List<SysUserVo> sysUserVos = teamExtMapper.queryEnableWorkCenterById(sysUserVo);
        return ResultUtil.success(sysUserVos);
    }
}
