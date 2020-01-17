package com.watchball.dataserver.feijing.bettingodds.apientity;

import lombok.Data;

/**
 * 竞彩足球赔率
 */
@Data
public class BettinGoddResul {
    /**
     * 普通玩法说明
     */
    //竞彩网ID
    private String id;
    //比赛时间
    private String matchTime;
    //联赛名称
    private String league;
    //主队名字
    private String home;
    //客队名字
    private String away;
    //让球胜平负玩法单关标志
    private boolean singleRqspf;
    //比分玩法单关标志
    private boolean singleBf;
    //总进球数玩法单关标志
    private boolean singleJq;
    //半全场胜平负玩法单关标志
    private boolean singleBqc;
    //胜平负玩法单关标志
    private boolean singleSpf;
    //让球胜平负
    private rqspfApiResul rqspf;
    //比分 未列出字段中：
    //sw表示主队赢，sd表示平局，sl表示主队输，数字为比分。
    //例：<sd00>表示比分为0:0赔率。
    private BfApiResul bf;
    //进球数
    private JqApiResul jq;
    //半全场
    private bqcApiResul bqc;
    //胜平负
    private spfApiResul spf;
    /**
     * 下面的字段 在冠亚军玩法 有值
     */
    //玩法类型
    private String type;
    //编号
    private String matchId;
    //球队
    private String teams;
    //赔率
    private double odds;
    //是否已淘汰（不可投注）
    private double isEnd;
}
