package org.example.utils;

import java.util.List;

public class Util {

    public static int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] nums = new int[m + n];
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (i >= 0 || j >= 0) {
            if (i >= 0 && (j < 0 || nums1[i] >= nums2[j])) {
                nums[k--] = nums1[i--];
            } else if (i < 0 || nums1[i] <= nums2[j]) {
                nums[k--] = nums2[j--];
            }
        }

        return nums;
    }

    public static ListNode generateNodeList(List<Integer> list) {
        if (list == null || list.size() == 0) return null;
        ListNode head = new ListNode();
        ListNode prev = null;
        for (int j = 0; j < list.size(); j++) {
            Integer i = list.get(j);
            if (prev == null) {
                if (j != list.size() - 1) {
                    prev = new ListNode();
                }
                head.val = i;
                head.next = prev;
            } else {
                prev.val = i;
                if (j != list.size() - 1) {
                    prev.next = new ListNode();
                }
                prev = prev.next;
            }
        }
        return head;
    }

    public static boolean compareNodes(ListNode head1, ListNode head2) {
        if (!((head1 == null && head2 == null) || (head1 != null && head2 != null))) {
            return false;
        }

        while (head1 != null && head2 != null) {
            if (head1.val != head2.val) {
                return false;
            }

            head1 = head1.next;
            head2 = head2.next;
        }

        return head1 == null && head2 == null;
    }

    public static void printListNode(ListNode actual) {
        while (actual != null) {
            System.out.print(actual.val + " ");
            actual = actual.next;
        }
        System.out.println();
    }
}
