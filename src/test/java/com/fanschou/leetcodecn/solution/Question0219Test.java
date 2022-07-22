package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0219Test {

    Question0219 question0219 = new Question0219();

    @Test
    void containsNearbyDuplicate() {
        assertTrue(question0219.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
        assertTrue(question0219.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
        assertFalse(question0219.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}