package com.huirong.authguidesdk;

import org.junit.Test;

import java.util.HashMap;

/**
 * Created by HuirongZhang
 * on 28/12/2016.
 */

public class HashMapTest {

    /**
     * 1.key和value允许为null
     * 2.HashMap不允许key重复，如果重复，会覆盖旧值。
     */

    @Test
    public void nullKeyAndValueTest() {
        HashMap<String, String> table = new HashMap<>();
        String key = "key1";
        table.put(key, null);
    }
}
