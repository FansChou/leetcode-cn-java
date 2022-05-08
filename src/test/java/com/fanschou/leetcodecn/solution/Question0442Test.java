package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0442Test {

    Question0442 question0442 = new Question0442();

    @Test
    void findDuplicates() {
        List<Integer> result = new ArrayList<>();
        result.add(2);
        result.add(3);
        assertEquals(result, question0442.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));

        result.clear();
        result.add(1);
        assertEquals(result, question0442.findDuplicates(new int[]{1,1,2}));

        result.clear();
        assertEquals(result, question0442.findDuplicates(new int[]{1}));
    }
}