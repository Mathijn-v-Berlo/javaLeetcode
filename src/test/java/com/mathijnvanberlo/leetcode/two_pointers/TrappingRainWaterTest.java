package com.mathijnvanberlo.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {
    @Test
    void testTrappingRainWater() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();

        assertEquals(9, trappingRainWater.trap(new int[]{0, 2, 0, 3, 1, 0, 1, 3, 2, 1}));

        assertEquals(6, trappingRainWater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));

        assertEquals(9, trappingRainWater.trap(new int[]{4, 2, 0, 3, 2, 5}));

        assertEquals(1, trappingRainWater.trap(new int[]{5, 4, 1, 2}));
    }
}