package com.fanschou.leetcodecn.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @title [3] 无重复字符的最长子串
 *
 * @description https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 *
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * @author fanzhou
 */
public class Question0003 {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int ans = 0;
        char[] chs = s.toCharArray();
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            while(set.contains(chs[right])){
                set.remove(chs[left++]);
            }
            set.add(chs[right]);
            right++;
            ans = Math.max(ans, right - left);
        }
        ans = Math.max(ans, chs.length - left);
        return ans;
    }

    public int lengthOfLongestSubstring1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for (int start = 0, end = 0; end < s.length(); end++) {
            char right = s.charAt(end);
            map.put(right, map.getOrDefault(right, 0) + 1);
            while (map.get(right) > 1) {
                char left = s.charAt(start);
                map.put(left, map.get(left) - 1);
                start++;
            }
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}
