package org.example.tasks_01;

public class Task4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int i = m - 1, j = n - 1, k = m + n - 1;
        int[] nums = new int[m + n];

        while (i >= 0 || j >= 0) {
            if (i >= 0 && (j < 0 || nums1[i] >= nums2[j])) {
                nums[k--] = nums1[i--];
            } else if (i < 0 || nums1[i] <= nums2[j]) {
                nums[k--] = nums2[j--];
            }
        }

        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2d;
        } else {
            return nums[nums.length / 2];
        }
    }

    public double findMedianSortedArraysSolution(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int n = n1 + n2;
        int[] arr = new int[n];

        // Merge two sorted arrays
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1
        while (i < n1) {
            arr[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2
        while (j < n2) {
            arr[k++] = nums2[j++];
        }

        // Find the median
        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2] + arr[(n / 2) - 1]) / 2.0;
        }
    }
}
