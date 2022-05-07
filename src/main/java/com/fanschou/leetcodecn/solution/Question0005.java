package com.fanschou.leetcodecn.solution;

/**
 * @title [5] 最长回文子串
 *
 * @description https://leetcode-cn.com/problems/longest-palindromic-substring/
 *
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * @author fanzhou
 */
public class Question0005 {

    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for (int l = 0; l < n; ++l) {
            for (int i = 0; i + l < n; ++i) {
                int j = i + l;
                if (l == 0) {
                    dp[i][j] = true;
                } else if (l == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
                if (dp[i][j] && l + 1 > ans.length()) {
                    ans = s.substring(i, i + l + 1);
                }
            }
        }
        return ans;
    }
}
