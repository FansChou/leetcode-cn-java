package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question1282Test {

    Question1282 question1282 = new Question1282();

    @Test
    void groupThePeople() {
        assertEquals(List.of(List.of(5), List.of(0,1,2), List.of(3,4,6)), question1282.groupThePeople(new int[]{3,3,3,3,3,1,3}));
    }
}