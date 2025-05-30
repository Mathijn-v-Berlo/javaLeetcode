package com.mathijnvanberlo.leetcode.arrays_and_hashing;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int longest = 1;
        int current = 1;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            int prevNum = nums[i - 1];
            int currentNum = nums[i];
            if (prevNum == currentNum) continue;
            if (prevNum + 1 == currentNum) {
                current += 1;
            }
            else {
                longest = Math.max(longest, current);
                current = 1;
            }
        }
        return Math.max(longest, current);
    }
}
