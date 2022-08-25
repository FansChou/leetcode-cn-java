package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @title [658] 找到K个最接近的元素
 *
 * @description https://leetcode.cn/problems/find-k-closest-elements/
 *
 * 在英语中，我们有一个叫做 词根(root) 的概念，可以词根后面添加其他一些词组成另一个较长的单词——我们称这个词为 继承词(successor)。例如，词根an，跟随着单词 other(其他)，可以形成新的单词 another(另一个)。
 *
 * 现在，给定一个由许多词根组成的词典 dictionary 和一个用空格分隔单词形成的句子 sentence。你需要将句子中的所有继承词用词根替换掉。如果继承词有许多可以形成它的词根，则用最短的词根替换它。
 *
 * 你需要输出替换之后的句子。
 *
 * @author fanzhou
 */
public class Question0658 {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        // 二分查找定位到最靠近x的元素位置
        while (l < r){
            int mid = l + r + 1 >> 1;
            if(arr[mid] <= x){
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        r = r + 1 < n && Math.abs(arr[r + 1] - x) < Math.abs(arr[r] - x) ? r + 1 : r;
        int i = r - 1;
        int j = r + 1;
        while (j - i - 1 < k) {
            if (i >= 0 && j < n) {
                // 找到更靠近x的那一侧扩展
                if (Math.abs(arr[j] - x) < Math.abs(arr[i] - x)) {
                    j++;
                } else {
                    i--;
                }
            } else if (i >= 0) {
                // 右侧走到尽头，单向扩展
                i--;
            } else {
                // 左侧走到尽头，单向扩展
                j++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int p = i + 1; p <= j - 1; p++) {
            ans.add(arr[p]);
        }
        return ans;
    }

}
