package com.fanschou.leetcodecn.solution;

/**
 * @title [1051] 高度检查器
 *
 * @description https://leetcode.cn/problems/height-checker/
 *
 * 学校打算为全体学生拍一张年度纪念照。根据要求，学生需要按照 非递减 的高度顺序排成一行。
 *
 * 排序后的高度情况用整数数组 expected 表示，其中 expected[i] 是预计排在这一行中第 i 位的学生的高度（下标从 0 开始）。
 *
 * 给你一个整数数组 heights ，表示 当前学生站位 的高度情况。heights[i] 是这一行中第 i 位学生的高度（下标从 0 开始）。
 *
 * 返回满足 heights[i] != expected[i] 的 下标数量 。
 *
 * @author fanzhou
 */
public class Question1051 {

    public int heightChecker(int[] heights) {
        int[] cnts = new int[101];
        for (int i : heights) {
            cnts[i]++;
        }
        int n = heights.length;
        int ans = 0;
        int[] t = new int[n];
        for (int i = 0, j = 0; i < 101; i++) {
            while (cnts[i]-- > 0) {
                t[j++] = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (t[i] != heights[i]) {
                ans++;
            }
        }
        return ans;
    }

}
