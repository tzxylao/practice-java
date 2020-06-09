package com.lll.practice.algorithm;

/**
 * @author: laoliangliang
 * @description: 求某个数的二进制格式下1的个数
 * n&(n-1)的结果其实是将n的最右边的1去掉，所以多次执行n&(n-1)直到将所有的1都去掉，以此来计数
 * @create: 2020/6/8 10:41
 **/
public class BinaryOne {
    public static void main(String[] args) {

        BinaryOne binaryOne = new BinaryOne();
        System.out.println(binaryOne.binaryCount(15));
    }

    public int binaryCount(int num) {
        int count = 0;
        while (num != 0) {
            num = num & (num-1);
            count++;
        }
        return count;
    }
}
