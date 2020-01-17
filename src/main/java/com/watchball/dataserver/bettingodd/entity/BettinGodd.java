package com.watchball.dataserver.bettingodd.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.watchball.dataserver.feijing.bettingodds.apientity.*;
import lombok.Data;
import org.apache.ibatis.type.JdbcType;

@Data
@TableName(value = "bettin_godd")
public class BettinGodd {
    /**
     * 普通玩法说明
     */
    //竞彩网ID
    @TableField(value = "id")
    private String id;
    //比赛时间
    @TableField(value = "match_time")
    private String matchTime;
    //联赛名称
    @TableField(value = "league")
    private String league;
    //主队名字
    @TableField(value = "home")
    private String home;
    //客队名字
    @TableField(value = "away")
    private String away;
    //让球胜平负玩法单关标志
    @TableField(value = "single_rqspf")
    private Boolean singleRqspf;
    //比分玩法单关标志
    @TableField(value = "single_bf")
    private Boolean singleBf;
    //总进球数玩法单关标志
    @TableField(value = "single_jq")
    private Boolean singleJq;
    //半全场胜平负玩法单关标志
    @TableField(value = "single_bqc")
    private Boolean singleBqc;
    //胜平负玩法单关标志
    @TableField(value = "single_spf")
    private Boolean singleSpf;
    //让球胜平负
    @TableField(value = "rqspf", typeHandler = JacksonTypeHandler.class, jdbcType = JdbcType.VARCHAR)
    private rqspfApiResul rqspf;
    //比分 未列出字段中：
    //sw表示主队赢，sd表示平局，sl表示主队输，数字为比分。
    //例：<sd00>表示比分为0:0赔率。
    @TableField(value = "bf", typeHandler = JacksonTypeHandler.class, jdbcType = JdbcType.VARCHAR)
    private BfApiResul bf;
    //进球数
    @TableField(value = "jq", typeHandler = JacksonTypeHandler.class, jdbcType = JdbcType.VARCHAR)
    private JqApiResul jq;
    //半全场
    @TableField(value = "bqc", typeHandler = JacksonTypeHandler.class, jdbcType = JdbcType.VARCHAR)
    private bqcApiResul bqc;
    //胜平负
    @TableField(value = "spf", typeHandler = JacksonTypeHandler.class, jdbcType = JdbcType.VARCHAR)
    private spfApiResul spf;

    /**
     * 下面的字段 在冠亚军玩法 有值
     */
    //玩法类型
    @TableField(value = "type")
    private String type;
    //编号
    @TableField(value = "match_id")
    private String matchId;
    //球队
    @TableField(value = "teams")
    private String teams;
    //赔率
    @TableField(value = "odds")
    private Double odds;
    //是否已淘汰（不可投注）
    @TableField(value = "is_end")
    private Double isEnd;
}
