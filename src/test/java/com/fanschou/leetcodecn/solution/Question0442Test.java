package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question0442Test {

    Question0442 question0442 = new Question0442();

    @Test
    void findDuplicates() {

        assertEquals(Arrays.asList(2, 3), question0442.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));

        assertEquals(List.of(1), question0442.findDuplicates(new int[]{1,1,2}));

        assertEquals(new ArrayList<>(), question0442.findDuplicates(new int[]{1}));
    }
}