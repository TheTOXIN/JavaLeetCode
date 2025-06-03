package org.example;

public class Task34 {

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];

        res[0] = -1;
        res[1] = -1;

        if (nums.length == 0) return res;

        int start = 0, end = nums.length - 1;

        while (start <= end) {
            if (nums[start] == target && nums[end] == target) {
                res[0] = start;
                res[1] = end;
                return res;
            }

            int mid = (end - start) / 2 + start;

            if (nums[mid] == target) {
                if (nums[start] != target) {
                    if (nums[mid - 1] != target) {
                        start = mid;
                    } else {
                        start++;
                    }
                }
                if (nums[end] != target) {
                    if (nums[mid + 1] != target) {
                        end = mid;
                    } else {
                        end--;
                    }
                }
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return res;
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
