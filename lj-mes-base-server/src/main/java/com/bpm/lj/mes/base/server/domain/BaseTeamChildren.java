package com.bpm.lj.mes.base.server.domain;

import java.util.Date;
import lombok.Data;

/**
 * 班组表详情
 */
@Data
public class BaseTeamChildren {
    private Integer id;

    /**
     * 班组id
     */
    private Integer teamId;

    /**
     * 工作中心id
     */
    private Integer locationId;

    /**
     * 是否启用
     */
    private Integer isEnable;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人id
     */
    private Integer creatorId;

    /**
     * 更新人id
     */
    private Integer updateId;

    /**
     * 创建时间
     */
    private Date creatorTime;
}