package com.mathijnvanberlo.leetcode.two_pointers;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();
        int length = nums.length;
        for (int left = 0; left < length - 2; left++) {
            for (int middle = left + 1; middle < length -1; middle++) {
                for (int right = middle + 1; right < length; right++) {
                    int sum = nums[left] + nums[middle] + nums[right];
                    if (sum == 0)  {
                        result.add(List.of(nums[left], nums[middle], nums[right]));
                    }
                    if (sum > 0) break;
                }
            }
        }
        return result.stream().toList();
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int startIndex = 0; startIndex < nums.length - 2; startIndex++) {
            if (!result.isEmpty() &&
                    result.get(result.size() - 1).get(0) == nums[startIndex]) {
                continue;
            }
        }
    }
}

