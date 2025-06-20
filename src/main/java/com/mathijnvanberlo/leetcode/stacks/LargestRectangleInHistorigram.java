package com.mathijnvanberlo.leetcode.stacks;

import java.util.Stack;

public class LargestRectangleInHistorigram {
    public int largestRectangleArea(int[] heights) {
        Stack<HeightIndex> heightIndexStack = new Stack<>();
        int largestArea = 0;
        int length = heights.length;

        for (int index = 0; index < length; index++) {
            int nextIndex = index;
            while (!heightIndexStack.isEmpty() &&
                    heightIndexStack.peek().getHeight() > heights[index]) {
                HeightIndex nextHeightIndex = heightIndexStack.pop();
                largestArea = Math.max(largestArea, nextHeightIndex.calculateArea(index));
                nextIndex = nextHeightIndex.getIndex();
            }
            heightIndexStack.push(new HeightIndex(nextIndex, heights[index]));
        }

        while (!heightIndexStack.isEmpty()) {
            HeightIndex nextHeightIndex = heightIndexStack.pop();
            largestArea = Math.max(largestArea, nextHeightIndex.calculateArea(length));
        }
        return largestArea;
    }

    private class HeightIndex {
        private final int index;
        private final int height;
        public HeightIndex(int index, int height) {
            this.index = index;
            this.height = height;
        }

        public int getIndex() {
            return this.index;
        }

        public int getHeight() {
            return this.height;
        }

        public int calculateArea(int index) {
            return (index - this.index) * this.height;
        }
    }
}
