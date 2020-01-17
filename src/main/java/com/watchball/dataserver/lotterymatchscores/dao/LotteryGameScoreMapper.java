package com.watchball.dataserver.lotterymatchscores.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.watchball.dataserver.lotterymatchscores.entity.LotteryGameScore;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LotteryGameScoreMapper extends BaseMapper<LotteryGameScore> {
    List<LotteryGameScore> findByMatchId(@Param("matchId")Integer matchId);

    List<LotteryGameScore> findByAll(LotteryGameScore lotteryGameScore);


}
