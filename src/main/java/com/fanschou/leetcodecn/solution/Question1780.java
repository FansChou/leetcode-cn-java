package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/check-if-number-is-a-sum-of-powers-of-three/">[1780] 判断一个数字是否可以表示成三的幂的和</a><br />
 * @author fanzhou
 */
public class Question1780 {

    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }

}
