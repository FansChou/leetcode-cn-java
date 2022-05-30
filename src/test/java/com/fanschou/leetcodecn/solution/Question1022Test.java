package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1022Test {

    Question1022 question1022 = new Question1022();

    @Test
    void sumRootToLeaf() {
        TreeNode leftleft = new TreeNode(0);
        TreeNode leftright = new TreeNode(1);
        TreeNode left = new TreeNode(0, leftleft, leftright);
        TreeNode rightleft = new TreeNode(0);
        TreeNode rightright = new TreeNode(1);
        TreeNode right = new TreeNode(1, rightleft, rightright);
        TreeNode root = new TreeNode(1, left, right);
        assertEquals(22, question1022.sumRootToLeaf(root));
    }
}