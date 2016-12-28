package com.huirong.authguidesdk;

import org.junit.Test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by HuirongZhang
 * on 28/12/2016.
 */

public class HashTableTest {
    /**
     * 1.key和value都不允许为null, 否则会报NullPointerException
     * 2.Hashtable不允许key重复，如果重复，会覆盖旧值。
     */

    @Test
    public void nullKeyAndValueTest() {
        Hashtable<String, String> table = new Hashtable<>();
        table.put("key1", "value1");
        table.put("key1", "value2");
        Set<Map.Entry<String, String>> entrySet = table.entrySet();

        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("nullKeyAndValueTest(),key = " + entry.getKey() + ",value = " + entry.getValue());
        }
    }
}
