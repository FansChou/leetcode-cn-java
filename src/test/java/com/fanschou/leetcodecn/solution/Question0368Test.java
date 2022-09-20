package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0368Test {

    Question0368 question0368 = new Question0368();

    @Test
    void largestDivisibleSubset() {
        assertEquals(List.of(2,1), question0368.largestDivisibleSubset(new int[]{1,2,3}));
        assertEquals(List.of(8, 4, 2, 1), question0368.largestDivisibleSubset(new int[]{1,2,4,8}));
    }
}