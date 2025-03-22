package com.mathijnvanberlo.leetcode.arrays_and_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            String sortedString = sortedString(str);

            if (!anagramMap.containsKey(sortedString)) {
                anagramMap.put(sortedString, new ArrayList<String>());
            }

            anagramMap.get(sortedString).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }

    private String sortedString(String str) {
        char[] strAsCharArray = str.toCharArray();
        Arrays.sort(strAsCharArray);
        return new String(strAsCharArray);
    }
}
