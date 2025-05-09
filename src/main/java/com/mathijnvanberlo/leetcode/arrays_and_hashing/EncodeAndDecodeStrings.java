package com.mathijnvanberlo.leetcode.arrays_and_hashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    public String encode(List<String> strs) {
		StringBuilder encodedStringBuilder = new StringBuilder();

		for (String str : strs) {
			encodedStringBuilder.append(str.length());
			encodedStringBuilder.append("#");
			encodedStringBuilder.append(str);
		}
		return encodedStringBuilder.toString();
    }

    public List<String> decode(String str) {
		ArrayList<String> decodedStrings = new ArrayList<>();

		int nextIndex = 0;
		while ((nextIndex = str.indexOf("#")) != -1) {
			int lengthOfString = Integer.parseInt(str.substring(0, nextIndex));
			String nextString = str.substring(nextIndex + 1, lengthOfString + nextIndex + 1);
			decodedStrings.add(nextString);
			str = str.substring(nextIndex + lengthOfString + 1);
		}

		return decodedStrings;
    }
}
