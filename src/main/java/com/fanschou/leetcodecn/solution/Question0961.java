package com.fanschou.leetcodecn.solution;

/**
 * @title [961] 在长度 2N 的数组中找出重复 N 次的元素
 *
 * @description https://leetcode.cn/problems/n-repeated-element-in-size-2n-array/
 *
 * 给你一个整数数组 nums ，该数组具有以下属性：
 *
 * nums.length == 2 * n.
 * nums 包含 n + 1 个 不同的 元素
 * nums 中恰有一个元素重复 n 次
 *
 * 找出并返回重复了 n 次的那个元素。
 *
 * @author fanzhou
 */
public class Question0961 {

    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int t = nums[i];
            if (i - 1 >= 0 && nums[i - 1] == t) {
                return t;
            }
            if (i - 2 >= 0 && nums[i - 2] == t) {
                return t;
            }
            if (i - 3 >= 0 && nums[i - 3] == t) {
                return t;
            }
        }
        return -1;
    }
}
