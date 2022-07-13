package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0735Test {

    Question0735 question0735 = new Question0735();

    @Test
    void asteroidCollision() {
        assertArrayEquals(new int[]{5,10}, question0735.asteroidCollision(new int[]{5,10,-5}));
        assertArrayEquals(new int[]{}, question0735.asteroidCollision(new int[]{8,-8}));
        assertArrayEquals(new int[]{10}, question0735.asteroidCollision(new int[]{10,2,-5}));
    }
}