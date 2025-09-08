package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.ListNode;

import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.cn/problems/merge-k-sorted-lists/">[23] 合并 K 个升序链表</a><br />
 * @author fanzhou
 */
public class Question0023 {

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode head : lists) {
            if(head != null) {
                pq.offer(head);
            }
        }
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (!pq.isEmpty()) {
            ListNode top = pq.poll();
            if(top.next != null){
                pq.offer(top.next);
            }
            cur.next = top;
            cur = cur.next;
        }
        return head.next;
    }

}
