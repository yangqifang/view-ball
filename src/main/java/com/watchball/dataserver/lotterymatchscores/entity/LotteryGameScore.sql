-- auto Generated on 2020-01-15
-- DROP TABLE IF EXISTS lottery_game_score;
CREATE TABLE lottery_game_score(
	match_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '比赛ID',
	color VARCHAR (50) NOT NULL DEFAULT '' COMMENT '颜色值~',
	kind INT (11) NOT NULL DEFAULT -1 COMMENT '类型 1：联赛 2：杯赛',
	league_id INT (11) NOT NULL DEFAULT -1 COMMENT '联赛ID',
	league_chs VARCHAR (50) NOT NULL DEFAULT '' COMMENT '联赛简体名',
	sub_league_id VARCHAR (50) NOT NULL DEFAULT '' COMMENT '子联赛ID',
	sub_league VARCHAR (50) NOT NULL DEFAULT '' COMMENT '子联赛名称',
	match_time VARCHAR (50) NOT NULL DEFAULT '' COMMENT '比赛时间',
	start_time VARCHAR (50) NOT NULL DEFAULT '' COMMENT '开场时间 state=1：返回上半场开场时间； state=3：返回下半场开场时间。',
	home_chs VARCHAR (50) NOT NULL DEFAULT '' COMMENT '主队简体名',
	away_chs VARCHAR (50) NOT NULL DEFAULT '' COMMENT '客队简体名',
	home_id INT (11) NOT NULL DEFAULT -1 COMMENT '主队ID',
	away_id INT (11) NOT NULL DEFAULT -1 COMMENT '客队ID',
	`state` INT (11) NOT NULL DEFAULT -1 COMMENT '0：未开
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
     * -14：推迟',
	home_score INT (11) NOT NULL DEFAULT -1 COMMENT '主队比分 常规时间',
	away_score INT (11) NOT NULL DEFAULT -1 COMMENT '客队比分 常规时间',
	home_half_score INT (11) NOT NULL DEFAULT -1 COMMENT '主队上半场比分',
	away_half_score INT (11) NOT NULL DEFAULT -1 COMMENT '客队上半场比分',
	home_red INT (11) NOT NULL DEFAULT -1 COMMENT '主队红牌',
	away_red INT (11) NOT NULL DEFAULT -1 COMMENT '客队红牌',
	home_yellow INT (11) NOT NULL DEFAULT -1 COMMENT '主队黄牌',
	away_yellow INT (11) NOT NULL DEFAULT -1 COMMENT '客队黄牌',
	home_corner INT (11) NOT NULL DEFAULT -1 COMMENT '主队角球',
	away_corner INT (11) NOT NULL DEFAULT -1 COMMENT '客队角球',
	home_rank VARCHAR (50) NOT NULL DEFAULT '' COMMENT '主队排名',
	away_rank VARCHAR (50) NOT NULL DEFAULT '' COMMENT '客队排名',
	is_neutral TINYINT (3) NOT NULL DEFAULT 0 COMMENT '是否中立场',
	has_lineup VARCHAR (50) NOT NULL DEFAULT '' COMMENT '是否有阵容 1：有  null：无',
	`explain` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '比赛说明',
	PRIMARY KEY (match_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'lottery_game_score';
