package com.watchball.dataserver.feijing.util;

import lombok.Data;

public enum interfaceEnum {
    bettingodds("bettingodds", "/lottery/JczqOdds.aspx"),
    lotterymatch("lotterymatch", "/lottery/Zq_BF.aspx"),
    matchidinterface("matchidinterface", "/lottery/MatchidInterface.aspx");
    private String name;
    private String path;

    interfaceEnum() {
    }

    interfaceEnum(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
