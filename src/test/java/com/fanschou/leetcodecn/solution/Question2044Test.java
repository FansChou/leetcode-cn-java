package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question2044Test {

    @Test
    void countMaxOrSubsets() {
        assertEquals(2, new Question2044().countMaxOrSubsets(new int[]{3,1}));
        assertEquals(7, new Question2044().countMaxOrSubsets(new int[]{2,2,2}));
        assertEquals(6, new Question2044().countMaxOrSubsets(new int[]{3,2,1,5}));
    }
}