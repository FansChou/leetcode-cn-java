package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2438Test {

    Question2438 question2438 = new Question2438();

    @Test
    void removeElement() {
        assertArrayEquals(new int[]{2,4,64}, question2438.productQueries(15, new int[][]{new int[]{0,1}, new int[]{2,2}, new int[]{0,3}}));
        assertArrayEquals(new int[]{2}, question2438.productQueries(2, new int[][]{new int[]{0,0}}));

    }
}