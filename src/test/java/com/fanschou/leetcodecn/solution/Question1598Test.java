package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1598Test {

    Question1598 question1598 = new Question1598();

    @Test
    void minOperations() {
        assertEquals(2, question1598.minOperations(new String[]{"d1/","d2/","../","d21/","./"}));
        assertEquals(3, question1598.minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"}));
        assertEquals(0, question1598.minOperations(new String[]{"d1/","../","../","../"}));
    }
}