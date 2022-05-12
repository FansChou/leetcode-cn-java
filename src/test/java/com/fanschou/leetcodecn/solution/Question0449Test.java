package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0449Test {

    @Test
    void test(){
        Question0449.Codec codec = new Question0449.Codec();
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        String tree = codec.serialize(root);
        assertEquals(root, codec.deserialize(tree));
    }
}