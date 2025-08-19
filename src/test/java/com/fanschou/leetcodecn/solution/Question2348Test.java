package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question2348Test {

    Question2348 question2348 = new Question2348();

    @Test
    void removeElement() {
        assertEquals(6, question2348.zeroFilledSubarray(new int[]{1,3,0,0,2,0,0,4}));
        assertEquals(9, question2348.zeroFilledSubarray(new int[]{0,0,0,2,0,0}));
        assertEquals(0, question2348.zeroFilledSubarray(new int[]{2,10,2019}));
    }
}