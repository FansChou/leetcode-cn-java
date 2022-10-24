package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0915Test {

    Question0915 question0915 = new Question0915();

    @Test
    void partitionDisjoint() {
        assertEquals(3, question0915.partitionDisjoint(new int[]{5,0,3,8,6}));
        assertEquals(4, question0915.partitionDisjoint(new int[]{1,1,1,0,6,12}));
    }
}