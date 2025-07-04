package com.mathijnvanberlo.leetcode.two_pointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length -1;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, getArea(minHeight, left, right));
            while (height[left] <= minHeight && left < right) left++;
            while (height[right] <= minHeight && left < right) right--;
        }
        return maxArea;
    }

    private int getArea(int lowestHeight, int left, int right) {
        return (right - left) * lowestHeight;
    }
}
