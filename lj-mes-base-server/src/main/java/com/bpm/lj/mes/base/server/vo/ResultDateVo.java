package com.bpm.lj.mes.base.server.vo;

import lombok.Data;

import java.util.List;

@Data
public class ResultDateVo {
    private  String time;
    private List<BaseSchedulingVo> list;
}
