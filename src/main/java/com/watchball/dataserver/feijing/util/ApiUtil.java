package com.watchball.dataserver.feijing.util;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiUtil {
    /**
     * key 接口名称
     * value 上一次的结果hash值
     */
    private static Map<String, String> map = new HashMap<>();

    /**
     * 判断本次请求与上次请求的结果是否相同
     *
     * @param object 本次请求回来的结果对象
     * @param key    接口名称
     * @return
     */
    public static boolean iseq(Object object, String key) {
        if (ObjectUtil.isNull(object)) {
            return false;
        }
        String newmd = SecureUtil.md5(object.toString());
        String oldmd = map.get(key);
        if (!StrUtil.equals(newmd, oldmd)) {
            map.put(key, newmd);
            return true;
        }
        return false;
    }

    public static void main(String[] age) {
        int i = 10;
        for (int i1 = 0; i1 < i; i1++) {
            String md5 = SecureUtil.md5("SecureUtil主要针对常用加密算法构建快捷方式，还有提供一些密钥生成的快捷工具方法。");
            System.err.println(md5);
        }
    }
}
