package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0532Test {

    Question0532 question0532 = new Question0532();

    @Test
    void findPairs() {
        assertEquals(2, question0532.findPairs(new int[]{3, 1, 4, 1, 5}, 2));
        assertEquals(4, question0532.findPairs(new int[]{1, 2, 3, 4, 5}, 1));
        assertEquals(1, question0532.findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }
}