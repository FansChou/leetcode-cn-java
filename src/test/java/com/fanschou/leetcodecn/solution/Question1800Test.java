package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1800Test {

    Question1800 question1800 = new Question1800();

    @Test
    void maxAscendingSum() {
        assertEquals(65, question1800.maxAscendingSum(new int[]{10,20,30,5,10,50}));
        assertEquals(150, question1800.maxAscendingSum(new int[]{10,20,30,40,50}));
        assertEquals(33, question1800.maxAscendingSum(new int[]{12,17,15,13,10,11,12}));
        assertEquals(100, question1800.maxAscendingSum(new int[]{100,10,1}));
    }
}