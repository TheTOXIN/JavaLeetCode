package org.example.tasks_2;

import java.util.Arrays;

public class Task16 {

    public int threeSumClosest(int[] nums, int target) {
        int res = 0;
        int min = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                int diff = Math.abs(sum - target);

                if (diff < min) {
                    min = diff;
                    res = sum;
                }

                if (sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    return sum;
                }
            }
        }

        return res;
    }
}
