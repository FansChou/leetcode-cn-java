package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0087Test {

    Question0087 question0087 = new Question0087();

    @Test
    void isScramble() {
        assertTrue(question0087.isScramble("great", "rgeat"));
        assertFalse(question0087.isScramble("abcde", "caebd"));
        assertTrue(question0087.isScramble("a", "a"));
    }
}