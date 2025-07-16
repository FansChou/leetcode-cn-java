package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question3201Test {

    Question3201 question3201 = new Question3201();

    @Test
    void containsNearbyDuplicate() {
        assertEquals(4, question3201.maximumLength(new int[]{1,2,3,4}));
        assertEquals(6, question3201.maximumLength(new int[]{1,2,1,1,2,1,2}));
        assertEquals(2, question3201.maximumLength(new int[]{1,3}));
    }
}