package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0007Test {

    Question0007 question0007 = new Question0007();

    @Test
    void reverse() {
        assertEquals(321, question0007.reverse(123));
        assertEquals(-321, question0007.reverse(-123));
        assertEquals(21, question0007.reverse(120));
        assertEquals(0, question0007.reverse(0));
    }
}