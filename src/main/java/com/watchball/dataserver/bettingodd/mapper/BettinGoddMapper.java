package com.watchball.dataserver.bettingodd.mapper;
import com.watchball.dataserver.feijing.bettingodds.apientity.rqspfApiResul;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.watchball.dataserver.feijing.bettingodds.apientity.JqApiResul;
import com.watchball.dataserver.feijing.bettingodds.apientity.BfApiResul;
import com.watchball.dataserver.feijing.bettingodds.apientity.spfApiResul;
import com.watchball.dataserver.feijing.bettingodds.apientity.bqcApiResul;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.watchball.dataserver.bettingodd.entity.BettinGodd;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BettinGoddMapper extends BaseMapper<BettinGodd> {
    List<BettinGodd> findByAll(BettinGodd bettinGodd);
}
