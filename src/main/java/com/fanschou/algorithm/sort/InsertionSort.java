package com.fanschou.algorithm.sort;

/**
 * @author fanzhou
 */
public class InsertionSort {

    /**
     * 传统方式进行插入排序
     * @param arr
     */
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int left = 0;
        int right = arr.length - 1;
        for (int i = left, j = i; i < right; j = ++i) {
            int ai = arr[i + 1];
            while (ai < arr[j]) {
                arr[j + 1] = arr[j];
                if (j-- == left) {
                    break;
                }
            }
            arr[j + 1] = ai;
        }
    }

    /**
     * 二分查找的插入排序
     * 优化往已排序队列的插入动作
     * @param arr
     */
    public static void binaryInsertSort(int[] arr) {
        int left;
        int right;
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            left = 0;
            right = i - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] > key) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            if (i - left >= 0) {
                System.arraycopy(arr, left, arr, left + 1, i - left);
            }

            arr[left] = key;
        }
    }

}
