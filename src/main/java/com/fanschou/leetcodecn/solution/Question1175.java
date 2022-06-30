package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @title [1108] 质数排列
 *
 * @description https://leetcode.cn/problems/prime-arrangements/
 *
 * 请你帮忙给从 1 到 n 的数设计排列方案，使得所有的「质数」都应该被放在「质数索引」（索引从 1 开始）上；你需要返回可能的方案总数。
 *
 * 让我们一起来回顾一下「质数」：质数一定是大于 1 的，并且不能用两个小于它的正整数的乘积来表示。
 *
 * 由于答案可能会很大，所以请你返回答案 模 mod 10^9 + 7 之后的结果即可。
 *
 * @author fanzhou
 */
public class Question1175 {

    static final int MOD = (int)1e9+7;
    static int[] cnts = new int[110];
    static {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            boolean ok = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                list.add(i);
            }
            cnts[i] = list.size();
        }
    }
    public int numPrimeArrangements(int n) {
        int a = cnts[n];
        int b = n - a;
        long ans = 1;
        for (int i = b; i > 1; i--) {
            ans = ans * i % MOD ;
        }
        for (int i = a; i > 1; i--) {
            ans = ans * i % MOD ;
        }
        return (int)ans;
    }

}
