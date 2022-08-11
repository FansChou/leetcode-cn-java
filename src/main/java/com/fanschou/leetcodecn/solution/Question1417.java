package com.fanschou.leetcodecn.solution;

/**
 * @title [1417] 重新格式化字符串
 *
 * @description https://leetcode.cn/problems/minimum-value-to-get-positive-step-by-step-sum/
 *
 * 给你一个混合了数字和字母的字符串 s，其中的字母均为小写英文字母。
 *
 * 请你将该字符串重新格式化，使得任意两个相邻字符的类型都不同。也就是说，字母后面应该跟着数字，而数字后面应该跟着字母。
 *
 * 请你返回 重新格式化后 的字符串；如果无法按要求重新格式化，则返回一个 空字符串 。
 *
 * @author fanzhou
 */
public class Question1417 {

    public String reformat(String s) {
        StringBuilder chars = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        // 字母和数字分开存放
        for (char ch : s.toCharArray()) {
            if(Character.isDigit(ch)){
                digits.append(ch);
            } else {
                chars.append(ch);
            }
        }
        int charLength = chars.length();
        int digitLength = digits.length();
        // 字母和数字数量相差大于1，一定无法格式化
        if(Math.abs(charLength - digitLength) > 1){
            return "";
        }
        int total = charLength + digitLength;
        StringBuilder sb = new StringBuilder();
        while (sb.length() != total){
            if(charLength > digitLength){
                sb.append(chars.charAt(--charLength));
            } else if (digitLength > charLength){
                sb.append(digits.charAt(--digitLength));
            } else {
                if(!sb.isEmpty() && Character.isDigit(sb.charAt(sb.length() - 1))){
                    sb.append(chars.charAt(--charLength));
                } else {
                    sb.append(digits.charAt(--digitLength));
                }
            }
        }

        return sb.toString();
    }
}
