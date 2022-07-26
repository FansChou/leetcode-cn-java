package com.fanschou.leetcodecn.solution;

/**
 * @title [258] 各位相加
 *
 * @description https://leetcode-cn.com/problems/add-digits/
 *
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
 *
 * @author fanzhou
 */
public class Question0258 {

    public int addDigits(int num) {
        return getNum(String.valueOf(num));
    }

    private int getNum(String s){
        if(s.length() == 0){
            return Integer.parseInt(s);
        }
        char[] cs = s.toCharArray();
        int ans = 0;
        for (char c : cs) {
            ans += c - 48;
        }
        if(ans >= 0 && ans <= 9){
            return ans;
        } else {
            return getNum(String.valueOf(ans));
        }
    }

}
