package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0094Test {

    Question0094 question0094 = new Question0094();

    @Test
    void inorderTraversal() {
        TreeNode right = new TreeNode(2, new TreeNode(3), null);
        TreeNode root = new TreeNode(1, null, right);

        assertEquals(List.of(1, 3, 2), question0094.inorderTraversal(root));
    }
}