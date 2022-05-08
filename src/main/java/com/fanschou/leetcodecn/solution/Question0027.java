package com.fanschou.leetcodecn.solution;

/**
 * @title [27] 移除元素
 *
 * @description https://leetcode-cn.com/problems/remove-element/
 *
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * @author fanzhou
 */
public class Question0027 {

    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int begin = 0;
        int end = nums.length - 1;

        while(begin < end){
            if(nums[begin] == val){
                if(nums[end] != val){
                    swap(nums, begin, end);
                    begin++;
                } else {
                    end--;
                }
            } else {
                begin++;
            }
        }

        if(begin == end){
            if(nums[begin] == val){
                return begin;
            } else {
                return begin + 1;
            }
        }

        return begin + 1;
    }

    public void swap(int[] nums, int begin, int end) {
        int temp = nums[begin];
        nums[begin] = nums[end];
        nums[end] = temp;
    }
}
