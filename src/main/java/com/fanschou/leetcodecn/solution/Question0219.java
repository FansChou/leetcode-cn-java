package com.fanschou.leetcodecn.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @title [219] 存在重复元素 II
 *
 * @description https://leetcode-cn.com/problems/contains-duplicate-ii/
 *
 * 给你一个整数数组nums 和一个整数k ，判断数组中是否存在两个 不同的索引i和j ，满足 nums[i] == nums[j] 且
 * abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。
 *
 * @author fanzhou
 */
public class Question0219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(i > k){
                s.remove(nums[i - k - 1]);
            }
            if(s.contains(nums[i])){
                return true;
            }
            s.add(nums[i]);
        }
        return false;
    }

}
