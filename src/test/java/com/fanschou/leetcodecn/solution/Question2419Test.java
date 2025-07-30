package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question2419Test {

    Question2419 question2419 = new Question2419();

    @Test
    void countMaxOrSubsets() {
        assertEquals(2, question2419.longestSubarray(new int[]{1,2,3,3,2,2}));
        assertEquals(1, question2419.longestSubarray(new int[]{1,2,3,4}));
    }
}