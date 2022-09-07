package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * [1592] 重新排列单词间的空格
 *
 * https://leetcode.cn/problems/rearrange-spaces-between-words/
 * 
 * 给你一个字符串 text ，该字符串由若干被空格包围的单词组成。每个单词由一个或者多个小写英文字母组成，并且两个单词之间至少存在一个空格。题目测试用例保证 text 至少包含一个单词 。
 *
 * 请你重新排列空格，使每对相邻单词之间的空格数目都 相等 ，并尽可能 最大化 该数目。如果不能重新平均分配所有空格，请 将多余的空格放置在字符串末尾 ，这也意味着返回的字符串应当与原 text 字符串的长度相等。
 *
 * 返回 重新排列空格后的字符串 。
 *
 * @author fanzhou
 */
public class Question1592 {

    public String reorderSpaces(String text) {
        int length = text.length();
        int spaceCount = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < length; ) {
            if(text.charAt(i) == ' '){
                spaceCount++;
                i++;
                continue;
            }
            int j = i;
            while (j < length && text.charAt(j) != ' '){
                j++;
            }
            list.add(text.substring(i, j));
            i = j;
        }

        int m = Math.max(list.size() - 1, 1);
        int count = spaceCount / m;
        String repeat = " ".repeat(count);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(repeat);
            }
        }
        while (sb.length() != length) {
            sb.append(" ");
        }

        return sb.toString();
    }
}
