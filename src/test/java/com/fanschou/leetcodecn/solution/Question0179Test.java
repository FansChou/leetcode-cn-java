package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0179Test {

    Question0179 question0179 = new Question0179();

    @Test
    void largestNumber() {
        assertEquals("210", question0179.largestNumber(new int[]{10,2}));
        assertEquals("9534330", question0179.largestNumber(new int[]{3,30,34,5,9}));
        assertEquals("1", question0179.largestNumber(new int[]{1}));
        assertEquals("10", question0179.largestNumber(new int[]{1,0}));
    }
}