package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0655Test {

    Question0655 question0655 = new Question0655();

    @Test
    void printTree() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        assertEquals(List.of(List.of("", "1", ""), List.of("2", "", "")), question0655.printTree(root));

        root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        assertEquals(List.of(List.of("","","","1","","",""), List.of("","2","","","","3",""), List.of("","","4","","","","")), question0655.printTree(root));
    }
}