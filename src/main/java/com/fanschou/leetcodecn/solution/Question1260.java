package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @title [1260] 二维网格迁移
 *
 * @description https://leetcode.cn/problems/shift-2d-grid/
 *
 * 给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。
 *
 * 每次「迁移」操作将会引发下述活动：
 *
 * 位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
 * 位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。
 * 位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。
 * 请你返回 k 次迁移操作后最终得到的 二维网格。
 *
 * @author fanzhou
 */
public class Question1260 {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] mat = new int[n][m];
        for (int i = 0; i < m; i++) {
            int newCol = (i + k) % m;
            int newRow = ((i + k) / m) % n;
            int idx = 0;
            while (idx != n) {
                mat[newRow++][newCol] = grid[idx++][i];
                if (newRow == n) {
                    newRow = 0;
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                list.add(mat[i][j]);
            }
            ans.add(list);
        }
        return ans;
    }
}
