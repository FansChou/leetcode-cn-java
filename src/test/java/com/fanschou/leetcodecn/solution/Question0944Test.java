package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0944Test {

    Question0944 question0944 = new Question0944();

    @Test
    void minDeletionSize() {
        assertEquals(1, question0944.minDeletionSize(new String[]{"cba","daf","ghi"}));
        assertEquals(0, question0944.minDeletionSize(new String[]{"a","b"}));
        assertEquals(3, question0944.minDeletionSize(new String[]{"zyx","wvu","tsr"}));
    }
}