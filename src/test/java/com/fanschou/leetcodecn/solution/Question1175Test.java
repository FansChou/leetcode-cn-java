package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1175Test {
    Question1175 question1175 = new Question1175();

    @Test
    void numPrimeArrangements() {
        assertEquals(12, question1175.numPrimeArrangements(5));
        assertEquals(682289015, question1175.numPrimeArrangements(100));
    }
}