package org.example.tasks_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);
        combinationSumHelper(res, new ArrayList<>(), candidates, 0, target);

        return res;
    }

    private void combinationSumHelper(
            List<List<Integer>> res,
            List<Integer> combo,
            int[] candidates,
            int start,
            int target
    ) {
        if (target == 0) {
            res.add(new ArrayList<>(combo));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            combo.add(candidates[i]);
            combinationSumHelper(res, combo, candidates, i + 1, target - candidates[i]);
            combo.removeLast();
        }
    }
}
