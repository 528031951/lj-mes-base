package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.dto.BaseModelProcessTimeDTO;
import com.bpm.lj.mes.base.server.vo.DeptVo;
import com.bpm.lj.mes.base.server.vo.ProcessVo;

import java.util.List;

public interface BaseModelProcessTimeExtMapper {
    List<BaseModelProcessTimeDTO> queryPageList(BaseModelProcessTimeDTO dto);

    List<BaseModelProcessTimeDTO> queryPageDetails(String machineCode);

    List<ProcessVo> queryProcess(Integer id);

    List<ProcessVo> queryProcessName(Integer id);

    List<DeptVo> queryDepartment(Integer teamId);

    List<DeptVo> teamList();

    Integer queryWorkId(String code);

    Integer queryProcessId(String code);
}