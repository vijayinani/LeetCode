package leetcode_51_to_100;

public class _53_MaximumSubarray {
    public static void main(String[] args) {
        System.out.println(new _53_MaximumSubarray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;
        for (int num : nums) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += num;
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
}
