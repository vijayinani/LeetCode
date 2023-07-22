package leetcode_1_to_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _40_CombinationSumII {
    public static void main(String[] args) {
        System.out.println(new _40_CombinationSumII().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, target, candidates, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(List<List<Integer>> result, int remaining, int[] candidates, int start, ArrayList<Integer> integers) {
        if (remaining < 0) {
            return;
        } else if (remaining == 0) {
            result.add(new ArrayList<>(integers));
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) continue;
                integers.add(candidates[i]);
                backtrack(result, remaining - candidates[i], candidates, i + 1, integers);
                integers.remove(integers.size() - 1);
            }
        }
    }
}
