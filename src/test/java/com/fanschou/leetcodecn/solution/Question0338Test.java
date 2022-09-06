package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0338Test {

    Question0338 question0338 = new Question0338();

    @Test
    void countBits() {
        assertArrayEquals(new int[]{0,1,1}, question0338.countBits(2));
        assertArrayEquals(new int[]{0,1,1,2,1,2}, question0338.countBits(5));
    }
}