package com.fanschou.leetcodecn.solution;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/mean-of-array-after-removing-some-elements/">[1619] 删除某些元素后的数组均值</a><br />
 *
 * 给你一个整数数组 arr ，请你删除最小 5% 的数字和最大 5% 的数字后，剩余数字的平均值。
 *
 * 与 标准答案 误差在 10-5 的结果都被视为正确结果。
 *
 * @author fanzhou
 */
public class Question1619 {

    public double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int partialSum = 0;
        for (int i = n / 20; i < 19 * n / 20; i++) {
            partialSum += arr[i];
        }
        return partialSum / (n * 0.9);
    }
}
