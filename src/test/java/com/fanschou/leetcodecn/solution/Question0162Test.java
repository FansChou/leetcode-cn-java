package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0162Test {

    Question0162 question0162 = new Question0162();

    @Test
    void findPeakElement() {
        assertEquals(2, question0162.findPeakElement(new int[]{1,2,3,1}));
        assertEquals(5, question0162.findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
}