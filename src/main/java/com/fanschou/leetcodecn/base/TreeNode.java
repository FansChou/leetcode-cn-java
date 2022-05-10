package com.fanschou.leetcodecn.base;

/**
 * 树节点
 * @author fanzhou
 */
public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
