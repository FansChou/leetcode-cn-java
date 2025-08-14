package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Question1780Test {

    Question1780 question1780 = new Question1780();

    @Test
    void removeElement() {
        assertTrue(question1780.checkPowersOfThree(12));
        assertTrue(question1780.checkPowersOfThree(91));
        assertFalse(question1780.checkPowersOfThree(21));

    }
}