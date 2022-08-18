package com.fanschou.leetcodecn.solution;

/**
 * @title [274] H 指数
 *
 * @description https://leetcode-cn.com/problems/h-index/
 *
 * 给定一位研究者论文被引用次数的数组（被引用次数是非负整数）。编写一个方法，计算出研究者的 h  指数。
 *
 * h 指数的定义：h 代表“高引用次数”（high citations），一名科研人员的 h 指数是指他（她）的（N 篇论文中）总共有 h
 * 篇论文分别被引用了至少 h 次。且其余的 N - h 篇论文每篇被引用次数不超过 h 次。
 *
 * 例如：某人的 h 指数是 20，这表示他已发表的论文中，每篇被引用了至少 20 次的论文总共有 20 篇。
 *
 * @author fanzhou
 */
public class Question0274 {

    public int hIndex(int[] cs) {
        int n = cs.length;
        int l = 0;
        int r = n;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (check(cs, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }
    boolean check(int[] cs, int mid) {
        int ans = 0;
        for (int i : cs) {
            if (i >= mid) {
                ans++;
            }
        }
        return ans >= mid;
    }

}
