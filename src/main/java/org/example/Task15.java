package org.example;

import java.util.*;

public class Task15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) continue;

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    res.add(List.of(nums[i], nums[l], nums[r]));

                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    l++;
                    r--;
                }
            }
        }

        return res;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int k = 0; k < nums.length; k++) {
            map.computeIfAbsent(nums[k], n -> new ArrayList<>()).add(k);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> list = map.get(nums[i] + nums[j] * -1);
                if (list != null) {
                    for (Integer k : list) {
                        if (k > j && k > i) {
                            res.add(List.of(nums[i], nums[j], nums[k]));
                        }
                    }
                }
            }
        }

        return res;
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (j != nums.length - 1) {
                        for (int k = j + 1; k < nums.length; k++) {
                            int r = nums[i] + nums[j] + nums[k];
                            if (r == 0) {
                                res.add(List.of(nums[i], nums[j], nums[k]));
                            }
                        }
                    }
                }
            }
        }

        return res;
    }
}
