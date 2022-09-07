package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1592Test {

    Question1592 question1592 = new Question1592();

    @Test
    void reorderSpaces() {
        assertEquals("this   is   a   sentence", question1592.reorderSpaces("  this   is  a sentence "));
        assertEquals("practice   makes   perfect ", question1592.reorderSpaces(" practice   makes   perfect"));
        assertEquals("hello   world", question1592.reorderSpaces("hello   world"));
        assertEquals("walks  udp  package  into  bar  a ", question1592.reorderSpaces("  walks  udp package   into  bar a"));
        assertEquals("a", question1592.reorderSpaces("a"));
        assertEquals("hello  ", question1592.reorderSpaces("  hello"));
    }
}