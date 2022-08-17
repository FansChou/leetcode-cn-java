package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @title [1302] 层数最深叶子节点的和
 *
 * @description https://leetcode.cn/problems/deepest-leaves-sum/
 *
 * 给你一棵二叉树的根节点 root ，请你返回 层数最深的叶子节点的和 。
 *
 * @author fanzhou
 */
public class Question1302 {

    public int deepestLeavesSum(TreeNode root) {
        Deque<TreeNode> d = new ArrayDeque<>();
        d.addLast(root);
        int deepestLeavesSum = 0;
        while (!d.isEmpty()) {
            int sz = d.size();
            deepestLeavesSum = 0;
            while (sz-- > 0) {
                TreeNode node = d.pollFirst();
                deepestLeavesSum += node.val;
                if (node.left != null) {
                    d.addLast(node.left);
                }
                if (node.right != null) {
                    d.addLast(node.right);
                }
            }
        }
        return deepestLeavesSum;
    }
}
