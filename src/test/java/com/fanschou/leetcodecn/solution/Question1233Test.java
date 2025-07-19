package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question1233Test {

    Question1233 question1233 = new Question1233();

    @Test
    void removeSubfolders() {
        assertEquals(List.of("/a","/c/d","/c/f"), question1233.removeSubfolders(new String[]{"/a","/a/b","/c/d","/c/d/e","/c/f"}));
        assertEquals(List.of("/a"), question1233.removeSubfolders(new String[]{"/a","/a/b/c","/a/b/d"}));
        assertEquals(List.of("/a/b/c","/a/b/ca","/a/b/d"), question1233.removeSubfolders(new String[]{"/a/b/c","/a/b/ca","/a/b/d"}));
    }
}