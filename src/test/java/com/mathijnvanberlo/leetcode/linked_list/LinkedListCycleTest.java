package com.mathijnvanberlo.leetcode.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {
    @Test
    void testHasCycle() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        ListNode head;

        head = ListNode.FromArray(new int[]{1, 2, 3, 4});
        head.CreateCycle(1);
        assertEquals(true, linkedListCycle.hasCycle(head));

        head = ListNode.FromArray(new int[]{1, 2});
        assertEquals(false, linkedListCycle.hasCycle(head));

        head = ListNode.FromArray(new int[]{3, 2, 0, -4});
        head.CreateCycle(1);
        assertEquals(true, linkedListCycle.hasCycle(head));

        head = ListNode.FromArray(new int[]{1, 2});
        head.CreateCycle(0);
        assertEquals(true, linkedListCycle.hasCycle(head));

        head = ListNode.FromArray(new int[]{0, 5, 1, 4, 3, 2});
        head.CreateCycle(1);
        assertEquals(true, linkedListCycle.hasCycle(head));

        assertEquals(false, linkedListCycle.hasCycle(null));

        head = ListNode.FromArray(new int[]{-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5});
        assertEquals(false, linkedListCycle.hasCycle(head));
    }
}