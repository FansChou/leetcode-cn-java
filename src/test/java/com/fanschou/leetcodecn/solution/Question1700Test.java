package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1700Test {

    Question1700 question1700 = new Question1700();

    @Test
    void countStudents() {
        assertEquals(0, question1700.countStudents(new int[]{1,1,0,0}, new int[]{0,1,0,1}));
        assertEquals(3, question1700.countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1}));
    }
}