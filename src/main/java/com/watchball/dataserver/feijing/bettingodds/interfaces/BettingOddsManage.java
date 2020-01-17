package com.watchball.dataserver.feijing.bettingodds.interfaces;

import com.watchball.dataserver.feijing.bettingodds.apientity.BettinGoddResul;

import java.util.List;

/**
 * 接口描述
 * • 竞彩足球赔率，让球胜平负中让球数“goal”1代表主队比分+1，让球数“goal”-1代表主队比分-1，请注意与足球亚指盘的区分；
 * • 由于中国竞彩网也时有错误发生，我们将尽力维护数据的准确性和实时性，但由于各种原因不能保证数据100%正确，请谨慎使用；
 * • 若某场次停售，则接口不再返回该场次数据。
 * <p>
 * 限制说明
 * 频率限制：60秒/次
 * <p>
 * 建议更新频率：2-5分/次
 */
public interface BettingOddsManage {

    public List<BettinGoddResul> getBettinGoddResul();
}
