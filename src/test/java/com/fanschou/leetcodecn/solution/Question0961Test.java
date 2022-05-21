package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0961Test {

    Question0961 question0961 = new Question0961();

    @Test
    void repeatedNTimes() {
        assertEquals(3, question0961.repeatedNTimes(new int[]{1,2,3,3}));
        assertEquals(2, question0961.repeatedNTimes(new int[]{2,1,2,5,3,2}));
        assertEquals(5, question0961.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }
}