package com.fanschou.leetcodecn.solution;

import com.fanschou.leetcodecn.base.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @title [146] LRU 缓存机制
 *
 * @description https://leetcode-cn.com/problems/lru-cache/
 *
 * 请你设计并实现一个满足 LRU (最近最少使用) 缓存 约束的数据结构。
 *
 * 实现 LRUCache 类：
 *
 * LRUCache(int capacity) 以 正整数 作为容量 capacity 初始化 LRU 缓存
 * int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
 * void put(int key, int value) 如果关键字 key 已经存在，则变更其数据值 value ；如果不存在，则向缓存中插入该组
 * key-value 。如果插入操作导致关键字数量超过 capacity ，则应该 逐出 最久未使用的关键字。
 *
 * 函数 get 和 put 必须以 O(1) 的平均时间复杂度运行。
 *
 * @author fanzhou
 */
public class Question0146 {

    static class LRUCache {

        class DLinkedNode {
            int key;
            int value;
            DLinkedNode prev;
            DLinkedNode next;

            public DLinkedNode(){}

            public DLinkedNode(int _key, int _value){
                this.key = _key;
                this.value = _value;
            }
        }
        int capacity;
        int size;
        DLinkedNode head;
        DLinkedNode tail;
        Map<Integer, DLinkedNode> map;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            head = new DLinkedNode();
            tail = new DLinkedNode();
            map = new HashMap<>();
            head.next = tail;
            tail.prev = head;

        }

        public int get(int key) {
            DLinkedNode node = map.get(key);
            if(node == null){
                return -1;
            }
            moveToHead(node);
            return node.value;
        }

        public void put(int key, int value) {
            DLinkedNode node = map.get(key);
            if(node == null){
                node = new DLinkedNode(key, value);
                map.put(key, node);
                addToHead(node);
                size++;
                if(size > capacity){
                    DLinkedNode tail = removeTail();
                    map.remove(tail.key);
                    size--;
                }
            } else {
                node.value = value;
                moveToHead(node);
            }

        }

        private void moveToHead(DLinkedNode node){
            removeNode(node);
            addToHead(node);
        }

        private void removeNode(DLinkedNode node){
            node.next.prev = node.prev;
            node.prev.next = node.next;
        }

        private void addToHead(DLinkedNode node){
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        private DLinkedNode removeTail(){
            DLinkedNode res = tail.prev;
            removeNode(res);
            return res;
        }
    }
}
