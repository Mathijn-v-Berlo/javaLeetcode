package com.mathijnvanberlo.leetcode.two_pointers;

import java.util.Locale;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int endPointer = s.length() - 1;
        int startPointer = 0;
        char[] chars = s.toLowerCase().toCharArray();

        while (startPointer < endPointer) {
            char start = s.charAt(startPointer);
            if (!Character.isLetterOrDigit(start)) {
                startPointer++;
                continue;
            }

            char end = s.charAt(endPointer);
            if (!Character.isLetterOrDigit(end)) {
                endPointer--;
                continue;
            }

            if (start != end) return false;

            startPointer++;
            endPointer--;
        }
        return true;
    }
}
