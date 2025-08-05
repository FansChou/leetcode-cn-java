package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/fruits-into-baskets-ii/">[3477] 水果成篮 II</a><br />
 * @author fanzhou
 */
public class Question3477 {

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced = 0;
        int n = fruits.length;
        boolean[] used = new boolean[n];
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n && !flag; j++) {
                if (!used[j] && baskets[j] >= fruits[i]) {
                    used[j] = true;
                    flag = true;
                }
            }
            if (!flag) {
                unplaced++;
            }
        }
        return unplaced;
    }

}