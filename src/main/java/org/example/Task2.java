package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class Task2 {

    @NoArgsConstructor
    @AllArgsConstructor
    public static class ListNode {
        public int val;
        public ListNode next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();

        process(l1, l2, res, false);

        return res;
    }

    private void process(ListNode node1, ListNode node2, ListNode res, Boolean carry) {
        System.out.println("n1=" + (node1 != null ? node1.val : "*") + " : " + "n2=" + (node2 != null ? node2.val : "*"));

        res.val = (node1 != null ? node1.val : 0) + (node2 != null ? node2.val : 0) + (carry ? 1 : 0);
        carry = res.val / 10 > 0;

        if (carry) res.val = res.val % 10;

        if ((node1 == null || node1.next == null) && (node2 == null || node2.next == null) && !carry) {
            return;
        }

        res.next = new ListNode();
        process(node1 != null ? node1.next : null, node2 != null ? node2.next : null, res.next, carry);
    }
}
