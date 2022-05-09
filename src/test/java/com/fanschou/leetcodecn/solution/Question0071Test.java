package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question0071Test {

    Question0071 question0071 = new Question0071();

    @Test
    void simplifyPath() {

        assertEquals("/home", question0071.simplifyPath("/home/"));
        assertEquals("/", question0071.simplifyPath("/../"));
        assertEquals("/home/foo", question0071.simplifyPath("/home//foo/"));
        assertEquals("/c", question0071.simplifyPath("/a/./b/../../c/"));
    }
}