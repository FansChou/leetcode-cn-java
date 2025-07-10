package com.fanschou.leetcodecn.solution;

public class Question3440 {

    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int a = 0, b = -1, c = -1;
        int n = startTime.length;
        // 计算前三大空位的位置
        for (int i = 1; i <= n; i++) {
            int sz = get(i, startTime, endTime, eventTime);
            if(sz > get(a, startTime, endTime, eventTime)){
                c = b;
                b = a;
                a = i;
            } else if (b < 0 || sz > get(b, startTime, endTime, eventTime)){
                c = b;
                b = i;
            } else if(c < 0 || sz > get(c, startTime, endTime, eventTime)){
                c = i;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sz = endTime[i] - startTime[i];
            if(i != a && i + 1 != a && sz <= get(a, startTime, endTime, eventTime)
                || i!= b && i + 1 != b && sz <= get(b, startTime, endTime, eventTime)
                || sz <= get(c ,startTime, endTime, eventTime)){
                ans = Math.max(ans, get(i,startTime, endTime, eventTime) + sz + get(i + 1,startTime, endTime, eventTime));
            } else {
                ans = Math.max(ans, get(i,startTime, endTime, eventTime) + get(i + 1,startTime, endTime, eventTime));
            }
        }
        return ans;
    }

    private int get(int i, int[] startTime, int[] endTime, int eventTime) {
        if(i == 0){
            return startTime[0];
        }
        int n = startTime.length;
        if (i == n) {
            return eventTime - endTime[n - 1];
        }
        return startTime[i] - endTime[i - 1];
    }
}
