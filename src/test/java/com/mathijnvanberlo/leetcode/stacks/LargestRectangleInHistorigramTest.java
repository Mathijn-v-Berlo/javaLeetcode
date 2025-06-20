package com.mathijnvanberlo.leetcode.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestRectangleInHistorigramTest {
    @Test
    void testLargestRectangleArea() {
        LargestRectangleInHistorigram largestRectangleInHistorigram = new LargestRectangleInHistorigram();
        int[] heights;

        heights = new int[] {2, 1, 5, 6, 2, 3};
        assertEquals(10, largestRectangleInHistorigram.largestRectangleArea(heights));

        heights = new int[] {2, 4};
        assertEquals(4, largestRectangleInHistorigram.largestRectangleArea(heights));

        heights = new int[] {1, 1, 1, 1, 1};
        assertEquals(5, largestRectangleInHistorigram.largestRectangleArea(heights));

        heights = new int[] {7, 1, 7, 2, 2, 4};
        assertEquals(8, largestRectangleInHistorigram.largestRectangleArea(heights));
    }
}