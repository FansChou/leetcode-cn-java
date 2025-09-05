package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/minimum-operations-to-make-the-integer-zero/">[2749] 得到整数零需要执行的最少操作数</a><br />
 * @author fanzhou
 */
public class Question2749 {

    public int makeTheIntegerZero(int num1, int num2) {
        for (long k = 1; k <= num1 - num2 * k; k++) {
            if (k >= Long.bitCount(num1 - num2 * k)) {
                return (int) k;
            }
        }
        return -1;
    }

}
