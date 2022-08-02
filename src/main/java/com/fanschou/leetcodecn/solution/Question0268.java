package com.fanschou.leetcodecn.solution;

/**
 * @title [268] 丢失的数字
 *
 * @description https://leetcode-cn.com/problems/missing-number/
 *
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 *
 * @author fanzhou
 */
public class Question0268 {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int cur = 0;
        int sum = n * (n + 1) / 2;
        for (int i : nums) {
            cur += i;
        }
        return sum - cur;
    }

}
