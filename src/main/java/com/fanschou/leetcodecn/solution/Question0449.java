package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;

/**
 * @title [449] 序列化和反序列化二叉搜索树
 *
 * @description https://leetcode.cn/problems/serialize-and-deserialize-bst/
 *
 * 序列化是将数据结构或对象转换为一系列位的过程，以便它可以存储在文件或内存缓冲区中，或通过网络连接链路传输，以便稍后在同一个或另一个计算机环境中重建。
 *
 * 设计一个算法来序列化和反序列化 二叉搜索树 。 对序列化/反序列化算法的工作方式没有限制。 您只需确保二叉搜索树可以序列化为字符串，并且可以将该字符串反序列化为最初的二叉搜索树。
 *
 * 编码的字符串应尽可能紧凑。
 *
 * @author fanzhou
 */
public class Question0449 {

    public static class Codec {
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            dfs1(root, sb);
            return sb.toString();
        }

        private void dfs1(TreeNode root, StringBuilder sb) {
            if (root == null) {
                return;
            }
            sb.append((char) root.val);
            dfs1(root.left, sb);
            dfs1(root.right, sb);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == null) {
                return null;
            }
            return dfs2(0, data.length() - 1, data);
        }

        private TreeNode dfs2(int l, int r, String ss) {
            if (l > r) {
                return null;
            }
            int j = l + 1;
            int t = ss.charAt(l);
            TreeNode ans = new TreeNode(t);
            while (j <= r && ss.charAt(j) <= t) {
                j++;
            }
            ans.left = dfs2(l + 1,j - 1, ss);
            ans.right = dfs2(j, r, ss);
            return ans;
        }
    }
}
