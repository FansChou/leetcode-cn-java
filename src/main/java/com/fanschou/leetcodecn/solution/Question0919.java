package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @title [916] 完全二叉树插入器
 *
 * @description https://leetcode.cn/problems/complete-binary-tree-inserter/
 *
 * 完全二叉树 是每一层（除最后一层外）都是完全填充（即，节点数达到最大）的，并且所有的节点都尽可能地集中在左侧。
 *
 * 设计一种算法，将一个新节点插入到一个完整的二叉树中，并在插入后保持其完整。
 *
 * 实现 CBTInserter 类:
 *
 * CBTInserter(TreeNode root)使用头节点为root的给定树初始化该数据结构；
 * CBTInserter.insert(int v) 向树中插入一个值为Node.val == val的新节点TreeNode。使树保持完全二叉树的状态，并返回插入节点TreeNode的父节点的值；
 * CBTInserter.get_root() 将返回树的头节点。
 *
 * @author fanzhou
 */
public class Question0919 {

    static class CBTInserter {
        Queue<TreeNode> candidate;
        TreeNode root;

        public CBTInserter(TreeNode root) {
            this.candidate = new ArrayDeque<>();
            this.root = root;

            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                if (!(node.left != null && node.right != null)) {
                    candidate.offer(node);
                }
            }
        }

        public int insert(int val) {
            TreeNode child = new TreeNode(val);
            TreeNode node = candidate.peek();
            int ret = node.val;
            if (node.left == null) {
                node.left = child;
            } else {
                node.right = child;
                candidate.poll();
            }
            candidate.offer(child);
            return ret;
        }

        public TreeNode get_root() {
            return root;
        }
    }
}
