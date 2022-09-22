package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1640Test {

    Question1640 question1640 = new Question1640();

    @Test
    void canFormArray() {
        assertTrue(question1640.canFormArray(new int[]{15,88}, new int[][]{new int[]{88},new int[]{15}}));
        assertFalse(question1640.canFormArray(new int[]{49,18,16}, new int[][]{new int[]{16,18,49}}));
        assertTrue(question1640.canFormArray(new int[]{91,4,64,78}, new int[][]{new int[]{78},new int[]{4,64},new int[]{91}}));
    }
}