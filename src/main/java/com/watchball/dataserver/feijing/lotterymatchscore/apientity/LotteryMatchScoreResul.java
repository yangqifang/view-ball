package com.watchball.dataserver.feijing.lotterymatchscore.apientity;

import lombok.Data;

/**
 * 彩票比赛的比分数据
 */
@Data
public class LotteryMatchScoreResul {
    //    比赛ID
    private int matchId;
    //    颜色值~
    private String color;
    //类型 1：联赛 2：杯赛
    private int kind;
    //联赛ID
    private int leagueId;
    //    联赛英文名
    private String leagueEn;

    private String leagueChs;

    private String leagueCht;

    private String subLeagueId;

    private String subLeague;

    private String matchTime;

    private String startTime;

    private String homeEn;

    private String homeChs;

    private String homeCht;

    private String awayEn;

    private String awayChs;

    private String awayCht;

    private int homeId;

    private int awayId;

    private int state;

    private int homeScore;

    private int awayScore;

    private int homeHalfScore;

    private int awayHalfScore;

    private int homeRed;

    private int awayRed;

    private int homeYellow;

    private int awayYellow;

    private int homeCorner;

    private int awayCorner;

    private String homeRank;

    private String awayRank;

    private boolean isNeutral;

    private String hasLineup;

    private String explain;

    private String extraExplain;

}
