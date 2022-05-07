package com.fanschou.leetcodecn.solution;

/**
 * @title [9] 回文数
 *
 * @description https://leetcode-cn.com/problems/palindrome-number/
 *
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * @author fanzhou
 */
public class Question0009 {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int tmp = 0;
        while(x > tmp){
            int bit = x % 10;
            x /= 10;
            tmp = tmp * 10 + bit;
        }

        return x == tmp || x == tmp / 10;
    }
}
