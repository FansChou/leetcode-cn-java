package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question2749Test {

    Question2749 question2749 = new Question2749();

    @Test
    void removeElement() {
        assertEquals(3, question2749.makeTheIntegerZero(3, -2));
        assertEquals(-1, question2749.makeTheIntegerZero(5, 7));
    }
}