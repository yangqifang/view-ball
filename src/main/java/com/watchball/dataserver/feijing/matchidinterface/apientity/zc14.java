package com.watchball.dataserver.feijing.matchidinterface.apientity;

import lombok.Data;

/**
 * 传统足彩-14场胜负彩、任9场胜负彩
 */
@Data
public class zc14 {

    /**
     * issueNum : 2020004
     * id : 1
     * matchId : 1721891
     * matchTime : 2020/1/11 4:00:00
     * home : 谢菲联
     * away : 西汉姆
     * homeId : 51
     * awayId : 62
     * league : 英超
     * isTurn : false
     * recordId : 239131
     */

    private String issueNum;
    private String id;
    private int matchId;
    private String matchTime;
    private String home;
    private String away;
    private int homeId;
    private int awayId;
    private String league;
    private boolean isTurn;
    private int recordId;

}
