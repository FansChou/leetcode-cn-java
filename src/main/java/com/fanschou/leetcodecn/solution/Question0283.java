package com.fanschou.leetcodecn.solution;

/**
 * @title [283] 移动零
 *
 * @description https://leetcode-cn.com/problems/move-zeroes/
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * @author fanzhou
 */
public class Question0283 {

    public void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;
        while(fast < nums.length){
            if(nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        while(slow < nums.length){
            nums[slow++] = 0;
        }
    }

}
