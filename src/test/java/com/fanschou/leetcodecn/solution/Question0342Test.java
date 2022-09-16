package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0342Test {

    Question0342 question0342 = new Question0342();

    @Test
    void isPowerOfFour() {
        assertTrue(question0342.isPowerOfFour(16));
        assertFalse(question0342.isPowerOfFour(5));
        assertTrue(question0342.isPowerOfFour(1));
    }
}