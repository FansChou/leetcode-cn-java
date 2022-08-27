package com.fanschou.leetcodecn.solution;

import java.util.Arrays;

/**
 * @title [300] 最长递增子序列
 *
 * @description https://leetcode-cn.com/problems/longest-increasing-subsequence/
 *
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 *
 * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7]
 * 的子序列。
 *
 * @author fanzhou
 */
public class Question0300 {

    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int maxSize = 1;

        int[] dp = new int[len];
        Arrays.fill(dp, 1);

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            if(dp[i] > maxSize){
                maxSize = dp[i];
            }
        }

        return maxSize;
    }
}
