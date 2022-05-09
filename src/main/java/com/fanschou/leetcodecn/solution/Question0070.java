package com.fanschou.leetcodecn.solution;

/**
 * @title [70] 爬楼梯
 *
 * @description https://leetcode-cn.com/problems/climbing-stairs/
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * @author fanzhou
 */
public class Question0070 {

    public int climbStairs(int n) {
        int f1;
        int f2 = 1;
        int r = 1;
        for (int i = 2; i <= n; i++) {
            f1 = f2;
            f2 = r;
            r = f1 + f2;
        }

        return r;
    }
}
