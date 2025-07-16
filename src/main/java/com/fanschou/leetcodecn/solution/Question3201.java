package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/find-the-maximum-length-of-valid-subsequence-i/">[3201] 找出有效子序列的最大长度 I</a><br />
 * @author fanzhou
 */
public class Question3201 {

    public int maximumLength(int[] nums) {
        int[] cnt1 = new int[2];
        int[] cnt2 = new int[2];
        for (int num : nums) {
            cnt1[num % 2]++;
            cnt2[num % 2] = cnt2[1 - (num % 2)] + 1;
        }
        return Math.max(Math.max(cnt2[0], cnt2[1]), Math.max(cnt1[0], cnt1[1]));
    }
}
