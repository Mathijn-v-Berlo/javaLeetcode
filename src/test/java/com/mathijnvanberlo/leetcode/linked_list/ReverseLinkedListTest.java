package com.mathijnvanberlo.leetcode.linked_list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void testReverseLinkedList1() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListNode head = ListNode.FromArray(new int[]{1, 2, 3, 4, 5});
        head = reverseLinkedList.reverseList(head);
        LinkedListTest.AssertLinkedList(new int[]{5, 4, 3, 2, 1}, head);

        head = ListNode.FromArray(new int[]{1, 2});
        head = reverseLinkedList.reverseList(head);
        LinkedListTest.AssertLinkedList(new int[]{2, 1}, head);

        head = null;
        LinkedListTest.AssertLinkedList(new int[]{}, null);
    }
}