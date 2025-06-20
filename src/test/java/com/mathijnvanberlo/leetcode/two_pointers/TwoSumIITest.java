package com.mathijnvanberlo.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIITest {
    @Test
    void testTwoSum() {
        runTestTwoSum(new int[] {2, 7, 11, 15}, 9, new int[] {1, 2});
        runTestTwoSum(new int[] {2, 3, 4}, 6, new int[] {1, 3});
        runTestTwoSum(new int[] {-1, 0}, -1, new int[] {1, 2});
        runTestTwoSum(new int[] {1, 2, 3, 4}, 3, new int[] {1, 2});
        int[] input = {12, 13, 23, 28, 43, 44, 59, 60, 61, 68, 70, 86, 88, 92, 124, 125, 136, 168, 173, 173, 180, 199, 212, 221, 227, 230, 277, 282, 306, 314, 316, 321, 325, 328, 336, 337, 363, 365, 368, 370, 370, 371, 375, 384, 387, 394, 400, 404, 414, 422, 422, 427, 430, 435, 457, 493, 506, 527, 531, 538, 541, 546, 568, 583, 585, 587, 650, 652, 677, 691, 730, 737, 740, 751, 755, 764, 778, 783, 785, 789, 794, 803, 809, 815, 847, 858, 863, 863, 874, 887, 896, 916, 920, 926, 927, 930, 933, 957, 981, 997};
        runTestTwoSum(input, 542, new int[]{24, 32});
    }

    void runTestTwoSum(int[] numbers, int target, int[] expectedResult) {
        TwoSumII twoSumII = new TwoSumII();
        int[] result = twoSumII.twoSum(numbers, target);
        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], result[i], String.valueOf(target));
        }
    }
}