package com.fanschou.leetcodecn.solution;

public class Question3439 {

    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] f = new int[n + 1];
        f[0] = startTime[0];
        f[n] = eventTime - endTime[n - 1];
        for (int i = 1; i < n; i++) {
            f[i] = startTime[i] - endTime[i - 1];
        }

        int ans = 0;
        int vol = 0;
        for (int i = 0; i < n + 1; i++) {
            vol += f[i];
            if(i < k){
                continue;
            }
            ans = Math.max(ans, vol);
            vol -= f[i - k];
        }
        return ans;
    }
}
