package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1475Test {

    Question1475 question1475 = new Question1475();

    @Test
    void finalPrices() {
        assertArrayEquals(new int[]{4,2,4,2,3}, question1475.finalPrices(new int[]{8,4,6,2,3}));
        assertArrayEquals(new int[]{1,2,3,4,5}, question1475.finalPrices(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{9,0,1,6}, question1475.finalPrices(new int[]{10,1,1,6}));
    }
}