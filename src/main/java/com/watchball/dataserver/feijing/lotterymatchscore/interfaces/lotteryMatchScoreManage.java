package com.watchball.dataserver.feijing.lotterymatchscore.interfaces;

import com.watchball.dataserver.feijing.lotterymatchscore.apientity.LotteryMatchScoreResul;

import java.util.List;

/**
 * 彩票比赛的比分数据
 * <p>
 * 接口描述
 * • 此接口用于获取彩票比赛的比分数据，包括传统足彩、北京单场、竞彩足球的比赛数据；
 * • 个别比赛主客队与彩票赛程主客相反，需通过【接口8.彩票赛程与比赛ID关联表】中的“isTurn”使用；
 * • 可以通过“matchId”匹配【接口2.即时变化的比分数据】的比赛变化数据。
 * <p>
 * 限制说明
 * 频率限制：15秒/次
 * <p>
 * 建议更新频率：60秒/次
 */
public interface lotteryMatchScoreManage {

    List<LotteryMatchScoreResul> getLotteryMatchScore();
}
