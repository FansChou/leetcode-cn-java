package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question1695Test {

    Question1695 question1695 = new Question1695();

    @Test
    void maximumUniqueSubarray() {
        assertEquals(17, question1695.maximumUniqueSubarray(new int[]{4,2,4,5,6}));
        assertEquals(8, question1695.maximumUniqueSubarray(new int[]{5,2,1,2,5,2,1,2,5}));
    }
}