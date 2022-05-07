package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0003Test {

    private final Question0003 question0003 = new Question0003();

    @Test
    void lengthOfLongestSubstring() {

        assertEquals(3, question0003.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, question0003.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, question0003.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void lengthOfLongestSubstring1() {

        assertEquals(3, question0003.lengthOfLongestSubstring1("abcabcbb"));
        assertEquals(1, question0003.lengthOfLongestSubstring1("bbbbb"));
        assertEquals(3, question0003.lengthOfLongestSubstring1("pwwkew"));
    }
}