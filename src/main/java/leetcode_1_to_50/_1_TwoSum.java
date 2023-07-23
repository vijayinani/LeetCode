package leetcode_1_to_50;

import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {
    /*public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }*/

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> iteratedValues = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (iteratedValues.containsKey(remainder)) {
                return new int[]{iteratedValues.get(remainder), i};
            }
            iteratedValues.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        twoSum(new int[]{2, 7, 11, 15}, 9);
    }
}
