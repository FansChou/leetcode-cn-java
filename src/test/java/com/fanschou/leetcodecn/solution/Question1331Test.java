package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1331Test {

    Question1331 question1331 = new Question1331();

    @Test
    void arrayRankTransform() {
        assertArrayEquals(new int[]{4,1,2,3}, question1331.arrayRankTransform(new int[]{40,10,20,30}));
        assertArrayEquals(new int[]{1,1,1}, question1331.arrayRankTransform(new int[]{100,100,100}));
        assertArrayEquals(new int[]{5,3,4,2,8,6,7,1,3}, question1331.arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12}));
    }
}