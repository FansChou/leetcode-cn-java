package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question1200Test {

    Question1200 question1200 = new Question1200();

    @Test
    void minimumAbsDifference() {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(List.of(1, 2));
        ans.add(List.of(2, 3));
        ans.add(List.of(3, 4));

        assertEquals(ans, question1200.minimumAbsDifference(new int[]{4,2,1,3}));
    }
}