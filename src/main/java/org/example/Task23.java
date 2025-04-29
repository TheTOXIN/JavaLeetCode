package org.example;

import org.example.utils.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Вам дан массив lists с k связными списками,
 * каждый связный список отсортирован по возрастанию.
 * Объедините все связные списки в один связный список и верните его.
 */
public class Task23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        List<Integer> list = new ArrayList<>();

        for (ListNode listNode : lists) {
            while (listNode != null) {
                list.add(listNode.val);
                listNode = listNode.next;
            }
        }

        Collections.sort(list);

        ListNode head = new ListNode();
        ListNode temp = head;

        for (Integer integer : list) {
            temp.next = new ListNode(integer);
            temp = temp.next;
        }

        return head.next;
    }

    public ListNode mergeKListsOld(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        return mergeLists(null, lists, 0);
    }

    public ListNode mergeLists(ListNode head, ListNode[] lists, int index) {
        if (index == lists.length) return head;

        ListNode merged = mergeTwoLists(head, lists[index]);

        return mergeLists(merged, lists, index + 1);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        System.out.println("MERGE");
        if (list1 == null && list2 == null) return null;

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = new ListNode(0);
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
}
