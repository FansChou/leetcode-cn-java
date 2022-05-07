package com.fanschou.leetcodecn.solution;

/**
 * @title [1] Two Sum
 *
 * @description https://leetcode-cn.com/problems/two-sum/
 *
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 * 
 * @author fanzhou
 */
public class Question0001 {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(target == nums[i] + nums[j] && i != j) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {0, 0};
    }
}
