package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0028Test {

    Question0028 question0028 = new Question0028();

    @Test
    void strStr() {
        assertEquals(2, question0028.strStr("hello", "ll"));
        assertEquals(-1, question0028.strStr("aaaaa", "bba"));
        assertEquals(0, question0028.strStr("", ""));
    }
}