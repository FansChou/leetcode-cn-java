package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Question0326Test {

    Question0326 question0326 = new Question0326();

    @Test
    void removeElement() {
        assertTrue(question0326.isPowerOfThree(27));
        assertFalse(question0326.isPowerOfThree(0));
        assertTrue(question0326.isPowerOfThree(9));
        assertFalse(question0326.isPowerOfThree(45));

    }
}