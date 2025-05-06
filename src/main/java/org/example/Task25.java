package org.example;

import org.example.utils.ListNode;
import org.example.utils.Util;

public class Task25 {

    public ListNode reverse(ListNode start, ListNode end) {
        ListNode prev = null, next, cur = start;

        while (cur != end) {
            next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;
        }

        end.next = prev;

        return end;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) return head;

        ListNode temp = head, last = head, prev = null;
        int count = 1;

        while (temp != null && temp.next != null) {
            temp = temp.next;
            count++;

            if (count % k == 0) {
                ListNode next = temp.next;
                ListNode reverse = reverse(last, temp);

                if (count == k) head = reverse;
                if (prev != null) prev.next = temp;

                prev = last;
                temp = next;
                last = next;

                count++;
            }
        }

        if (prev != null) prev.next = last;

        return head;
    }

    public ListNode reverseKGroupTemp(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode temp = head;
        int count = 1;

        while (temp.next != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (count < k) return head;

        ListNode reverse = reverse(head, temp);

        Util.printListNode(reverse);

        return reverse;
    }
}
