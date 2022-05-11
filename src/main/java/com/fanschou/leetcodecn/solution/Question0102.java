package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @title [102] 二叉树的层序遍历
 *
 * @description https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 *
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 *
 * @author fanzhou
 */
public class Question0102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Deque<TreeNode> d = new LinkedList<>();
        d.add(root);
        while(!d.isEmpty()){
            List<Integer> single = new ArrayList<>();
            int curSize = d.size();
            for (int i = 0; i < curSize; i++) {
                TreeNode node = d.poll();
                single.add(node.val);
                if(node.left != null){
                    d.add(node.left);
                }
                if(node.right != null){
                    d.add(node.right);
                }
            }
            ans.add(single);
        }

        return ans;
    }
}
