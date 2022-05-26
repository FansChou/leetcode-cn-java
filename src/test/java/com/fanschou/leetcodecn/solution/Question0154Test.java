package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0154Test {

    Question0154 question0154 = new Question0154();

    @Test
    void findMin() {
        assertEquals(1, question0154.findMin(new int[]{1,3,5}));
        assertEquals(0, question0154.findMin(new int[]{2,2,2,0,1}));
    }
}