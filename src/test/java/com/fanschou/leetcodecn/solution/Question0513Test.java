package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0513Test {

    Question0513 question0513 = new Question0513();

    @Test
    void findBottomLeftValue() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertEquals(1, question0513.findBottomLeftValue(root));
    }
}