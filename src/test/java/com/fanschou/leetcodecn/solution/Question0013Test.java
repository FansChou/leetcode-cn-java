package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0013Test {

    Question0013 question0013 = new Question0013();

    @Test
    void romanToInt() {

        assertEquals(3, question0013.romanToInt("III"));
        assertEquals(4, question0013.romanToInt("IV"));
        assertEquals(9, question0013.romanToInt("IX"));
        assertEquals(58, question0013.romanToInt("LVIII"));
        assertEquals(1994, question0013.romanToInt("MCMXCIV"));
    }
}