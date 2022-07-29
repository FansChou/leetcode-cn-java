package com.fanschou.leetcodecn.solution;

/**
 * @title [593] 有效的正方形
 *
 * @description https://leetcode.cn/problems/valid-square/
 *
 * 给定2D空间中四个点的坐标 p1, p2, p3 和 p4，如果这四个点构成一个正方形，则返回 true 。
 *
 * 点的坐标 pi 表示为 [xi, yi] 。输入 不是 按任何顺序给出的。
 *
 * 一个 有效的正方形 有四条等边和四个等角(90度角)。
 *
 * @author fanzhou
 */
public class Question0593 {
    long len = -1;

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        return calc(p1, p2, p3) && calc(p1, p2, p4) && calc(p1, p3, p4) && calc(p2, p3, p4);
    }

    /**
     * 计算三个点是否构成等腰直角三角形
     * @param a
     * @param b
     * @param c
     * @return
     */
    boolean calc(int[] a, int[] b, int[] c) {
        long l1 = (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
        long l2 = (a[0] - c[0]) * (a[0] - c[0]) + (a[1] - c[1]) * (a[1] - c[1]);
        long l3 = (b[0] - c[0]) * (b[0] - c[0]) + (b[1] - c[1]) * (b[1] - c[1]);
        // 两边相等+勾股定理
        boolean ok = (l1 == l2 && l1 + l2 == l3) || (l1 == l3 && l1 + l3 == l2) || (l2 == l3 && l2 + l3 == l1);
        if (!ok) {
            return false;
        }
        if (len == -1) {
            len = Math.min(l1, l2);
        } else if (len == 0 || len != Math.min(l1, l2)) {
            // 边长度为0或者长度不一致
            return false;
        }
        return true;
    }
}
