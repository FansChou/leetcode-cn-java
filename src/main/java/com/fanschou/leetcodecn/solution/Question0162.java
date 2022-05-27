package com.fanschou.leetcodecn.solution;

/**
 * @title [162] 寻找峰值
 *
 * @description https://leetcode-cn.com/problems/find-peak-element/
 *
 * 峰值元素是指其值严格大于左右相邻值的元素。
 *
 * 给你一个整数数组nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
 *
 * 你可以假设nums[-1] = nums[n] = -∞ 。
 *
 * 你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
 *
 * @author fanzhou
 */
public class Question0162 {

    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            int mid = l + r >> 1;
            if(nums[mid] > nums[mid + 1]){
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
}
