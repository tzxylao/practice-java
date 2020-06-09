package com.lll.practice.algorithm;

import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.LRUCache;

import java.util.Iterator;

/**
 * @author: laoliangliang
 * @description:
 * @create: 2020/6/9 15:09
 **/
public class LRUExample {
    public static void main(String[] args) {
        LRUCache<String, String> cache = CacheUtil.newLRUCache(3);
        for (int i = 0; i < 10; i++) {
            cache.put("key" + i, "value" + i);
        }
        Iterator<String> iterator = cache.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
