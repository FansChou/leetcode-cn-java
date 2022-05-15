package com.fanschou.leetcodecn.solution;

/**
 * @title [137] 只出现一次的数字 II
 *
 * @description https://leetcode-cn.com/problems/single-number-ii/description/
 *
 * 给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。
 *
 * @author fanzhou
 */
public class Question0137 {

    public int singleNumber(int[] nums) {
        int a = 0;
        int b = 0;

        for(int x : nums){
            b = (b ^ x) & ~a;
            a = (a ^ x) & ~b;
        }

        return b;
    }
}
