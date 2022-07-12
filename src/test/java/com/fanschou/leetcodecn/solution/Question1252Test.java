package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1252Test {

    Question1252 question1252 = new Question1252();

    @Test
    void oddCells() {
        assertEquals(6, question1252.oddCells(2, 3, new int[][]{new int[]{0,1}, new int[]{1,1}}));
        assertEquals(0, question1252.oddCells(2, 2, new int[][]{new int[]{1,1}, new int[]{0,0}}));
    }
}