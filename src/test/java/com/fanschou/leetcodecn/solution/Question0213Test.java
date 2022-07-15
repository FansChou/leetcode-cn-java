package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0213Test {

    Question0213 question0213 = new Question0213();

    @Test
    void rob() {
        assertEquals(3, question0213.rob(new int[]{2,3,2}));
        assertEquals(4, question0213.rob(new int[]{1,2,3,1}));
        assertEquals(0, question0213.rob(new int[]{0}));
    }
}