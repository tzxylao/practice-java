package com.lll.practice.util;

import com.github.javafaker.Faker;

import java.util.Locale;

/**
 * @author: laoliangliang
 * @description:
 * @create: 2020/6/9 16:14
 **/
public class FakerUtil {
    private static Faker faker = Faker.instance(Locale.CHINA);
    public static String name(){
        return faker.name().name();
    }
    public static String phoneNumber(){
        return faker.phoneNumber().cellPhone();
    }
    public static String address(){
        return faker.address().fullAddress();
    }
}
