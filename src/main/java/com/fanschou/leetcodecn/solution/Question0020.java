package com.fanschou.leetcodecn.solution;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @title [20] 有效的括号
 *
 * @description https://leetcode-cn.com/problems/valid-parentheses/
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * @author fanzhou
 */
public class Question0020 {

    public boolean isValid(String s) {
        Deque<Character> d = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if(!map.containsKey(c)){
                d.push(c);
            } else if(d.isEmpty() || !map.get(c).equals(d.pop())){
                return false;
            }
        }
        return d.isEmpty();
    }
}
