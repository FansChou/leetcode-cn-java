package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question1403Test {

    Question1403 question1403 = new Question1403();

    @Test
    void minSubsequence() {
        assertEquals(List.of(10,9), question1403.minSubsequence(new int[]{4,3,10,9,8}));
        assertEquals(List.of(7,7,6), question1403.minSubsequence(new int[]{4,4,7,6,7}));
        assertEquals(List.of(6), question1403.minSubsequence(new int[]{6}));
    }
}