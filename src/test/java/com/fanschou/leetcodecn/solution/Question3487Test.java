package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question3487Test {

    Question3487 question3487 = new Question3487();

    @Test
    void maxSum() {
        assertEquals(15, question3487.maxSum(new int[]{1,2,3,4,5}));
        assertEquals(1, question3487.maxSum(new int[]{1,1,0,1,1}));
        assertEquals(3, question3487.maxSum(new int[]{1,2,-1,-2,1,0,-1}));
    }
}