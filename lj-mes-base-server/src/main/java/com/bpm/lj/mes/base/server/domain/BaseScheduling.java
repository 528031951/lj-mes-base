package com.bpm.lj.mes.base.server.domain;

import lombok.Data;

/**
 * 排班表
 */
@Data
public class BaseScheduling {
    private Integer id;

    /**
     * 日期
     */
    private String formatTime;

    /**
     * 班组id
     */
    private Integer teamId;

    /**
     * 班次id
     */
    private Integer shiftId;
}