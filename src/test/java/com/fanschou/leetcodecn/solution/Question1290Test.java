package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question1290Test {

    Question1290 question1290 = new Question1290();

    @Test
    void matchPlayersAndTrainers() {
        ListNode head = ListNode.createNodeByArrays(new int[]{1,0,1});
        assertEquals(5, question1290.getDecimalValue(head));

        head = ListNode.createNodeByArrays(new int[]{0});
        assertEquals(0, question1290.getDecimalValue(head));

        head = ListNode.createNodeByArrays(new int[]{1});
        assertEquals(1, question1290.getDecimalValue(head));

        head = ListNode.createNodeByArrays(new int[]{1,0,0,1,0,0,1,1,1,0,0,0,0,0,0});
        assertEquals(18880, question1290.getDecimalValue(head));

        head = ListNode.createNodeByArrays(new int[]{0,0});
        assertEquals(0, question1290.getDecimalValue(head));
    }
}