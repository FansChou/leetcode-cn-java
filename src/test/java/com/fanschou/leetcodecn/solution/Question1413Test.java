package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1413Test {

    Question1413 question1413 = new Question1413();

    @Test
    void minStartValue() {
        assertEquals(5, question1413.minStartValue(new int[]{-3,2,-3,4,2}));
        assertEquals(1, question1413.minStartValue(new int[]{1,2}));
        assertEquals(5, question1413.minStartValue(new int[]{1,-2,-3}));
    }
}