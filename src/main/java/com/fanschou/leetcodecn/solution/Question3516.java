package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/find-closest-person/">[3516] 找到最近的人</a><br />
 * @author fanzhou
 */
public class Question3516 {

    public int findClosest(int x, int y, int z) {
        int a = Math.abs(x - z);
        int b = Math.abs(y - z);
        return a == b ? 0 : a < b ? 1 : 2;
    }

}
