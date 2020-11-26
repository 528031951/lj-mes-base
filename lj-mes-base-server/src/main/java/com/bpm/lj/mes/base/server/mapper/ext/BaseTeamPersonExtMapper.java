package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.dto.BaseTeamPersonDTO;

import java.util.List;

public interface BaseTeamPersonExtMapper {

    List<BaseTeamPersonDTO> queryUserId(BaseTeamPersonDTO dto);

    List<BaseTeamPersonDTO> queryWorkCenterId(BaseTeamPersonDTO dto);

    void deleteBy(BaseTeamPersonDTO dto);

    void updateStatus(BaseTeamPersonDTO dto);

    void updateWorlCenterTeamStatus(BaseTeamPersonDTO dto);
}