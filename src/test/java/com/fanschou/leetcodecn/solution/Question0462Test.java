package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0462Test {

    Question0462 question0462 = new Question0462();

    @Test
    void minMoves2() {

        assertEquals(2, question0462.minMoves2(new int[]{1,2,3}));
        assertEquals(16, question0462.minMoves2(new int[]{1,10,2,9}));
    }
}