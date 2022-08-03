package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0899Test {

    Question0899 question0899 = new Question0899();

    @Test
    void orderlyQueue() {
        assertEquals("acb", question0899.orderlyQueue("cba", 1));
        assertEquals("aaabc", question0899.orderlyQueue("baaca", 3));
    }
}