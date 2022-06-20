package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0508Test {

    Question0508 question0508 = new Question0508();

    @Test
    void findFrequentTreeSum() {
        TreeNode root = new TreeNode(5, new TreeNode(2), new TreeNode(-3));
        assertArrayEquals(new int[]{2,-3,4}, question0508.findFrequentTreeSum(root));

        root = new TreeNode(5, new TreeNode(2), new TreeNode(-5));
        assertArrayEquals(new int[]{2}, question0508.findFrequentTreeSum(root));
    }
}