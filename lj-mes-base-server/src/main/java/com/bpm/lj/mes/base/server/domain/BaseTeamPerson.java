package com.bpm.lj.mes.base.server.domain;

import java.util.Date;
import lombok.Data;

/**
 * 班组用户表
 */
@Data
public class BaseTeamPerson {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date creatTime;

    /**
     * 创建时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Integer creatorId;

    /**
     * 修改人
     */
    private Integer updateId;

    /**
     * 班组id
     */
    private Integer teamId;

    /**
     * 用户id
     */
    private Integer userId;

    private String type;

    private Integer status;
}