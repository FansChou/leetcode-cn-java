package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1037Test {

    Question1037 question1037 = new Question1037();

    @Test
    void isBoomerang() {
        assertTrue(question1037.isBoomerang(new int[][]{new int[]{1,1}, new int[]{2,3}, new int[]{3,2}}));
        assertFalse(question1037.isBoomerang(new int[][]{new int[]{1,1}, new int[]{2,2}, new int[]{3,3}}));
    }
}