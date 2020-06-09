package com.lll.practice.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author: laoliangliang
 * @description:
 * @create: 2020/6/9 14:26
 **/
public class SortExample {
    public static void main(String[] args) {
        List<OrderBean> orderBeans = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            OrderBean orderBean = new OrderBean(getLevel(random), getLevel(random), getLevel(random));
            orderBeans.add(orderBean);
        }
        List<OrderBean> beans = orderBeans.stream().sorted(Comparator.comparing(OrderBean::getLevel1, Comparator.reverseOrder())
                .thenComparing(Comparator.comparingInt(OrderBean::getLevel2))).collect(Collectors.toList());
        for (OrderBean bean : beans) {
            System.out.println(bean);
        }

    }

    private static Integer getLevel(Random random) {
        return random.nextInt(5);
    }
}
