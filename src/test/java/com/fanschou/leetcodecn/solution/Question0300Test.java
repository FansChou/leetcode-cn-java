package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0300Test {

    Question0300 question0300 = new Question0300();

    @Test
    void lengthOfLIS() {
        assertEquals(4, question0300.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
        assertEquals(4, question0300.lengthOfLIS(new int[]{0,1,0,3,2,3}));
        assertEquals(1, question0300.lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
    }
}