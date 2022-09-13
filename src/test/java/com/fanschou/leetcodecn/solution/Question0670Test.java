package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0670Test {

    Question0670 question0670 = new Question0670();

    @Test
    void maximumSwap() {
        assertEquals(7236, question0670.maximumSwap(2736));
        assertEquals(9973, question0670.maximumSwap(9973));
    }
}