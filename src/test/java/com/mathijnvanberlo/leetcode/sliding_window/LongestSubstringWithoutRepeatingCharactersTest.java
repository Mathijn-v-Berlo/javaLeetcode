package com.mathijnvanberlo.leetcode.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    void testLengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters =
                new LongestSubstringWithoutRepeatingCharacters();

        String input = "abcabcbb";
        int output = 3;
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringSlidingWindow(input));

        input = "bbbbb";
        output = 1;
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringSlidingWindow(input));

        input = "pwwkew";
        output = 3;
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringSlidingWindow(input));

        input = "zxyzxyz";
        output = 3;
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringSlidingWindow(input));

        input = "xxxx";
        output = 1;
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringSlidingWindow(input));

        input = "";
        output = 0;
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringSlidingWindow(input));

        input = "dvdf";
        output = 3;
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input));
        assertEquals(output, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstringSlidingWindow(input));
    }
}