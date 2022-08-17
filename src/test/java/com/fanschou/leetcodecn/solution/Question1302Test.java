package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1302Test {

    Question1302 question1302 = new Question1302();

    @Test
    void deepestLeavesSum() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, new TreeNode(7), null),
                        new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(6, null, new TreeNode(8))));
        assertEquals(15, question1302.deepestLeavesSum(root));
    }
}