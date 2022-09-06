package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode-cn.com/problems/counting-bits/">[338] 比特位计数</a>
 *
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 *
 * @author fanzhou
 */
public class Question0338 {

    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        dp[0] = 0;
        int highBit = 1;
        for (int i = 1; i <= num; i++) {
            // i-1到i产生进位，最高bit位升一位
            if((i & (i - 1)) == 0) {
                highBit = i;
            }
            dp[i] = dp[i - highBit] + 1;
        }

        return dp;
    }
}
