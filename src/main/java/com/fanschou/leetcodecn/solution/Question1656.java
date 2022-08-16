package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @title [1656] 设计有序流
 *
 * @description https://leetcode.cn/problems/design-an-ordered-stream/
 *
 * @author fanzhou
 */
public class Question1656 {

    class OrderedStream {
        String[] ss;
        int idx;
        int n;
        public OrderedStream(int n) {
            ss = new String[n + 10];
            Arrays.fill(ss, "");
            idx = 1;
            this.n = n;
        }
        public List<String> insert(int key, String value) {
            ss[key] = value;
            List<String> ans = new ArrayList<>();
            while (ss[idx].length() == 5) {
                ans.add(ss[idx++]);
            }
            return ans;
        }
    }
}
