package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @title [745] 前缀和后缀搜索
 *
 * @description https://leetcode.cn/problems/prefix-and-suffix-search/
 *
 * 设计一个包含一些单词的特殊词典，并能够通过前缀和后缀来检索单词。
 *
 * 实现 WordFilter 类：
 *
 * WordFilter(string[] words) 使用词典中的单词 words 初始化对象。
 * f(string pref, string suff) 返回词典中具有前缀 prefix 和后缀 suff 的单词的下标。如果存在不止一个满足要求的下标，返回其中 最大的下标 。如果不存在这样的单词，返回 -1 。
 *
 * @author fanzhou
 */
public class Question0745 {

    static class WordFilter {

        static class TrieNode {
            TrieNode[] tns = new TrieNode[26];
            List<Integer> idxs = new ArrayList<>();
        }

        void add(TrieNode node, String str, int idx, boolean isTurn){
            int n = str.length();
            node.idxs.add(idx);
            for (int i = isTurn ? n - 1 : 0; i < n && i >= 0; i += isTurn ? -1 : 1) {
                int u = str.charAt(i) - 'a';
                if(node.tns[u] == null){
                    node.tns[u] = new TrieNode();
                }
                node = node.tns[u];
                node.idxs.add(idx);
            }
        }

        int query(String prefix, String suffix){
            int m = prefix.length();
            int n = suffix.length();
            TrieNode node = tr1;
            for (int i = 0; i < m; i++) {
                int u = prefix.charAt(i) - 'a';
                if(node.tns[u] == null){
                    return -1;
                }
                node = node.tns[u];
            }
            List<Integer> list1 = node.idxs;

            node = tr2;
            for (int i = n - 1; i >= 0; i--) {
                int u = suffix.charAt(i) - 'a';
                if(node.tns[u] == null){
                    return -1;
                }
                node = node.tns[u];
            }
            List<Integer> list2 = node.idxs;

            m = list1.size();
            n = list2.size();
            for (int i = m -1, j = n - 1; i >= 0 && j >= 0; ) {
                if(list1.get(i) > list2.get(j)){
                    i--;
                } else if(list1.get(i) < list2.get(j)){
                    j--;
                } else {
                    return list1.get(i);
                }
            }

            return -1;
        }

        TrieNode tr1 = new TrieNode();
        TrieNode tr2 = new TrieNode();

        public WordFilter(String[] words) {
            int n = words.length;
            for (int i = 0; i < n; i++) {
                add(tr1, words[i], i, false);
                add(tr2, words[i], i, true);
            }
        }

        public int f(String prefix, String suffix) {
            return query(prefix, suffix);
        }
    }
}
