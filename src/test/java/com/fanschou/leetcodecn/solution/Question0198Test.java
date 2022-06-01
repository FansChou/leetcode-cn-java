package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0198Test {

    Question0198 question0198 = new Question0198();

    @Test
    void rob() {
        assertEquals(4, question0198.rob(new int[]{1,2,3,1}));
        assertEquals(12, question0198.rob(new int[]{2,7,9,3,1}));
    }
}