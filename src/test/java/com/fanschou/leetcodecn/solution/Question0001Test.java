package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Question0001Test {

    private final Question0001 question0001 = new Question0001();

    @Test
    void twoSum(){
        assertArrayEquals(new int[]{0,1}, question0001.twoSum(new int[]{2,7,11,15}, 9));
        assertArrayEquals(new int[]{1,2}, question0001.twoSum(new int[]{3,2,4}, 6));
        assertArrayEquals(new int[]{0,1}, question0001.twoSum(new int[]{3,3}, 6));
    }
}
