package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0672Test {

    Question0672 question0672 = new Question0672();

    @Test
    void flipLights() {
        assertEquals(2, question0672.flipLights(1,1));
        assertEquals(3, question0672.flipLights(2,1));
        assertEquals(4, question0672.flipLights(3,1));
    }
}