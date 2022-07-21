package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0814Test {

    Question0814 question0814 = new Question0814();

    @Test
    void pruneTree() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(0, new TreeNode(0), new TreeNode(1)));
        TreeNode result = new TreeNode(1,
                null,
                new TreeNode(0, null, new TreeNode(1)));
        assertEquals(result, question0814.pruneTree(root));

        root = new TreeNode(1,
                new TreeNode(0, new TreeNode(0), new TreeNode(0)),
                new TreeNode(1, new TreeNode(0), new TreeNode(1)));
        result = new TreeNode(1,
                null,
                new TreeNode(1, null, new TreeNode(1)));
        assertEquals(result, question0814.pruneTree(root));

        root = new TreeNode(1,
                new TreeNode(1, new TreeNode(1, new TreeNode(0), null), new TreeNode(1)),
                new TreeNode(0, new TreeNode(0), new TreeNode(1)));
        result = new TreeNode(1,
                new TreeNode(1, new TreeNode(1), new TreeNode(1)),
                new TreeNode(0, null, new TreeNode(1)));
        assertEquals(result, question0814.pruneTree(root));
    }
}