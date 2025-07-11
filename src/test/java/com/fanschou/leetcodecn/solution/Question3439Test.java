package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question3439Test {

    Question3439 question3439 = new Question3439();

    @Test
    void maxFreeTime() {
        assertEquals(2, question3439.maxFreeTime(5, 1, new int[]{1,3}, new int[]{2,5}));
        assertEquals(6, question3439.maxFreeTime(10, 1, new int[]{0,2,9}, new int[]{1,4,10}));
        assertEquals(0, question3439.maxFreeTime(5, 2, new int[]{0,1,2,3,4}, new int[]{1,2,3,4,5}));
    }
}