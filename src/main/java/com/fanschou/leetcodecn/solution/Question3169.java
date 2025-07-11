package com.fanschou.leetcodecn.solution;

import java.util.Arrays;
import java.util.Comparator;

public class Question3169 {

    public int countDays(int days, int[][] meetings) {
        // 按照左端点从小到大排序
        Arrays.sort(meetings, Comparator.comparingInt(p -> p[0]));
        int start = 1;
        int end = 0;
        for (int[] meeting : meetings) {
            if(meeting[0] > end) {
                days -= end - start + 1;
                start = meeting[0];
            }
            end = Math.max(end, meeting[1]);
        }
        days -= end - start + 1;
        return days;
    }
}
