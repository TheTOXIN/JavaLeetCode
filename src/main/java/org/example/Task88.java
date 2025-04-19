package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 7, 0, 0};
        int[] nums2 = {2, 6};
        merge3(nums1, 3, nums2, 2);
        System.out.println("nums1 = " + java.util.Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;

        for (int i = 0; i < n; i++) {
            int n2 = nums2[i];

            for (int j = k; j < m + n; j++) {
                int n1 = nums1[j];

                if (n2 < n1) {
                    nums1[j] = n2;

                    for (int l = nums1.length - 1; l > j; l--) {
                        nums1[l] = nums1[l - 1];
                    }

                    nums1[j + 1] = n1;

                    k = j + 1;
                    break;
                } else if (j >= m + i) {
                    nums1[j] = n2;

                    k = j + 1;
                    break;
                }
            }
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int firstPointer = m - 1;
        int secondPointer = n - 1;
        int emptyPointer = m + n - 1;

        while (firstPointer >= 0 && secondPointer >= 0) {
            if (nums1[firstPointer] > nums2[secondPointer]) {
                nums1[emptyPointer] = nums1[firstPointer];
                firstPointer--;
                emptyPointer--;
            } else {
                nums1[emptyPointer] = nums2[secondPointer];
                secondPointer--;
                emptyPointer--;
            }
        }

        // Can be returned.
        if (secondPointer < 0) {
            return;
        }

        // Copy elements from second as per the emptyPointer
        while (emptyPointer >= 0 && secondPointer >= 0) {
            nums1[emptyPointer] = nums2[secondPointer];
            emptyPointer--;
            secondPointer--;
        }
    }

    public static void merge3(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0)
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
    }
}