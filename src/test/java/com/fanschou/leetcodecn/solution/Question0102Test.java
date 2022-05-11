package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0102Test {

    Question0102 question0102 = new Question0102();

    @Test
    void levelOrder() {
        TreeNode left = new TreeNode(9);
        TreeNode rightleft = new TreeNode(15);
        TreeNode rightright = new TreeNode(7);
        TreeNode right = new TreeNode(20, rightleft, rightright);
        TreeNode root = new TreeNode(3, left, right);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(){{
            add(3);
        }};
        List<Integer> list2 = new ArrayList<>(){{
            add(9);
            add(20);
        }};
        List<Integer> list3 = new ArrayList<>(){{
            add(15);
            add(7);
        }};
        result.add(list1);
        result.add(list2);
        result.add(list3);

        assertEquals(result, question0102.levelOrder(root));
    }
}