package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0382Test {

    @Test
    void getRandom() {
        ListNode head = ListNode.createNodeByArrays(new int[]{1,2,3});
        Question0382 question0382 = new Question0382(head);
        question0382.getRandom();
        // 随机情况不能完全确定最终的结果
//        assertEquals(1, question0382.getRandom());
    }
}