package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0066Test {

    Question0066 question0066 = new Question0066();

    @Test
    void plusOne() {
        assertArrayEquals(new int[]{1,2,4}, question0066.plusOne(new int[]{1,2,3}));
        assertArrayEquals(new int[]{4,3,2,2}, question0066.plusOne(new int[]{4,3,2,1}));
        assertArrayEquals(new int[]{1}, question0066.plusOne(new int[]{0}));
        assertArrayEquals(new int[]{1,0,0,0,0}, question0066.plusOne(new int[]{9,9,9,9}));
        assertArrayEquals(new int[]{6,0,0,0,0}, question0066.plusOne(new int[]{5,9,9,9,9}));
    }
}