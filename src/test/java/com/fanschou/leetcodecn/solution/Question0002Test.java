package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0002Test {

    private final Question0002 question0002 = new Question0002();

    @Test
    void addTwoNumbers() {
        ListNode node1 = ListNode.createNodeByArrays(new int[]{2,4,3});
        ListNode node2 = ListNode.createNodeByArrays(new int[]{5,6,4});
        ListNode nodeResult = ListNode.createNodeByArrays(new int[]{7,0,8});

        assertEquals(nodeResult, question0002.addTwoNumbers(node1, node2));

        node1 = ListNode.createNodeByArrays(new int[]{0});
        node2 = ListNode.createNodeByArrays(new int[]{0});
        nodeResult = ListNode.createNodeByArrays(new int[]{0});

        assertEquals(nodeResult, question0002.addTwoNumbers(node1, node2));

        node1 = ListNode.createNodeByArrays(new int[]{9,9,9,9,9,9,9});
        node2 = ListNode.createNodeByArrays(new int[]{9,9,9,9});
        nodeResult = ListNode.createNodeByArrays(new int[]{8,9,9,9,0,0,0,1});

        assertEquals(nodeResult, question0002.addTwoNumbers(node1, node2));
    }
}