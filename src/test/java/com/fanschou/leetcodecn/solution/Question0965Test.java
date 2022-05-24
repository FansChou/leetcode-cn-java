package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0965Test {

    Question0965 question0965 = new Question0965();

    @Test
    void isUnivalTree() {
        TreeNode leftright = new TreeNode(1);
        TreeNode leftleft = new TreeNode(1);
        TreeNode left = new TreeNode(1, leftleft, leftright);
        TreeNode rightright = new TreeNode(1);
        TreeNode right = new TreeNode(1, null, rightright);
        TreeNode root = new TreeNode(1, left, right);

        assertTrue(question0965.isUnivalTree(root));

        leftright = new TreeNode(2);
        leftleft = new TreeNode(5);
        left = new TreeNode(2, leftleft, leftright);
        right = new TreeNode(2);
        root = new TreeNode(2, left, right);
        assertFalse(question0965.isUnivalTree(root));
    }
}