package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1422Test {

    Question1422 question1422 = new Question1422();

    @Test
    void maxScore() {
        assertEquals(5, question1422.maxScore("011101"));
        assertEquals(5, question1422.maxScore("00111"));
        assertEquals(3, question1422.maxScore("1111"));
    }
}