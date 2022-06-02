package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0450Test {

    Question0450 question0450 = new Question0450();

    @Test
    void deleteNode() {
        // 5,3,6,2,4,null,7
        TreeNode leftleft = new TreeNode(2);
        TreeNode leftright = new TreeNode(4);
        TreeNode left = new TreeNode(3, leftleft, leftright);
        TreeNode rightright = new TreeNode(7);
        TreeNode right = new TreeNode(6, null, rightright);
        TreeNode root = new TreeNode(5, left, right);

        TreeNode result = new TreeNode(5, new TreeNode(2, null, new TreeNode(4)), new TreeNode(6, null, new TreeNode(7)));
        assertEquals(result, question0450.deleteNode(root, 3));
    }
}