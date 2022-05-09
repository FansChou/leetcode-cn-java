package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0942Test {

    Question0942 question0942 = new Question0942();

    @Test
    void diStringMatch() {
        assertArrayEquals(new int[]{0,4,1,3,2}, question0942.diStringMatch("IDID"));
        assertArrayEquals(new int[]{0,1,2,3}, question0942.diStringMatch("III"));
        assertArrayEquals(new int[]{3,2,0,1}, question0942.diStringMatch("DDI"));
    }
}