package com.fanschou.algorithm.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSortTest {

    QuickSort quickSort = new QuickSort();

    @Test
    void sort() {

        int[] arr = new int[]{16, 24, 7, 43, 32, 11, 15, 30, 28, 38};
        quickSort.sort(arr);
        assertArrayEquals(new int[]{7,11,15,16,24,28,30,32,38,43}, arr);
    }
}