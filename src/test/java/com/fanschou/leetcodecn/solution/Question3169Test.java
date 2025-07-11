package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question3169Test {

    Question3169 question3440 = new Question3169();

    @Test
    void countDays() {
        assertEquals(2, question3440.countDays(10, new int[][]{
                new int[]{5,7},
                new int[]{1,3},
                new int[]{9,10}
        }));
        assertEquals(1, question3440.countDays(5, new int[][]{
                new int[]{2,4},
                new int[]{1,3}
        }));
        assertEquals(0, question3440.countDays(6, new int[][]{
                new int[]{1,6}
        }));
    }
}