package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0012Test {

    Question0012 question0012 = new Question0012();

    @Test
    void intToRoman() {
        assertEquals("III", question0012.intToRoman(3));
        assertEquals("IV", question0012.intToRoman(4));
        assertEquals("IX", question0012.intToRoman(9));
        assertEquals("LVIII", question0012.intToRoman(58));
        assertEquals("MCMXCIV", question0012.intToRoman(1994));
    }
}