package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0070Test {

    Question0070 question0070 = new Question0070();

    @Test
    void climbStairs() {
        assertEquals(2, question0070.climbStairs(2));
        assertEquals(3, question0070.climbStairs(3));
    }
}