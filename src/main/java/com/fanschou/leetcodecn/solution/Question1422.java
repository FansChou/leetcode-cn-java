package com.fanschou.leetcodecn.solution;

/**
 * @title [1422] 分割字符串的最大得分
 *
 * @description https://leetcode.cn/problems/maximum-score-after-splitting-a-string/
 *
 * 给你一个由若干 0 和 1 组成的字符串 s ，请你计算并返回将该字符串分割成两个 非空 子字符串（即 左 子字符串和 右 子字符串）所能获得的最大得分。
 *
 * 「分割字符串的得分」为 左 子字符串中 0 的数量加上 右 子字符串中 1 的数量。
 *
 * @author fanzhou
 */
public class Question1422 {

    public int maxScore(String s) {
        int n = s.length();
        int cur = s.charAt(0) == '0' ? 1 : 0;
        // 计算以s0为分割点的得分数
        for (int i = 1; i < n; i++) {
            cur += s.charAt(i) - '0';
        }
        int ans = cur;
        for (int i = 1; i < n - 1; i++) {
            // 得分点偏移一位，如果是0，表示左边多了一个0，得1分，但是右边不计算0的得分，减少也没有影响，所以总分直接+1
            // 如果是1，表示左边多一个1不得分，增加也不影响，但是右边计算1的得分，减少的话少1分，所以总分-1
            cur += s.charAt(i) == '0' ? 1 : -1;
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}
