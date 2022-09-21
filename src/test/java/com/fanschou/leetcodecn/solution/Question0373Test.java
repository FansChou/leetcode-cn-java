package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0373Test {

    Question0373 question0373 = new Question0373();

    @Test
    void kSmallestPairs() {
        assertEquals(List.of(List.of(1,2), List.of(1,4), List.of(1,6)), question0373.kSmallestPairs(new int[]{1,7,11}, new int[]{2,4,6},3));
    }
}