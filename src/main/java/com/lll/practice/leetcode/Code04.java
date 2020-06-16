package com.lll.practice.leetcode;

/**
 * @author: laoliangliang
 * @description: 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @create: 2020/6/12 14:22
 **/
public class Code04 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        Code04 code = new Code04();
        System.out.println(code.findOne(matrix, 1));
        System.out.println(code.findOne(matrix, 15));
        System.out.println(code.findOne(matrix, 18));
        System.out.println(code.findOne(matrix, 30));
        System.out.println(code.findOne(matrix, 50));
        System.out.println(code.findOne(matrix, 25));
        String str = "a df f";
        str = str.replaceAll(" ", "%20");
        System.out.println(str);
    }

    public boolean findOne(int[][] matrix, int n) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = col-1; i >= 0; i--) {
            for (int j = 0; j < row; j++) {
                if (n == matrix[j][i]) {
                    return true;
                }
                if (n < matrix[j][i]) {
                    break;
                }
            }
        }
        return false;
    }
}
