package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/power-of-two/">[231] 2 的幂</a><br />
 * @author fanzhou
 */
public class Question0231 {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

}
