package com.fanschou.leetcodecn.base;

import lombok.EqualsAndHashCode;

/**
 * 链表节点
 * @author fanzhou
 */
@EqualsAndHashCode
public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode createNodeByArrays(int[] arrays){

        ListNode head = new ListNode(-1);
        ListNode cur = head;

        for (int array : arrays) {
            ListNode node = new ListNode(array);
            cur.next = node;
            cur = node;
        }

        return head.next;
    }
}
