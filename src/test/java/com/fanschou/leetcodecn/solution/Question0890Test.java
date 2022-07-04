package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0890Test {

    Question0890 question0890 = new Question0890();

    @Test
    void findAndReplacePattern() {

        assertEquals(List.of("mee", "aqq"), question0890.findAndReplacePattern(new String[]{"abc","deq","mee","aqq","dkd","ccc"}, "abb"));
    }
}