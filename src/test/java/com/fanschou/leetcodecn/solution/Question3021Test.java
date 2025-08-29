package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question3021Test {

    Question3021 question3021 = new Question3021();

    @Test
    void removeElement() {
        assertEquals(3, question3021.flowerGame(3, 2));
        assertEquals(0, question3021.flowerGame(1, 1));
    }
}