package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0283Test {

    Question0283 question0278 = new Question0283();

    @Test
    void moveZeroes() {
        int[] array = new int[]{0,1,0,3,12};
        question0278.moveZeroes(array);
        assertArrayEquals(new int[]{1,3,12,0,0}, array);
    }
}