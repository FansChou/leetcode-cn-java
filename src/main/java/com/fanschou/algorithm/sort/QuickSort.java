package com.fanschou.algorithm.sort;

/**
 * @author fanzhou
 */
public class QuickSort {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    /**
     * 递归排序
     * @param src
     * @param begin
     * @param end
     */
    private void quickSort(int[] src, int begin, int end) {
        if (begin >= end) {
            return;
        }

        int key = src[begin];
        int i = begin;
        int j = end;
        while (i < j) {
            while (i < j && src[j] > key) {
                j--;
            }
            if (i < j) {
                src[i] = src[j];
                i++;
            }
            while (i < j && src[i] < key) {
                i++;
            }
            if (i < j) {
                src[j] = src[i];
                j--;
            }
        }
        src[i] = key;
        quickSort(src, begin, i - 1);
        quickSort(src, i + 1, end);
    }
}
