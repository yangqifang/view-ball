package com.watchball.dataserver.feijing.bettingodds.interfaces;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.watchball.dataserver.feijing.util.BaseinterfaceManage;
import com.watchball.dataserver.feijing.bettingodds.apientity.BettinGoddResul;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@Service
public class BettingOddsManageImpl extends BaseinterfaceManage implements BettingOddsManage {
    private String PATH = "/lottery/JczqOdds.aspx";

    @Override
    public List<BettinGoddResul> getBettinGoddResul() {
        List<BettinGoddResul> bettinGoddResuls = new ArrayList<>();
        try {
            HttpResponse execute = HttpRequest.get(getBASE_URL() + PATH).setProxy(getProxy()).execute();
            String body = execute.body();
            JSONObject parseObject = JSON.parseObject(body);
            Object list = parseObject.get("list");
            bettinGoddResuls = JSON.parseArray(JSON.toJSONString(list), BettinGoddResul.class);
        } catch (Exception e) {
            log.info("BettingOddsManageImpl.getBettinGoddResul fail:{}", e);
        }
        return bettinGoddResuls;
    }
}
