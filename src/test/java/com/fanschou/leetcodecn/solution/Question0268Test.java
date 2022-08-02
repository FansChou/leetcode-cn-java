package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0268Test {

    Question0268 question0268 = new Question0268();

    @Test
    void missingNumber() {
        assertEquals(2, question0268.missingNumber(new int[]{3,0,1}));
        assertEquals(2, question0268.missingNumber(new int[]{0,1}));
        assertEquals(8, question0268.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        assertEquals(1, question0268.missingNumber(new int[]{0}));
    }
}