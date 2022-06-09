package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0875Test {

    Question0875 question0875 = new Question0875();

    @Test
    void minEatingSpeed() {
        assertEquals(4, question0875.minEatingSpeed(new int[]{3,6,7,11}, 8));
        assertEquals(30, question0875.minEatingSpeed(new int[]{30,11,23,4,20}, 5));
        assertEquals(23, question0875.minEatingSpeed(new int[]{30,11,23,4,20}, 6));
    }
}