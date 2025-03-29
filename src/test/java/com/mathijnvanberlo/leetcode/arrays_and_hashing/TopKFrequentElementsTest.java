package com.mathijnvanberlo.leetcode.arrays_and_hashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TopKFrequentElementsTest {
    // Given an integer array nums and an integer k,
    // return the k most frequent elements.
    // You may return the answer in any order.

    @Test
    void topKFrequentElementsTest() {
	
	int[] input = new int[] { 1 };
	int[] result = sortedResults(input, 1);
	assertEquals(1, result[0], "We expect result to be {1}");
	result = sortedResultsBucketSort(input, 1);
	assertEquals(1, result[0], "We expect result to be {1}");
	
	input = new int[] { 1, 1, 1, 2, 2, 3 };
	result = sortedResults(input, 2);
	assertEquals(1, result[0], "We expect result to be {1, 2}");
	assertEquals(2, result[1], "We expect result to be {1, 2}");
	result = sortedResultsBucketSort(input, 2);
	assertEquals(1, result[0], "We expect result to be {1, 2}");
	assertEquals(2, result[1], "We expect result to be {1, 2}");

	input = new int[] { 1, 2, 2, 3, 3 };
	result = sortedResults(input, 2);
	assertEquals(2, result[0], "We expect result to be {2, 3}");
	assertEquals(3, result[1], "We expect result to be {2, 3}");
	result = sortedResultsBucketSort(input, 2);
	assertEquals(2, result[0], "We expect result to be {2, 3}");
	assertEquals(3, result[1], "We expect result to be {2, 3}");
    }

    private int[] sortedResults(int[] input, int k) {
	int[] result = result(input, k);
	Arrays.sort(result);
	return result;
    }

    private int[] sortedResultsBucketSort(int[] input, int k) {
	int[] result = resultBucketSort(input, k);
	Arrays.sort(result);
	return result;
    }

    private int[] result(int[] input, int k) {
	TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
	return topKFrequentElements.topKFrequent(input, k);
    }

    private int[] resultBucketSort(int[] input, int k) {
	TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
	return topKFrequentElements.topKFrequentBucketSort(input, k);
    }
}
