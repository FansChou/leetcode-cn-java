package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;

/**
 * [687] 最长同值路径
 *
 * https://leetcode.cn/problems/longest-univalue-path/
 *
 * 给定一个二叉树的 root ，返回 最长的路径的长度 ，这个路径中的 每个节点具有相同值 。 这条路径可以经过也可以不经过根节点。
 *
 * 两个节点之间的路径长度 由它们之间的边数表示。
 *
 * @author fanzhou
 */
public class Question0687 {

    int max;

    public int longestUnivaluePath(TreeNode root) {
        max = 0;
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int left1 = 0;
        int right1 = 0;
        if (root.left != null && root.left.val == root.val) {
            left1 = left + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            right1 = right + 1;
        }
        max = Math.max(max, left1 + right1);
        return Math.max(left1, right1);
    }

}
