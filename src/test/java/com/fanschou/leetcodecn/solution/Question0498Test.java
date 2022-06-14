package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0498Test {

    Question0498 question0498 = new Question0498();

    @Test
    void findDiagonalOrder() {
        assertArrayEquals(new int[]{1,2,4,7,5,3,6,8,9},
                question0498.findDiagonalOrder(new int[][]{new int[]{1,2,3}, new int[]{4,5,6}, new int[]{7,8,9}}));
        assertArrayEquals(new int[]{1,2,3,4},
                question0498.findDiagonalOrder(new int[][]{new int[]{1,2}, new int[]{3,4}}));
        assertArrayEquals(new int[]{6,9,7},
                question0498.findDiagonalOrder(new int[][]{new int[]{6,9,7}}));
    }
}