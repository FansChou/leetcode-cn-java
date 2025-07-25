package com.fanschou.leetcodecn.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.cn/problems/maximum-unique-subarray-sum-after-deletion/">[3487] 删除后的最大子数组元素和</a><br />
 * 给你一个整数数组 nums 。
 * 你可以从数组 nums 中删除任意数量的元素，但不能将其变为 空 数组。执行删除操作后，选出 nums 中满足下述条件的一个子数组：
 *     1. 子数组中的所有元素 互不相同 。
 *     2. 最大化 子数组的元素和。
 * 返回子数组的 最大元素和 。
 * 子数组 是数组的一个连续、非空 的元素序列。
 * @author fanzhou
 */
public class Question3487 {

    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        int maxNeg = Integer.MIN_VALUE;
        for (int num : nums) {
            if(num < 0) {
                maxNeg = Math.max(maxNeg, num);
            } else if(set.add(num)){
                ans += num;
            }
        }
        return set.isEmpty() ? maxNeg : ans;
    }
}
