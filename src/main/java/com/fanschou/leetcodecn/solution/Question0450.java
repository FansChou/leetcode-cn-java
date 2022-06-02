package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;

/**
 * @title [450] 删除二叉搜索树中的节点
 *
 * @description https://leetcode.cn/problems/delete-node-in-a-bst/
 *
 * 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。
 *
 * @author fanzhou
 */
public class Question0450 {

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        // 找到节点
        if(root.val == key){
            // 左节点为空，使用右节点代替root
            if(root.left == null){
                return root.right;
            }
            // 右节点为空，使用左节点代替root
            if(root.right == null){
                return root.left;
            }
            // 左右节点都不为空时
            TreeNode t = root.left;
            // 从左节点一直找到最右侧的节点，也就是左子树中最大的节点
            while(t.right != null){
                t = t.right;
            }
            // 根据BST的特性，右子树的节点值都大于左子树，将右子树接在左子树最大节点的右侧
            t.right = root.right;
            // 返回左子树
            return root.left;
        } else if(root.val < key) {
            // 搜索右子树，返回值给到root的右节点上
            root.right = deleteNode(root.right, key);
        } else {
            // 搜索左子树，返回值给到root的左节点上
            root.left = deleteNode(root.left, key);
        }
        return root;
    }
}
