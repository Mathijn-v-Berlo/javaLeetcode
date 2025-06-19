package com.mathijnvanberlo.leetcode.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {

    @Test
    void testDailyTemperatures() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expectedOutput = {1, 1, 4, 2, 1, 1, 0, 0};
        runTestDailyTemperatures(temperatures, expectedOutput);

        temperatures = new int[]{30, 40, 50, 60};
        expectedOutput = new int[]{1, 1, 1, 0};
        runTestDailyTemperatures(temperatures, expectedOutput);

        temperatures = new int[]{30, 60, 90};
        expectedOutput = new int[]{1, 1, 0};
        runTestDailyTemperatures(temperatures, expectedOutput);

    }

    void runTestDailyTemperatures(int[] temperatures, int[] expectedOutput) {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] result = dailyTemperatures.dailyTemperatures(temperatures);

        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], result[i]);
        }
    }
}