package com.fanschou.leetcodecn.solution;

/**
 * @title [641] 设计循环双端队列
 *
 * @description https://leetcode.cn/problems/design-circular-deque/
 *
 * 设计实现双端队列。
 *
 * 实现 MyCircularDeque 类:
 *
 * MyCircularDeque(int k) ：构造函数,双端队列最大为 k 。
 * boolean insertFront()：将一个元素添加到双端队列头部。 如果操作成功返回 true ，否则返回 false 。
 * boolean insertLast() ：将一个元素添加到双端队列尾部。如果操作成功返回 true ，否则返回 false 。
 * boolean deleteFront() ：从双端队列头部删除一个元素。 如果操作成功返回 true ，否则返回 false 。
 * boolean deleteLast() ：从双端队列尾部删除一个元素。如果操作成功返回 true ，否则返回 false 。
 * int getFront() )：从双端队列头部获得一个元素。如果双端队列为空，返回 -1 。
 * int getRear() ：获得双端队列的最后一个元素。 如果双端队列为空，返回 -1 。
 * boolean isEmpty() ：若双端队列为空，则返回 true ，否则返回 false  。
 * boolean isFull() ：若双端队列满了，则返回 true ，否则返回 false 。
 *
 * @author fanzhou
 */
public class Question0641 {

    class MyCircularDeque {
        private class DLinkListNode {
            int val;
            DLinkListNode prev;
            DLinkListNode next;

            DLinkListNode(int val) {
                this.val = val;
            }
        }

        private DLinkListNode head;
        private DLinkListNode tail;
        private int capacity;
        private int size;

        public MyCircularDeque(int k) {
            capacity = k;
            size = 0;
        }

        public boolean insertFront(int value) {
            if (isFull()) {
                return false;
            }
            DLinkListNode node = new DLinkListNode(value);
            if (size == 0) {
                head = tail = node;
            } else {
                node.next = head;
                head.prev = node;
                head = node;
            }
            size++;
            return true;
        }

        public boolean insertLast(int value) {
            if (isFull()) {
                return false;
            }
            DLinkListNode node = new DLinkListNode(value);
            if (size == 0) {
                head = tail = node;
            } else {
                tail.next = node;
                node.prev = tail;
                tail = node;
            }
            size++;
            return true;
        }

        public boolean deleteFront() {
            if (size == 0) {
                return false;
            }
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
            return true;
        }

        public boolean deleteLast() {
            if (size == 0) {
                return false;
            }
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
            size--;
            return true;
        }

        public int getFront() {
            if (size == 0) {
                return -1;
            }
            return head.val;
        }

        public int getRear() {
            if (size == 0) {
                return -1;
            }
            return tail.val;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }
    }

}
