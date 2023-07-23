package leetcode_1_to_50;

public class _41_FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(new _41_FirstMissingPositive().firstMissingPositive(new int[]{3, 4, -1, 1, 6}));
    }

    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        // change all negative and numbers greater than n to n + 1 (some number higher than n)
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        // change all numbers in range to negative which are greater than 0 and less than n
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num > n) {
                continue;
            }
            num--;
            if (nums[num] > 0) {
                nums[num] = -1 * nums[num];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
