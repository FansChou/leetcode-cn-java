package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/count-number-of-maximum-bitwise-or-subsets/">[2044] 统计按位或能得到最大值的子集数目</a><br />
 * 给你一个整数数组 nums ，请你找出 nums 子集 按位或 可能得到的 最大值 ，并返回按位或能得到最大值的 不同非空子集的数目 。
 * 如果数组 a 可以由数组 b 删除一些元素（或不删除）得到，则认为数组 a 是数组 b 的一个 子集 。如果选中的元素下标位置不一样，则认为两个子集 不同 。
 * 对数组 a 执行 按位或 ，结果等于 a[0] OR a[1] OR ... OR a[a.length - 1]（下标从 0 开始）。
 * @author fanzhou
 */
public class Question2044 {

    int ans = 0;
    public int countMaxOrSubsets(int[] nums) {
        int totalOR = 0;
        for (int num : nums) {
            totalOR |= num;
        }
        dfs(0, 0, totalOR, nums);
        return ans;
    }

    private void dfs(int i, int subOr, int totalOR, int[] nums) {
        if(subOr == totalOR) {
            ans += 1 << (nums.length - i);
            return;
        }
        if(i == nums.length) {
            return;
        }
        dfs(i + 1, subOr, totalOR, nums);
        dfs(i + 1, subOr | nums[i], totalOR, nums);
    }

}