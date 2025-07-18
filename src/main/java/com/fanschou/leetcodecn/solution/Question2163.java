package com.fanschou.leetcodecn.solution;

import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.cn/problems/minimum-difference-in-sums-after-removal-of-elements/">[2163] 删除元素后和的最小差值</a><br />
 * @author fanzhou
 */
public class Question2163 {

    public long minimumDifference(int[] nums) {
        int m = nums.length;
        int n = m / 3;
        long sum = 0;
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        for (int i = m - 1; i >= m - n; i--) {
            minPQ.offer(nums[i]);
            sum += nums[i];
        }
        long[] sufMax = new long[m - n + 1];
        sufMax[m - n] = sum;
        for (int i = m - n - 1; i >= n; i--) {
            int v = nums[i];
            if(v > minPQ.peek()){
                sum += v - minPQ.poll();
                minPQ.offer(v);
            }
            sufMax[i] = sum;
        }

        long preMin = 0;
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n; i++) {
            maxPQ.offer(nums[i]);
            preMin += nums[i];
        }

        long ans = preMin - sufMax[n];
        for (int i = n; i < m - n; i++) {
            int v = nums[i];
            if(v < maxPQ.peek()){
                preMin += v - maxPQ.poll();
                maxPQ.offer(v);
            }
            ans = Math.min(ans, preMin - sufMax[i + 1]);
        }
        return ans;
    }
}
