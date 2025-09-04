package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question3516Test {

    Question3516 question3516 = new Question3516();

    @Test
    void removeElement() {
        assertEquals(1, question3516.findClosest(2, 7, 4));
        assertEquals(2, question3516.findClosest(2, 5, 6));
        assertEquals(0, question3516.findClosest(1, 5, 3));
    }
}