package org.example.tasks_01;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            Integer val = map.get(diff);

            if (val != null) {
                return new int[]{val, i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{0, 0};
    }

    public int[] twoSum2(int[] nums, int target) {
        System.gc();
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[] { j - i, j };
                }
            }
        }
        return new int[] {};
    }
}
