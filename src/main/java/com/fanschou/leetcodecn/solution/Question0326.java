package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/power-of-three/">[326] 3 的幂</a><br />
 * @author fanzhou
 */
public class Question0326 {

    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

}
