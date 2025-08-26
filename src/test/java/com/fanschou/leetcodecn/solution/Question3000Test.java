package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question3000Test {

    Question3000 question3000 = new Question3000();

    @Test
    void removeElement() {
        assertEquals(48, question3000.areaOfMaxDiagonal(new int[][]{new int[]{9,3}, new int[]{8,6}}));
        assertEquals(12, question3000.areaOfMaxDiagonal(new int[][]{new int[]{3,4}, new int[]{4,3}}));
    }
}