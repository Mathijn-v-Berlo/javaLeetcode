package com.mathijnvanberlo.leetcode.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {
    @Test
    void testMaxProfit() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] prices = {7, 1, 5, 3, 6, 4};
        int output = 5;
        assertEquals(output, bestTimeToBuyAndSellStock.maxProfit(prices));

        prices = new int[]{7, 6, 4, 3, 1};
        output = 0;
        assertEquals(output, bestTimeToBuyAndSellStock.maxProfit(prices));

        prices = new int[]{10, 1, 5, 6, 7, 1};
        output = 6;
        assertEquals(output, bestTimeToBuyAndSellStock.maxProfit(prices));

        prices = new int[]{10, 8, 7, 5, 2};
        output = 0;
        assertEquals(output, bestTimeToBuyAndSellStock.maxProfit(prices));
    }
}