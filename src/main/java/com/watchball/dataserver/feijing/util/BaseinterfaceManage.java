package com.watchball.dataserver.feijing.util;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;
import java.net.Proxy;

@Data
@Component
public abstract class BaseinterfaceManage {
    Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("47.101.32.241", 9999));
    private String BASE_URL = "http://interface.win007.com";
}
