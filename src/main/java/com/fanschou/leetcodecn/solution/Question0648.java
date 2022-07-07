package com.fanschou.leetcodecn.solution;

import java.util.List;

/**
 * @title [648] 单词替换
 *
 * @description https://leetcode.cn/problems/replace-words/
 *
 * 在英语中，我们有一个叫做 词根(root) 的概念，可以词根后面添加其他一些词组成另一个较长的单词——我们称这个词为 继承词(successor)。例如，词根an，跟随着单词 other(其他)，可以形成新的单词 another(另一个)。
 *
 * 现在，给定一个由许多词根组成的词典 dictionary 和一个用空格分隔单词形成的句子 sentence。你需要将句子中的所有继承词用词根替换掉。如果继承词有许多可以形成它的词根，则用最短的词根替换它。
 *
 * 你需要输出替换之后的句子。
 *
 * @author fanzhou
 */
public class Question0648 {

    class Node {
        boolean end;
        Node[] tns = new Node[26];
    }
    Node root = new Node();

    void add(String s){
        Node p = root;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if(p.tns[c] == null){
                p.tns[c] = new Node();
            }
            p = p.tns[c];
        }
        p.end = true;
    }

    String search(String s){
        Node p = root;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if(p.tns[c] == null){
                break;
            }
            if(p.tns[c].end){
                return s.substring(0, i + 1);
            }
            p = p.tns[c];
        }
        return s;
    }

    public String replaceWords(List<String> ds, String s) {
        ds.forEach(this::add);
        StringBuilder sb = new StringBuilder();
        for (String str : s.split(" ")) {
            sb.append(search(str)).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

}
