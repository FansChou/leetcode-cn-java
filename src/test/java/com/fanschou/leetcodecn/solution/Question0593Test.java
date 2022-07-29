package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Question0593Test {

    @Test
    void validSquare() {
        assertTrue(new Question0593().validSquare(new int[]{0,0}, new int[]{1,1}, new int[]{1,0}, new int[]{0,1}));
        assertFalse(new Question0593().validSquare(new int[]{0,0}, new int[]{1,1}, new int[]{1,0}, new int[]{0,12}));
        assertTrue(new Question0593().validSquare(new int[]{1,0}, new int[]{-1,0}, new int[]{0,1}, new int[]{0,-1}));
    }
}