package com.fanschou.leetcodecn.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @title [1217] 玩筹码
 *
 * @description https://leetcode.cn/problems/minimum-cost-to-move-chips-to-the-same-position/
 *
 * 有 n 个筹码。第 i 个筹码的位置是 position[i] 。
 *
 * 我们需要把所有筹码移到同一个位置。在一步中，我们可以将第 i 个筹码的位置从 position[i] 改变为:
 *
 * position[i] + 2 或 position[i] - 2 ，此时 cost = 0
 * position[i] + 1 或 position[i] - 1 ，此时 cost = 1
 * 返回将所有筹码移动到同一位置上所需要的 最小代价 。
 *
 * @author fanzhou
 */
public class Question1217 {

    public int minCostToMoveChips(int[] position) {
        int even = 0;
        for (int pos : position) {
            if((pos & 1) == 0){
                even++;
            }
        }
        return Math.min(even, position.length - even);
    }
}
