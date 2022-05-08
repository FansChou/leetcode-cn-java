package com.fanschou.leetcodecn.solution;

/**
 * @title [28] 实现 strStr()
 *
 * @description https://leetcode-cn.com/problems/implement-strstr/
 *
 * 实现 strStr() 函数。
 *
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0
 * 开始）。如果不存在，则返回  -1 。
 *
 *
 * 说明：
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf()
 * 定义相符。
 *
 * @author fanzhou
 */
public class Question0028 {

    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }

        int h = haystack.length();
        int n = needle.length();
        int[] pmt = new int[n];

        for (int i = 1, j = 0; i < n; i++) {
            while(j > 0 && needle.charAt(i) != needle.charAt(j)){
                j = pmt[j - 1];
            }
            if(needle.charAt(i) == needle.charAt(j)){
                j++;
            }

            pmt[i] = j;
        }

        for (int i = 0, j = 0; i < h; i++) {
            while(j > 0 && haystack.charAt(i) != needle.charAt(j)){
                j = pmt[j - 1];
            }
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }

            if(j == n){
                return i - n + 1;
            }
        }

        return -1;
    }
}
