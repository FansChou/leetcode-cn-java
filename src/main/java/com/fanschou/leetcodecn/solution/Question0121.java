package com.fanschou.leetcodecn.solution;

/**
 * @title [121] 买卖股票的最佳时机
 *
 * @description https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 *
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 * @author fanzhou
 */
public class Question0121 {

    public int maxProfit(int[] prices) {
        int lowestPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i : prices) {
            lowestPrice = Math.min(lowestPrice, i);
            maxProfit = Math.max(maxProfit, i - lowestPrice);
        }
        return maxProfit;
    }
}
