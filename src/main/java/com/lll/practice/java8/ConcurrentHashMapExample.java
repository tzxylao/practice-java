package com.lll.practice.java8;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: laoliangliang
 * @description:
 * @create: 2020/6/15 17:18
 **/
public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap();
        String who = map.get("who");
        System.out.println(who);
        String who1 = map.computeIfAbsent("AaAa", key -> map.computeIfAbsent("BBBB", key2 -> "C"));
        System.out.println(who1);
    }
}
