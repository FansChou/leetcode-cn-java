package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0078Test {

    Question0078 question0078 = new Question0078();

    @Test
    void subsets(){
        List<List<Integer>> result = new ArrayList<>();
        //输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
        result.add(new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
        }});
        result.add(new ArrayList<>(){{
            add(1);
            add(2);
        }});
        result.add(new ArrayList<>(){{
            add(1);
            add(3);
        }});
        result.add(new ArrayList<>(){{
            add(1);
        }});
        result.add(new ArrayList<>(){{
            add(2);
            add(3);
        }});
        result.add(new ArrayList<>(){{
            add(2);
        }});
        result.add(new ArrayList<>(){{
            add(3);
        }});
        result.add(new ArrayList<>());
        assertEquals(result, question0078.subsets(new int[]{1,2,3}));
    }
}