package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0009Test {

    Question0009 question0009 = new Question0009();

    @Test
    void isPalindrome() {

        assertTrue(question0009.isPalindrome(121));
        assertFalse(question0009.isPalindrome(-121));
        assertFalse(question0009.isPalindrome(10));
    }
}