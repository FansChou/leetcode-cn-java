package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0121Test {

    Question0121 question0121 = new Question0121();

    @Test
    void maxProfit() {
        assertEquals(5, question0121.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(0, question0121.maxProfit(new int[]{7,6,4,3,1}));
    }
}