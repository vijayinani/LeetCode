package leetcode_1_to_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _47_PermutationsII {
    public static void main(String[] args) {
        System.out.println(new _47_PermutationsII().permuteUnique(new int[]{1, 1, 2}));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(result, nums, new ArrayList<>(), used);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, List<Integer> tempList, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            tempList.add(nums[i]);
            backtrack(result, nums, tempList, used);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}
