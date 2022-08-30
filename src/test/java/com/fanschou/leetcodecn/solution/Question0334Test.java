package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0334Test {

    Question0334 question0334 = new Question0334();

    @Test
    void increasingTriplet() {
        assertTrue(question0334.increasingTriplet(new int[]{1,2,3,4,5}));
        assertFalse(question0334.increasingTriplet(new int[]{5,4,3,2,1}));
        assertTrue(question0334.increasingTriplet(new int[]{2,1,5,0,4,6}));
    }
}