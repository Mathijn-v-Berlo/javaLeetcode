package com.mathijnvanberlo.leetcode.arrays_and_hashing;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    @Test
    void groupAnagramsTest() {
        String[] input = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> result = sortedResults(input);
        assertEquals(1, result.get(0).size(), "GroupanagramsTest 1: We expect a group of 1 anagrams at index 1");
        assertEquals(2, result.get(1).size(), "GroupanagramsTest 1: We expect a group of 2 anagrams at index 2");
        assertEquals(3, result.get(2).size(), "GroupanagramsTest 1: We expect a group of 3 anagram at index 3");

        input = new String[] { "" };
        result = sortedResults(input);
        assertEquals(1, result.get(0).size(), "GroupanagramsTest 2: We expect a group of 1 anagrams at index 1");

        input = new String[] { "a" };
        result = sortedResults(input);
        assertEquals(1, result.get(0).size(), "GroupanagramsTest 3: We expect a group of 1 anagrams at index 1");

        input = new String[] { "eat", "tea", "tan", "ate", "nat", "bat", "eatm" };
        result = sortedResults(input);
        assertEquals(1, result.get(0).size(), "GroupanagramsTest 4: We expect a group of 1 anagrams at index 1");
        assertEquals(1, result.get(1).size(), "GroupanagramsTest 4: We expect a group of 1 anagrams at index 2");
        assertEquals(2, result.get(2).size(), "GroupanagramsTest 4: We expect a group of 2 anagram at index 3");
        assertEquals(3, result.get(3).size(), "GroupanagramsTest 4: We expect a group of 3 anagram at index 4");
    }

    private List<List<String>> sortedResults(String[] input) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> result = groupAnagrams.groupAnagrams(input);
        result.sort(Comparator.comparingInt(List::size));
        return result;
    }
}