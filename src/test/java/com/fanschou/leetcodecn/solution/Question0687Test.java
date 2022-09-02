package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0687Test {

    Question0687 question0687 = new Question0687();

    @Test
    void longestUnivaluePath() {
        assertEquals(2, question0687.longestUnivaluePath(
                new TreeNode(5,
                new TreeNode(4, new TreeNode(1), new TreeNode(1)),
                new TreeNode(5, null, new TreeNode(5)))
        ));
        assertEquals(2, question0687.longestUnivaluePath(
                new TreeNode(1,
                        new TreeNode(4, new TreeNode(4), new TreeNode(4)),
                        new TreeNode(5, null, new TreeNode(5)))
        ));
    }
}