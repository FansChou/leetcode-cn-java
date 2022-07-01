package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0241Test {

    Question0241 question0241 = new Question0241();

    @Test
    void diffWaysToCompute() {

        assertEquals(Arrays.asList(2,0), question0241.diffWaysToCompute("2-1-1"));
        assertEquals(Arrays.asList(-34, -10, -14, -10, 10), question0241.diffWaysToCompute("2*3-4*5"));
    }
}