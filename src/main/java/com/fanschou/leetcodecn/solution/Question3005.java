package com.fanschou.leetcodecn.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/count-elements-with-maximum-frequency/">[3005] 最大频率元素计数</a><br />
 * @author fanzhou
 */
public class Question3005 {

    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int maxCnt = 0;
        int ans = 0;
        for (int x : nums) {
            int c = cnt.merge(x, 1, Integer::sum);
            if (c > maxCnt) {
                ans = maxCnt = c;
            } else if (c == maxCnt) {
                ans += c;
            }
        }
        return ans;
    }

}
