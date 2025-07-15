package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/valid-word/">[3136] 有效单词</a><br />
 *
 * 有效单词 需要满足以下几个条件：
 * 至少 包含 3 个字符。
 * - 由数字 0-9 和英文大小写字母组成。（不必包含所有这类字符。）
 * - 至少 包含一个 元音字母 。
 * - 至少 包含一个 辅音字母 。
 * - 给你一个字符串 word 。如果 word 是一个有效单词，则返回 true ，否则返回 false 。
 *
 * @author fanzhou
 */
public class Question3136 {

    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        boolean[] f = new boolean[2];
        for (char c : word.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                c = Character.toLowerCase(c);
                f[c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ? 1 : 0] = true;
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return f[0] && f[1];
    }
}
