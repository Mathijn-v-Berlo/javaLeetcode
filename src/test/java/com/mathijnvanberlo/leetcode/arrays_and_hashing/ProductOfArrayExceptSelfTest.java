package com.mathijnvanberlo.leetcode.arrays_and_hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void productOfArrayExceptSelfTest() {
        int[][] inputs = {
                {1, 2, 3, 4},
                {-1, 1, 0, -3, 3}
        };

        int[][] expectedResults = {
                {24, 12, 8, 6},
                {0, 0, 9, 0, 0}
        };

        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

        for (int i = 0; i < inputs.length; i++) {
            int[] expectedResult = expectedResults[i];
            int[] result = productOfArrayExceptSelf.productExceptSelf(inputs[i]);
            testResult(expectedResult, result, i + 1);
            result = productOfArrayExceptSelf.productExceptSelfOptimal(inputs[i]);
            testResult(expectedResult, result, i + 1);
        }
    }

    private void testResult(int[] expectedResult, int[] result, int testNum) {
        for (int j = 0; j < expectedResult.length; j++) {
            int expected = expectedResult[j];
            int actual = result[j];
            String message = "We expect: %d. Actual: %d For test: %d at index %d".formatted(expected, actual, testNum, j);
            assertEquals(expected, actual, message);
        }
    }
}