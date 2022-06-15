package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0926Test {

    Question0926 question0926 = new Question0926();

    @Test
    void minFlipsMonoIncr() {
        assertEquals(1, question0926.minFlipsMonoIncr("00110"));
        assertEquals(2, question0926.minFlipsMonoIncr("010110"));
        assertEquals(2, question0926.minFlipsMonoIncr("00011000"));
    }
}