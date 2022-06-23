package com.fanschou.leetcodecn.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @title [290] 单词规律
 *
 * @description https://leetcode.cn/problems/word-pattern/
 *
 * 给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 *
 * @author fanzhou
 */
public class Question0290 {

    public boolean wordPattern(String pattern, String s) {
        Map<String, Character> str2ch = new HashMap<>();
        Map<Character, String> ch2str = new HashMap<>();
        String[] split = s.split("\\s+");
        if(split.length != pattern.length()){
            return false;
        }

        for (int i = 0; i < split.length; i++) {
            char c = pattern.charAt(i);
            if(str2ch.containsKey(split[i]) && c != str2ch.get(split[i])){
                return false;
            }
            if(ch2str.containsKey(c) && !split[i].equals(ch2str.get(c))){
                return false;
            }
            str2ch.put(split[i], c);
            ch2str.put(c, split[i]);
        }
        return true;
    }

    public boolean wordPattern1(String pattern, String str) {
        Map<String, Character> str2ch = new HashMap<>();
        Map<Character, String> ch2str = new HashMap<>();
        int m = str.length();
        int i = 0;
        for (int p = 0; p < pattern.length(); ++p) {
            char ch = pattern.charAt(p);
            if (i >= m) {
                return false;
            }
            int j = i;
            while (j < m && str.charAt(j) != ' ') {
                j++;
            }
            String tmp = str.substring(i, j);
            if (str2ch.containsKey(tmp) && str2ch.get(tmp) != ch) {
                return false;
            }
            if (ch2str.containsKey(ch) && !tmp.equals(ch2str.get(ch))) {
                return false;
            }
            str2ch.put(tmp, ch);
            ch2str.put(ch, tmp);
            i = j + 1;
        }
        return i >= m;
    }

}
