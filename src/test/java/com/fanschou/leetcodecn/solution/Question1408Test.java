package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question1408Test {

    Question1408 question1408 = new Question1408();

    @Test
    void stringMatching() {
        assertEquals(List.of("as","hero"), question1408.stringMatching(new String[]{"mass","as","hero","superhero"}));
        assertEquals(List.of("et","code"), question1408.stringMatching(new String[]{"leetcode","et","code"}));
        assertEquals(List.of(), question1408.stringMatching(new String[]{"blue","green","bu"}));
    }
}