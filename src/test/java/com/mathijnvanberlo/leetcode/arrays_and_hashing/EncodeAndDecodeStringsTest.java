package com.mathijnvanberlo.leetcode.arrays_and_hashing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EncodeAndDecodeStringsTest {

    @Test
    void encodeAndDecodeStringsTest() {
		runEncodeAndDecodeStringsTest(List.of("neet", "code", "love", "you"));
		runEncodeAndDecodeStringsTest(List.of("we", "say", ":", "yes"));
    }

    private void runEncodeAndDecodeStringsTest(List<String> input) {
		EncodeAndDecodeStrings encodeAndDecodeStrings = new EncodeAndDecodeStrings();
		String encodedString = encodeAndDecodeStrings.encode(input);
		List<String> decodedOutput = encodeAndDecodeStrings.decode(encodedString);

		for (int i = 0; i < input.size(); i++) {
			assertEquals(input.get(i), decodedOutput.get(i), "We expect decoded string to be identical to the input");
		}
	}
}
