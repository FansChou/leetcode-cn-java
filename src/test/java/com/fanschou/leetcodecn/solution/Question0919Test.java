package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0919Test {

    @Test
    void cBTInserter() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        Question0919.CBTInserter cBTInserter = new Question0919.CBTInserter(root);
        assertEquals(1, cBTInserter.insert(3));
        assertEquals(2, cBTInserter.insert(4));

        root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3));
        assertEquals(root, cBTInserter.get_root());
    }

}