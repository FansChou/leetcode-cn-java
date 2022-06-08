package com.fanschou.leetcodecn.solution;

/**
 * @title [1037] 有效的回旋镖
 *
 * @description https://leetcode.cn/problems/valid-boomerang/
 *
 * 给定一个数组 points ，其中 points[i] = [xi, yi] 表示 X-Y 平面上的一个点，如果这些点构成一个 回旋镖 则返回 true 。
 *
 * 回旋镖 定义为一组三个点，这些点 各不相同 且 不在一条直线上 。
 *
 * @author fanzhou
 */
public class Question1037 {

    public boolean isBoomerang(int[][] ps) {
        return (ps[1][0] - ps[0][0]) * (ps[2][1] - ps[0][1]) != (ps[2][0] - ps[0][0]) * (ps[1][1] - ps[0][1]);
    }

}
