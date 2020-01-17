package com.watchball.dataserver.feijing.job;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import com.watchball.dataserver.bettingodd.entity.BettinGodd;
import com.watchball.dataserver.bettingodd.service.BettinGoddService;
import com.watchball.dataserver.feijing.bettingodds.apientity.BettinGoddResul;
import com.watchball.dataserver.feijing.bettingodds.interfaces.BettingOddsManage;
import com.watchball.dataserver.feijing.lotterymatchscore.apientity.LotteryMatchScoreResul;
import com.watchball.dataserver.feijing.lotterymatchscore.interfaces.lotteryMatchScoreManage;
import com.watchball.dataserver.feijing.matchidinterface.apientity.MatchidInterfaceEntity;
import com.watchball.dataserver.feijing.matchidinterface.interfaces.MatchidInterfaceMange;
import com.watchball.dataserver.feijing.util.ApiUtil;
import com.watchball.dataserver.feijing.util.interfaceEnum;
import com.watchball.dataserver.lotterymatch.entity.LotteryMatch;
import com.watchball.dataserver.lotterymatch.service.LotteryMatchService;
import com.watchball.dataserver.lotterymatchscores.entity.LotteryGameScore;
import com.watchball.dataserver.lotterymatchscores.service.LotteryGameScoreService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 飞鲸定时任务
 */
@Log4j2
@Component
public class FeiJinJob {
    @Autowired
    private lotteryMatchScoreManage lotteryMatchScoreManage;
    @Autowired
    private LotteryGameScoreService lotteryGameScoreService;


    @Autowired
    private MatchidInterfaceMange matchidInterfaceMange;
    @Autowired
    private LotteryMatchService lotteryMatchService;


    @Autowired
    private BettingOddsManage bettingOddsManage;
    @Autowired
    private BettinGoddService bettinGoddService;

    /**
     * 彩票比赛比分
     */
    @Scheduled(fixedRate = 16000)
    void lotteryMatchScoreJob() {
        List<LotteryMatchScoreResul> lotteryMatchScore = lotteryMatchScoreManage.getLotteryMatchScore();
        if (ApiUtil.iseq(lotteryMatchScore, interfaceEnum.lotterymatch.name())) {
            log.info("lotteryMatch 数据发生更新 :{}", lotteryMatchScore);
            List<LotteryGameScore> lotteryGameScores = new ArrayList<>();
            log.info("开始转换数据", System.currentTimeMillis());
            lotteryMatchScore.forEach(item -> {
                LotteryGameScore gameScore = new LotteryGameScore();
                BeanUtil.copyProperties(item, gameScore);
                lotteryGameScores.add(gameScore);
            });
            log.info("数据转换完毕", System.currentTimeMillis());
            lotteryGameScoreService.saveOrUpdateBatch(lotteryGameScores);
        }
    }

    /**
     * 彩票比赛赛程
     */
    @Scheduled(fixedRate = 1000 * 60 * 2)
    void lotterymatchJob() {
        List<MatchidInterfaceEntity> matchidInterface = matchidInterfaceMange.getMatchidInterface();
        if (ApiUtil.iseq(matchidInterface, interfaceEnum.matchidinterface.name())) {
            log.info("matchidinterface 数据发生更新 :{}", matchidInterfaceMange);
            List<LotteryMatch> lotteryMatchList = new ArrayList<>();
            log.info("matchidinterface 开始转换数据", System.currentTimeMillis());
            matchidInterface.forEach(item -> {
                if (CollUtil.isNotEmpty(item.getBd())) {
                    item.getBd().forEach(bd -> {
                        LotteryMatch match = new LotteryMatch();
                        match.setType("bd");
                        BeanUtil.copyProperties(bd, match);
                        lotteryMatchList.add(match);
                    });
                }
                if (CollUtil.isNotEmpty(item.getBdsf())) {
                    item.getBdsf().forEach(bdsf -> {
                        LotteryMatch match = new LotteryMatch();
                        match.setType("bdsf");
                        BeanUtil.copyProperties(bdsf, match);
                        lotteryMatchList.add(match);
                    });
                }
                if (CollUtil.isNotEmpty(item.getJclq())) {
                    item.getJclq().forEach(jclq -> {
                        LotteryMatch match = new LotteryMatch();
                        match.setType("jclq");
                        BeanUtil.copyProperties(jclq, match);
                        lotteryMatchList.add(match);
                    });
                }
                if (CollUtil.isNotEmpty(item.getJczq())) {
                    item.getJczq().forEach(jczq -> {
                        LotteryMatch match = new LotteryMatch();
                        match.setType("jczq");
                        BeanUtil.copyProperties(jczq, match);
                        lotteryMatchList.add(match);
                    });
                }
                if (CollUtil.isNotEmpty(item.getZc4())) {
                    item.getZc4().forEach(zc4 -> {
                        LotteryMatch match = new LotteryMatch();
                        match.setType("zc4");
                        BeanUtil.copyProperties(zc4, match);
                        lotteryMatchList.add(match);
                    });
                }
                if (CollUtil.isNotEmpty(item.getZc6())) {
                    item.getZc6().forEach(zc6 -> {
                        LotteryMatch match = new LotteryMatch();
                        match.setType("zc6");
                        BeanUtil.copyProperties(zc6, match);
                        lotteryMatchList.add(match);
                    });
                }
                if (CollUtil.isNotEmpty(item.getZc14())) {
                    item.getZc14().forEach(zc14 -> {
                        LotteryMatch match = new LotteryMatch();
                        match.setType("zc14");
                        BeanUtil.copyProperties(zc14, match);
                        lotteryMatchList.add(match);
                    });
                }
            });
            log.info("matchidinterface 数据转换完毕", System.currentTimeMillis());
            lotteryMatchList.forEach(item -> {
                try {
                    lotteryMatchService.saveOrUpdate(item);
                } catch (Exception e) {
                    log.error("save lotterymatch fail:{} \n Exception:{}", item, e);
                }
            });
        }
    }

    /**
     * 赔率
     */
    @Scheduled(fixedRate = 60000)
    void bettinGoddJob() {
        List<BettinGoddResul> bettinGoddResul = bettingOddsManage.getBettinGoddResul();
        if (ApiUtil.iseq(bettinGoddResul, interfaceEnum.bettingodds.name())) {
            log.info("bettinGoddResul 数据发生更新 :{}", bettinGoddResul);
            log.info("开始转换数据", System.currentTimeMillis());
            bettinGoddResul.forEach(item -> {
                BettinGodd bettinGodd = new BettinGodd();
                BeanUtil.copyProperties(item, bettinGodd);
                bettinGoddService.saveOrUpdate(bettinGodd);
            });
            log.info("数据转换完毕", System.currentTimeMillis());
        }
    }
}
