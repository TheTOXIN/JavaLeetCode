package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        combinationSumHelper(res, new ArrayList<>(), candidates, target, 0, 0);

        return res;
    }

    private void combinationSumHelper(
            List<List<Integer>> res,
            List<Integer> combo,
            int[] candidates,
            int target,
            int start,
            int sum
    ) {
        if (sum == target) {
            res.add(new ArrayList<>(combo));
            return;
        }

        if (sum > target) return;

        for (int i = start; i < candidates.length; i++) {
            combo.add(candidates[i]);
            combinationSumHelper(res, combo, candidates, target, i, sum + candidates[i]);
            combo.removeLast();
        }
    }
}
