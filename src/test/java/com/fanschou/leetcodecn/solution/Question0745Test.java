package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0745Test {

    @Test
    void f(){
        Question0745.WordFilter wordFilter = new Question0745.WordFilter(new String[]{"apple"});
        assertEquals(0, wordFilter.f("a", "e"));
    }
}