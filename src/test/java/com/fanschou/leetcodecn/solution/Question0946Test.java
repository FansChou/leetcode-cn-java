package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0946Test {

    Question0946 question0946 = new Question0946();

    @Test
    void validateStackSequences() {
        assertTrue(question0946.validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1}));
        assertFalse(question0946.validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,3,5,1,2}));
    }
}