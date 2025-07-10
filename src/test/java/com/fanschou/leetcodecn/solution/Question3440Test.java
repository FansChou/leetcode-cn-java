package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question3440Test {

    Question3440 question3440 = new Question3440();

    @Test
    void maxAscendingSum() {
        assertEquals(2, question3440.maxFreeTime(5, new int[]{1,3}, new int[]{2,5}));
        assertEquals(7, question3440.maxFreeTime(10, new int[]{0,7,9}, new int[]{1,8,10}));
        assertEquals(6, question3440.maxFreeTime(10, new int[]{0,3,7,9}, new int[]{1,4,8,10}));
        assertEquals(0, question3440.maxFreeTime(5, new int[]{0,1,2,3,4}, new int[]{1,2,3,4,5}));
        assertEquals(16, question3440.maxFreeTime(37, new int[]{5,14,27,34}, new int[]{13,18,31,37}));
    }
}