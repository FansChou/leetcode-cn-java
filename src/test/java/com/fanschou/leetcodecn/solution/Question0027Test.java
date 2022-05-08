package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Question0027Test {

    Question0027 question0027 = new Question0027();

    @Test
    void removeElement() {
        int[] nums = new int[]{3,2,2,3};
        assertEquals(2, question0027.removeElement(nums, 3));
        assertArrayEquals(new int[]{2,2}, Arrays.copyOfRange(nums, 0, 2));

        nums = new int[]{0,1,2,2,3,0,4,2};
        assertEquals(5, question0027.removeElement(nums, 2));
        assertArrayEquals(new int[]{0,1,4,0,3}, Arrays.copyOfRange(nums, 0, 5));
    }
}