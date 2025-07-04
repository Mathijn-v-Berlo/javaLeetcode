package com.mathijnvanberlo.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    @Test
    void testContainerWithMostWater() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

        assertEquals(1, containerWithMostWater.maxArea(new int[]{1, 1}));

        assertEquals(49, containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));

        assertEquals(8, containerWithMostWater.maxArea(new int[]{1, 2, 3, 4, 3, 2, 1}));

        assertEquals(36, containerWithMostWater.maxArea(new int[]{1, 7, 2, 5, 4, 7, 3, 6}));

        assertEquals(4, containerWithMostWater.maxArea(new int[]{2, 2, 2}));
    }
}