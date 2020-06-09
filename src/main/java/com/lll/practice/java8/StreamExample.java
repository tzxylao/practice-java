package com.lll.practice.java8;

import com.alibaba.fastjson.JSON;
import com.lll.practice.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author: laoliangliang
 * @description:
 * @create: 2020/6/9 14:50
 **/
public class StreamExample {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setAge(1);
        userList.add(user);
        user = new User();
        user.setId(1);
        user.setAge(1);
        userList.add(user);
        user = new User();
        user.setId(2);
        user.setAge(2);
        userList.add(user);
        userList = userList.stream().filter(distinctByKey(u -> u.getId())).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(userList));
    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t ->
                seen.putIfAbsent(
                        keyExtractor.apply(t), Boolean.TRUE) == null;
    }

}
