package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/new-21-game/">[837] 新 21 点</a><br />
 *
 * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4^x
 *
 * @author fanzhou
 */
public class Question0837 {

    public double new21Game(int n, int k, int maxPts) {
        double[] f = new double[n + 1];
        double s = 0;
        for (int i = n; i >= 0; i--) {
            f[i] = i >= k ? 1 : s / maxPts;
            s += f[i];
            if (i + maxPts <= n) {
                s -= f[i + maxPts];
            }
        }
        return f[0];
    }
}
