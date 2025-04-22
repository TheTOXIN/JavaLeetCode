package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers,
 * return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 */
public class Task18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int l = j + 1;
                int r = nums.length - 1;

                while (l < r) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r] ;

                    if (sum < target) {
                        l++;
                    } else if (sum > target) {
                        r--;
                    } else {
                        res.add(List.of(nums[i], nums[j], nums[l], nums[r]));

                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;

                        l++;
                        r--;
                    }
                }
            }
        }

        return res;
    }
}
