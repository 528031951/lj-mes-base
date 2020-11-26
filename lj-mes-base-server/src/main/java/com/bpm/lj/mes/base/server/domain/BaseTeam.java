package com.bpm.lj.mes.base.server.domain;

import java.util.Date;
import lombok.Data;

/**
 * 班组表
 */
@Data
public class BaseTeam {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 班组名称
     */
    private String crewName;

    /**
     * 创建时间
     */
    private Date crewTime;

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
     * 车间id
     */
    private Integer workShopId;

    /**
     * 是否启用
     */
    private Integer isEnable;

    /**
     * 班组编码
     */
    private String teamCode;

    /**
     * 产线id
     */
    private Integer productionLineId;

    /**
     * 班组类型
     */
    private Integer teamType;

    private String type;

    private String type1;

    private String type2;

    private Integer status;

    private String teamName;
}