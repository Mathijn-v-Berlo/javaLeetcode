package com.mathijnvanberlo.leetcode.linked_list;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode newHead = reverseOrder(head);
        head.next = null;
        return newHead;
    }

    private ListNode reverseOrder(ListNode currentNode) {
        if (currentNode.next == null) return currentNode;

        ListNode next = currentNode.next;
        ListNode lastNode = reverseOrder(next);
        next.next = currentNode;
        return lastNode;
    }
}
