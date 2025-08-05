package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question3477Test {

    Question3477 question3477 = new Question3477();

    @Test
    void countMaxOrSubsets() {
        assertEquals(1, question3477.numOfUnplacedFruits(new int[]{4,2,5}, new int[]{3,5,4}));
        assertEquals(0, question3477.numOfUnplacedFruits(new int[]{3,6,1}, new int[]{6,4,7}));
    }
}