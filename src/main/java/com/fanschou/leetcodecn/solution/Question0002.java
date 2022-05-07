package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.ListNode;

/**
 * @title [2] Add Two Numbers
 *
 * @description https://leetcode-cn.com/problems/add-two-numbers
 *
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序的方式存储的，并且每个节点只能存储一位数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * @author fanzhou
 */
public class Question0002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = sumNum(l1);
        int num2 = sumNum(l2);

        int total = num1 + num2;
        if(total == 0){
            return new ListNode(0);
        }

        int remain = total % 10;
        total = total / 10;
        ListNode result = new ListNode(remain);
        ListNode last = result;
        while(total / 10 != 0){
            remain = total % 10;
            total = total / 10;
            ListNode tmp = new ListNode(remain);
            last.next = tmp;
            last = tmp;
        }

        if(total != 0){
            last.next = new ListNode(total);
        }

        return result;
    }

    private static int sumNum(ListNode l1){
        if(l1 != null){
            ListNode next = l1.next;
            int num1 = l1.val;
            int suanzi = 10;
            while(next != null){
                num1 = next.val * suanzi + num1;
                next = next.next;
                suanzi *= 10;
            }
            return num1;
        }

        return 0;
    }
}
