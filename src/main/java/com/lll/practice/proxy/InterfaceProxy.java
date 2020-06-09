package com.lll.practice.proxy;

import com.alibaba.fastjson.JSON;
import com.lll.practice.entity.User;

import java.lang.reflect.Proxy;

/**
 * @author: laoliangliang
 * @description: 接口代理
 * @create: 2020/6/9 10:57
 **/
public class InterfaceProxy {

    public static void main(String[] args) {
        UserMapper userMapper = (UserMapper) Proxy.newProxyInstance(InterfaceProxy.class.getClassLoader(), new Class[]{MapperProxy.class}, new MapperProxy<UserMapper>());
        User user = userMapper.getOne("哈哈哈");
        System.out.println(JSON.toJSONString(user));
    }
}
