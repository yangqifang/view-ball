package com.watchball.dataserver.feijing.bettingodds.apientity;

import lombok.Data;

/**
 * 让球胜平负
 */
@Data
public class rqspfApiResul {
    //让球数
    private Integer goal;
    //让球胜赔率
    private Double rq3;
    //让球平赔率
    private Double rq1;
    //让球负赔率
    private Double rq0;
    //是否停售
    private Boolean stop;
}
