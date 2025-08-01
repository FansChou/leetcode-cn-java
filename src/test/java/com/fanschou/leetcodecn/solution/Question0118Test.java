package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0118Test {

    Question0118 question0118 = new Question0118();

    @Test
    void generate() {
        assertEquals(List.of(List.of(1),List.of(1,1),List.of(1,2,1),List.of(1,3,3,1),List.of(1,4,6,4,1)), question0118.generate(5));
        assertEquals(List.of(List.of(1)), question0118.generate(1));
    }
}