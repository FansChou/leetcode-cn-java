package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Question2683Test {

    Question2683 question2683 = new Question2683();

    @Test
    void countMaxOrSubsets() {
        assertTrue(question2683.doesValidArrayExist(new int[]{1,1,0}));
        assertTrue(question2683.doesValidArrayExist(new int[]{1,1}));
        assertFalse(question2683.doesValidArrayExist(new int[]{1,0}));
    }
}