package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0023Test {

    Question0023 question0023 = new Question0023();

    @Test
    void maxSum() {
        assertEquals(ListNode.createNodeByArrays(new int[]{1,1,2,3,4,4,5,6}), question0023.mergeKLists(ListNode.createNodeByArrays(new int[][]{new int[]{1,4,5},new int[]{1,3,4},new int[]{2,6}})));
    }
}