package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1790Test {

    Question1790 question1790 = new Question1790();

    @Test
    void areAlmostEqual() {
        assertTrue(question1790.areAlmostEqual("bank", "kanb"));
        assertFalse(question1790.areAlmostEqual("attack", "defend"));
        assertTrue(question1790.areAlmostEqual("kelb", "kelb"));
        assertFalse(question1790.areAlmostEqual("abcd", "dcba"));
    }
}