package com.fanschou.leetcodecn.solution;

/**
 * @title [1464] 数组中两元素的最大乘积
 *
 * @description https://leetcode.cn/problems/maximum-product-of-two-elements-in-an-array/
 *
 * 给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
 *
 * 请你计算并返回该式的最大值。
 *
 * @author fanzhou
 */
public class Question1464 {

    public int maxProduct(int[] nums) {
        int a = -1;
        int b = -1;
        for (int x : nums) {
            if (x > a) {
                b = a; a = x;
            } else if (x > b) {
                b = x;
            }
        }
        return (a - 1) * (b - 1);
    }
}
