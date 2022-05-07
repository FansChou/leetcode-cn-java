package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0005Test {

    Question0005 question0005 = new Question0005();

    @Test
    void longestPalindrome() {
        assertEquals("bab", question0005.longestPalindrome("babad"));
        assertEquals("bb", question0005.longestPalindrome("cbbd"));
    }
}