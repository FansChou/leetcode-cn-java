package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1217Test {

    Question1217 question1217 = new Question1217();

    @Test
    void minCostToMoveChips() {
        assertEquals(1, question1217.minCostToMoveChips(new int[]{1,2,3}));
        assertEquals(2, question1217.minCostToMoveChips(new int[]{2,2,2,3,3}));
        assertEquals(1, question1217.minCostToMoveChips(new int[]{1,1000000000}));
    }
}