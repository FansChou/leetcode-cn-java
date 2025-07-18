package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question2163Test {

    Question2163 question2163 = new Question2163();

    @Test
    void findPairs() {
        assertEquals(-1, question2163.minimumDifference(new int[]{3,1,2}));
        assertEquals(1, question2163.minimumDifference(new int[]{7,9,5,8,1,3}));
    }
}