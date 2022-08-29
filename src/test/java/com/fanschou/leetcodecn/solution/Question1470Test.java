package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1470Test {

    Question1470 question1470 = new Question1470();

    @Test
    void shuffle() {
        assertArrayEquals(new int[]{2,3,5,4,1,7}, question1470.shuffle(new int[]{2,5,1,3,4,7}, 3));
        assertArrayEquals(new int[]{1,4,2,3,3,2,4,1}, question1470.shuffle(new int[]{1,2,3,4,4,3,2,1}, 4));
        assertArrayEquals(new int[]{1,2,1,2}, question1470.shuffle(new int[]{1,1,2,2}, 2));
    }
}