package com.fanschou.leetcodecn.solution;

/**
 * @title [1089] 复写零
 *
 * @description https://leetcode.cn/problems/duplicate-zeros/
 *
 * 给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
 *
 * 注意：请不要在超过该数组长度的位置写入元素。
 *
 * 要求：请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。
 *
 * @author fanzhou
 */
public class Question1089 {

    public void duplicateZeros(int[] arr) {
        int i = 0;
        int j = 0;
        int n = arr.length;
        while (j < n){
            // 元素为0，j多推进一位
            if(arr[i] == 0){
                j++;
            }
            i++;
            j++;
        }
        // 临界值回退一位
        i--;
        j--;
        // 进行回填
        while(i >= 0){
            // 这里注意，回退一位，仍然有可能出现 j 超出数组地址
            // 此种情形只出现在arr[i]=0时，可以通过后面的步骤统一解决
            if(j < n){
                arr[j] = arr[i];
            }
            if(arr[i] == 0 && --j > 0){
                arr[j] = 0;
            }
            i--;
            j--;
        }
    }

}
