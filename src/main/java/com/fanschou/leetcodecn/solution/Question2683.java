package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/neighboring-bitwise-xor/">[2683] 相邻值的按位异或</a><br />
 * @author fanzhou
 */
public class Question2683 {

    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0;
        for (int x : derived) {
            xor ^= x;
        }
        return xor == 0;
    }

}