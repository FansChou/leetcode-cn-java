package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1460Test {

    Question1460 question1460 = new Question1460();

    @Test
    void canBeEqual() {
        assertTrue(question1460.canBeEqual(new int[]{1,2,3,4}, new int[]{2,4,1,3}));
        assertTrue(question1460.canBeEqual(new int[]{7}, new int[]{7}));
        assertFalse(question1460.canBeEqual(new int[]{3,7,9}, new int[]{3,7,11}));
    }
}