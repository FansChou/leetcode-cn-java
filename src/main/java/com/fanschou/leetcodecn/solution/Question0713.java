package com.fanschou.leetcodecn.solution;

/**
 * @title [713] 乘积小于 K 的子数组
 *
 * @description https://leetcode-cn.com/problems/subarray-product-less-than-k/
 *
 * 给你一个整数数组 nums 和一个整数 k ，请你返回子数组内所有元素的乘积严格小于 k 的连续子数组的数目。
 *
 * @author fanzhou
 */
public class Question0713 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int n = nums.length;
        int ans = 0;
        int cur = 1;
        int j = 0;

        for (int i = 0; i < n; i++) {
            cur *= nums[i];
            while(cur >= k){
                cur /= nums[j++];
            }
            ans += i - j + 1;
        }
        return ans;
    }
}
