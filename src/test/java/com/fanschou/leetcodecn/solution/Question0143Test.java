package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0143Test {

    Question0143 question0143 = new Question0143();

    @Test
    void reorderList() {
        ListNode head = ListNode.createNodeByArrays(new int[]{1,2,3,4});
        question0143.reorderList(head);

        ListNode result = ListNode.createNodeByArrays(new int[]{1,4,2,3});
        assertEquals(head, result);

        head = ListNode.createNodeByArrays(new int[]{1,2,3,4,5});
        question0143.reorderList(head);

        result = ListNode.createNodeByArrays(new int[]{1,5,2,4,3});
        assertEquals(head, result);
    }
}