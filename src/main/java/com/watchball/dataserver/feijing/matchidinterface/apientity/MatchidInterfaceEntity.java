package com.watchball.dataserver.feijing.matchidinterface.apientity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 限制说明
 * 频率限制：2分/次
 *彩票赛程与比赛ID关联表
 * 建议更新频率：10分/次
 */
@Data
public class MatchidInterfaceEntity {
    private List<bd> bd = new ArrayList<>();
    private List<bdsf> bdsf = new ArrayList<>();
    private List<jclq> jclq = new ArrayList<>();
    private List<jczq> jczq = new ArrayList<>();
    private List<zc4> zc4 = new ArrayList<>();
    private List<zc6> zc6 = new ArrayList<>();
    private List<zc14> zc14 = new ArrayList<>();
}
