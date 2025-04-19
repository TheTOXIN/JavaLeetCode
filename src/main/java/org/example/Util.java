package org.example;

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
}
