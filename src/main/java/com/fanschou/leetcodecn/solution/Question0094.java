package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @title [94] 二叉树的中序遍历
 *
 * @description https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 *
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 *
 * @author fanzhou
 */
public class Question0094 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        TreeNode tmp = root;
        Deque<TreeNode> stack = new LinkedList<>();
        while(tmp != null || !stack.isEmpty()){
            while(tmp != null){
                stack.push(tmp);
                tmp = tmp.left;
            }

            tmp = stack.pop();
            result.add(tmp.val);
            tmp = tmp.right;
        }

        return result;
    }
}
