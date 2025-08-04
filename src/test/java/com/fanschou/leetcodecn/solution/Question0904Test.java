package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0904Test {

    Question0904 question0904 = new Question0904();

    @Test
    void generate() {
        assertEquals(3, question0904.totalFruit(new int[]{1,2,1}));
        assertEquals(3, question0904.totalFruit(new int[]{0,1,2,2}));
        assertEquals(4, question0904.totalFruit(new int[]{1,2,3,2,2}));
        assertEquals(5, question0904.totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }
}