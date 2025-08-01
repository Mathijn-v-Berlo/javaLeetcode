package com.mathijnvanberlo.leetcode.binary_search;

public class SearchRotatedSortedArray {
    /*
    * There is an integer array nums sorted in ascending order (with distinct values).
    *
    * Prior to being passed to your function, nums is possibly rotated at an unknown
    * pivot index k (1 <= k < nums.length) such that the resulting array is
    * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
    * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
    *
    * Given the array nums after the possible rotation and an integer target,
    * return the index of target if it is in nums, or -1 if it is not in nums.
    *
    * You must write an algorithm with O(log n) runtime complexity.
    *
    * Constraints:
    * 1 <= nums.length <= 5000
    * -104 <= nums[i] <= 104
    * All values of nums are unique.
    * nums is an ascending array that is possibly rotated.
    * -104 <= target <= 104
    * */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] == target) return middle;

            if (shouldShiftLeft(nums, target, left, middle, right)) right = middle - 1;
            else left = middle + 1;
        }
        return -1;
    }

    private boolean shouldShiftLeft(int[] nums, int target, int left, int middle, int right) {
        return (nums[middle] > target && (nums[left] > nums[middle] || nums[left] <= target)) ||
                (nums[middle] < target && nums[right] > nums[middle] && nums[right] < target);
    }
}
