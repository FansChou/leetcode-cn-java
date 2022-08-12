package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @title [1282] 用户分组
 *
 * @description https://leetcode.cn/problems/group-the-people-given-the-group-size-they-belong-to/
 *
 * 有 n 个人被分成数量未知的组。每个人都被标记为一个从 0 到 n - 1 的唯一ID 。
 *
 * 给定一个整数数组 groupSizes ，其中 groupSizes[i] 是第 i 个人所在的组的大小。例如，如果 groupSizes[1] = 3 ，则第 1 个人必须位于大小为 3 的组中。
 *
 * 返回一个组列表，使每个人 i 都在一个大小为 groupSizes[i] 的组中。
 *
 * 每个人应该 恰好只 出现在 一个组 中，并且每个人必须在一个组中。如果有多个答案，返回其中 任何 一个。可以 保证 给定输入 至少有一个 有效的解。
 *
 * @author fanzhou
 */
public class Question1282 {

    public List<List<Integer>> groupThePeople(int[] gs) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < gs.length; i++) {
            List<Integer> list = map.getOrDefault(gs[i], new ArrayList<>());
            list.add(i);
            map.put(gs[i], list);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int k : map.keySet()) {
            List<Integer> list = map.get(k);
            List<Integer> cur = new ArrayList<>();
            for (Integer index : list) {
                cur.add(index);
                if (cur.size() == k) {
                    ans.add(cur);
                    cur = new ArrayList<>();
                }
            }
        }
        return ans;
    }
}
