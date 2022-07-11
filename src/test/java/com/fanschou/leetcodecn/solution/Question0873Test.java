package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0873Test {

    Question0873 question0873 = new Question0873();

    @Test
    void lenLongestFibSubseq() {
        assertEquals(5, question0873.lenLongestFibSubseq(new int[]{1,2,3,4,5,6,7,8}));
        assertEquals(3, question0873.lenLongestFibSubseq(new int[]{1,3,7,11,12,14,18}));
    }
}