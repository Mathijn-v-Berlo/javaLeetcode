package com.mathijnvanberlo.leetcode.linked_list;

import org.junit.jupiter.api.Test;

class MergeTwoSortedLinkedListsTest {
    @Test
    void testMergeTwoLists() {
        assertTwoListsMerged(new int[]{1, 2, 4}, new int[]{1, 3, 5}, new int[]{1, 1, 2, 3, 4, 5});

        assertTwoListsMerged(new int[]{}, new int[]{1, 2}, new int[]{1, 2});

        assertTwoListsMerged(new int[]{}, new int[]{}, new int[]{});
    }

    void assertTwoListsMerged(int[] values1, int[] values2, int[] expectedValues) {
        MergeTwoSortedLinkedLists mergeTwoSortedLinkedLists = new MergeTwoSortedLinkedLists();

        ListNode list1 = ListNode.FromArray(values1);
        ListNode list2 = ListNode.FromArray(values2);
        ListNode mergedList = mergeTwoSortedLinkedLists.mergeTwoLists(list1, list2);
        LinkedListTest.AssertLinkedList(expectedValues, mergedList);
    }
}