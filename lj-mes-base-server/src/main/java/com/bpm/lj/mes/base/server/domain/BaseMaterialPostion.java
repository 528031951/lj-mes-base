package com.bpm.lj.mes.base.server.domain;

import lombok.Data;

/**
 * 货位物料表
 */
@Data
public class BaseMaterialPostion {
    private Integer id;

    /**
     * 物料ID
     */
    private Integer materialId;

    /**
     * 货位ID
     */
    private Integer postionId;
}