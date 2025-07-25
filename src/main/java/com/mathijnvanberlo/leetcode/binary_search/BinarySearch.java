package com.mathijnvanberlo.leetcode.binary_search;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int top = nums.length;
        int bottom = 0;

        while (top >= bottom && top >= 0 && bottom < nums.length) {
            int middle = (top + bottom) / 2;
            if (nums[middle] == target) return middle;

            if (nums[middle] > target) top = middle - 1;
            if (nums[middle] < target) bottom = middle + 1;
        }

        return -1;
    }
}