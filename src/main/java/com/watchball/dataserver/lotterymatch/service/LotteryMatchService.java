package com.watchball.dataserver.lotterymatch.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.watchball.dataserver.lotterymatch.entity.LotteryMatch;
import com.watchball.dataserver.lotterymatch.mappper.LotteryMatchMapper;
import org.springframework.stereotype.Service;

@Service
public class LotteryMatchService extends ServiceImpl<LotteryMatchMapper, LotteryMatch> {
}
