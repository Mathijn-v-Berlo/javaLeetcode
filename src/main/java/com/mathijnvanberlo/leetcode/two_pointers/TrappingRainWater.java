package com.mathijnvanberlo.leetcode.two_pointers;

import java.util.HashMap;

public class TrappingRainWater {
    public int trap(int[] height) {
        // Prefix & suffix, this solution works
        int trappedArea = 0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];

        int currentMax = 0;
        for (int i = 0; i < height.length; i++) {
            maxLeft[i] = currentMax;
            currentMax = Math.max(currentMax, height[i]);
        }

        currentMax = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            maxRight[i] = currentMax;
            currentMax = Math.max(currentMax, height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            int bucketHeight = Math.min(maxLeft[i], maxRight[i]);
            trappedArea += Math.max(0, bucketHeight - height[i]);
        }
        return trappedArea;
    }

    public int trapWithPointers(int[] height) {
        // With Pointers, optimised memory
        int trappedArea = 0;
        if (height.length < 2) return trappedArea;
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                trappedArea += Math.max(0, leftMax - height[left]);
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                trappedArea += Math.max(0, rightMax - height[right]);
            }
        }
        return trappedArea;
    }
}