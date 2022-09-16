package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode-cn.com/problems/power-of-four/">[342] 4的幂</a><br />
 *
 * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4^x
 *
 * @author fanzhou
 */
public class Question0342 {

    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }
}
