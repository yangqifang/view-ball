package com.watchball.dataserver.feijing.matchidinterface.apientity;

import lombok.Data;

@Data
public class bd {

    /**
     * issueNum : 20012
     * id : 1
     * matchId : 1824793
     * matchTime : 2020/1/8 1:30:00
     * home : 沃洛斯
     * away : 阿特罗米托斯
     * homeId : 35725
     * awayId : 1778
     * league : 希腊杯
     * isTurn : false
     * recordId : 239155
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
