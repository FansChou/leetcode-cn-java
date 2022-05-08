package com.fanschou.leetcodecn.solution;

/**
 * @title [14] 最长公共前缀
 *
 * @description https://leetcode-cn.com/problems/longest-common-prefix/
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * @author fanzhou
 */
public class Question0014 {

    public String longestCommonPrefix(String[] strs) {
        String shortestStr = strs[0];
        int len = strs[0].length();
        for (String string : strs) {
            if(string.length() < len){
                shortestStr = string;
            }
        }
        for (int i = shortestStr.length(); i >= 1; i--) {
            String s = shortestStr.substring(0, i);
            boolean ok = true;
            for (String string : strs) {
                if(!string.startsWith(s)){
                    ok = false;
                    break;
                }
            }
            if(ok){
                return s;
            }
        }
        return "";
    }
}
