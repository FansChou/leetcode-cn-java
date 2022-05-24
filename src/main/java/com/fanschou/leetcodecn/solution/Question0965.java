package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;

/**
 * @title [965] 单值二叉树
 *
 * @description https://leetcode.cn/problems/univalued-binary-tree/
 *
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 *
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 *
 * @author fanzhou
 */
public class Question0965 {

    int val = -1;
    public boolean isUnivalTree(TreeNode root) {
        if (val == -1) {
            val = root.val;
        }
        if (root == null) {
            return true;
        }
        if (root.val != val) {
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }

}
