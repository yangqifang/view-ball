package com.watchball.dataserver.feijing.matchidinterface.apientity;

import lombok.Data;

@Data
public class zc6 {

    /**
     * issueNum : 2020004
     * id : 1
     * matchId : 1724418
     * matchTime : 2020/1/11 3:00:00
     * home : 阿雅克
     * away : 格勒诺
     * homeId : 194
     * awayId : 393
     * league : 法乙
     * isTurn : false
     * recordId : 239145
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
