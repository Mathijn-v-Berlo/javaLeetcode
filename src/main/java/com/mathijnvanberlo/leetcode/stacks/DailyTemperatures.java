package com.mathijnvanberlo.leetcode.stacks;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] result = new int[len];
        Stack<Integer> temperatureStack = new Stack<>();
        Stack<Integer> indexStack = new Stack<>();
        for (int i = 0; i < len; i++) {
            int temperature = temperatures[i];
            while (!temperatureStack.isEmpty() && temperatureStack.peek() < temperature) {
                int poppedIndex = indexStack.pop();
                result[poppedIndex] = i - poppedIndex;
                temperatureStack.pop();
            }
            temperatureStack.push(temperature);
            indexStack.push(i);
        }
        return result;
    }
}
