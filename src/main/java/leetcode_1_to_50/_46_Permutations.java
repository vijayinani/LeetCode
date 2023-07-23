package leetcode_1_to_50;

import java.util.ArrayList;
import java.util.List;

public class _46_Permutations {
    public static void main(String[] args) {
        System.out.println(new _46_Permutations().permute(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, new ArrayList<Integer>());
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, List<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backtrack(result, nums, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
