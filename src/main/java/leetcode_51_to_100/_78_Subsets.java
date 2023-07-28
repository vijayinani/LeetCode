package leetcode_51_to_100;

import java.util.ArrayList;
import java.util.List;

public class _78_Subsets {
    public static void main(String[] args) {
        System.out.println(new _78_Subsets().subsets(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, int start, List<Integer> tempList) {
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(result, nums, i + 1, tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
}
