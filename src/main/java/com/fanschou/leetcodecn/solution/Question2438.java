package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/range-product-queries-of-powers/">[2438] 二的幂数组中查询范围内的乘积</a><br />
 * @author fanzhou
 */
public class Question2438 {

    private static final int MOD = (int)1e9 + 7;
    private static final int MAX = 436;
    // 预处理 2^i
    private static final int[] POWERS = new int[MAX];

    static {
        POWERS[0] = 1;
        for (int i = 1; i < MAX; i++) {
            POWERS[i] = (POWERS[i - 1] * 2) % MOD;
        }
    }

    public int[] productQueries(int n, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (; n > 0; n &= n - 1) {
            int e = Integer.numberOfTrailingZeros(n);
            // 计算 n 拆解为 2^e 相乘的 前缀和
            list.add(list.getLast() + e);
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] q = queries[i];
            int sum = list.get(q[1] + 1) - list.get(q[0]);
            ans[i] = POWERS[sum];
        }
        return ans;
    }

}
