package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0258Test {

    Question0258 question0258 = new Question0258();

    @Test
    void addDigits() {
        assertEquals(2, question0258.addDigits(38));
        assertEquals(0, question0258.addDigits(0));
    }
}