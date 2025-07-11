package com.mathijnvanberlo.leetcode.sliding_window;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int lengthOfLongestSubstring = 0;
        char[] chars = s.toCharArray();
        StringBuilder subStringBuilder = new StringBuilder();

        for (Character currentChar: chars) {
            String currentCharString = currentChar.toString();
            int indexFound = subStringBuilder.indexOf(currentCharString);
            if (indexFound >= 0) {
                lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, subStringBuilder.length());
                subStringBuilder.delete(0, indexFound + 1);
            }
            subStringBuilder.append(currentCharString);
        }
        return Math.max(lengthOfLongestSubstring, subStringBuilder.length());
    }
}
