package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1464Test {

    Question1464 question1464 = new Question1464();

    @Test
    void maxProduct() {
        assertEquals(12, question1464.maxProduct(new int[]{3,4,5,2}));
        assertEquals(16, question1464.maxProduct(new int[]{1,5,4,5}));
        assertEquals(12, question1464.maxProduct(new int[]{3,7}));
    }
}