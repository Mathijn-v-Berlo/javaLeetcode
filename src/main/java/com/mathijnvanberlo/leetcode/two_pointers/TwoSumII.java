package com.mathijnvanberlo.leetcode.two_pointers;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length - 1;
        while (numbers[0] + numbers[right] > target) right--;

        int left;
        for (left = 0; left < right; left++) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) break;
            if (left == right - 1) {
                right--;
                left = 0;
            }
        }
        return new int[] {left + 1, right + 1};
    }
}
