package com.fanschou.leetcodecn.solution;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @title [735] 行星碰撞
 *
 * @description https://leetcode.cn/problems/asteroid-collision/
 *
 * 给定一个整数数组 asteroids，表示在同一行的行星。
 *
 * 对于数组中的每一个元素，其绝对值表示行星的大小，正负表示行星的移动方向（正表示向右移动，负表示向左移动）。每一颗行星以相同的速度移动。
 *
 * 找出碰撞后剩下的所有行星。碰撞规则：两个行星相互碰撞，较小的行星会爆炸。如果两颗行星大小相同，则两颗行星都会爆炸。两颗移动方向相同的行星，永远不会发生碰撞。
 *
 * @author fanzhou
 */
public class Question0735 {

    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int asteroid : asteroids) {
            boolean alive = true;
            while (alive && !stack.isEmpty() && stack.peekLast() > 0 && asteroid < 0){
                alive = stack.peekLast() < -asteroid;
                if(stack.peekLast() <= - asteroid){
                    stack.pollLast();
                }
            }
            if(alive){
                stack.addLast(asteroid);
            }
        }

        int size = stack.size();
        int[] ans = new int[size];
        while (!stack.isEmpty()){
            ans[--size] = stack.pollLast();
        }
        return ans;
    }
}
