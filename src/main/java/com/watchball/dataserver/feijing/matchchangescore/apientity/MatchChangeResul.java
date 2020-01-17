package com.watchball.dataserver.feijing.matchchangescore.apientity;

import lombok.Data;

/**
 * 即时变化的比分数据 接口返回的实体
 */
@Data
public class MatchChangeResul {


    private int matchId;//比赛ID
    /**
     * 比赛状态
     * 0：未开
     * 1：上半场
     * 2：中场
     * 3：下半场
     * 4：加时
     * 5：点球
     * -1：完场
     * -10：取消
     * -11：待定
     * -12：腰斩
     * -13：中断
     * -14：推迟
     */
    private int state;
    //主队得分  常规时间
    private int homeScore;
    //客队得分 常规时间
    private int awayScore;
    //主队上半场得分
    private int homeHalfScore;
    //客队上半场得分
    private int awayHalfScore;
    //主队红牌数
    private int homeRed;
    //客队红牌数
    private int awayRed;
    //    主队黄牌数
    private int homeYellow;
    //    客队黄牌数
    private int awayYellow;
    //主队角球数
    private int homeCorner;
    //客队角球数
    private int awayCorner;
    //是否有阵容 1：有
    //null：无
    private String hasLineup;
    //比赛时间
    private String matchTime;
    //开场时间
    //state=1：返回上半场开场时间；
    //state=3：返回下半场开场时间。
    private String startTime;
    //比赛说明
    private String explain;
    //比赛说明2
    private String extraExplain;
}
