package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0020Test {

    Question0020 question0020 = new Question0020();

    @Test
    void isValid() {
        assertTrue(question0020.isValid("()"));
        assertTrue(question0020.isValid("()[]{}"));
        assertFalse(question0020.isValid("(]"));
        assertFalse(question0020.isValid("([)]"));
        assertTrue(question0020.isValid("{[]}"));
    }
}