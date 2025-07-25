package com.mathijnvanberlo.leetcode.linked_list;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode FromArray(int[] values) {
        int length = values.length;
        if (length == 0) return null;

        ListNode node = new ListNode(values[length - 1]);
        for (int i = length - 2; i >= 0; i--) {
            ListNode next = new ListNode(values[i]);
            next.next = node;
            node = next;
        }
        return node;
    }

    public void CreateCycle(int position) {

        ListNode linkedFromEnd = this;
        while (--position >= 0) linkedFromEnd = linkedFromEnd.next;

        ListNode lastNode = linkedFromEnd.next;
        while (lastNode.next != null) lastNode = lastNode.next;

        lastNode.next = linkedFromEnd;

    }
}
