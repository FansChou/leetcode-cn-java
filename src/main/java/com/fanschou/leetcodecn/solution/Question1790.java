package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/check-if-one-string-swap-can-make-strings-equal/">[1790] 仅执行一次字符串交换能否使两个字符串相等</a><br />
 *
 * 给你长度相等的两个字符串 s1 和 s2 。一次 字符串交换 操作的步骤如下：选出某个字符串中的两个下标（不必不同），并交换这两个下标所对应的字符。
 *
 * 如果对 其中一个字符串 执行 最多一次字符串交换 就可以使两个字符串相等，返回 true ；否则，返回 false 。
 *
 * @author fanzhou
 */
public class Question1790 {

    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int a = -1;
        int b = -1;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            }
            if (a == -1) {
                a = i;
            } else if (b == -1) {
                b = i;
            } else {
                return false;
            }
        }
        if (a == -1) {
            return true;
        }
        if (b == -1) {
            return false;
        }
        return s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a);
    }
}
