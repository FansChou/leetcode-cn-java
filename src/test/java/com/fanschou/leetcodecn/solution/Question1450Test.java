package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1450Test {

    Question1450 question1450 = new Question1450();

    @Test
    void busyStudent() {
        assertEquals(1, question1450.busyStudent(new int[]{1,2,3}, new int[]{3,2,7}, 4));
        assertEquals(1, question1450.busyStudent(new int[]{4}, new int[]{4}, 4));
        assertEquals(5, question1450.busyStudent(new int[]{9,8,7,6,5,4,3,2,1}, new int[]{10,10,10,10,10,10,10,10,10}, 5));
    }
}