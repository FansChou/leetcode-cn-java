package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1051Test {

    Question1051 question1051 = new Question1051();

    @Test
    void heightChecker() {
        assertEquals(3, question1051.heightChecker(new int[]{1,1,4,2,1,3}));
        assertEquals(5, question1051.heightChecker(new int[]{5,1,2,3,4}));
        assertEquals(0, question1051.heightChecker(new int[]{1,2,3,4,5}));
    }
}