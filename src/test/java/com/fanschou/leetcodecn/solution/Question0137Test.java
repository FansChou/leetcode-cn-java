package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0137Test {

    Question0137 question0137 = new Question0137();

    @Test
    void singleNumber() {
        assertEquals(3, question0137.singleNumber(new int[]{2,2,3,2}));
        assertEquals(99, question0137.singleNumber(new int[]{0,1,0,1,0,1,99}));
    }
}