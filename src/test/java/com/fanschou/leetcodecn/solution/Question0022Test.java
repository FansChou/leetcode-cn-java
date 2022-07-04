package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0022Test {

    Question0022 question0022 = new Question0022();

    @Test
    void generateParenthesis() {

        assertEquals(List.of("((()))", "(()())", "(())()", "()(())", "()()()"), question0022.generateParenthesis(3));
        assertEquals(List.of("()"), question0022.generateParenthesis(1));
    }
}