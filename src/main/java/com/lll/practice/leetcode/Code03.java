package com.lll.practice.leetcode;

/**
 * @author: laoliangliang
 * @description: 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
 * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *  输入：
    [2, 3, 1, 0, 2, 5, 3]
    输出：2 或 3
    限制：
    2 <= n <= 100000
 * @create: 2020/6/12 11:56
 **/
public class Code03 {

    public static void main(String[] args) {
        Code03 code = new Code03();
        int[] nums = {1,1,3};
        System.out.println(code.findRepeatNumber(nums));
    }

    public int findRepeatNumber(int[] nums) {
        for (int i = 0, len = nums.length; i < len; ++i) {
            while (i != nums[i]) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                swap(nums, i, nums[i]);
            }
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
