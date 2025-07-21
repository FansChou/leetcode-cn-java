package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question1957Test {

    Question1957 question1957 = new Question1957();

    @Test
    void makeFancyString() {
        assertEquals("leetcode", question1957.makeFancyString("leeetcode"));
        assertEquals("aabaa", question1957.makeFancyString("aaabaaaa"));
        assertEquals("aab", question1957.makeFancyString("aab"));
    }
}