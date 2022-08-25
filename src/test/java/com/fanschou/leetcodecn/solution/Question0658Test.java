package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0658Test {

    Question0658 question0658 = new Question0658();

    @Test
    void findClosestElements() {
        assertEquals(List.of(1,2,3,4), question0658.findClosestElements(new int[]{1,2,3,4,5}, 4, 3));
        assertEquals(List.of(1,2,3,4), question0658.findClosestElements(new int[]{1,2,3,4,5}, 4, -1));
    }
}