package org.example.tasks_2;

import org.example.utils.ListNode;

/**
 * Вам дан указатель head связного списка,
 * удалите nый узел с конца списка
 * и верните указатель на голову списка.
 */
public class Task19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 1 && head.next == null) return null;

        int r = remover(head, n);

        if (r == 0) return head.next;

        return head;
    }

    public int remover(ListNode node, int n) {
        if (node == null) return n;

        int r = remover(node.next, n);

        if (r == 0) {
            node.next = node.next != null ? node.next.next : null;
            return -1;
        } else if (r > 0) {
            return r - 1;
        }

        return r;
    }
}
