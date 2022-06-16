package com.fanschou.leetcodecn.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @title [532] 数组中的 k-diff 数对
 *
 * @description https://leetcode.cn/problems/k-diff-pairs-in-an-array/
 *
 * 给定一个整数数组和一个整数 k，你需要在数组里找到 不同的 k-diff 数对，并返回不同的 k-diff 数对 的数目。
 *
 * 这里将 k-diff 数对定义为一个整数对 (nums[i], nums[j])，并满足下述全部条件：
 *
 * 0 <= i < j < nums.length
 * |nums[i] - nums[j]| == k
 * 注意，|val| 表示 val 的绝对值。
 *
 * @author fanzhou
 */
public class Question0532 {

    public int findPairs(int[] nums, int k) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int num : nums) {
            if(visited.contains(num - k)){
                result.add(num - k);
            }
            if(visited.contains(num + k)){
                result.add(num);
            }
            visited.add(num);
        }
        return result.size();
    }

    public int findPairs1(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int y = 0;
        int res = 0;
        for (int x = 0; x < n; x++) {
            if (x == 0 || nums[x] != nums[x - 1]) {
                while (y < n && (nums[y] < nums[x] + k || y <= x)) {
                    y++;
                }
                if (y < n && nums[y] == nums[x] + k) {
                    res++;
                }
            }
        }
        return res;
    }

}
