package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Question0231Test {

    Question0231 question0231 = new Question0231();

    @Test
    void removeElement() {
        assertTrue(question0231.isPowerOfTwo(1));
        assertTrue(question0231.isPowerOfTwo(16));
        assertFalse(question0231.isPowerOfTwo(3));

    }
}