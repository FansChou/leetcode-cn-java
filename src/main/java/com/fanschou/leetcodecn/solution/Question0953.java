package com.fanschou.leetcodecn.solution;

/**
 * @title [953] 验证外星语词典
 *
 * @description https://leetcode.cn/problems/verifying-an-alien-dictionary/
 *
 * 某种外星语也使用英文小写字母，但可能顺序 order 不同。字母表的顺序（order）是一些小写字母的排列。
 *
 * 给定一组用外星语书写的单词 words，以及其字母表的顺序 order，只有当给定的单词在这种外星语中按字典序排列时，返回 true；否则，返回 false。
 *
 * @author fanzhou
 */
public class Question0953 {

    public boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        // 将字母表顺序初始化
        for (int i = 0; i < order.length(); i++) {
            index[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            boolean valid = false;
            for (int j = 0; j < words[i - 1].length() && j < words[i].length(); j++) {
                int prev = index[words[i - 1].charAt(j) - 'a'];
                int cur = index[words[i].charAt(j) - 'a'];
                // 前一个字符串的字符比后一个字符串的字符小，满足字典序，直接跳出循环
                if(prev < cur){
                    valid = true;
                    break;
                } else if(prev > cur){
                    return false;
                }
            }
            // 其中一个字符串遍历完
            // 前一个字符串的长度比后一个字符串的长度大，不满足字典序，直接返回false
            if(!valid && words[i - 1].length() > words[i].length()){
                return false;
            }
        }
        return true;
    }
}
