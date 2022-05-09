package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0933Test {

    @Test
    void ping(){
        Question0933.RecentCounter recentCounter = new Question0933.RecentCounter();
        // requests = [1]，范围是 [-2999,1]，返回 1
        assertEquals(1, recentCounter.ping(1));
        // requests = [1, 100]，范围是 [-2900,100]，返回 2
        assertEquals(2, recentCounter.ping(100));
        // requests = [1, 100, 3001]，范围是 [1,3001]，返回 3
        assertEquals(3, recentCounter.ping(3001));
        // requests = [1, 100, 3001, 3002]，范围是 [2,3002]，返回 3
        assertEquals(3, recentCounter.ping(3002));
    }

}