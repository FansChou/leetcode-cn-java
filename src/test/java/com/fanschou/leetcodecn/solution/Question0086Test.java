package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0086Test {

    Question0086 question0086 = new Question0086();

    @Test
    void partition() {
        assertEquals(ListNode.createNodeByArrays(new int[]{1,2,2,4,3,5}), question0086.partition(ListNode.createNodeByArrays(new int[]{1,4,3,2,5,2}), 3));
        assertEquals(ListNode.createNodeByArrays(new int[]{1,2}), question0086.partition(ListNode.createNodeByArrays(new int[]{2,1}), 2));
    }
}