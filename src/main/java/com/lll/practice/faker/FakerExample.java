package com.lll.practice.faker;

import com.lll.practice.util.FakerUtil;

/**
 * @author: laoliangliang
 * @description: 随机造假数据
 * @create: 2020/6/9 16:03
 **/
public class FakerExample {
    public static void main(String[] args) {
        System.out.println("----------");
        for (int i = 0; i < 10; i++) {
            System.out.print(FakerUtil.name() + " ");
        }
        System.out.println();
        System.out.println("----------");

        for (int i = 0; i < 10; i++) {
            System.out.print(FakerUtil.address() + " ");
        }
        System.out.println();
        System.out.println("----------");

        for (int i = 0; i < 10; i++) {
            System.out.print(FakerUtil.phoneNumber() + " ");
        }
        System.out.println();
        System.out.println("----------");
    }
}
