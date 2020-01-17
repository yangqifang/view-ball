package com.watchball.dataserver.lotterymatch.mappper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.watchball.dataserver.lotterymatch.entity.LotteryMatch;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LotteryMatchMapper extends BaseMapper<LotteryMatch> {
    List<LotteryMatch> findByAll(LotteryMatch lotteryMatch);


}
