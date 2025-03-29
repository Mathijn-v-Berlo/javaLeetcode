package com.mathijnvanberlo.leetcode.arrays_and_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TopKFrequentElements {
    // Given an integer array nums and an integer k,
    // return the k most frequent elements.
    // You may return the answer in any order.

    public int[] topKFrequent(int[] nums, int k) {
	HashMap<Integer, int[]> freqMap = new HashMap<>();

	for (int num: nums) {
	    int[] freq = freqMap.getOrDefault(num, new int[]{num, 0});
	    freq[1]++;
	    freqMap.put(num, freq);
	}

	int[][] freqArrays = freqMap.values().toArray(new int[][]{});
	Arrays.sort(freqArrays, (a, b) -> Integer.compare(b[1], a[1]));

	int[] result = new int[k];
	for (int i = 0; i < k; i++) {
	    result[i] = freqArrays[i][0];
	}
	return result;
    }

    public int[] topKFrequentBucketSort(int[] nums, int k) {
	HashMap<Integer, Integer> freqMap = new HashMap<>();

	for (int num : nums) {
	    int freq = freqMap.getOrDefault(num, 0);
	    freq++;
	    freqMap.put(num, freq);
	}

	ArrayList<Integer>[] bucketSort = new ArrayList[nums.length];
	for (int i = 0; i < bucketSort.length; i++) bucketSort[i] = new ArrayList<>();

	for (int key : freqMap.keySet()) {
	    bucketSort[freqMap.get(key) - 1].add(key);
	}

	int[] result = new int[k];
	int found = 0;
	for (int i = nums.length - 1; i >= 0; i--) {
	    for (int num : bucketSort[i]) {
		result[found] = num;
		found++;
		if (found == k) return result;
	    }
	}
	return result;
    }
}
