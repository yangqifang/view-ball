package com.watchball.dataserver.feijing.lotterymatchscore.interfaces;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.watchball.dataserver.feijing.util.BaseinterfaceManage;
import com.watchball.dataserver.feijing.lotterymatchscore.apientity.LotteryMatchScoreResul;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
@Service
@Log4j2
public class lotteryMatchManageImpl extends BaseinterfaceManage implements lotteryMatchScoreManage {
    private final String PATH = "/lottery/Zq_BF.aspx";

    @Override
    public List<LotteryMatchScoreResul> getLotteryMatchScore() {
        List<LotteryMatchScoreResul> lotteryMatchScoreResulList = new ArrayList<>();
        try {
            log.info("send ",getBASE_URL() + PATH);
            HttpRequest httpRequest = HttpRequest.get(getBASE_URL() + PATH).setProxy(getProxy());
            HttpResponse httpResponse = httpRequest.execute();
            String body = httpResponse.body();
            JSONObject jsonObject = JSON.parseObject(body);
            Object matchList = jsonObject.get("matchList");
            lotteryMatchScoreResulList = JSON.parseArray(JSON.toJSONString(matchList), LotteryMatchScoreResul.class);
        } catch (Exception e) {
            log.info("lotteryMatchManageImpl.getLotteryMatch fail", e);
        }
        return lotteryMatchScoreResulList;
    }
}
