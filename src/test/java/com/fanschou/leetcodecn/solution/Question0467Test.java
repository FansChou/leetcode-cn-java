package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0467Test {

    Question0467 question0467 = new Question0467();

    @Test
    void findSubstringInWraproundString() {
        assertEquals(1, question0467.findSubstringInWraproundString("a"));
        assertEquals(2, question0467.findSubstringInWraproundString("cac"));
        assertEquals(6, question0467.findSubstringInWraproundString("zab"));
        assertEquals(3, question0467.findSubstringInWraproundString("abaab"));
    }
}