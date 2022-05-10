package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0091Test {

    Question0091 question0091 = new Question0091();

    @Test
    void numDecodings() {
        assertEquals(2, question0091.numDecodings("12"));
        assertEquals(3, question0091.numDecodings("226"));
        assertEquals(0, question0091.numDecodings("06"));
        assertEquals(0, question0091.numDecodings("0"));
    }
}