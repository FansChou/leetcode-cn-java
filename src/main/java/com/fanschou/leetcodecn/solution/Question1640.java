package com.fanschou.leetcodecn.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/check-array-formation-through-concatenation/">[1640] 能否连接形成数组</a><br />
 *
 * 给你一个整数数组 arr ，数组中的每个整数 互不相同 。另有一个由整数数组构成的数组 pieces，其中的整数也 互不相同 。
 * 请你以 任意顺序 连接 pieces 中的数组以形成 arr 。但是，不允许 对每个数组 pieces[i] 中的整数重新排序。
 *
 * 如果可以连接 pieces 中的数组形成 arr ，返回 true ；否则，返回 false 。
 *
 * @author fanzhou
 */
public class Question1640 {

    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = pieces.length;
        for (int i = 0; i < m; i++) {
            // 记录pieces每个数组首位数字在pieces中的索引
            map.put(pieces[i][0], i);
        }
        int n = arr.length;
        for (int i = 0; i < n; ) {
            // 首位数字找不到，直接false
            if (!map.containsKey(arr[i])) {
                return false;
            }
            Integer j = map.get(arr[i]);
            int len = pieces[j].length;
            for (int k = 0; k < len; k++) {
                // 数字序列对不齐，直接false
                if (arr[i + k] != pieces[j][k]) {
                    return false;
                }
            }
            i += len;
        }
        return true;
    }
}
