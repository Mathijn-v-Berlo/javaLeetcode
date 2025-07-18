package com.mathijnvanberlo.leetcode.linked_list;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    public static void AssertLinkedList(int[] expectedValues, ListNode head) {
        for (int expectedValue: expectedValues) {
            assertEquals(expectedValue, head.val);
            head = head.next;
        }
    }
}
