package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1582Test {

    Question1582 question1582 = new Question1582();

    @Test
    void numSpecial() {
        assertEquals(1, question1582.numSpecial(new int[][]{new int[]{1,0,0},new int[]{0,0,1},new int[]{1,0,0}}));
        assertEquals(3, question1582.numSpecial(new int[][]{new int[]{1,0,0},new int[]{0,1,0},new int[]{0,0,1}}));
        assertEquals(2, question1582.numSpecial(new int[][]{new int[]{0,0,0,1},new int[]{1,0,0,0},new int[]{0,1,1,0},new int[]{0,0,0,0}}));
        assertEquals(3, question1582.numSpecial(new int[][]{new int[]{0,0,0,0,0},new int[]{1,0,0,0,0},new int[]{0,1,0,0,0},new int[]{0,0,1,0,0},new int[]{0,0,0,1,1}}));
    }
}