package com.fanschou.leetcodecn.solution;

/**
 * @title [498] 对角线遍历
 *
 * @description https://leetcode.cn/problems/diagonal-traverse/
 *
 * 给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，用一个数组返回这个矩阵中的所有元素。
 *
 * @author fanzhou
 */
public class Question0498 {

    public int[] findDiagonalOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int cnt = m * n;
        int[] ans = new int[m * n];
        // 计数
        int idx = 0;
        // 遍历方向，1 为向右上方遍历，-1 为向左下方遍历
        int dir = 1;
        // x，y坐标
        int x = 0;
        int y = 0;

        while(idx < cnt){
            ans[idx++] = matrix[x][y];
            // 右上方遍历时，x减少，y增加
            int nx = dir == 1 ? x - 1 : x + 1;
            int ny = dir == 1 ? y + 1 : y - 1;

            // 临界处理
            if(nx < 0 || ny < 0 || nx >= n || ny >= m){
                if(dir == 1){
                    // 右上方遍历时，如果y轴不越界，则x轴不动，y增加；如果y轴越界，则x增加，y轴不动
                    nx = y + 1 < m ? x : x + 1;
                    ny = y + 1 < m ? y + 1 : y;
                } else {
                    // 左下方遍历时，如果x轴不越界，则x轴增加，y轴不动；如果x轴越界，则x轴不动，y轴增加
                    nx = x + 1 < n ? x + 1 : x;
                    ny = x + 1 < n ? y : y + 1;
                }
                // 临界时，需要调转方向
                dir *= -1;
            }
            x = nx;
            y = ny;
        }

        return ans;
    }

}
