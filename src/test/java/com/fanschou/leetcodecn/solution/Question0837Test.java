package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0837Test {

    Question0837 question0837 = new Question0837();

    @Test
    void removeElement() {
        assertEquals(1.00000, question0837.new21Game(10,1,10));
        assertEquals(0.60000, question0837.new21Game(6,1,10));
        assertEquals(0.7327777870686074, question0837.new21Game(21,17,10));
    }
}