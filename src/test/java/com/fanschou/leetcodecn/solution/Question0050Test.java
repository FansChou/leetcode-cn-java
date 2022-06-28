package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0050Test {

    Question0050 question0050 = new Question0050();

    @Test
    void myPow() {
        assertEquals(1024.0, question0050.myPow(2.0, 10));
        assertEquals(0.25, question0050.myPow(2.0, -2));
    }
}