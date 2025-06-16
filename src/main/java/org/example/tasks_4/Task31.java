package org.example.tasks_4;

public class Task31 {

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 1) return;

        int len = nums.length;
        int start = nums.length - 1;

        for (int i = len - 2; i >= 0; i--) {
            if (nums[start] <= nums[i]) {
                start = i;
            } else {
                break;
            }
        }

        for (int i = 0; i < (len - start) / 2; i++) {
            int first = start + i;
            int last = len - 1 - i;

            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
        }

        if (start == 0) return;

        for (int i = start; i < len; i++) {
            if (nums[i] > nums[start - 1]) {
                int temp = nums[i];
                nums[i] = nums[start - 1];
                nums[start - 1] = temp;
                break;
            }
        }
    }
}
