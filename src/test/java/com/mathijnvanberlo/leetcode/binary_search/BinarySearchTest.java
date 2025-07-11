package com.mathijnvanberlo.leetcode.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testBinarySearch() {
        BinarySearch binarySearch = new BinarySearch();

        int[] input = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int expectedOutput = 4;
        assertEquals(expectedOutput, binarySearch.search(input, target));

        target = 2;
        expectedOutput = -1;
        assertEquals(expectedOutput, binarySearch.search(input, target));

        input = new int[]{0};
        target = 0;
        expectedOutput = 0;
        assertEquals(expectedOutput, binarySearch.search(input, target));

        target = 1;
        expectedOutput = -1;
        assertEquals(expectedOutput, binarySearch.search(input, target));

        input = new int[]{2,5};
        target = 2;
        expectedOutput = 0;
        assertEquals(expectedOutput, binarySearch.search(input, target));
    }
}