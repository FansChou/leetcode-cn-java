package com.fanschou.leetcodecn.solution;

/**
 * @title [942] 增减字符串匹配
 *
 * @description https://leetcode.cn/problems/di-string-match/
 *
 * 由范围 [0,n] 内所有整数组成的 n + 1 个整数的排列序列可以表示为长度为 n 的字符串 s ，其中:
 *
 * 如果 perm[i] < perm[i + 1] ，那么 s[i] == 'I' 
 * 如果 perm[i] > perm[i + 1] ，那么 s[i] == 'D' 
 *
 * 给定一个字符串 s ，重构排列 perm 并返回它。如果有多个有效排列perm，则返回其中 任何一个 。
 *
 *
 * @author fanzhou
 */
public class Question0942 {

    public int[] diStringMatch(String s) {
        int max = s.length();
        int min = 0;

        char[] chars = s.toCharArray();
        int[] perm = new int[chars.length + 1];
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'I'){
                perm[i] = min;
                min++;
            }
            if(chars[i] == 'D'){
                perm[i] = max;
                max--;
            }
        }
        perm[chars.length] = max;
        return perm;
    }
}
