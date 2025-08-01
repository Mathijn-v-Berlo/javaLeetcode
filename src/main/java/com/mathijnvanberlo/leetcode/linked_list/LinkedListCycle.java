package com.mathijnvanberlo.leetcode.linked_list;

public class LinkedListCycle {
/*
    Given head, the head of a linked list, determine if the linked list has a cycle in it.

    There is a cycle in a linked list if there is some node in the list that can be reached
    again by continuously following the next pointer. Internally, pos is used to denote the
    index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

    Return true if there is a cycle in the linked list. Otherwise, return false.
*/
    public boolean hasCycle(ListNode head) {
        // Easy solution, kind of exploiting the constraints by Leetcode, as node.val can't be higher than 100000
        if (head == null) return false;

        while (head.next != null) {
            if (head.val == 100001) return true;
            head.val = 100001;
            head = head.next;
        }
        return false;
    }

    public boolean hasCycleFloydTortoiseHare(ListNode head) {
        // Using the Floyd's Tortoise & Hare algorithm
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }
}
