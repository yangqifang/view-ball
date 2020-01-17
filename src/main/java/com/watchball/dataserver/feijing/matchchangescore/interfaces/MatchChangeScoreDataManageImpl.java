package com.watchball.dataserver.feijing.matchchangescore.interfaces;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.watchball.dataserver.feijing.util.BaseinterfaceManage;
import com.watchball.dataserver.feijing.matchchangescore.apientity.MatchChangeResul;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 即时变化的比分数据
 * <p>
 * 频率限制：不限频率
 * <p>
 * 建议更新频率：2-10秒/次
 */
@Log4j2
@Service
public class MatchChangeScoreDataManageImpl extends BaseinterfaceManage implements MatchChangeScoreDataManage {
    private String PATH = "/football/change.aspx";

    @Override
    public Object getMatchScoreData() {
        HttpResponse response = HttpRequest.get(getBASE_URL() + PATH).setProxy(getProxy()).execute();
        String data = response.body();
        JSONObject jsonObject = JSON.parseObject(data);
        Object matchList = jsonObject.get("changeList");
        List<MatchChangeResul> matchChangeResulList = JSON.parseArray(JSON.toJSONString(matchList), MatchChangeResul.class);
        return matchChangeResulList;
    }
}
