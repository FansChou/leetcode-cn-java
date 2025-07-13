package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question2410Test {

    Question2410 question2410 = new Question2410();

    @Test
    void matchPlayersAndTrainers() {
        assertEquals(2, question2410.matchPlayersAndTrainers(new int[]{4,7,9}, new int[]{8,2,5,8}));
        assertEquals(1, question2410.matchPlayersAndTrainers(new int[]{1,1,1}, new int[]{10}));
    }
}