package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0648Test {

    Question0648 question0648 = new Question0648();

    @Test
    void replaceWords() {
        assertEquals("the cat was rat by the bat", question0648.replaceWords(List.of("cat","bat","rat"), "the cattle was rattled by the battery"));
        assertEquals("a a b c", question0648.replaceWords(List.of("a","b","c"), "aadsfasf absbs bbab cadsfafs"));
    }
}