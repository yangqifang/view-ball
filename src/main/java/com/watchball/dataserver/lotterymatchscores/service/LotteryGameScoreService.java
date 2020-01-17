package com.watchball.dataserver.lotterymatchscores.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.watchball.dataserver.lotterymatchscores.dao.LotteryGameScoreMapper;
import com.watchball.dataserver.lotterymatchscores.entity.LotteryGameScore;
import org.springframework.stereotype.Service;

@Service
public class LotteryGameScoreService extends ServiceImpl<LotteryGameScoreMapper, LotteryGameScore> {
}
