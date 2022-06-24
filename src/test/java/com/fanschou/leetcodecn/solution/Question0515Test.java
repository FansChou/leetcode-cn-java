package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0515Test {

    Question0515 question0515 = new Question0515();

    @Test
    void largestValues() {
        TreeNode root = new TreeNode(1,
                new TreeNode(3, new TreeNode(5), new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(9)));
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(3);
        result.add(9);
        assertEquals(result, question0515.largestValues(root));

        result.clear();
        result.add(1);
        result.add(3);
        root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        assertEquals(result, question0515.largestValues(root));
    }
}