package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1636Test {

    Question1636 question1636 = new Question1636();

    @Test
    void frequencySort() {
        assertArrayEquals(new int[]{3,1,1,2,2,2}, question1636.frequencySort(new int[]{1,1,2,2,2,3}));
        assertArrayEquals(new int[]{1,3,3,2,2}, question1636.frequencySort(new int[]{2,3,1,3,2}));
        assertArrayEquals(new int[]{5,-1,4,4,-6,-6,1,1,1}, question1636.frequencySort(new int[]{-1,1,-6,4,5,-6,1,4,1}));
    }
}