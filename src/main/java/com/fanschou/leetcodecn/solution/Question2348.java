package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/number-of-zero-filled-subarrays/">[2348] 全 0 子数组的数目</a><br />
 * 给你一个整数数组 nums ，返回全部为 0 的 子数组 数目。
 * 子数组 是一个数组中一段连续非空元素组成的序列。
 * @author fanzhou
 */
public class Question2348 {

    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        for (int left = 0, right = 0; left < nums.length; left++) {
            if(nums[left] == 0){
                right = left;
                while(right < nums.length && nums[right] == 0){
                    right++;
                }
                int cnt = right - left;
                ans += ((long) cnt * (cnt + 1)) / 2;
                left = right;
            }
        }
        return ans;
    }

}
