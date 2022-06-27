package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @title [20] 有效的括号
 *
 * @description https://leetcode.cn/problems/generate-parentheses/
 *
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 * @author fanzhou
 */
public class Question0022 {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    private void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max) {
        if(cur.length() == max * 2){
            ans.add(cur.toString());
            return;
        }
        if(open < max){
            cur.append("(");
            backtrack(ans, cur, open + 1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if(close < open){
            cur.append(")");
            backtrack(ans, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
