package com.fanschou.leetcodecn.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/fruit-into-baskets/">[904] 水果成篮</a><br />
 * @author fanzhou
 */
public class Question0904 {

    public int totalFruit(int[] fruits) {
        int ans = 0;
        int left = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int right = 0; right < fruits.length; right++) {
            cnt.merge(fruits[right], 1, Integer::sum);
            while (cnt.size() > 2) {
                int out = fruits[left];
                cnt.merge(out, -1, Integer::sum);
                if(cnt.get(out) == 0){
                    cnt.remove(out);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
