package com.fanschou.leetcodecn.solution;

/**
 * @title [208] 实现 Trie (前缀树)
 *
 * @description https://leetcode-cn.com/problems/implement-trie-prefix-tree/
 *
 * Trie（发音类似 "try"）或者说 前缀树
 * 是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。这一数据结构有相当多的应用情景，例如自动补完和拼写检查。
 *
 * 请你实现 Trie 类：
 *
 * Trie() 初始化前缀树对象。
 * void insert(String word) 向前缀树中插入字符串 word 。
 * boolean search(String word) 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回
 * false 。
 * boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true
 * ；否则，返回 false 。
 *
 * @author fanzhou
 */
public class Question0208 {

    static class Trie {
        private Trie[] children;
        private boolean isEnd = false;

        /** Initialize your data structure here. */
        public Trie() {
            this.children = new Trie[26];
            this.isEnd = false;
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            Trie cur = this;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if(cur.children[index] == null){
                    cur.children[index] = new Trie();
                }
                cur = cur.children[index];
            }
            cur.isEnd = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            Trie node = searchEndNode(word);
            return node != null && node.isEnd;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            return searchEndNode(prefix) != null;
        }

        private Trie searchEndNode(String word){
            Trie cur = this;

            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if(cur.children[index] == null){
                    return null;
                }
                cur = cur.children[index];
            }

            return cur;
        }
    }

}
