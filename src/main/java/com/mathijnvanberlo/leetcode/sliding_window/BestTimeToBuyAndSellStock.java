package com.mathijnvanberlo.leetcode.sliding_window;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int bestBuy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
            bestBuy = Math.min(bestBuy, prices[i]);
        }

        return maxProfit;
    }
}
