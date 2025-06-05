package org.example.tasks_03;

import org.example.utils.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You must solve the problem without modifying the values in the list's nodes
 * (i.e., only nodes themselves may be changed.)
 */
public class Task24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode node1 = head, node2, node3;
        ListNode prev = null;

        head = head.next;

        while (node1 != null && node1.next != null) {
            node2 = node1.next;
            node3 = node2.next;

            node1.next = node3;
            node2.next = node1;

            if (prev != null) {
                prev.next = node2;
            }

            prev = node1;
            node1 = node3;
        }

        return head;
    }
}
