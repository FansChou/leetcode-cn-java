package com.fanschou.leetcodecn.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @title [873] 最长的斐波那契子序列的长度
 *
 * @description https://leetcode.cn/problems/length-of-longest-fibonacci-subsequence/
 *
 * 给定一个严格递增的正整数数组形成序列 arr ，找到 arr 中最长的斐波那契式的子序列的长度。如果一个不存在，返回  0 。
 *
 * @author fanzhou
 */
public class Question0873 {

    public int lenLongestFibSubseq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }
        // f[j][i] 表示以arr[j]、arr[i]作为斐波拉契数列结尾的两个数所能得到的最大序列长度
        int[][] f = new int[n][n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            // 剪枝1：以 j 位置的数字作为序列倒数第二个值，此时如果最大长度也超不过ans，直接减去
            // 剪枝2：如果arr[j]前面的数无法和arr[j]、arr[i]凑成序列，也直接减去
            for (int j = i - 1; j >= 0 && j + 2 > ans && arr[j] * 2 > arr[i]; j--) {
                int index = map.getOrDefault(arr[i] - arr[j], -1);
                if(index == -1){
                    continue;
                }
                f[j][i] = Math.max(3, f[index][j] + 1);
                ans = Math.max(ans, f[j][i]);
            }
        }

        return ans;
    }
}
