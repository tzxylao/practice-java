package com.lll.practice.entity;

import lombok.Data;

/**
 * @author: laoliangliang
 * @description:
 * @create: 2020/6/5 17:51
 **/
@Data
public class User {
    private String name;
    private int age;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("User 被回收");
    }
}
