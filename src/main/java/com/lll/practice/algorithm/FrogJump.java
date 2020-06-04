package com.lll.practice.algorithm;

/**
 * @author: laoliangliang
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @create: 2020/6/4 16:44
 **/
public class FrogJump {

    /**
     * 可抽象成 f(n) = f(n-1)+f(n-2)
     * 1 2 3 5 8
     *
     * @param args
     */
    public static void main(String[] args) {
        FrogJump jump = new FrogJump();
        int num = jump.step(10);
        System.out.println(num);
    }

    private int step(int number) {
        if (number <= 0) {
            return 0;
        }
        if (number == 1) {
            return number;
        }
        if (number == 2) {
            return number;
        }
        int first = 1, second = 2, thrid = 0;
        for (int i = 3; i <= number; i++) {
            thrid = first + second;
            first = second;
            second = thrid;
        }
        return thrid;
    }
}
