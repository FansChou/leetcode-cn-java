package com.fanschou.algorithm.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void insertionSort() {
        int[] arr = new int[]{16, 24, 7, 43, 32, 11, 15, 30, 28, 38};
        InsertionSort.insertionSort(arr);
        assertArrayEquals(new int[]{7,11,15,16,24,28,30,32,38,43}, arr);
    }

    @Test
    void binaryInsertSort() {
        int[] arr = new int[]{16, 24, 7, 43, 32, 11, 15, 30, 28, 38};
        InsertionSort.binaryInsertSort(arr);
        assertArrayEquals(new int[]{7,11,15,16,24,28,30,32,38,43}, arr);
    }
}