package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @title [442] 数组中重复的数据
 *
 * @description https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/
 *
 * 给你一个长度为 n 的整数数组 nums ，其中 nums 的所有整数都在范围 [1, n] 内，且每个整数出现 一次 或 两次 。请你找出所有出现 两次 的整数，并以数组形式返回。
 *
 * 你必须设计并实现一个时间复杂度为 O(n) 且仅使用常量额外空间的算法解决此问题。
 *
 * @author fanzhou
 */
public class Question0382 {

    ListNode head;
    Random random = new Random(20220512);

    public Question0382(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        int ans = 0;
        int idx = 0;
        ListNode t = head;
        while (t != null && ++idx >= 0) {
            if (random.nextInt(idx) == 0) {
                ans = t.val;
            }
            t = t.next;
        }
        return ans;
    }
}
