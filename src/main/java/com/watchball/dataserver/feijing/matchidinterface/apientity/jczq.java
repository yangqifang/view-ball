package com.watchball.dataserver.feijing.matchidinterface.apientity;

import lombok.Data;

@Data
public class jczq {

    /**
     * id : 周三002
     * matchId : 1825878
     * matchTime : 2020/1/8 21:15:00
     * home : 泰国23
     * away : 巴林23
     * homeId : 5198
     * awayId : 5202
     * league : 亚青U23
     * isTurn : false
     * recordId : 3082002
     */

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public int getHomeId() {
        return homeId;
    }

    public void setHomeId(int homeId) {
        this.homeId = homeId;
    }

    public int getAwayId() {
        return awayId;
    }

    public void setAwayId(int awayId) {
        this.awayId = awayId;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public boolean isIsTurn() {
        return isTurn;
    }

    public void setIsTurn(boolean isTurn) {
        this.isTurn = isTurn;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }
}
