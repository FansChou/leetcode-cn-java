package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1108Test {

    Question1108 question1108 = new Question1108();

    @Test
    void defangIPaddr() {
        assertEquals("1[.]1[.]1[.]1", question1108.defangIPaddr("1.1.1.1"));
        assertEquals("255[.]100[.]50[.]0", question1108.defangIPaddr("255.100.50.0"));
    }
}