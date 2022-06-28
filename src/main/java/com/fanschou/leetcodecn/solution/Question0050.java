package com.fanschou.leetcodecn.solution;

/**
 * @title [50] Pow(x, n)
 *
 * @description https://leetcode.cn/problems/powx-n/
 *
 * 实现 pow(x, n) ，即计算 x 的整数 n 次幂函数（即，xn ）。
 *
 * @author fanzhou
 */
public class Question0050 {

    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public double quickMul(double x, long n) {
        double ans = 1.0;
        // 贡献的初始值为 x
        double xContribute = x;
        // 在对 n 进行二进制拆分的同时计算答案
        while (n > 0) {
            if (n % 2 == 1) {
                // 如果 n 二进制表示的最低位为 1，那么需要计入贡献
                ans *= xContribute;
            }
            // 将贡献不断地平方
            xContribute *= xContribute;
            // 舍弃 n 二进制表示的最低位，这样我们每次只要判断最低位即可
            n /= 2;
        }
        return ans;
    }
}
