package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;

/**
 * @title [513] 找树左下角的值
 *
 * @description https://leetcode.cn/problems/find-bottom-left-tree-value/
 *
 * 给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。
 *
 * 假设二叉树中至少有一个节点。
 *
 * @author fanzhou
 */
public class Question0513 {
    int max = 0;
    int ans = 0;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 1);
        return ans;
    }

    private void dfs(TreeNode root, int depth){
        if(root == null){
            return;
        }
        if(depth > max){
            max = depth;
            ans = root.val;
        }
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
