package com.watchball.dataserver.lotterymatchscores.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@TableName(value = "lottery_game_score")
@Data
public class LotteryGameScore {
    //    比赛ID
    @TableId(value = "match_id")
    private Integer matchId;
    //    颜色值~
    @TableField(value = "color")
    private String color;
    //类型 1：联赛 2：杯赛
    @TableField(value = "kind")
    private Integer kind;
    //联赛ID
    @TableField(value = "league_id")
    private Integer leagueId;
    //联赛简体名
    @TableField(value = "league_chs")
    private String leagueChs;
    //子联赛ID
    @TableField(value = "sub_league_id")
    private String subLeagueId;
    //子联赛名称
    @TableField(value = "sub_league")
    private String subLeague;
    //比赛时间
    @TableField(value = "match_time")
    private String matchTime;
    @TableField(value = "start_time")
    //开场时间 state=1：返回上半场开场时间； state=3：返回下半场开场时间。
    private String startTime;
    //主队简体名
    @TableField(value = "home_chs")
    private String homeChs;
    //客队简体名
    @TableField(value = "away_chs")
    private String awayChs;
    //主队ID
    @TableField(value = "home_id")
    private Integer homeId;
    //客队ID
    @TableField(value = "away_id")
    private Integer awayId;
    /**
     * 0：未开
     * 1：上半场
     * 2：中场
     * 3：下半场
     * 4：加时
     * 5：点球
     * -1：完场
     * -10:取消
     * -11：待定
     * -12：腰斩
     * -13：中断
     * -14：推迟
     */
    @TableField(value = "state")
    private Integer state;
    //主队比分 常规时间
    @TableField(value = "home_score")
    private Integer homeScore;
    //客队比分 常规时间
    @TableField(value = "away_score")
    private Integer awayScore;
    //主队上半场比分
    @TableField(value = "home_half_score")
    private Integer homeHalfScore;
    //客队上半场比分
    @TableField(value = "away_half_score")
    private Integer awayHalfScore;
    //主队红牌
    @TableField(value = "home_red")
    private Integer homeRed;
    //客队红牌
    @TableField(value = "away_red")
    private Integer awayRed;
    //主队黄牌
    @TableField(value = "home_yellow")
    private Integer homeYellow;
    //客队黄牌
    @TableField(value = "away_yellow")
    private Integer awayYellow;
    //主队角球
    @TableField(value = "home_corner")
    private Integer homeCorner;
    //客队角球
    @TableField(value = "away_corner")
    private Integer awayCorner;
    //主队排名
    @TableField(value = "home_rank")
    private String homeRank;
    //客队排名
    @TableField(value = "away_rank")
    private String awayRank;
    //是否中立场
    @TableField(value = "is_neutral")
    private Boolean isNeutral;
    //是否有阵容 1：有  null：无
    @TableField(value = "has_lineup")
    private String hasLineup;
    // 比赛说明
    @TableField(value = "`explain`")
    private String explain;

}
