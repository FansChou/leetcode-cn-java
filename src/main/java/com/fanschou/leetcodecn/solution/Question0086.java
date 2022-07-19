package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.ListNode;

/**
 * @title [86] 分隔链表
 *
 * @description https://leetcode.cn/problems/partition-list/
 *
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 *
 * @author fanzhou
 */
public class Question0086 {

    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(-1);
        ListNode smallHead = small;
        ListNode big = new ListNode(-1);
        ListNode bigHead = big;

        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                big.next = head;
                big = big.next;
            }
            head = head.next;
        }

        big.next = null;
        small.next = bigHead.next;
        return smallHead.next;
    }
}
