package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0026Test {

    Question0026 question0026 = new Question0026();

    @Test
    void removeDuplicates() {
        assertEquals(2, question0026.removeDuplicates(new int[]{1,1,2}));
        assertEquals(5, question0026.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}