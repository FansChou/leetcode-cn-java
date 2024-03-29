package com.fanschou.leetcodecn.solution;

/**
 * <a href="https://leetcode.cn/problems/k-th-symbol-in-grammar/solution/">[779] 第K个语法符号</a><br />
 *
 * 我们构建了一个包含 n 行( 索引从 1  开始 )的表。首先在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
 *
 * 例如，对于 n = 3 ，第 1 行是 0 ，第 2 行是 01 ，第3行是 0110 。
 * 给定行数 n 和序数 k，返回第 n 行中第 k 个字符。（ k 从索引 1 开始）
 *
 * @author fanzhou
 */
public class Question0779 {

    public int kthGrammar(int n, int k) {
         return Integer.bitCount(k - 1) & 1;
    }
}
