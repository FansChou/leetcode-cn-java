package com.fanschou.leetcodecn.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @title [87] 扰乱字符串
 *
 * @description https://leetcode-cn.com/problems/scramble-string/
 *
 * 使用下面描述的算法可以扰乱字符串 s 得到字符串 t ：
 *
 * 如果字符串的长度为 1 ，算法停止
 * 如果字符串的长度 > 1 ，执行下述步骤：
 *
 * 在一个随机下标处将字符串分割成两个非空的子字符串。即，如果已知字符串 s ，则可以将其分成两个子字符串 x 和 y ，且满足 s = x + y
 * 。
 * 随机 决定是要「交换两个子字符串」还是要「保持这两个子字符串的顺序不变」。即，在执行这一步骤之后，s 可能是 s = x + y 或者 s = y +
 * x 。
 * 在 x 和 y 这两个子字符串上继续从步骤 1 开始递归执行此算法。
 *
 * 给你两个 长度相等 的字符串 s1 和 s2，判断 s2 是否是 s1 的扰乱字符串。如果是，返回 true ；否则，返回 false 。
 *
 * @author fanzhou
 */
public class Question0087 {

    private int[][][] flags;
    private String s1;
    private String s2;

    public boolean isScramble(String s1, String s2) {
        int length = s1.length();
        this.flags = new int[length][length][length + 1];
        this.s1 = s1;
        this.s2 = s2;

        return bfs(0, 0, length);
    }

    private boolean bfs(int i1, int i2, int length){
        // 对应的标志位被计算过了，直接返回结果
        if(flags[i1][i2][length] != 0){
            return flags[i1][i2][length] == 1;
        }

        // substring equals,note flag bit, and return true
        if(s1.substring(i1, i1 + length).equals(s2.substring(i2, i2 + length))){
            flags[i1][i2][length] = 1;
            return true;
        }

        // check it that every character's num in two substrings is similar
        if(!checkCharacterSimilar(i1, i2, length)){
            flags[i1][i2][length] = -1;
            return false;
        }

        for (int i = 1; i < length; i++) {
            if(bfs(i1, i2, i) && bfs(i1 + i, i2 + i, length - i)){
                flags[i1][i2][length] = 1;
                return true;
            }

            if(bfs(i1, i2 + length - i, i) && bfs(i1 + i, i2, length - i)){
                flags[i1][i2][length] = 1;
                return true;
            }
        }

        flags[i1][i2][length] = -1;
        return false;
    }

    private boolean checkCharacterSimilar(int i1, int i2, int length){
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i = i1; i < i1 + length; i++) {
            char tmp = s1.charAt(i);
            charCountMap.put(tmp, charCountMap.getOrDefault(tmp, 0) + 1);
        }

        for (int i = i2; i < i2 + length; i++) {
            char tmp = s2.charAt(i);
            charCountMap.put(tmp, charCountMap.getOrDefault(tmp, 0) - 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            int value = entry.getValue();
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}
