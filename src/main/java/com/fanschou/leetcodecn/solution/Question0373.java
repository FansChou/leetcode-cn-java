package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/">[373] 查找和最小的K对数字</a><br />
 *
 * 给定两个以升序排列的整数数组 nums1 和 nums2 , 以及一个整数 k 。
 *
 * 定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2 。
 *
 * 请找到和最小的 k 个数对 (u1,v1),  (u2,v2)  ...  (uk,vk) 。
 *
 * @author fanzhou
 */
public class Question0373 {

    boolean flag = true;
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int m = nums2.length;

        if(n > m && !(flag = false)){
            return kSmallestPairs(nums2, nums1, k);
        }
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(a -> (nums1[a[0]] + nums2[a[1]])));

        for (int i = 0; i < Math.min(n, k); i++) {
            q.add(new int[]{i, 0});
        }

        while(ans.size() < k && !q.isEmpty()){
            int[] poll = q.poll();
            int a = poll[0];
            int b = poll[1];

            List<Integer> pair = new ArrayList<>();
            pair.add(flag ? nums1[a] : nums2[b]);
            pair.add(flag ? nums2[b] : nums1[a]);
            ans.add(pair);
            if(b + 1 < m){
                q.add(new int[]{a, b + 1});
            }
        }
        return ans;
    }
}
