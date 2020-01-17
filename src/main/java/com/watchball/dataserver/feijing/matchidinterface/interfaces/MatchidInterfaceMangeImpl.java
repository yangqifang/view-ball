package com.watchball.dataserver.feijing.matchidinterface.interfaces;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.watchball.dataserver.feijing.util.BaseinterfaceManage;
import com.watchball.dataserver.feijing.matchidinterface.apientity.MatchidInterfaceEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 彩票赛程与比赛ID关联表
 * <p>
 * 接口描述
 * • 此接口用于获取彩票赛事的期号/场次“issueNum/id”与比赛数据的比赛ID“matchId”关联表；
 * • 数据内容包含：传统足彩、北京单场、竞彩足球、竞彩篮球；
 * • 部分彩票赛事的主客队与比赛ID的主客队相反，需“isTurn”判断。
 * <p>
 * 限制说明
 * 频率限制：2分/次
 * <p>
 * 建议更新频率：10分/次
 */
@Service
@Log4j2
public class MatchidInterfaceMangeImpl extends BaseinterfaceManage implements MatchidInterfaceMange {
    private final String PATH = "/lottery/MatchidInterface.aspx";

    @Override
    public List<MatchidInterfaceEntity> getMatchidInterface() {
        List<MatchidInterfaceEntity> matchidInterfaceEntities = new ArrayList<>();
        try {
            HttpRequest request = HttpRequest.get(getBASE_URL() + PATH).setProxy(getProxy());
            HttpResponse response = request.execute();
            JSONObject parseObject = JSON.parseObject(response.body());
            Object list = parseObject.get("list");
            matchidInterfaceEntities = JSON.parseArray(JSON.toJSONString(list), MatchidInterfaceEntity.class);
        } catch (Exception e) {
            log.info("MatchidInterfaceMangeImpl.getMatchidInterface fail", e);
        }
        return matchidInterfaceEntities;
    }
}
