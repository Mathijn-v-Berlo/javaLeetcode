package com.mathijnvanberlo.leetcode.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {
    @Test
    void testFindMin() {
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();

        int[] input = {3, 4, 5, 1, 2};
        int result = findMinimumInRotatedSortedArray.findMin(input);
        assertEquals(1, result);

        input = new int[]{4, 5, 6, 7, 0, 1, 2};
        result = findMinimumInRotatedSortedArray.findMin(input);
        assertEquals(0, result);

        input = new int[]{11, 13, 15, 17};
        result = findMinimumInRotatedSortedArray.findMin(input);
        assertEquals(11, result);

        input = new int[]{3, 4, 5, 6, 1, 2};
        result = findMinimumInRotatedSortedArray.findMin(input);
        assertEquals(1, result);

        input = new int[]{4, 5, 0, 1, 2, 3};
        result = findMinimumInRotatedSortedArray.findMin(input);
        assertEquals(0, result);

        input = new int[]{4, 5, 6, 7};
        result = findMinimumInRotatedSortedArray.findMin(input);
        assertEquals(4, result);

        input = new int[]{2, 1};
        result = findMinimumInRotatedSortedArray.findMin(input);
        assertEquals(1, result);
    }
}