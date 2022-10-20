package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0779Test {

    Question0779 question0779 = new Question0779();

    @Test
    void kthGrammar() {
        assertEquals(0, question0779.kthGrammar(1, 1));
        assertEquals(0, question0779.kthGrammar(2, 1));
        assertEquals(1, question0779.kthGrammar(2, 2));
    }
}