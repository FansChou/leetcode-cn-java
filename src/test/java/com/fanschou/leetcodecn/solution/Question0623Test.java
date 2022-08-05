package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0623Test {

    Question0623 question0623 = new Question0623();

    @Test
    void addOneRow() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(3), new TreeNode(1)),
                new TreeNode(6, new TreeNode(5), null));
        TreeNode result = new TreeNode(4,
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(3),
                                new TreeNode(1)),
                        null),
                new TreeNode(1,
                        null,
                        new TreeNode(6,
                                new TreeNode(5),
                                null)));
        assertEquals(result, question0623.addOneRow(root, 1, 2));
    }
}