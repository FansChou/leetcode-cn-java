package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question3005Test {

    Question3005 question3005 = new Question3005();

    @Test
    void removeElement() {
        assertEquals(4, question3005.maxFrequencyElements(new int[]{1,2,2,3,1,4}));
        assertEquals(5, question3005.maxFrequencyElements(new int[]{1,2,3,4,5}));
    }
}