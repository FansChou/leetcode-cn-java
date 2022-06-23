package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0290Test {

    Question0290 question0290 = new Question0290();

    @Test
    void wordPattern() {
        assertTrue(question0290.wordPattern("abba", "dog cat cat dog"));
        assertFalse(question0290.wordPattern("abba", "dog cat cat fish"));
        assertFalse(question0290.wordPattern("abba", "dog dog dog dog"));
        assertFalse(question0290.wordPattern("aaaa", "dog cat cat dog"));
    }
}