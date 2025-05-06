package org.example.utils;

import java.util.Arrays;
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

    public static ListNode generateNodeList(Integer... ints) {
        return generateNodeList(Arrays.asList(ints));
    }

    public static ListNode generateNodeList(List<Integer> list) {
        if (list == null || list.isEmpty()) return null;

        ListNode head = new ListNode();
        ListNode temp = head;

        for (Integer integer : list) {
            temp.next = new ListNode(integer);
            temp = temp.next;
        }

        return head.next;
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

    public static <T extends Comparable<? super T>> boolean compareToList(List<T> list1, List<T> list2) {
        if (list1 == null || list2 == null) {
            return list1 == list2;
        }

        if (list1.size() != list2.size()) {
            return false;
        }

        List<T> copy1 = List.copyOf(list1);
        List<T> copy2 = List.copyOf(list2);

        List<T> sorted1 = copy1.stream().sorted().toList();
        List<T> sorted2 = copy2.stream().sorted().toList();

        return sorted1.equals(sorted2);
    }
}
