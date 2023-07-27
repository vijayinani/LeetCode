package leetcode_51_to_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, )
}
