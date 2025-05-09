package com.mathijnvanberlo.leetcode.arrays_and_hashing;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;

        int[] prefix = new int[numsLength];
        prefix[0] = 1;
        for (int i = 1; i < numsLength; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }

        int[] suffix = new int[numsLength];
        suffix[numsLength - 1] = 1;
        for (int i = numsLength - 2; i >= 0; i--) {
            suffix[i] = nums[i + 1] * suffix[i + 1];
        }

        int[] result = new int[numsLength];
        for (int i = 0; i < numsLength; i++) {
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }

    public int[] productExceptSelfOptimal(int[] nums) {
        int numsLength = nums.length;
        int[] result = new int[numsLength];
        result[0] = 1;
        for (int i = 1; i < numsLength; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        int postFix = 1;
        for (int i = numsLength - 1; i >= 0; i--) {
            result[i] *= postFix;
            postFix *= nums[i];
        }
        return result;
    }
}
