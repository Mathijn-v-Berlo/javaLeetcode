package com.mathijnvanberlo.leetcode.binary_search;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] < nums[right]) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return nums[left];
    }
}
