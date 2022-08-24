package com.fanschou.leetcodecn.solution;

/**
 * @title [1460] 通过翻转子数组使两个数组相等
 *
 * @description https://leetcode.cn/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 *
 * 给你两个长度相同的整数数组 target 和 arr 。每一步中，你可以选择 arr 的任意 非空子数组 并将它翻转。你可以执行此过程任意次。
 *
 * 如果你能让 arr 变得与 target 相同，返回 True；否则，返回 False 。
 *
 * @author fanzhou
 */
public class Question1460 {

    public boolean canBeEqual(int[] target, int[] arr) {
        int n = arr.length;
        int tot = 0;
        int[] cnt = new int[1010];
        for (int i = 0; i < n; i++) {
            if (++cnt[target[i]] == 1) {
                tot++;
            }
            if (--cnt[arr[i]] == 0) {
                tot--;
            }
        }
        return tot == 0;
    }
}
