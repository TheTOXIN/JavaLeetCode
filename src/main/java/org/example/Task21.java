package org.example;

import org.example.utils.ListNode;

/**
 * Вам даны указатели на головы двух отсортированных связных списков list1 и list2.
 * <p>
 * Объедините оба списка в один отсортированный список.
 * Список должен быть создан путем объединения узлов первых двух списков.
 * <p>
 * Верните указатель на голову объединенного связного списка.
 */
public class Task21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = new ListNode();
        ListNode temp = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        temp.next = list1 != null ? list1 : list2;

        return head.next;
    }

    public ListNode mergeTwoListsOld(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = new ListNode();
        ListNode temp = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                while (list1 != null && list1.val <= list2.val) {
                    temp.val = list1.val;
                    temp.next = new ListNode();
                    temp = temp.next;
                    list1 = list1.next;
                }
            } else {
                while (list2 != null && list2.val <= list1.val) {
                    temp.val = list2.val;
                    temp.next = new ListNode();
                    temp = temp.next;
                    list2 = list2.next;
                }
            }
        }

        if (list1 == null) {
            while (list2 != null) {
                temp.val = list2.val;
                if (list2.next != null) {
                    temp.next = new ListNode();
                }
                temp = temp.next;
                list2 = list2.next;
            }
        } else {
            while (list1 != null) {
                temp.val = list1.val;
                if (list1.next != null) {
                    temp.next = new ListNode();
                }
                temp = temp.next;
                list1 = list1.next;
            }
        }

        return head;
    }
}
