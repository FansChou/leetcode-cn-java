package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Question3136Test {

    Question3136 question3136 = new Question3136();

    @Test
    void maxFreeTime() {
        assertTrue(question3136.isValid("234Adas"));
        assertFalse(question3136.isValid("b3"));
        assertFalse(question3136.isValid("a3$e"));
    }
}