package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/delete-characters-to-make-fancy-string/">[1957] 删除字符使字符串变好</a><br />
 * @author fanzhou
 */
public class Question1957 {

    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            cnt++;
            if (cnt < 3) {
                ans.append(s.charAt(i));
            }
            if (i < s.length() - 1 && s.charAt(i) != s.charAt(i + 1)) {
                cnt = 0; // 当前字母和下个字母不同，重置计数器
            }
        }
        return ans.toString();
    }
}
