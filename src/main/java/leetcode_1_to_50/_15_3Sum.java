package leetcode_1_to_50;

import java.util.*;

public class _15_3Sum {
    public static void main(String[] args) {
        System.out.println(new _15_3Sum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(new _15_3Sum().threeSum(new int[]{-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            int j = i + 1;
            if (nums[i] == 0 && nums[j] > 0) {
                break;
            }
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        output.addAll(result);
        return output;
    }
}
