package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question1717Test {

    Question1717 question1717 = new Question1717();

    @Test
    void maximumUniqueSubarray() {
        assertEquals(19, question1717.maximumGain("cdbcbbaaabab", 4, 5));
        assertEquals(20, question1717.maximumGain("aabbaaxybbaabb", 5, 4));
    }
}