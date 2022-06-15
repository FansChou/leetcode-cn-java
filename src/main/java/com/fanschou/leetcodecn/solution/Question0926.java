package com.fanschou.leetcodecn.solution;

/**
 * @title [926] 将字符串翻转到单调递增
 *
 * @description https://leetcode.cn/problems/flip-string-to-monotone-increasing/
 *
 * 如果一个二进制字符串，是以一些 0（可能没有 0）后面跟着一些 1（也可能没有 1）的形式组成的，那么该字符串是 单调递增 的。
 *
 * 给你一个二进制字符串 s，你可以将任何 0 翻转为 1 或者将 1 翻转为 0 。
 *
 * 返回使 s 单调递增的最小翻转次数。
 *
 * @author fanzhou
 */
public class Question0926 {

    public int minFlipsMonoIncr(String s) {
        char[] ch = s.toCharArray();
        int n = s.length();
        int[] sum = new int[n + 1];
        int ans = s.length();
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + (ch[i - 1] - '0');
        }
        for (int i = 1; i <= n; i++) {
            int l = sum[i - 1];
            int r = (n - i) - (sum[n] - sum[i]);
            ans = Math.min(ans, l + r);
        }
        return ans;
    }
}
