package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @title [1200] 最小绝对差
 *
 * @description https://leetcode.cn/problems/minimum-absolute-difference/
 *
 * 给你个整数数组 arr，其中每个元素都 不相同。
 * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
 *
 * @author fanzhou
 */
public class Question1200 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int left = 0;
        int right = left + 1;
        int min = arr[1] - arr[0];
        List<List<Integer>> ans = new ArrayList<>();
        while (right < arr.length){
            if(Math.abs(arr[right] - arr[left]) < min){
                ans.clear();
                ans.add(List.of(arr[left], arr[right]));
                min = Math.abs(arr[right] - arr[left]);
            } else if(Math.abs(arr[right] - arr[left]) == min){
                ans.add(List.of(arr[left], arr[right]));
            }
            left++;
            right++;
        }

        return ans;
    }

}
