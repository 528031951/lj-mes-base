package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BaseLocation;
import com.bpm.lj.mes.base.server.domain.BaseLocationExample;
import com.bpm.lj.mes.base.server.dto.*;
import com.bpm.lj.mes.base.server.mapper.base.BaseLocationMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BaseLocationExtMapper;
import com.bpm.lj.mes.base.server.service.BmLocationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class BmLocationServiceImpl implements BmLocationService {

    @Autowired
    private BaseLocationMapper bmLocationMapper;

    @Autowired
    private BaseLocationExtMapper bmLocationExtMapper;

    /**
     * 新增/修改
     *
     * @param bmLocationDTO
     * @return
     */
    @Transactional
    @Override
    public ResultVO addBmLocation(BmLocationDTO bmLocationDTO) {
        BaseLocation bmLocation = new BaseLocation();
        BeanUtils.copyProperties(bmLocationDTO, bmLocation);
        bmLocation.setUpdateTime(new Date());
        if (bmLocationDTO.getId() == null) {
            bmLocation.setCreateTime(new Date());
            if (bmLocationDTO.getType() != 60) {
                List<BmLocationEquipmentDTO> dtos = bmLocationExtMapper.selectRepeat(bmLocationDTO);
                if(dtos.size()>0){
                    return ResultUtil.error("编码重复");
                }
                bmLocationMapper.insertSelective(bmLocation);
            }
        } else {
            List<BmLocationEquipmentDTO> dtos = bmLocationExtMapper.selectRepeat(bmLocationDTO);
            if(dtos.size()>0){
                return ResultUtil.error("编码重复");
            }

            bmLocationMapper.updateByPrimaryKeySelective(bmLocation);
        }
        List<BmLocationDTO> equipmentLlist = bmLocationDTO.getEquipmentLlist();
        if (equipmentLlist != null) {
            equipmentLlist.remove(null);
            if (bmLocationDTO.getEquipmentLlist().size() > 0) {
                for (BmLocationDTO dto : bmLocationDTO.getEquipmentLlist()) {
                    dto.setPId(bmLocationDTO.getPId());

                    BaseLocation bm = new BaseLocation();
                    bm.setName(dto.getName());
                    bm.setCode(dto.getCode());
                    bm.setCreateTime(new Date());
                    bm.setUpdateTime(new Date());
                    bm.setCreatorId(bmLocationDTO.getCreatorId());
                    bm.setUpdaterId(bmLocationDTO.getUpdaterId());
                    bm.setUpdateTime(new Date());
                    bm.setType(bmLocationDTO.getType());
                    bm.setPId(bmLocationDTO.getPId());
                    List<BmLocationNodeDTO> nodeDTOList = bmLocationExtMapper.selectLine(dto);
                    if (nodeDTOList.size() == 0) {
                        bmLocationMapper.insertSelective(bm);
                    }

                }
            }
        }


        return ResultUtil.success("成功！");
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public ResultVO deleteBmLocation(Long id) {

        List<BmLocationDTO> locationDTOList = bmLocationExtMapper.selectDelNodeList(id);
        if (locationDTOList.size() > 0) {
            return ResultUtil.error("下面有子节点");
        }

        bmLocationExtMapper.deleted(id.intValue());

        return ResultUtil.success("成功");
    }

    /**
     * 查询
     *
     * @param id
     * @return
     */
    @Override
    public ResultVO bmLocationtById(Long id) {
        BmLocationEquipmentDTO bmLocationEquipmentDTO = bmLocationExtMapper.selectById(id.intValue());

        return ResultUtil.success(bmLocationEquipmentDTO);
    }

    /**
     * 列表
     *
     * @return
     */
    @Override
    public ResultVO queryBmLocation() {
        BmLocationDTO bmLocationDTO = new BmLocationDTO();
        bmLocationDTO.setPId(null);
//        List<BmLocationTreeNode> bmLocationTreeNodes = bmLocationExtMapper.selectAllTree(bmLocationDTO);
//        List<BmLocationTreeNode> build = bmLocationTreeUtil.build(bmLocationTreeNodes, null);
        List<BmLocationTreeNode> bmLocationTreeNodes = recursiveTree(bmLocationDTO);
        return ResultUtil.success(bmLocationTreeNodes);

    }

    @Override
    public ResultVO tree() {
        BmLocationDTO bmLocationDTO = new BmLocationDTO();
        bmLocationDTO.setPId(null);
//        List<BmLocationTreeNode> bmLocationTreeNodes = bmLocationExtMapper.selectAllTree(bmLocationDTO);
//        List<BmLocationTreeNode> build = bmLocationTreeUtil.build(bmLocationTreeNodes, null);
        List<BmLocationTreeNode> bmLocationTreeNodes = recursiveTree(bmLocationDTO);
        return ResultUtil.success(bmLocationTreeNodes);
    }

    //递归树结构
    public List<BmLocationTreeNode> recursiveTree(BmLocationDTO bmLocationDTO) {

        //查询节点
        BmLocationDTO dto = new BmLocationDTO();
        bmLocationDTO.setPageSize(99999999);
        List<BmLocationTreeNode> bmLocationTreeNodes = bmLocationExtMapper.selectAllTree(bmLocationDTO);
        for (BmLocationTreeNode node : bmLocationTreeNodes) {

            dto.setPId(node.getId());
            dto.setType(node.getType());
            List<BmLocationTreeNode> treeNodes = recursiveTree(dto);
            if (!treeNodes.isEmpty()) {
                for (BmLocationTreeNode treeNode : treeNodes) {
                    node.getChildren().add(treeNode);
                }

            }
        }
        return bmLocationTreeNodes;


    }


    @Override
    public ResultVO selectLine(Long id) {
        BmLocationDTO dto = new BmLocationDTO();
        dto.setPId(id.intValue());
        List<BmLocationNodeDTO> locationNodeDTOList = bmLocationExtMapper.selectLine(dto);
        return ResultUtil.success(locationNodeDTOList);
    }

    @Override
    public ResultVO selectLineTree() {
        BmLocationDTO dto = new BmLocationDTO();
//     产线集合
        dto.setPageSize(99999999);
        List<BmLocationNodeDTO> locationNodeDTOList = bmLocationExtMapper.selectLine(dto);
        for (BmLocationNodeDTO bmLocationNodeDTO : locationNodeDTOList) {

            //工位集合
            List<BmLocationStationDTO> stationList = bmLocationExtMapper.selectStationLine(bmLocationNodeDTO.getId().longValue());

            for (BmLocationStationDTO equipment : stationList) {

                //设备集合
                List<BmLocationEquipmentDTO> equipmentList = bmLocationExtMapper.selectEquipmentLine(equipment.getId().longValue());
                equipment.setChildren(equipmentList);
            }
            bmLocationNodeDTO.setChildren(stationList);
        }
        return ResultUtil.success(locationNodeDTOList);
    }

    @Override
    public List<BmLocationDTO> workshopAndLine(Long type, Long pId) {
        BmLocationDTO bmLocationDTO = new BmLocationDTO();
        bmLocationDTO.setPId(pId.intValue());
        bmLocationDTO.setType(type.intValue());
        bmLocationDTO.setPageSize(9999999);
        List<BmLocationDTO> dtos = bmLocationExtMapper.queryNodeList(bmLocationDTO);
        return dtos;
    }


}