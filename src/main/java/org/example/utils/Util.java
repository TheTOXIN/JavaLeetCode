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

    public static ListNode generate(List<Integer> list) {
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
}
