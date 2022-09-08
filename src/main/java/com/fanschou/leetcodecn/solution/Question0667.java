package com.fanschou.leetcodecn.solution;

/**
 * [667] 优美的排列 II
 *
 * https://leetcode.cn/problems/beautiful-arrangement-ii/
 *
 * 给你两个整数 n 和 k ，请你构造一个答案列表 answer ，该列表应当包含从 1 到 n 的 n 个不同正整数，并同时满足下述条件：
 *
 * 假设该列表是 answer = [a1, a2, a3, ... , an] ，那么列表 [|a1 - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an|] 中应该有且仅有 k 个不同整数。
 * 返回列表 answer 。如果存在多种答案，只需返回其中 任意一种 。
 *
 * @author fanzhou
 */
public class Question0667 {

    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int t = n - k -1;
        for (int i = 0; i < t; i++) {
            ans[i] = i + 1;
        }
        for (int i = t, a = n - k, b = n; i < n; ) {
            ans[i++] = a++;
            if(i < n){
                ans[i++] = b--;
            }
        }
        return ans;
    }

}
