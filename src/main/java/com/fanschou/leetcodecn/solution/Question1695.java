package com.fanschou.leetcodecn.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.cn/problems/maximum-erasure-value/">[1695] 删除子数组的最大得分</a><br />
 * 给你一个正整数数组 nums ，请你从中删除一个含有 若干不同元素 的子数组。删除子数组的 得分 就是子数组各元素之 和 。
 * 返回 只删除一个 子数组可获得的 最大得分 。
 * 如果数组 b 是数组 a 的一个连续子序列，即如果它等于 a[l],a[l+1],...,a[r] ，那么它就是 a 的一个子数组。
 * @author fanzhou
 */
public class Question1695 {

    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        int sum = 0;
        int left = 0;
        for (int num : nums) {
            while (set.contains(num)) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(num);
            sum += num;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
