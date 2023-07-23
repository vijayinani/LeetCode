package leetcode_1_to_50;

public class _45_JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0;
        int curEnd = 0;
        int curFarthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(nums[i] + i, curFarthest);
            if (i == curEnd) {
                jumps++;
                curEnd = curFarthest;
            }
        }
        return jumps;
    }
}
