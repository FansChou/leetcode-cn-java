package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0014Test {

    Question0014 question0014 = new Question0014();

    @Test
    void longestCommonPrefix() {
        assertEquals("fl", question0014.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", question0014.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}