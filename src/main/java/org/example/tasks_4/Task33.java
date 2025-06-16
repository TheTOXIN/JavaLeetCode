package org.example.tasks_4;

public class Task33 {

    public int search(int[] nums, int target) {
        int result = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return mid;

            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target <= nums[end] && target >= nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return result;
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int i = (start + end) / 2;

            if (target == nums[i]) {
                return i;
            } else if (target > nums[i]) {
                start = i + 1;
            } else {
                end = i - 1;
            }
        }

        return -1;
    }
}
