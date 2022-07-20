package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question1260Test {

    Question1260 question1260 = new Question1260();

    @Test
    void shiftGrid() {
        assertEquals(List.of(List.of(9,1,2), List.of(3,4,5), List.of(6,7,8)),
                question1260.shiftGrid(new int[][]{new int[]{1,2,3}, new int[]{4,5,6}, new int[]{7,8,9}}, 1));

        assertEquals(List.of(List.of(12,0,21,13), List.of(3,8,1,9), List.of(19,7,2,5), List.of(4,6,11,10)),
                question1260.shiftGrid(new int[][]{new int[]{3,8,1,9}, new int[]{19,7,2,5}, new int[]{4,6,11,10}, new int[]{12,0,21,13}}, 4));

        assertEquals(List.of(List.of(1,2,3), List.of(4,5,6), List.of(7,8,9)),
                question1260.shiftGrid(new int[][]{new int[]{1,2,3}, new int[]{4,5,6}, new int[]{7,8,9}}, 9));
    }
}