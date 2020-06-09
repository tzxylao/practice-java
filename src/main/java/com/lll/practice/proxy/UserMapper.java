package com.lll.practice.proxy;

import com.lll.practice.entity.User;

/**
 * @author: laoliangliang
 * @description:
 * @create: 2020/6/9 11:39
 **/
public interface UserMapper {
    User getOne(String name);
}
