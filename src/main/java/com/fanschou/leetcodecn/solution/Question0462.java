package com.fanschou.leetcodecn.solution;

import java.util.Arrays;

/**
 * @title [462] 最少移动次数使数组元素相等 II
 *
 * @description https://leetcode.cn/problems/minimum-moves-to-equal-array-elements-ii/
 *
 * 给你一个长度为 n 的整数数组 nums ，返回使所有数组元素相等需要的最少移动数。
 *
 * 在一步操作中，你可以使数组中的一个元素加 1 或者减 1 。
 *
 * @author fanzhou
 */
public class Question0462 {

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int t = nums[(n - 1) / 2];
        int ans = 0;
        for (int i : nums) {
            ans += Math.abs(t - i);
        }
        return ans;
    }
}
