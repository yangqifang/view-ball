-- auto Generated on 2020-01-15
-- DROP TABLE IF EXISTS lottery_match;
CREATE TABLE lottery_match(
    match_id INT (11) NOT NULL DEFAULT -1 COMMENT '比赛ID',
    id VARCHAR (50) NOT NULL COMMENT '场次 用于匹配彩票赛事场次/赔率',
    `type` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'zc14 传统足彩-14场胜负彩、任9场胜负彩
     * zc4 传统足彩-4场进球
     * zc6 传统足彩-6场半全场
     * bd 北京单场
     * jczq 竞彩足球
     * jclq 竞彩篮球
     * bdsf 北京单场-胜负过关',
    issue_num VARCHAR (50) NOT NULL DEFAULT '' COMMENT '期号
     * bdsf 用于匹配彩票赛事场次/赔率，竞彩为空
     * bd 用于匹配彩票赛事场次/赔率
     * zc6 用于匹配彩票赛事场次/赔率
     * zc4 	用于匹配彩票赛事场次/赔率
     * zc14 用于匹配彩票赛事场次/赔率',
    sport VARCHAR (50) NOT NULL DEFAULT '' COMMENT '体育类型 足球、篮球、橄榄球、冰球等',
    match_time VARCHAR (50) NOT NULL DEFAULT '' COMMENT '比赛时间',
    home VARCHAR (50) NOT NULL DEFAULT '' COMMENT '主队名称',
    away VARCHAR (50) NOT NULL DEFAULT '' COMMENT '客队名称',
    home_id INT (11) NOT NULL DEFAULT -1 COMMENT '主队ID',
    away_id INT (11) NOT NULL DEFAULT -1 COMMENT '客队ID',
    league VARCHAR (50) NOT NULL DEFAULT '' COMMENT '联赛名称',
    is_turn TINYINT (3) NOT NULL DEFAULT 0 COMMENT '是否主客相反',
    record_id INT (11) NOT NULL DEFAULT -1 COMMENT '记录ID',
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'lottery_match';
