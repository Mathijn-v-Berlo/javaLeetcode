package com.mathijnvanberlo.leetcode.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchRotatedSortedArrayTest {
    @Test
    void testSearchRotatedSortedArray() {
        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();
        int[] nums;
        int target;
        int expectedOutput;

        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        target = 0;
        expectedOutput = 4;
        assertEquals(expectedOutput, searchRotatedSortedArray.search(nums, target));

        target = 3;
        expectedOutput = -1;
        assertEquals(expectedOutput, searchRotatedSortedArray.search(nums, target));

        nums = new int[]{1};
        target = 0;
        assertEquals(expectedOutput, searchRotatedSortedArray.search(nums, target));

        nums = new int[]{3, 4, 5, 6, 1, 2};
        target = 1;
        expectedOutput = 4;
        assertEquals(expectedOutput, searchRotatedSortedArray.search(nums, target));

        nums = new int[]{3, 5, 6, 0, 1, 2};
        target = 4;
        expectedOutput = -1;
        assertEquals(expectedOutput, searchRotatedSortedArray.search(nums, target));

        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        target = 2;
        expectedOutput = 1;
        assertEquals(expectedOutput, searchRotatedSortedArray.search(nums, target));

        target = 9;
        expectedOutput = 8;
        assertEquals(expectedOutput, searchRotatedSortedArray.search(nums, target));

        nums = new int[]{5, 1, 2, 3, 4};
        target = 1;
        expectedOutput = 1;
        assertEquals(expectedOutput, searchRotatedSortedArray.search(nums, target));

        nums = new int[]{2, 3, 4, 5, 1};
        target = 5;
        expectedOutput = 3;
        assertEquals(expectedOutput, searchRotatedSortedArray.search(nums, target));
    }
}