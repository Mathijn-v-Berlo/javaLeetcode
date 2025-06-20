package com.mathijnvanberlo.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    @Test
    void testIsPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"), "A man, a plan, a canal: Panama");

        assertTrue(validPalindrome.isPalindrome("Was it a car or a cat I saw?"), "Was it a car or a cat I saw?");

        assertFalse(validPalindrome.isPalindrome("race a car"), "race a car");

        assertTrue(validPalindrome.isPalindrome(" "), " ");

        assertFalse(validPalindrome.isPalindrome("tab a cat"), "tab a cat");

        assertTrue(validPalindrome.isPalindrome(".,"), ".,");
    }

}