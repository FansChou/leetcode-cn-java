package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @title [655] 输出二叉树
 *
 * @description https://leetcode.cn/problems/print-binary-tree/
 *
 * @author fanzhou
 */
public class Question0655 {

    public List<List<String>> printTree(TreeNode root) {
        // 计算树的深度
        int height = calDepth(root);
        int m = height + 1;
        int n = (1 << (height + 1)) - 1;
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add("");
            }
            res.add(row);
        }
        dfs(res, root, 0, (n - 1) / 2, height);
        return res;
    }

    /**
     * 计算树的深度
     * @param root
     * @return
     */
    public int calDepth(TreeNode root) {
        int h = 0;
        if (root.left != null) {
            h = Math.max(h, calDepth(root.left) + 1);
        }
        if (root.right != null) {
            h = Math.max(h, calDepth(root.right) + 1);
        }
        return h;
    }

    /**
     * 排列节点
     * @param res 结果集
     * @param root 当前遍历到的根结点
     * @param row 当前行
     * @param column 当前根结点所在列
     * @param height 树的高度
     */
    public void dfs(List<List<String>> res, TreeNode root, int row, int column, int height) {
        res.get(row).set(column, Integer.toString(root.val));
        if (root.left != null) {
            // 递归时，行数加1，以根结点为中心，左右偏移树宽度的1/2
            dfs(res, root.left, row + 1, column - (1 << (height - row - 1)), height);
        }
        if (root.right != null) {
            dfs(res, root.right, row + 1, column + (1 << (height - row - 1)), height);
        }
    }

}
