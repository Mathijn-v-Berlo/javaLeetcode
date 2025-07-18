package com.mathijnvanberlo.leetcode.linked_list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    @Test
    void testReverseLinkedList1() {
        ListNode head = new ListNode(1);
        ListNode node = new ListNode(2);
        head.next = node;
        for (int i = 3; i <= 5; i++) {
            node.next = new ListNode(i);
            node = node.next;
        }

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        head = reverseLinkedList.reverseList(head);
        for (int i = 5; i > 0; i--) {
            System.out.println(head.val);
            assertEquals(i, head.val);
            head = head.next;
        }
    }

    @Test
    void testReverseLinkedList2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        head = reverseLinkedList.reverseList(head);
        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
    }
}