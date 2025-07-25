package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.ListNode;

/**
 * <a href="https://leetcode.cn/problems/convert-binary-number-in-a-linked-list-to-integer">[1290] 二进制链表转整数</a><br />
 *
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 *
 * @author fanzhou
 */
public class Question1290 {

    public int getDecimalValue(ListNode head) {
        int ans = 0;
        while(head != null){
            ans = ans << 1 | head.val;
            head = head.next;
        }
        return ans;
    }
}
