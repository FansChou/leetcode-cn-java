package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/longest-subarray-with-maximum-bitwise-and/">[2419] 按位与最大的最长子数组</a><br />
 * 给你一个长度为 n 的整数数组 nums 。
 * 考虑 nums 中进行 按位与（bitwise AND）运算得到的值 最大 的 非空 子数组。
 * 换句话说，令 k 是 nums 任意 子数组执行按位与运算所能得到的最大值。那么，只需要考虑那些执行一次按位与运算后等于 k 的子数组。
 * 返回满足要求的 最长 子数组的长度。
 * 数组的按位与就是对数组中的所有数字进行按位与运算。
 * 子数组 是数组中的一个连续元素序列。
 * @author fanzhou
 */
public class Question2419 {

    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ans = 0;
        int cnt = 0;
        for (int num : nums) {
            if(num > max) {
                cnt = 1;
                ans = 1;
                max = num;
            } else if (num == max) {
                cnt++;
                ans = Math.max(ans, cnt);
            } else {
                cnt = 0;
            }
        }
        return ans;
    }

}