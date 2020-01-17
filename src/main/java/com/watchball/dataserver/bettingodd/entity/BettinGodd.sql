-- auto Generated on 2020-01-16
-- DROP TABLE IF EXISTS bettin_godd;
CREATE TABLE bettin_godd(
	id VARCHAR (50) NOT NULL COMMENT '普通玩法说明',
	match_time VARCHAR (50) NOT NULL COMMENT '比赛时间',
	league VARCHAR (50) NOT NULL COMMENT '联赛名称',
	home VARCHAR (50) NOT NULL COMMENT '主队名字',
	away VARCHAR (50) NOT NULL COMMENT '客队名字',
	single_rqspf TINYINT (3) NOT NULL COMMENT '让球胜平负玩法单关标志',
	single_bf TINYINT (3) NOT NULL COMMENT '比分玩法单关标志',
	single_jq TINYINT (3) NOT NULL COMMENT '总进球数玩法单关标志',
	single_bqc TINYINT (3) NOT NULL COMMENT '半全场胜平负玩法单关标志',
	single_spf TINYINT (3) NOT NULL COMMENT '胜平负玩法单关标志',
	`type` VARCHAR (50) NOT NULL COMMENT '下面的字段 在冠亚军玩法 有值',
	match_id VARCHAR (50) NOT NULL COMMENT '编号',
	teams VARCHAR (50) NOT NULL COMMENT '球队',
	odds DOUBLE (16,4) NOT NULL COMMENT '赔率',
	is_end DOUBLE (16,4) NOT NULL COMMENT '是否已淘汰（不可投注）',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'bettin_godd';
