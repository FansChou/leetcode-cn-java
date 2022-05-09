package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0713Test {

    Question0713 question0713 = new Question0713();

    @Test
    void numSubarrayProductLessThanK() {
        assertEquals(8, question0713.numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
        assertEquals(0, question0713.numSubarrayProductLessThanK(new int[]{1,2,3}, 0));
    }
}