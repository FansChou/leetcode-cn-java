package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0022Test {

    Question0022 question0022 = new Question0022();

    @Test
    void generateParenthesis() {
        List<String> res = new ArrayList<>();
        res.add("((()))");
        res.add("(()())");
        res.add("(())()");
        res.add("()(())");
        res.add("()()()");
        assertEquals(res, question0022.generateParenthesis(3));
        res.clear();
        res.add("()");
        assertEquals(res, question0022.generateParenthesis(1));
    }
}