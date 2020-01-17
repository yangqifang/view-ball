package com.watchball.dataserver.lotterymatch.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 彩票赛程与比赛ID关联表
 */
@Data
@TableName(value = "lottery_match")
public class LotteryMatch {
    //比赛ID
    @TableId(value = "match_id")
    private Integer matchId;
    //场次 用于匹配彩票赛事场次/赔率
    @TableField(value = "id")
    private String id;
    /**
     * zc14 传统足彩-14场胜负彩、任9场胜负彩
     * zc4 传统足彩-4场进球
     * zc6 传统足彩-6场半全场
     * bd 北京单场
     * jczq 竞彩足球
     * jclq 竞彩篮球
     * bdsf 北京单场-胜负过关
     */
    @TableField(value = "type")
    private String type;
    /**
     * 期号
     * bdsf 用于匹配彩票赛事场次/赔率，竞彩为空
     * bd 用于匹配彩票赛事场次/赔率
     * zc6 用于匹配彩票赛事场次/赔率
     * zc4 	用于匹配彩票赛事场次/赔率
     * zc14 用于匹配彩票赛事场次/赔率
     */
    @TableField(value = "issue_num")
    private String issueNum;
    //体育类型 足球、篮球、橄榄球、冰球等
    @TableField(value = "sport")
    private String sport;
    //比赛时间
    @TableField(value = "match_time")
    private String matchTime;
    //主队名称
    @TableField(value = "home")
    private String home;
    //客队名称
    @TableField(value = "away")
    private String away;
    //主队ID
    @TableField(value = "home_id")
    private Integer homeId;
    //客队ID
    @TableField(value = "away_id")
    private Integer awayId;
    //联赛名称
    @TableField(value = "league")
    private String league;
    //是否主客相反
    @TableField(value = "is_turn")
    private Boolean isTurn;
    //记录ID
    @TableField(value = "record_id")
    private Integer recordId;
}
