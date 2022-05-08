package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0056Test {

    Question0056 question0056 = new Question0056();

    @Test
    void merge() {

        int[][] intervals = new int[][]{
                new int[]{1,3},
                new int[]{2,6},
                new int[]{8,10},
                new int[]{15,18}
        };
        int[][] result = new int[][]{
                new int[]{1,6},
                new int[]{8,10},
                new int[]{15,18}
        };
        assertArrayEquals(result, question0056.merge(intervals));

        intervals = new int[][]{
                new int[]{1,4},
                new int[]{4,5}
        };
        result = new int[][]{
                new int[]{1,5}
        };
        assertArrayEquals(result, question0056.merge(intervals));
    }
}