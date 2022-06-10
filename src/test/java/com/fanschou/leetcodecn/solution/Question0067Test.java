package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0067Test {

    Question0067 question0067 = new Question0067();

    @Test
    void addBinary() {
        assertEquals("100", question0067.addBinary("11", "1"));
        assertEquals("10101", question0067.addBinary("1010", "1011"));
    }
}