package com.fanschou.leetcodecn.solution;

/**
 * @title [179] 最大数
 *
 * @description https://leetcode-cn.com/problems/largest-number/
 *
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 *
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 * @author fanzhou
 */
public class Question0179 {

    public String largestNumber(int[] nums) {
        if(nums.length == 1){
            return String.valueOf(nums[0]);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(bindCompare(nums[i], nums[j]) < 0) {
                    swap(nums, i ,j);
                }
            }
        }

        if(nums[0] == 0){
            return String.valueOf(nums[0]);
        }

        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }

        return sb.toString();
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private int bindCompare(int i, int j){
        if(i == j){
            return 0;
        }

        int xMultiFactor = 10;
        int yMultiFactor = 10;

        while(xMultiFactor <= i){
            xMultiFactor *= 10;
        }

        while(yMultiFactor <= j){
            yMultiFactor *= 10;
        }

        return (-yMultiFactor * i - j + xMultiFactor * j + i);
    }
}
