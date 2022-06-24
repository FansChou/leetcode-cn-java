package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @title [515] 在每个树行中找最大值
 *
 * @description https://leetcode.cn/problems/find-largest-value-in-each-tree-row/
 *
 * 给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
 *
 * @author fanzhou
 */
public class Question0515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Deque<TreeNode> q = new ArrayDeque<>();
        q.addLast(root);
        while (!q.isEmpty()){
            int size = q.size();
            int max = q.peek().val;
            while(size-- >0){
                TreeNode treeNode = q.pollFirst();
                max = Math.max(max, treeNode.val);
                if(treeNode.left != null){
                    q.addLast(treeNode.left);
                }
                if(treeNode.right != null){
                    q.addLast(treeNode.right);
                }
            }
            ans.add(max);
        }

        return ans;
    }
}
