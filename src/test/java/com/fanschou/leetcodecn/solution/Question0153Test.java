package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0153Test {

    Question0153 question0153 = new Question0153();

    @Test
    void findMin() {
        assertEquals(1, question0153.findMin(new int[]{3,4,5,1,2}));
        assertEquals(0, question0153.findMin(new int[]{4,5,6,7,0,1,2}));
        assertEquals(11, question0153.findMin(new int[]{11,13,15,17}));
    }
}