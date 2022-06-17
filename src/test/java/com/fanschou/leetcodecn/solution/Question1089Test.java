package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1089Test {

    Question1089 question1089 = new Question1089();

    @Test
    void duplicateZeros() {
        int[] original = new int[]{1,0,2,3,0,4,5,0};
        question1089.duplicateZeros(original);
        assertArrayEquals(new int[]{1,0,0,2,3,0,0,4}, original);

        original = new int[]{1,2,3};
        question1089.duplicateZeros(original);
        assertArrayEquals(new int[]{1,2,3}, original);
    }
}