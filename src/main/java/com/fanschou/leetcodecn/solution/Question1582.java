package com.fanschou.leetcodecn.solution;

/**
 * [1582] 二进制矩阵中的特殊位置
 *
 * https://leetcode.cn/problems/special-positions-in-a-binary-matrix/
 * 
 * 给你一个大小为 rows x cols 的矩阵 mat，其中 mat[i][j] 是 0 或 1，请返回 矩阵 mat 中特殊位置的数目 。
 *
 * 特殊位置 定义：如果 mat[i][j] == 1 并且第 i 行和第 j 列中的所有其他元素均为 0（行和列的下标均 从 0 开始 ），则位置 (i, j) 被称为特殊位置。
 *
 * @author fanzhou
 */
public class Question1582 {

    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int ans = 0;
        int[] row = new int[n];
        int[] column = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                row[i] += mat[i][j];
                column[j] += mat[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1 && row[i] == 1 && column[j] == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
