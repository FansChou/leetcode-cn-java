package com.fanschou.leetcodecn.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question0146Test {

    @Test
    void lruCache(){

        Question0146.LRUCache lRUCache = new Question0146.LRUCache(2);
        // 缓存是 {1=1}
        lRUCache.put(1, 1);
        // 缓存是 {1=1, 2=2}
        lRUCache.put(2, 2);
        // 返回 1
        assertEquals(1, lRUCache.get(1));
        // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        lRUCache.put(3, 3);
        // 返回 -1 (未找到)
        assertEquals(-1, lRUCache.get(2));
        // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        lRUCache.put(4, 4);
        // 返回 -1 (未找到)
        assertEquals(-1, lRUCache.get(1));
        // 返回 3
        assertEquals(3, lRUCache.get(3));
        // 返回 4
        assertEquals(4, lRUCache.get(4));

    }
}