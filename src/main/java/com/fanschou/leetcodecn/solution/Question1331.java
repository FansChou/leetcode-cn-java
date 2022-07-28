package com.fanschou.leetcodecn.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @title [1331] 数组序号转换
 *
 * @description https://leetcode.cn/problems/rank-transform-of-an-array/
 *
 * 给你一个整数数组 arr ，请你将数组中的每个元素替换为它们排序后的序号。
 *
 * 序号代表了一个元素有多大。序号编号的规则如下：
 *
 * 序号从 1 开始编号。
 * 一个元素越大，那么序号越大。如果两个元素相等，那么它们的序号相同。
 * 每个数字的序号都应该尽可能地小。
 *
 * @author fanzhou
 */
public class Question1331 {

    public int[] arrayRankTransform(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int idx = 0;
        for (int i : clone) {
            if (!map.containsKey(i)) {
                map.put(i, ++idx);
            }
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}
