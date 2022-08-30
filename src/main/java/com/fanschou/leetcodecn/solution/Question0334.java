package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode-cn.com/problems/increasing-triplet-subsequence/">[334] 递增的三元子序列</a>
 *
 * 给你一个整数数组 nums ，判断这个数组中是否存在长度为 3 的递增子序列。
 *
 * 如果存在这样的三元组下标 (i, j, k) 且满足 i < j < k ，使得 nums[i] < nums[j] < nums[k] ，返回
 * true ；否则，返回 false 。
 *
 * @author fanzhou
 */
public class Question0334 {

    public boolean increasingTriplet(int[] nums) {

        long[] f = new long[3];
        f[1] = f[2] = (int)1e19;

        for (int t : nums) {
            if (t > f[2]) {
                return true;
            } else if (f[1] < t && t < f[2]) {
                f[2] = t;
            } else if (t < f[1]) {
                f[1] = t;
            }
        }

        return false;
    }
}
