package com.mathijnvanberlo.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    @Test
    void testThreeSum() {
        int[] input;
        int[][] expectedResult;

        input = new int[] {-1, 0, 1, 2, -1, -4};
        expectedResult = new int[][]{{-1, -1, 2}, {-1, 0, 1}};
        runTestThreeSum(input, expectedResult);

        input = new int[]{0, 1, 1};
        expectedResult = new int[][] {};
        runTestThreeSum(input, expectedResult);

        input = new int[]{0, 0, 0};
        expectedResult = new int[][] {{0, 0, 0}};
        runTestThreeSum(input, expectedResult);

        input = new int[]{1, 2, -2, -1};
        expectedResult = new int[][] {};
        runTestThreeSum(input, expectedResult);
    }

    void runTestThreeSum(int[] input, int[][] expectedResult) {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(input);
        assertEquals(expectedResult.length, result.size(), "Expected: " + expectedResult.length + ". Actual size: " + result.size());
        for (int index = 0; index < expectedResult.length; index++) {
            for (int numIndex = 0; numIndex < expectedResult[index].length; numIndex++) {
                assertEquals(expectedResult[index][numIndex], result.get(index).get(numIndex));
            }
        }
    }
}