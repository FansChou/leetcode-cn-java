package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0274Test {

    Question0274 question0274 = new Question0274();

    @Test
    void hIndex() {
        assertEquals(3, question0274.hIndex(new int[]{3,0,6,1,5}));
    }
}