package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0565Test {

    Question0565 question0565 = new Question0565();

    @Test
    void arrayNesting() {
        assertEquals(4, question0565.arrayNesting(new int[]{5,4,0,3,1,6,2}));
    }
}