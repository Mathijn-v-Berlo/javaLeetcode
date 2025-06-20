package com.mathijnvanberlo.leetcode.stacks;

import java.util.Stack;

public class LargestRectangleInHistorigram {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> heightIndexStack = new Stack<>();
        heightIndexStack.push(new int[]{0, heights[0]});
        int largestArea = heights[0];
        int length = heights.length;

        for (int i = 1; i < length; i++) {
            if (heightIndexStack.peek()[1] > heights[i]) {
                int[] nextHeightIndex;
                do {
                    nextHeightIndex = heightIndexStack.pop();
                    largestArea = Math.max(largestArea, (i - nextHeightIndex[0]) * nextHeightIndex[1]);
                } while (!heightIndexStack.isEmpty() && heightIndexStack.peek()[1] > heights[i]);
                int index = nextHeightIndex[0];
                heightIndexStack.push(new int[]{index, heights[i]});
            } else {
                heightIndexStack.push(new int[]{i, heights[i]});
            }
        }

        while (!heightIndexStack.isEmpty()) {
            int[] nextHeightIndex = heightIndexStack.pop();
            largestArea = Math.max(largestArea, (length - nextHeightIndex[0]) * nextHeightIndex[1]);
        }
        return largestArea;
    }
}