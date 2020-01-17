package com.watchball.dataserver;

import com.watchball.dataserver.feijing.bettingodds.apientity.BettinGoddResul;
import com.watchball.dataserver.feijing.bettingodds.interfaces.BettingOddsManage;
import com.watchball.dataserver.feijing.lotterymatchscore.apientity.LotteryMatchScoreResul;
import com.watchball.dataserver.feijing.lotterymatchscore.interfaces.lotteryMatchScoreManage;
import com.watchball.dataserver.feijing.matchchangescore.interfaces.MatchChangeScoreDataManage;
import com.watchball.dataserver.feijing.matchidinterface.apientity.MatchidInterfaceEntity;
import com.watchball.dataserver.feijing.matchidinterface.interfaces.MatchidInterfaceMange;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DataserverApplicationTests {
    @Autowired
    private MatchChangeScoreDataManage matchScoreDataManage;
    @Autowired
    private MatchidInterfaceMange matchidInterfaceMange;
    @Autowired
    private lotteryMatchScoreManage lotteryMatchScoreManage;
    @Autowired
    private BettingOddsManage bettingOddsManage;

    @Test
    void contextLoads() {
        Object matchScoreData = matchScoreDataManage.getMatchScoreData();
    }

    @Test
    void MatchidInterfaceMangeTets() {
        List<MatchidInterfaceEntity> matchidInterface = matchidInterfaceMange.getMatchidInterface();
    }

    @Test
    void TestgetLotteryMatch() {
        List<LotteryMatchScoreResul> lotteryMatch = lotteryMatchScoreManage.getLotteryMatchScore();
    }

    @Test
    void bettingOddsManageTest(){
        List<BettinGoddResul> bettinGoddResul = bettingOddsManage.getBettinGoddResul();
    }
}
