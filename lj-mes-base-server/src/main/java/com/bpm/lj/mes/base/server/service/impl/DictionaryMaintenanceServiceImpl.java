package com.bpm.lj.mes.base.server.service.impl;


import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BaseDictionaryMaintenance;
import com.bpm.lj.mes.base.server.dto.DictionaryMaintenanceDTO;
import com.bpm.lj.mes.base.server.dto.DictionaryMaintenanceDeleteDTO;
import com.bpm.lj.mes.base.server.dto.DictionaryMaintenanceQueryDTO;
import com.bpm.lj.mes.base.server.mapper.base.BaseDictionaryMaintenanceMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BaseDictionaryMaintenanceExtMapper;
import com.bpm.lj.mes.base.server.service.DictionaryMaintenanceService;
import com.bpm.lj.mes.base.server.util.DictionaryMaintenanceTreeUtil;
import com.bpm.lj.mes.base.server.vo.DictionaryMaintenanceTreeNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class DictionaryMaintenanceServiceImpl implements DictionaryMaintenanceService {

    @Resource
    private BaseDictionaryMaintenanceMapper baseDictionaryMaintenanceMapper;

    @Resource
    private BaseDictionaryMaintenanceExtMapper baseDictionaryMaintenanceExtMapper;


    /**
     * 新增/修改字典维护
     *
     * @param dictionaryMaintenanceDTO
     * @return
     */
    @Override
    public ResultVO addDictionaryMaintenance(DictionaryMaintenanceDTO dictionaryMaintenanceDTO) {
        log.info("新增/修改字典维护的对象的id:" + dictionaryMaintenanceDTO.getId()
                + ";parentId(父级id):" + dictionaryMaintenanceDTO.getParentId()
                + ";code(字典编码):" + dictionaryMaintenanceDTO.getCode()
                + ";name(字典名称):" + dictionaryMaintenanceDTO.getName()
                + ";status(状态（0-启用，1-停用）):" + dictionaryMaintenanceDTO.getStatus());
        BaseDictionaryMaintenance baseDictionaryMaintenance = null;
        if (dictionaryMaintenanceDTO.getId() != null) {
            /*修改*/
            /*查询修改的name或code是否与其他数据的name或code重复*/
            baseDictionaryMaintenance = baseDictionaryMaintenanceExtMapper.selectIsRepate(dictionaryMaintenanceDTO);
            if (baseDictionaryMaintenance != null) {/*重复*/
                return ResultUtil.error("字典编码或者字典名称已存在！");
            } else {/*不重复*/
                baseDictionaryMaintenance = baseDictionaryMaintenanceMapper.selectByPrimaryKey(dictionaryMaintenanceDTO.getId());
                BeanUtils.copyProperties(dictionaryMaintenanceDTO, baseDictionaryMaintenance);
                baseDictionaryMaintenance.setUpdateTime(new Date());
                return ResultUtil.success(baseDictionaryMaintenanceMapper.updateByPrimaryKey(baseDictionaryMaintenance));
            }
        } else {
            /*新增*/
            /*查询修改的name或code是否与其他数据的name或code重复*/
            baseDictionaryMaintenance = baseDictionaryMaintenanceExtMapper.selectIsRepate(dictionaryMaintenanceDTO);
            if (baseDictionaryMaintenance != null) {/*重复*/
                return ResultUtil.error("字典编码或者字典名称已存在！");
            } else {/*不重复则新增*/
                baseDictionaryMaintenance = new BaseDictionaryMaintenance();
                BeanUtils.copyProperties(dictionaryMaintenanceDTO, baseDictionaryMaintenance);
                baseDictionaryMaintenance.setCreateTime(new Date());
                return ResultUtil.success(baseDictionaryMaintenanceMapper.insertSelective(baseDictionaryMaintenance));
            }

        }
    }

    /**
     * 删除字典维护
     *
     * @param dictionaryMaintenanceDeleteDTO
     * @return
     */
    @Override
    public ResultVO deleteDictionaryMaintenance(DictionaryMaintenanceDeleteDTO dictionaryMaintenanceDeleteDTO) {
        log.info("删除字典的id:" + dictionaryMaintenanceDeleteDTO.getId()
                + ";status(状态(0-启用  1-停用)):" + dictionaryMaintenanceDeleteDTO.getStatus());
        baseDictionaryMaintenanceExtMapper.deleteByPrimaryKey(dictionaryMaintenanceDeleteDTO);
        return ResultUtil.success("删除成功");
    }

    /**
     * 查询字典维护
     *
     * @param dictionaryMaintenanceQueryDTO
     * @return
     */
    @Override
    public ResultVO selectDictionaryMaintenance(DictionaryMaintenanceQueryDTO dictionaryMaintenanceQueryDTO) {
        List<DictionaryMaintenanceTreeNode> dictionaryMaintenanceVoList = baseDictionaryMaintenanceExtMapper.selectDictionaryMaintenancePageList(dictionaryMaintenanceQueryDTO);
        List<DictionaryMaintenanceTreeNode> dictionaryMaintenanceTreeNodeList = DictionaryMaintenanceTreeUtil.build(dictionaryMaintenanceVoList, null);
        return ResultUtil.success(dictionaryMaintenanceTreeNodeList);
    }

    /**
     * 根据名字查字典
     *
     * @param dictionaryMaintenanceQueryDTO
     * @return
     */
    @Override
    public ResultVO selectDictionaryByName(DictionaryMaintenanceQueryDTO dictionaryMaintenanceQueryDTO) {
        DictionaryMaintenanceTreeNode maintenanceTreeNode = baseDictionaryMaintenanceExtMapper.selectDicByName(dictionaryMaintenanceQueryDTO.getName());
        dictionaryMaintenanceQueryDTO = new DictionaryMaintenanceQueryDTO();
        List<DictionaryMaintenanceTreeNode> dictionaryMaintenanceVoList = baseDictionaryMaintenanceExtMapper.selectDictionaryMaintenancePageList(dictionaryMaintenanceQueryDTO);
        if (maintenanceTreeNode != null) {
            List<DictionaryMaintenanceTreeNode> dictionaryMaintenanceTreeNodeList = DictionaryMaintenanceTreeUtil.oneBuild(dictionaryMaintenanceVoList, maintenanceTreeNode);
            return ResultUtil.success(dictionaryMaintenanceTreeNodeList);
        } else {
            return ResultUtil.error("没有这个字典");
        }

    }


}
