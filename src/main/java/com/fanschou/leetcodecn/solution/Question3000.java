package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/maximum-area-of-longest-diagonal-rectangle/">[3000] 对角线最长的矩形的面积</a><br />
 * 给你一个下标从 0 开始的二维整数数组 dimensions。
 * 对于所有下标 i（0 <= i < dimensions.length），dimensions[i][0] 表示矩形 i 的长度，而 dimensions[i][1] 表示矩形 i 的宽度。
 * 返回对角线最 长 的矩形的 面积 。如果存在多个对角线长度相同的矩形，返回面积最 大 的矩形的面积。
 * @author fanzhou
 */
public class Question3000 {

    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans = 0, maxL = 0;
        for (int[] d : dimensions) {
            int x = d[0], y = d[1];
            int l = x * x + y * y;
            if (l > maxL || l == maxL && x * y > ans) {
                maxL = l;
                ans = x * y;
            }
        }
        return ans;
    }

}
