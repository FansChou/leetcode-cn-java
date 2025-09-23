package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0165Test {

    Question0165 question0165 = new Question0165();

    @Test
    void removeElement() {
        assertEquals(-1, question0165.compareVersion("1.2", "1.10"));
        assertEquals(0, question0165.compareVersion("1.01", "1.001"));
        assertEquals(0, question0165.compareVersion("1.0", "1.0.0.0"));
    }
}