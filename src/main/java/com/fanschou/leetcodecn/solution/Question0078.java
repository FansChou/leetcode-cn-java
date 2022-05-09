package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @title [78] 子集
 *
 * @description https://leetcode-cn.com/problems/subsets/
 *
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 *
 * @author fanzhou
 */
public class Question0078 {

    List<Integer> tmp = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return result;
    }

    private void dfs(int cur, int[] nums){
        if(cur == nums.length){
            result.add(new ArrayList<>(tmp));
            return;
        }

        tmp.add(nums[cur]);
        dfs(cur + 1, nums);

        tmp.remove(tmp.size() - 1);
        dfs(cur + 1, nums);
    }
}
