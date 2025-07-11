package com.mathijnvanberlo.leetcode.sliding_window;

import java.util.HashSet;

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

    public int lengthOfLongestSubstringSlidingWindow(String s) {
        int lengthOfLongestSubstring = 0;
        HashSet<Character> subString = new HashSet<>();
        int left = 0;

        for (char currentChar: s.toCharArray()) {
            while (subString.contains(currentChar)) {
                subString.remove(s.charAt(left));
                left++;
            }
            subString.add(currentChar);
            lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, subString.size());
        }
        return lengthOfLongestSubstring;
    }
}

